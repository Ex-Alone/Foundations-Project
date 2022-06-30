Feature: Managers should be redirected to admin console after a successful login

    Scenario: As a manager I want to create defects and assign it to a testers

        Given   the manager is on the admin console
        When    the manager types description of defect in text field
        When    the manager assigns defect to tester
        When    the manager clicks on the submit button
        Then    the manager should see an alert