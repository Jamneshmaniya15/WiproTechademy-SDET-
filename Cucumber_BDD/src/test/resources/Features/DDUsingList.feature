Feature: Login functionality using List
Scenario: Login using multiple user credentials
Given I launch the new browser 
When I enter valid username and password using list
| standard_user | secret_sauce |
| standard_user           | secret_sauce |
| problem_user            | secret_sauce |
| performance_glitch_user | secret_sauce |
And I click on Login button