Feature: User Registration

Scenario Outline:  User Registration with given details

Given User is on registration page
When User enters <firstName>,<lastName>,<email>,<password>,<mobile>,<role>
Then User should be <status>

Examples:
|firstName|lastName|email|password|mobile|role|status|
|"UshaShree"|"Rudroju"|"usha123@gmail.com"|"Usha@123"|987654321|"admin"|"registered successfully"|
|"Chaithanya"|"Rudroju"|"sony123@gmail.com"|"Sony@123"|987654321|"student"|"registered successfully"|
