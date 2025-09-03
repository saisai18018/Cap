@smoke
Feature: Login
  Scenario: Successful login with valid credentials
    Given User navigates to homepage
    When User opens login
    And User logs in with email "<email>" and password "<password>"
    Then User should be logged in

    Examples:
      | email                 | password  |
      | saidreammi@gmail.com    | Nop@123  |
