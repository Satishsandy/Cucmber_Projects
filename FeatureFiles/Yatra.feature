Feature: Login to Yatra
Scenario Outline: validate the data login the yatara
Given user navigate the yatara url
When user Click the MyAccount
When user Clcik the Signup button
When user Using the Username as "satishsuravarapu084@gamil.com"
When user Click the Continue 
When user Using thr Password as "Satish@989"
When user Click the Login button
When user Click the Hotel
When user Enter Cityname as "<City>" and Check-In as "<Date>" and Check-Out as "<date>"
When user Click the search 
When user Click the Choose room
When user Click the chooseRoom butoon
Then user close br
Examples:
|City|Date|date|
|Goa|27 Jun'22|28 Jun'22|


