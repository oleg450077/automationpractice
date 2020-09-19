Feature: Login Scenarios

  Scenario: Create an Account
    Given I navigate to home page
    When I click on Sign in button
    And I enter email
    When I click on Crate account button
    Then I see that email field gets a green check mark
    And Create an account page loaded

