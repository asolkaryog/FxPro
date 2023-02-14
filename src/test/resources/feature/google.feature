Feature: to test the search functionality
Scenario: validate the functionality of google search

Given Browser is open
And user is on google search page
When user enter text in a search box
And user hit enter
Then user is navigate to the search result page