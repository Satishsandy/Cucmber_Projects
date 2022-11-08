
Feature: validate the RediffMoney 

Scenario Outline:
validate Add Stock Module With mutual funds
Given Stocks navigate the Rediffmoney Url
When Stock Click to SignIn button
When Stock login Using Username as "Anil.boddupally16@gmail.com" and Password as "Anil@9971"
When Stock Click to login button
When Stock  Click to MutuaLfunds 
When Stock Enter the MFname as "<MFname>" and IAmount as "<IAmount>" and Date as "<Date>" and Price as "<Price>"
When Stock Click the AddMf button
When Stock Click the  Radio
When Stock Click the Delete
When Stock Click the oK button
Then Stock Close br
Examples:
|MFname|IAmount|Date|Price|
|HDFC Flexi Cap Fund - Regular Plan |7000|26-06-2022|3|
|HDFC TaxSaver - Direct Plan - |8000|26-06-2022|1|
|HDFC Top 100 Fund - Direct Plan - |9000|27-06-2022|2|




Scenario Outline:
validate Add stock Module With Add Stosk with Multiple Data
Given Stock navigate the Rediffmoney Url
When Stock Click To SignIn button
When Stock login Using Username as "Anil.boddupally16@gmail.com" and Password as "Anil@9971"
When Stock Click to login button
When Stock Click to My Whitelist 
When Stock Click to Addstocks button
When Stock Enter the Stockname as "<Sname>" and GoesAbove as"<Gabove>" and Goesdown as "<Gdown>"
When Stock Click to Add button
When Stock Click to Cross Symbol
When Stock Click to Yes buton
Then Stock Close br
Examples:
|Sname|Gabove|Gdown|
|Adani Green Energy |2000|1000|
|Adani Wilmar |4000|300|


