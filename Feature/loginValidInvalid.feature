Feature: To Test the Login Functionality of the application with Valig and Invalid credentials

Background:
Given A User is on the Home Page

Scenario: To test login functionality of the application with valid credentials

When User enters a valid UserName
And User enters a Valid Password
And User clicks on the login button
Then User must be able to log in to the application successfully


Scenario: To test login functionality of the application with invalid credentials

When User enters a invalid UserName
And User enters a invalid Password
And User clicks on the login button
Then User must not be able to log in to the application