Feature: Testers should be able to administer and monitor network security exploits 

    Scenario: As a tester I want to address this problem in linear progression

        Given   the tester is logged into the console
        When    the tester selects the defect id by level of priority
        When    the tester updates defect status to approved declined rejected fixed or shelved
        When    the tester clicks on button to apply changes
        Then    the tester should be notified of the changes an via alert box