Feature: Validate Login and Log out Functionality

  Scenario: Verify user can log in with Valid credentials
    Given user open website
    And verify user is on the login page
    When user log in with valid credential
    Then verify user is on the home page


#  Scenario: Verify user can log out
#    Given user open website
#    And verify user is on the login page
#    When user log in with valid credential
#    Then verify user is on the home page
#    When user enters valid credential
#    Then verify use is on the homepage
#    When user click on burger icon
#    And click on logout button
#    Then verify use is on the homepage
