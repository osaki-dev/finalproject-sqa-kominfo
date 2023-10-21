Feature: Inventory Page

  Scenario: View products
    Given I am logged in to SauceDemo
    When I go to the inventory page
    Then I should see a list of products
