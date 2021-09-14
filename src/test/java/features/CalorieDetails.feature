Feature: Calorie Calculator

  Background:
    Given the user in on the home page
    When user clicks on BMI link

  Scenario: Entering BMI Details
    And the user provides the age as 45
    And the user provides the height as 5
    And the user provides the weight as 70
    And the user selects the gender as "male"
    And the user performs BMI Calculation
    Then the user should be given the BMI Value
    And the user should be given the BMI Category
    And the user verifies the BMI Category

  Scenario Outline: Enter BMI details with multiple sets of data
    And the user provides the age as <age>
    And the user provides the height as <height>
    And the user provides the weight as <weight>
    And the user selects the gender as "<gender>"
    And the user performs BMI Calculation
    Then the user should be given the BMI Value
    And the user should be given the BMI Category
    And the user verifies the BMI Category
    Examples:
      | age | height | weight | gender |
      | 45  | 5      | 70     | female |

  @fourArgs
  Scenario: Enter BMI details as Cucumber Datatable
    And the user provides the following details
      | age | height | weight | gender |
      | 50  | 6      | 80     | male   |
      | 45  | 5      | 54     | female |
    And the user performs BMI Calculation
    Then the user should be given the BMI Value
    And the user should be given the BMI Category
    And the user verifies the BMI Category
