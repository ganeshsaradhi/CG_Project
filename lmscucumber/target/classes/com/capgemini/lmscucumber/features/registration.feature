@Registration
Feature: User Registration

  Scenario Outline: User Registration with given details
    Given User is on registration page
    When User enters <firstName>, <lastName>, <email>, <password>, <mobile>, <role>
    Then User should be registered

    Examples: 
      | firstName | lastName  | email                | password   | mobile     | role      |
      | "ganesh"  | "saradhi" | "ganeshch@gmail.com" | "Gane@123" | 8181818181 | "Student" |
