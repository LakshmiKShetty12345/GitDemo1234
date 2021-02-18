Feature: Application Login

Scenario: Home page default login

Given User is on landing page
When User logs in valid username and password.
Then Home page is populated.
And The card is displayed.
