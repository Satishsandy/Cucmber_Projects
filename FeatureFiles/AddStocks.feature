Feature: Creating Stocks Module
Scenario Outline:
Validate data Add stock in Multiple
Given Stocks navigate to url
When Stocks click to signin
When Stocks Login uding Username as "Anil.boddupally16@gmail.com" and Password as "Anil@9971"
When Stocks Click to login buttons
When Stocks Click to Addstocks
When Stocks Stockname as "<Sname>" and Dateofpurchase as "<DPurchase>" and Quantity as "<Quantity>" and Purchaseprice as "<PPrice>"
When Stocks Click to Add button 
When Stock Click the radio button
When Stock Click the delete
When Stock Click the Ok button
Then Stocks Close br
Examples:
|Sname|DPurchase|Quantity|PPrice|
|Quess Corp |26-06-2022|4|7000|
|Indoco Remedies |25-06-2022|2|8000|
|DFM Foods Lt|25-06-2022|2|2000|
