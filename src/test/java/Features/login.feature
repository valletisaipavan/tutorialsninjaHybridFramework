@smoke
 Feature: login Functionality
 Scenario: Search for a valid credentails
 Given user opens the application
 When user enters the valid email address "pavan1@gmail.com"
   And user click the login button 
 Then account open sucessfully
 
 
 @login
  Scenario: Search for a invalid credentails
 Given user opens the application
 When user enters the invalid email address "pavan@gmail.com"
 And user click the login button 
 Then it giver error messege