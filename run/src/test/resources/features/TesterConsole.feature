Feature: Testers should be able to administer and monitor network security exploits 

    Scenario: As a tester I want to address this problem in linear progression

        Given   the tester is on the tester console
        When    the tester should enter their id
        When    the tester clicks on the get button
        When    the tester selects the defect id 
        When    the tester updates status to approved or declined
        When    the tester clicks on button to apply changes
        When    the tester updates status to rejected fixed or shelved
        When    the tester clicks on button to update the status on defects
        Then    the tester should be able to monitor the whole process from start to finish