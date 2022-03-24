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

Feature: Rotate a single servo
  This will rotate a single servo given the id, angle and time

    Background
      Given The angular precision is "2 deg"
        And The  linear precision is "1 mm"
        And the    time precision is "1 s"

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


        
        
        
        
        
        
        
        
        
        
        
        
      
         
        
        
                