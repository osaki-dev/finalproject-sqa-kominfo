Feature: Checkout

  Scenario: Proceed to checkout
    Given I am logged in to SauceDemo
    When I add a product to the cart
    And I proceed to checkout
    Then I should see the checkout information
