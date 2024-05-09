Feature: Validate CartFeature Functionality

  Scenario: Verify user can use cart
    Given user open website
    And verify user is on the login page
    When user log in with valid credential
    Then verify user is on the home page
    When user enters valid credential
    Then verify use is on the homepage
    When user click on AddtoCart button
    Then verify it show cart button with qty
    When user click on cart icon
    Then verify use is on the Cart page
    When user removes the item
    Then verify cart is empty
