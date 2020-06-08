Feature: Student can request,return and able to view books

Background:

Given Student is on Login page
When Student enters "jogaaruna@gmail.com","Arunaprasad@11"
Then Student should be logged in

Scenario: Student should be able to request books
Given Student is on request book page
When BookId  and UserId are given 602, 100002
Then Book Requested Successfully

Scenario: Student should be able to return books
Given Student is on returning book page
When Book  and User are given 602, 100002
Then Book Returned Successfully

Scenario: Student should be able to view books based on names
Given Student is on  viewing books page based on names
When student enters "History"
Then show books based on bookname

Scenario: Student should be able to view books based on author name
Given Student is on  viewing books page based on author Name
When student enters author name "Lorens"
Then show books based on  authorname

Scenario: Student should be able to view books based on id
Given Student is on  viewing books page based on book id
When student enters book id 305
Then show books based on  bookid