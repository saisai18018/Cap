Feature: Cart and checkout
  Scenario: Move to checkout
    Given User navigates to homepage
    When User searches for "book"
    And User adds one or two items to cart from results
    And User opens cart from success bar and proceeds to checkout
