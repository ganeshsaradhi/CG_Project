Feature: Student Login

Scenario Outline: Student login with given details

Given Student is on Login page
When Student enters <email>,<password>
Then Student should be logged in

Examples:
|email|password|
|"jogaaruna@gmail.com"|"Arunaprasad@11"|