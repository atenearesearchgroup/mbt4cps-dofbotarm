Feature: Series of operations for the arm
	
  Background:
    Given The AnglePrecision is 2 degrees
    And 	The TimePrecision is 500 ms
 
  
  @Movement
	@Rotate @Single
	Scenario: Rotate a single servo:
		Given We have an operational arm 
		When  We call operation rotateServoOperation(1, 90, 1000)
		Then  The result is 1000
		And   Not_Later_Than 1000 : Query isAtSingleOperation(1, 90, AnglePrecision) returns True
		
      
      
Class: Machine
	StateMachine: RotateASingleServo
		PseudoState: Initial
		PseudoState: Final
		PseudoState: Error
	
		Transition: (Initial->Given1)
			Guard: []
			
		
		State: Given1
			Activity: Arm.BaseServo.ServosOperations.posInicial(1000);
			
		State: Given1Warning
			Activity: MessReport(mWarning, Warning Time)
			
		Transition: (Given1Warning->Given1)
			Guard: []
					
		Transition: (Given1->Given1Warning)
			Guard: Arm.BaseServo.ServosOperations.Time(1000)
		Transition: (Given1->When1)
			Guard: Arm.BaseServo.ServosOperations.isAt(90,90,90,90,90,90,2)
				
		State: When1
			Activity: result = Arm.BaseServo.ServosOperations.rotateServoOperation(1, 90, 1000)
		
		Transition: (When1->Final)
			Guard: equals(result, 1000)
			Guard: Arm.BaseServo.ServosOperations.isAtSingleOperation(1, 90, 1000)
			
		Transition: (When1->Error)
			Guard: !equals(result, 1000)
		
		Transition: (When1->Error)
			Guard: LaterThan(oRunTime, 1000)		
			
		
		
		
		
  
  @Movement
	@Rotate @Single
	Scenario Outline: Rotate a single servo:
		Given We have an operational arm 
		When  We call operation Arm.BaseServo.ServosOperations.rotateServoOperation(<id>, <angle>, <aTime>)
		Then  The result is <aTime>
		And   Not Later Than <aTime> Query Arm.BaseServo.ServosOperations.isAtSingleOperation(<id>, <angle>, AnglePrecision) returns True
		
	Examples:
      | id  | angle | aTime | 	
      |  1 	|    90 |  1000 | 			
      |  2 	|    90 |  1000 | 			  
      |  3 	|    90 |  1000 |  			  
      |  4 	|    90 |  1000 |  			  
      |  5 	|    90 |  1000 | 			  
      |  6 	|    90 |  1000 |  			  