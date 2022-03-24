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
Feature: Set the color of the RGB led
  The led will set the color given the combination of three values

  @tag1
  Scenario Outline: Set led color
	  Given We have a led
	  	And A <r> value for red color
	  	And A <g> value for green color
	  	And A <b> value for blue color
	  	And The <r> value is correct
	  	And The <g> value is correct
	  	And The <b> value is correct 
    When  The set led color command is issued
    	And The led is on with the given color  
    Then  The result color in HEX is <hex>
    
  	Examples: 
      |  r  |  g  |  b  |  hex        |
      | 255 | 0   | 0   |  "#FF0000"  |
      | 255 | 255 | 0   |  "#FFFF00"  |
      | 0   | 0   | 0   |  "#000000"  |
      | 255 | 255 | 255 |  "#FFFFFF"  |
