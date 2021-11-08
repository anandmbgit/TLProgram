@LoginTest
Feature: Login Fuctionality

  Scenario: Login with valid credentials
    Given Browser is open
    When User enters username & password and login 
    And Home page is displayed
    Then User logsout
    And User closes the Browser  
