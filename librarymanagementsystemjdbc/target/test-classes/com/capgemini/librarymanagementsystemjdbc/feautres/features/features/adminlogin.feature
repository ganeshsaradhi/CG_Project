Feature: Admin Login

Scenario Outline: Admin login with given details

Given Admin is on Login page
When Admin enters <email>,<password>
Then Admin should be logged in

Examples:
|email|password|
|"joganikhitha@gmail.com"|"Arunaprasad@11"|