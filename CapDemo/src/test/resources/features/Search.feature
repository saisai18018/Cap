Feature: Search and add to cart
  Scenario: Search items and add to cart
    Given User navigates to homepage
    When User searches for "computer"
    And User adds one or two items to cart from results
