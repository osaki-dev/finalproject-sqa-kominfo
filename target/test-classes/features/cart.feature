Feature: Shopping Cart

  Scenario: Add to cart
    Given I am logged in to SauceDemo
    When I add a product to the cart
    Then I should see the product in my cart
