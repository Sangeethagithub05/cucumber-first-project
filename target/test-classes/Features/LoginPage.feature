Feature: Verifying Customer details in Adactin Hotel
Scenario Outline: Verify the login details with valid credentials
Given user is on the Adactin Hotel page
When user enters the "<userName>" and "<password>"
And user should click on the login page
And user should select all the required details to book the Hotel "<firstName>","<lastName>","<billingAddress>","<creditCardNumber>","<cvvNumber>"
Then user should verify the order number


Examples:
|userName|password|firstName|lastName|billingAddress|creditCardNumber|cvvNumber|
|Sangeethasree|Sangeeviji@1995|Sangeetha|pv|Taramani|1234567891234567|6786|