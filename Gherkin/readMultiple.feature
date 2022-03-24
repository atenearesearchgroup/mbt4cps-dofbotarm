#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Read all the angles for each servo
  This operation will return the value for each servo in order

  @tag1
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


Feature: Rotate multiple servos
  This will rotate a series of servos given the angle value for each and the time for completion
  
  Background:
    Given The angular precision is "2 deg"
      And The  linear precision is "1 mm"
      And the    time precision is "1 s"
 
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
            