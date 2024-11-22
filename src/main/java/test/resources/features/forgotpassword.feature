Feature: I want reset the password.


  Scenario: Reset password for a valid user
    Given open the browser
    Given navigate to OrangeHRM application
    When click on Forgot Password
    And enter the username for reset password as 'Admin'
    Then click reset password button
    And close the browser
