Feature: Login

Scenario: Login to portal using valid login details

Given I am on the login page
When I enter valid username
And I enter valid password
And I click on submit button
Then I should be logged in successfully