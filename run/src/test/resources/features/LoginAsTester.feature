Feature: The tester should be able to login in to their respective consoles

    Scenario: I want to be able to login in the console as a tester
    
        Given   the tester is on the login page
        When    the tester enters the correct username
        When    the tester enters the correct password
        When    the tester clicks on the login button
        Then    the tester should be logged in