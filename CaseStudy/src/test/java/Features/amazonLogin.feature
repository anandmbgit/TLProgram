@Login
Feature: Login to Amazon
 
  Scenario:  Login to Amazon with valid credentials
    Given Browser opened
    Then click on Sign In button
    Then Login with valid credentials
    
