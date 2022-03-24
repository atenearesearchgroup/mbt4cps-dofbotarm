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
Feature: Rotate multiple servos
  This will rotate a series of servos given the angle value for each and the time for completion
  
	@tag1
	Scenario Outline: Rotate multiple servos
		Given We have an arm
			And A angle value for <id1angle>
			And A angle value for <id2angle>
			And A angle value for <id3angle>
			And A angle value for <id4angle>
			And A angle value for <id5angle>
			And A angle value for <id6angle>
      And A <time> for the completion of the move 
      And The <id1angle> is in the range of movement
			And The <id2angle> is in the range of movement
			And The <id3angle> is in the range of movement
			And The <id4angle> is in the range of movement
			And The <id5angle> is in the range of movement
			And The <id6angle> is in the range of movement
      And The <time> is acceptable
		When  The rotate multiple command is issued 
			And The operation is over
		Then  The read value for servo1 is equals to <id1angle>
			And The read value for servo1 is equals to <id2angle>
			And The read value for servo1 is equals to <id3angle>
			And The read value for servo1 is equals to <id4angle>
			And The read value for servo1 is equals to <id5angle>
			And The read value for servo1 is equals to <id6angle>
			And The result is approx <time>
			

    Examples: 
      |  id1angle |  id2angle |  id3angle |  id4angle |  id5angle |  id6angle | time |
      |   90			|   90 			|   90			|   90 			|   90 			|   90 			| 1000 |
      |   45  		|   45 			|   45 			|   45 			|   45 			|   45 			| 1000 |
      |   90  		|  130		 	|    0 			|    0 			|  270 			|   60 			| 1000 |
      
