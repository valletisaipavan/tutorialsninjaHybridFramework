
@run
Feature: search functionality
Scenario: Search for a valid product
When user enters below details into the fields
 Given user open the application
 When user enters the valid product in search fields
 And user enter the existing product in search fields
 And user enter the search button
 And valid product get displayed in search result 

