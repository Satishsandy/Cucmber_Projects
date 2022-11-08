@tag
Feature: facebook login module
Scenario: validate the facebook
Given user navigate the Url of facebook
When user login the Username as "9701749847" and password as "Satish@123"
When user click the login button
When user click the yourProfile
When user click the logout button
Then user closebr
