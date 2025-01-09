Feature: Calculations with a calculator
  As a user
  I want to use a calculator to perform basic operations
  So that I can see the results

  Scenario Outline: Add two numbers with a calculator
    Given I have a calculator
    And I have numbers <num1> and <num2>
    When I add them
    Then the result should be <result>

    Examples:
      | num1 | num2 | result |
      | 2    | 3    | 5      |
      | 10   | 15   | 25     |
      | -1   | 4    | 3      |
      | 0    | 0    | 0      |