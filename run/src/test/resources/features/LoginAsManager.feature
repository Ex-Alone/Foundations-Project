Feature: The manager should be able to login into the admin console

    Scenario: I want to be able to login in the console as a manager
    
        Given   the manager is on the login page
        When    the manager enters the correct username
        When    the manager enters the correct password
        When    the manager clicks on the login button
        Then    the manager should be logged in