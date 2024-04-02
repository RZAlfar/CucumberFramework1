Feature: feature to test the login functionality

  @SmokeTest
  Scenario: Check login is successful with valid credintials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
