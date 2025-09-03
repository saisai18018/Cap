Feature: Complete order with Check/Money Order
  Scenario: Guest checkout to successful order
    Given User navigates to homepage
    When User searches for "phone"
    And User adds one or two items to cart from results
    And User opens cart from success bar and proceeds to checkout
    And User checks out as guest if needed
    And User fills billing with default data
    And User selects shipping, payment and confirms order
    Then Order should be placed successfully
