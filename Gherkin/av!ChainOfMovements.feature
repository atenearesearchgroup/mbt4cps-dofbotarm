
Feature: Several movements chained together
  We chain several rotate commands
  
  Background
    Given The angular precision is "2 deg"
      And The  linear precision is "1 mm"
      And the    time precision is "1 s"
      
  Scenario Outline: Perform several movements
    Given The arm is initialized
    ## we start with the arm in the vertical position: 90,90,90,90,90,90
    When  The "rotateAll" command is issued with arguments <a1> <a2> <a3> <a4> <a5> <a6> <time>
      And We wait <time> seconds
      And The "rotateAll" command is issued with arguments <a2> <a3> <a4> <a5> <a6> <a1> <time>
      And We wait <time> seconds
      And The "rotateAll" command is issued with arguments <a3> <a4> <a5> <a6> <a1> <a2> <time>
      And We wait <time> seconds
      And The "rotateAll" command is issued with arguments <a4> <a5> <a6> <a1> <a2> <a3> <time>
      And We wait <time> seconds
      And The "rotateAll" command is issued with arguments <a5> <a6> <a1> <a2> <a3> <a4> <time>
      And We wait <time> seconds
      And The "rotateAll" command is issued with arguments <a6> <a1> <a2> <a3> <a4> <a5> <time>
      And We wait <time> seconds
      And The "rotateAll" command is issued with arguments <a1> <a2> <a3> <a4> <a5> <a6> <time>
      And We wait <time> seconds
    Then  The result is approx <time>
        And Servo "1" is approx at <a1>
      And Servo "2" is approx at <a2>
      And Servo "3" is approx at <a3>
        And Servo "4" is approx at <a4>
    And Servo "5" is approx at <a5>
    And Servo "6" is approx at <a6>
  
    Examples: 
      |  a1 |  a2 |  a3 |  a4 |  a5 |  a6 | time |  
      |  30 |  60 |  90 | 120 | 150 | 180 | 1000 | 
      |  60 |  90 | 120 | 150 | 180 |  30 | 1000 | 
      |  90 | 120 | 150 | 180 |  30 |  60 | 1000 | 
      | 120 | 150 | 180 |  30 |  60 |  90 | 1000 | 
      | 150 | 180 |  30 |  60 |  90 | 120 | 1000 | 
      | 180 |  30 |  60 |  90 | 120 | 150 | 1000 | 
      
