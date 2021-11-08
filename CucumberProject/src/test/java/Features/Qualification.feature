@AddSkillTest

Feature: Qualification fuctionality

    Scenario: Skills to add
    
    Given Browser is opened for user
    When User logs in
    And Home page comes up  
    When User clicks on Admin tab
    When User clicks on Qualification tab
    When User clicks on Skills element
    When User clicks on Add button
    When User enter new skills
    And User clicks on Save button
    Then User logout
    And Close the browser   