
Feature:	LoginPage

  Scenario: Login with valid credentials
    Given the user is logged in
    When the user logs in with credentials
    Then  The page title should be "Zero - Account Summary"

  Scenario Outline: Login with invalid credentials
    Given the user is logged in
    When the user logs in with invalid credantials "<username>" or "<password>"
    Then  the system should display error message "Login and/or password are wrong."
    Examples:
      | username | password |
      |          |password  |
      |username  |          |
      |aalll     |ewew      |
      |          |          |