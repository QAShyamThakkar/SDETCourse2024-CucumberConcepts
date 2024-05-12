Feature: Validate Login and Log out Functionality

  @Regression @Francis
  Scenario: Verify user can log in with Valid credentials
    Given user open website
    And verify user is on the login page
    When user log in username "standard_user" and password "secret_sauce"
    Then verify user is on the home page

  Scenario Outline: Verify user can log in with Invalid credentials
    Given user open website
    And verify user is on the login page
    When user log in username "<username>" and password "<password>"
    Then verify error message is displayed

    Examples:
      | username      | password     |
      | ""            | ""           |
      | Shyam         | secret_sauce |
      | standard_user | shyam        |


  #@Smoke @Shyam
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
