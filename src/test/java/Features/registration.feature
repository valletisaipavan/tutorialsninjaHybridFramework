
Feature: user registration 
Background:
Given user navigates to register account
Scenario: register with valid fields
When user enters below details into the fields
|firstname     |pavan|
|lastname      |valleti|
|telephone     |1234567890|
|password      |1234|
And select privacy policy field
And click on continue button 
Then account should get sucessfully
