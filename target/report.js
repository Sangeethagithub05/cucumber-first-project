$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/LoginPage.feature");
formatter.feature({
  "name": "Verifying Customer details in Adactin Hotel",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify the login details with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the Adactin Hotel page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters the \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should click on the login page",
  "keyword": "And "
});
formatter.step({
  "name": "user should select all the required details to book the Hotel \"\u003cfirstName\u003e\",\"\u003clastName\u003e\",\"\u003cbillingAddress\u003e\",\"\u003ccreditCardNumber\u003e\",\"\u003ccvvNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should verify the order number",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "firstName",
        "lastName",
        "billingAddress",
        "creditCardNumber",
        "cvvNumber"
      ]
    },
    {
      "cells": [
        "Sangeethasree",
        "Sangeeviji@1995",
        "Sangeetha",
        "pv",
        "Taramani",
        "1234567891234567",
        "6786"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the login details with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the Adactin Hotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage.user_is_on_the_Adactin_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the \"Sangeethasree\" and \"Sangeeviji@1995\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.user_enters_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click on the login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_should_click_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select all the required details to book the Hotel \"Sangeetha\",\"pv\",\"Taramani\",\"1234567891234567\",\"6786\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_should_select_all_the_required_details_to_book_the_Hotel(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the order number",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_should_verify_the_order_number()"
});
formatter.result({
  "status": "passed"
});
});