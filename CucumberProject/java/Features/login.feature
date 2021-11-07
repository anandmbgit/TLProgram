@SmokeTest
Feature: Login Fuctionality

  Scenario: Login with valid credentials
    Given User is on login page
    When User enters username and password
    And User clicks on login button
    Then User is navigated to home page    