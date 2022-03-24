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
Feature: Read servo
  This will read a single servo angle given the id
  
  @tag1
  Scenario Outline: Read a single servo
	  Given We have an arm
	  	And An <id> indicating the servo 
    When  The read single servo command is issued 
    Then The result value for servo <id> is <angle>

    Examples: 
      | id  | angle |
      |  1 	|    90 |
      |  2 	|    90 |
      |  3 	|    90 |
      |  4 	|    90 |
      |  5 	|    90 |
      |  6 	|    90 |
      
	