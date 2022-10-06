Feature: Test form functionality
 
  @Cart
  Scenario Outline: user enters the following data
  Given the user navigates to https://178.128.77.104/Softesting/Frontend/Caso1.html
  And Enter name<name>
  And Enter email<email>
  And Enter the neighborhood<neighborhood>
  And Enter the subject<subject>
  And Enter Message<Message>
  When Send the information
  Then shows message something went wrong

    Examples: 
        | name    |email|neighborhood|subject |Message|
        | claudia |cs@sp|     Iza    |saludo  | saludo|


  Feature: Cannot register because there is a user with the same email address.

   Scenario Outline:  registration failed due to repeated email
   Given a user already exists with the same email address.
   When registering email <wwe@g>
   Then registration failed