Feature: Testing the arm

  @start
  Scenario: The arm moves sideways
    Given we have an arm
    When we move the arm sideways 1.0 position
    Then the arm is in x equals 1.0

  Scenario: The arm moves forward
    Given we have an arm
    When we move the arm forward 1.0 position
    Then the arm is in y equals 1.0

  Scenario: The arm moves up
    Given we have an arm
    When we move the arm up 1.0 position
    Then the arm is in z equals 1.0

  Scenario: The arm grasps an item
    Given we have an arm and an item
    When the arm grasps
    Then the arm has an item

  Scenario: The arm moves sideways with an item
    Given we have an arm and an item
    When the arms grasps
    And we move the arm sideways 1.0 position
    Then the item is in x equals 1.0

  Scenario: The arm moves forward with an item
    Given we have an arm and an item
    When the arms grasps
    And we move the arm forward 1.0 position
    Then the item is in y equals 1.0

  Scenario: The arm drops the item
    Given we have an arm and an item
    When the arm grasps
    And the arm drops
    Then the arm has no item
    And we destroy the item

  Scenario Outline: The arm moves sideways with no item
    Given we have an arm
    When we move the arm sideways <x> position
    Then the arm is in x equals <x>
    Examples:
      | x   |
      | 5.0 |
      | 7.0 |
      | 9.0 |
      |11.0 |
      |13.0 |

  Scenario Outline: The arm moves forward with no item
    Given we have an arm
    When we move the arm forward <x> position
    Then the arm is in y equals <x>
    Examples:
      | x   |
      | 5.0 |
      | 7.0 |
      | 9.0 |
      |11.0 |
      |13.0 |

  Scenario Outline: The arm moves up with no item
    Given we have an arm
    When we move the arm up <x> position
    Then the arm is in z equals <x>
    Examples:
      | x   |
      | 5.0 |
      | 7.0 |
      | 9.0 |
      |11.0 |
      |13.0 |

  Scenario Outline: The arm moves sideways with item
    Given we have an arm and an item
    When the arm grasps
    And we move the arm sideways <x> position
    Then the arm is in x equals <x>
    And we destroy the item
    Examples:
      | x   |
      | 5.0 |
      | 7.0 |
      | 9.0 |
      |11.0 |
      |13.0 |

  Scenario Outline: The arm moves forward with item
    Given we have an arm and an item
    When the arm grasps
    And we move the arm forward <x> position
    Then the arm is in y equals <x>
    And we destroy the item
    Examples:
      | x   |
      | 5.0 |
      | 7.0 |
      | 9.0 |
      |11.0 |
      |13.0 |

  Scenario Outline: The arm moves up with item
    Given we have an arm and an item
    When the arm grasps
    And we move the arm up <x> position
    Then the arm is in z equals <x>
    And we destroy the item
    Examples:
      | x   |
      | 5.0 |
      | 7.0 |
      | 9.0 |
      |11.0 |
      |13.0 |

  Scenario Outline: The item moves with the arm
    Given we have an arm and an item
    When the arm grasps
    And we move the arm sideways <x> position
    Then the item is in x equals <x>
    Examples:
      | x   |
      | 5.0 |
      | 7.0 |
      | 9.0 |
      |11.0 |
      |13.0 |

  Scenario Outline: The item moves with the arm
    Given we have an arm and an item
    When the arm grasps
    And we move the arm forward <x> position
    Then the item is in y equals <x>
    Examples:
      | x   |
      | 5.0 |
      | 7.0 |
      | 9.0 |
      |11.0 |
      |13.0 |

  Scenario Outline: The item moves with the arm
    Given we have an arm and an item
    When the arm grasps
    And we move the arm up <x> position
    Then the item is in z equals <x>
    Examples:
      | x   |
      | 5.0 |
      | 7.0 |
      | 9.0 |
      |11.0 |
      |13.0 |

  Scenario: The arm grabs no item
    Given we have an arm
    When the arm grasps
    Then the arm has no item

  @end
  Scenario: The arm moves up with an item
    Given we have an arm and an item
    When the arms grasps
    And we move the arm up 1.0 position
    Then the item is in z equals 1.0





