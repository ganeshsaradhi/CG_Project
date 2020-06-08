Feature: Admin can add,delete,update,issue books and able to view books

Background:

Given Admin is on Login page
When Admin enters "joganikhitha@gmail.com","Arunaprasad@11"
Then Admin should be logged in

Scenario Outline: Admin should be able to add books
Given Admin is on adding book page
When Admin enters <bookName>,<author>,<category>,<publisher>
Then Book <status>

Examples:
|bookName|author|category|publisher|status|
|"History"|"Lorens"|"social"|"Md publications"|"Added Successfully"|
|"Biology"|"Ratnakar"|"science"|"Sm publications"|"Added Successfully"|


Scenario: Admin should be able to remove books
Given  Admin is on removing book page
When  Admin enters 402
Then Book deleted successfully

Scenario:  Admin should be able to issue books 
Given  Admin is on issuing book page
When  Admin enters 100002,602
Then Book issued successfully

Scenario:  Admin should be able to view books
Given  Admin is on  viewing books page based on names
When  Admin enters "History"
Then show books based on name

Scenario:  Admin should be able to view books
Given  Admin is on  viewing books page based on author Name
When  Admin enters author name "Lorens"
Then show books based on  author name

Scenario:  Admin should be able to view books based on id
Given  Admin is on  viewing books page based on book id
When  Admin enters book id 305
Then show books based on  book id