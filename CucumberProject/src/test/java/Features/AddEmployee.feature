@AddEmployeeTest
Feature: Add Employee

    Scenario: Adding emplyoee
        
    Given Browser is open for user
    When User logs into application
    When User clicks on PIM menu item
    When User clicks on Add Employee tab
    Then User enters firstname
    And User enters middlename
    And User enters lastname
    Then User Save the record
    Then User logsout of application
    And User closes the browser   