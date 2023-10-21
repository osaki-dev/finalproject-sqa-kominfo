Feature: Login to SauceDemo

  Scenario: Valid login
    Given I am on the SauceDemo login page
    When I enter valid credentials
    And I click the login button
    Then I should be logged in

  Scenario: Invalid login
    Given I am on the SauceDemo login page
    When I enter invalid credentials
    And I click the login button
    Then I should see an error message
