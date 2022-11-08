Feature: Order user module
Scenario Outline:  Validate the data to Product Amazon Order
Given  user Nvaigate the amazon login Url
When user Click the HOme&Account
When user Using the Usernmae as"9959394989"
When user Click the Contonue button
When user Using  Password as "Satish@989"
When User Using Login button
When user Using in Enter data as "<Samsung>"
When user click to search
When user Click the item
When user Click the Buynow button
When user Click the Pay on delivery button
When user click the continue
When user Click to PlaceOrder
Then user Close br
Examples:
|Samsung|
|SamsungM12|