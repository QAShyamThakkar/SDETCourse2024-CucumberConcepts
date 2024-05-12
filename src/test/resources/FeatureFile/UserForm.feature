Feature: Validate user form

  Scenario: Verifying user form
    Given user open website1
    And user open the registration form
      | Dauren |
      | dauren@test.com  |
      | USA |
      | I am cool   |
      | Go to hell |

    Then verify registration form is successful