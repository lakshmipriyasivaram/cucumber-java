
Feature: As an registered user, I want login and I should be navigated to the dashboard page.


  Scenario: Verify that I am a able to login with valid credentials
    Given open the browser
    Given navigate to OrangeHRM application
    When enter the valid username as 'admin'
    And enter the valid password as 'admin123'
    And click the Login button
    Then should be navigate to dashboard page
    And close the browser


  Scenario: Verify that I am a able to login with invalid user credentials
    Given open the browser
    Given navigate to OrangeHRM application
    When enter the invalid username as 'admin123'
    And enter the valid password as 'admin123'
    And click the Login button
    Then should be navigate to dashboard page
    And close the browser


  Scenario: Verify that I am a able to login with invalid password credentials
    Given open the browser
    Given navigate to OrangeHRM application
    When enter the valid username as 'admin'
    And enter the invalid password as 'admin@123'
    And click the Login button
    Then should be navigate to dashboard page
    And close the browser
