#Feature: Register
#
#Scenario Outline: Register with given details
#
#Given User is on register page
#When User gave <id>,<name>,<mobile>,<email>,<password>,<role>
#Then User should be <status>
#
#Examples:
#|id |  name  | mobile   |         email           |password|  role   |      status           |
#|123|"ganesh"|8919335039|"ganeshsaradhi@gmail.com"|"ganesh"|"student"|"registered succesfull"|
#|123|"ganesh"|8919335039|"ganeshsaradhi@gmail.com"|"ganesh"|"student"|"user Already Exists"  |
 