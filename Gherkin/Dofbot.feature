@Movement
@Rotate @Single
Feature: Rotate single servo
  This will rotate a single servo given the id, angle and time

    Background:
      Given The angular precision is "2 deg"
        And The linear precision is "1 mm"
        And The time precision is "1 s"

    Scenario Outline: Rotate a single servo
      Given The arm is Initialized
      ## we start with the arm in the vertical position: 90,90,90,90,90,90
      When  The "rotate" command is issued with arguments <id> <a> <time>
        And We wait <time> seconds
      Then  The result is approx <time>
        And Servo <id> is approx at <a>

      Examples:
        | id  |  a | time |
        |  1  | 90 | 1000 |
        |  2  | 90 | 1000 |
        |  3  | 90 | 1000 |
        |  4  | 90 | 1000 |
        |  5  | 90 | 1000 |
        |  6  | 90 | 1000 |


@Rotate @Multiple
Feature: Rotate multiple servos
  This will rotate a series of servos given the angle value for each and the time for completion
  
  Background:
    Given The angular precision is "2 deg"
      And The linear precision is "1 mm"
      And The time precision is "1 s"
 
  Scenario Outline: Rotate multiple servos
    Given The arm is Initialized 
    ## we start with the arm in the vertical position: 90,90,90,90,90,90
    When  The "rotateAll" command is issued with arguments <a1> <a2> <a3> <a4> <a5> <a6> <time>
      And We wait <time> seconds
    Then  The result is approx <time>
      And Servo "1" is approx at <a1>
      And Servo "2" is approx at <a2>
      And Servo "3" is approx at <a3>
      And Servo "4" is approx at <a4>
      And Servo "5" is approx at <a5>
      And Servo "6" is approx at <a6>
  
    Examples: 
      | a1 |  a2 | a3 | a4 |  a5 | a6 | time |  
      | 90 |  90 | 90 | 90 |  90 | 90 | 1000 | 
      | 45 |  45 | 45 | 45 |  45 | 45 | 1000 |
      | 90 | 130 |  0 |  0 | 270 | 60 | 1000 |
      

@Read @Single
Feature: Read servo
  This will read a single servo angle given the id
  
  Scenario Outline: Read a single servo
	  Given We have an arm
	  	And An <id> indicating the servo 
    When  The read single servo command is issued 
    Then  The result value for servo <id> is <angle>

    Examples: 
      | id  | angle |
      |  1 	|    90 |
      |  2 	|    90 |
      |  3 	|    90 |
      |  4 	|    90 |
      |  5 	|    90 |
      |  6 	|    90 |
      

@Read @Multiple
Feature: Read all the angles for each servo
  This operation will return the value for each servo in order

	Scenario Outline: Read all the angles
		Given We have an arm
		When  The read multiple command is issued
		Then  The angle value for servo id1 is <servo1>
			And The angle value for servo id1 is <servo2>
			And The angle value for servo id1 is <servo3>
			And The angle value for servo id1 is <servo4>
			And The angle value for servo id1 is <servo5>
			And The angle value for servo id1 is <servo6>
		
  	Examples: 
      |  servo1  |  servo2 |  servo3 |  servo4 |  servo5 |  servo6 |
      |      90  |      90 |      90 |      90 |      90 |      90 |
      |      45  |      45 |      45 |      45 |      45 |      45 |
      |      90  |     130 |       0 |       0 |     270 |      60 |
