Feature: Series of operations for the arm
	
  Background:
    Given The AnglePrecision is 2 degrees
    And 	The TimePrecision is 500 ms
 
  
  @Movement
	@Rotate @Single
	Scenario: Rotate a single servo:
		Given We have an operational arm 
		When  We call operation rotateServoOperation(1,90,1000)
		Then  The result is 1000
		And   Not_Later_Than 1000 Query isAtSingleOperation(1, 90, AnglePrecision) returns True
		
		
				
      
      
Class: Machine
	StateMachine: RotateASingleServo
		PseudoState: Initial
		PseudoState: Final
		PseudoState: Error
	
	
		Transition: (Initial->Given)
			Guard: []
			
		State: Given
			Activity: Arm.BaseServo.ServosOperations.posInicial(1000);
			
		State: GivenWarning
			Activity: MessReport(mWarning, Warning Time)
			
		Transition: (GivenWarning->Given)
			Guard: []
					
		Transition: (Given->GivenWarning)
			Guard: Arm.BaseServo.ServosOperations.Time(1000)
			
		Transition: (Given->When)
			Guard: Arm.BaseServo.ServosOperations.isAtOperation(90,90,90,90,90,90,2)
				
				
		State: When
			Activity: Arm.BaseServo.ServosOperations.rotateServoOperation(1, 90, 1000)
		
		
		Transition: (When->Error)
			Guard: LaterThan(oRunTime, 1000)		
			
		Transition: (When->Final)
			Guard: Arm.BaseServo.ServosOperations.isAtSingleOperation(1, 90, 1000)
			
			
		
		
 
  
  @Movement
	@Rotate @Single
	Scenario: Rotate a serie of servos:
		Given We have an operational arm 
		When  We call operation rotateServoOperation(1, 90, 1000)
		And   We call operation rotateServoOperation(5, 10, 2000)
		And   We call operation rotateServoOperation(3, 0, 1500)
		And   We call operation rotateServoOperation(2, 45, 2000)
		Then  The result is 2000
		And   Not_Later_Than 2000 Query isAtSingleOperation(2, 45, AnglePrecision) returns True
						
		
      
Class: Machine
	StateMachine: RotateASerieOfServos
		PseudoState: Initial
		PseudoState: Final
		PseudoState: Error
	
	
		Transition: (Initial->Given)
			Guard: []
			
		State: Given
			Activity: Arm.BaseServo.ServosOperations.posInicial(1000);
			
		State: GivenWarning
			Activity: MessReport(mWarning, Warning Time)
			
		Transition: (GivenWarning->Given)
			Guard: []
					
		Transition: (Given->GivenWarning)
			Guard: Arm.BaseServo.ServosOperations.Time(1000)
			
		Transition: (Given->When1)
			Guard: Arm.BaseServo.ServosOperations.isAtOperation(90,90,90,90,90,90,2)
				
				
				
				
		State: When1
			Activity: Arm.BaseServo.ServosOperations.rotateServoOperation(1, 90, 1000)
		
		Transition: (When1->Error)
			Guard: LaterThan(oRunTime, 1000)		
			
		Transition: (When1->When2)
			Guard: Arm.BaseServo.ServosOperations.isAtSingleOperation(1, 90, 1000)
			
			
			
			
							
		State: When2
			Activity: Arm.BaseServo.ServosOperations.rotateServoOperation(5, 10, 2000)
		
		Transition: (When2->Error)
			Guard: LaterThan(oRunTime, 1000)		
			
		Transition: (When2->When3)
			Guard: Arm.BaseServo.ServosOperations.isAtSingleOperation(5, 10, 2000)
			
							
							
							
		State: When3
			Activity: Arm.BaseServo.ServosOperations.rotateServoOperation(3, 0, 1500)
		
		Transition: (When3->Error)
			Guard: LaterThan(oRunTime, 1000)		
			
		Transition: (When3->When4)
			Guard: Arm.BaseServo.ServosOperations.isAtSingleOperation(3, 0, 1500)
			
			
			
	
		State: When4
			Activity: Arm.BaseServo.ServosOperations.rotateServoOperation(2, 45, 2000)
		
		Transition: (When4->Error)
			Guard: LaterThan(oRunTime, 2000)		
			
		Transition: (When4->Final)
			Guard: Arm.BaseServo.ServosOperations.isAtSingleOperation(2, 45, 2000)
			
			
		
		
		
		
  
  @Movement
	@Rotate @Single
	Scenario Outline: Rotate a single servo:
		Given We have an operational arm 
		When  We call operation rotateServoOperation(<id>, <angle>, <aTime>)
		Then  The result is <aTime>
		And   Not_Later_Than <aTime> Query isAtSingleOperation(<id>, <angle>, AnglePrecision) returns True
			
				
	Examples:
      | id  | angle | aTime | 	
      |  1 	|    90 |  1000 | 			
      |  2 	|    90 |  1000 | 			  
      |  3 	|    90 |  1000 |  			  


      
Class: Machine
	StateMachine: RotateASingleServo
		PseudoState: Initial
		PseudoState: Final
		PseudoState: Error
	
	
		Transition: (Initial->Given)
			Guard: []
			
		State: Given
			Activity: Arm.BaseServo.ServosOperations.posInicial(1000);
			
		State: GivenWarning
			Activity: MessReport(mWarning, Warning Time)
			
		Transition: (GivenWarning->Given)
			Guard: []
					
		Transition: (Given->GivenWarning)
			Guard: Arm.BaseServo.ServosOperations.Time(1000)
			
		Transition: (Given->When)
			Guard: Arm.BaseServo.ServosOperations.isAtOperation(90,90,90,90,90,90,2)
				
				
		State: When1
			Activity: Arm.BaseServo.ServosOperations.rotateServoOperation(1, 90, 1000)
		
		Transition: (When1->Error)
			Guard: LaterThan(oRunTime, 1000)		
			
		Transition: (When1->Final)
			Guard: Arm.BaseServo.ServosOperations.isAtSingleOperation(1, 90, 1000)
			
							
				
		State: When2
			Activity: Arm.BaseServo.ServosOperations.rotateServoOperation(2, 90, 1000)
		
		Transition: (When2->Error)
			Guard: LaterThan(oRunTime, 1000)		
			
		Transition: (When2->Final)
			Guard: Arm.BaseServo.ServosOperations.isAtSingleOperation(2, 90, 1000)
			
							
				
		State: When3
			Activity: Arm.BaseServo.ServosOperations.rotateServoOperation(3, 90, 1000)
		
		Transition: (When3->Error)
			Guard: LaterThan(oRunTime, 1000)		
			
		Transition: (When3->Final)
			Guard: Arm.BaseServo.ServosOperations.isAtSingleOperation(3, 90, 1000)
			
			
			

		
	@Movement
  @Rotate @Multiple
  Scenario: Rotate multiple servos:
	  Given We have an operational arm
	  When  We call operation rotateAllServosOperation(45, 45, 45, 45, 45, 45, 1000)   
		Then  The result is 1000
		And   Not_Later_Than 1000 Query isAtOperation(45, 45, 45, 45, 45, 45, AnglePrecision) returns True
			

			
Class: Machine
	StateMachine: RotateMultipleServos
		PseudoState: Initial
		PseudoState: Final
		PseudoState: Error
	
	
		Transition: (Initial->Given)
			Guard: []
			
		State: Given
			Activity: Arm.BaseServo.ServosOperations.posInicial(1000);
			
		State: GivenWarning
			Activity: MessReport(mWarning, Warning Time)
			
		Transition: (GivenWarning->Given)
			Guard: []
					
		Transition: (Given->GivenWarning)
			Guard: Arm.BaseServo.ServosOperations.Time(1000)
			
		Transition: (Given->When)
			Guard: Arm.BaseServo.ServosOperations.isAtOperation(90, 90, 90, 90, 90, 90,2)
				
				
		State: When
			Activity: Arm.BaseServo.ServosOperations.rotateAllServosOperation(80, 80, 80, 80, 80, 80, 1000)
		
		Transition: (When->Error)
			Guard: LaterThan(oRunTime, 1000)		
			
		Transition: (When->Final)
			Guard: Arm.BaseServo.ServosOperations.isAtOperation(80, 80, 80, 80, 80, 80, 2)
			
							
				


	@Movement
  @Rotate @Multiple
  Scenario Outline: Rotate multiple servos:
	  Given We have an operational arm
	  When  We call operation rotateAllServosOperation(<angle1>, <angle2>, <angle3>, <angle4>, <angle5>, <angle6>, <time>)   
		Then  The result is <aTime>
		And   Not_Later_Than <aTime> Query isAtOperation(<angle1>, <angle2>, <angle3>, <angle4>, <angle5>, <angle6>, AnglePrecision) returns True        
	Examples:
      | angle1 |  angle2 | angle3 | angle4 | angle5 | angle6 | time | a_precision |  
      |			80 |      80 |     80 |     80 |     80 |     80 | 1000 |           2 |
      |     45 |      45 |     45 |     45 |     45 |     45 | 1000 |           2 |
      |     90 |     130 |      0 |      0 |    270 |     60 | 1000 |						2 |        		
			
			
Class: Machine
	StateMachine: RotateMultipleServos
		PseudoState: Initial
		PseudoState: Final
		PseudoState: Error
	
	
		Transition: (Initial->Given)
			Guard: []
			
		State: Given
			Activity: Arm.BaseServo.ServosOperations.posInicial(1000);
			
		State: GivenWarning
			Activity: MessReport(mWarning, Warning Time)
			
		Transition: (GivenWarning->Given)
			Guard: []
					
		Transition: (Given->GivenWarning)
			Guard: Arm.BaseServo.ServosOperations.Time(1000)
			
		Transition: (Given->When)
			Guard: Arm.BaseServo.ServosOperations.isAtOperation(90, 90, 90, 90, 90, 90,2)
				
				
		State: When1
			Activity: Arm.BaseServo.ServosOperations.rotateAllServosOperation(80, 80, 80, 80, 80, 80, 1000)
		
		Transition: (When1->Error)
			Guard: LaterThan(oRunTime, 1000)		
			
		Transition: (When1->Final)
			Guard: Arm.BaseServo.ServosOperations.isAtOperation(80, 80, 80, 80, 80, 80, 2)
			
							
				
		State: When2
			Activity: Arm.BaseServo.ServosOperations.rotateAllServosOperation(45, 45, 45, 45, 45, 45, 1000)
		
		Transition: (When2->Error)
			Guard: LaterThan(oRunTime, 1000)		
			
		Transition: (When2->Final)
			Guard: Arm.BaseServo.ServosOperations.isAtSingleOperation(45, 45, 45, 45, 45, 45, 2)
			
							
				
		State: When3
			Activity: Arm.BaseServo.ServosOperations.rotateAllServosOperation(90, 130, 0, 0, 270, 60, 1000)		
			
		
		Transition: (When3->Error)
			Guard: LaterThan(oRunTime, 1000)		
			
		Transition: (When3->Final)
			Guard: Arm.BaseServo.ServosOperations.isAtSingleOperation(90, 130, 0, 0, 270, 60, 2)		
			
			
			
		
		  