$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Yatra.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Yatra",
  "description": "",
  "id": "login-to-yatra",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "validate the data login the yatara",
  "description": "",
  "id": "login-to-yatra;validate-the-data-login-the-yatara",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user navigate the yatara url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Click the MyAccount",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Clcik the Signup button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Using the Username as \"satishsuravarapu084@gamil.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Click the Continue",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Using thr Password as \"Satish@989\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Click the Login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user Click the Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user Enter Cityname as \"\u003cCity\u003e\" and Check-In as \"\u003cDate\u003e\" and Check-Out as \"\u003cdate\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user Click the search",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user Click the Choose room",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user Click the chooseRoom butoon",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user close br",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "login-to-yatra;validate-the-data-login-the-yatara;",
  "rows": [
    {
      "cells": [
        "City",
        "Date",
        "date"
      ],
      "line": 17,
      "id": "login-to-yatra;validate-the-data-login-the-yatara;;1"
    },
    {
      "cells": [
        "Goa",
        "27 Jun\u002722",
        "28 Jun\u002722"
      ],
      "line": 18,
      "id": "login-to-yatra;validate-the-data-login-the-yatara;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4507481900,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "validate the data login the yatara",
  "description": "",
  "id": "login-to-yatra;validate-the-data-login-the-yatara;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user navigate the yatara url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Click the MyAccount",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Clcik the Signup button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Using the Username as \"satishsuravarapu084@gamil.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Click the Continue",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Using thr Password as \"Satish@989\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Click the Login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user Click the Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user Enter Cityname as \"Goa\" and Check-In as \"27 Jun\u002722\" and Check-Out as \"28 Jun\u002722\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user Click the search",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user Click the Choose room",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user Click the chooseRoom butoon",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user close br",
  "keyword": "Then "
});
formatter.match({
  "location": "LibraryFunctions.user_navigate_the_yatara_url()"
});
formatter.result({
  "duration": 9187009100,
  "status": "passed"
});
formatter.match({
  "location": "LibraryFunctions.user_Click_the_MyAccount()"
});
formatter.result({
  "duration": 207388600,
  "status": "passed"
});
formatter.match({
  "location": "LibraryFunctions.user_Clcik_the_Signup_button()"
});
formatter.result({
  "duration": 5473387800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "satishsuravarapu084@gamil.com",
      "offset": 28
    }
  ],
  "location": "LibraryFunctions.user_Using_the_Username_as(String)"
});
formatter.result({
  "duration": 459232400,
  "status": "passed"
});
formatter.match({
  "location": "LibraryFunctions.user_Click_the_Continue()"
});
formatter.result({
  "duration": 2216285900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Satish@989",
      "offset": 28
    }
  ],
  "location": "LibraryFunctions.user_Using_thr_Password_as(String)"
});
formatter.result({
  "duration": 2218634700,
  "status": "passed"
});
formatter.match({
  "location": "LibraryFunctions.user_Click_the_Login_button()"
});
formatter.result({
  "duration": 2155842600,
  "status": "passed"
});
formatter.match({
  "location": "LibraryFunctions.user_Click_the_Hotel()"
});
formatter.result({
  "duration": 90493100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[@class\u003d\u0027demo-icon icon-hotels\u0027]\"}\n  (Session info: chrome\u003d103.0.5060.114)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-6IT123O\u0027, ip: \u0027192.168.77.142\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 103.0.5060.114, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\satish\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:55102}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 2e23f698eecbb012640216897b294834\n*** Element info: {Using\u003dxpath, value\u003d//span[@class\u003d\u0027demo-icon icon-hotels\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat stepDefination.LibraryFunctions.user_Click_the_Hotel(LibraryFunctions.java:373)\r\n\tat ✽.When user Click the Hotel(FeatureFiles/Yatra.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Goa",
      "offset": 24
    },
    {
      "val": "27 Jun\u002722",
      "offset": 46
    },
    {
      "val": "28 Jun\u002722",
      "offset": 75
    }
  ],
  "location": "LibraryFunctions.user_Enter_Cityname_as_and_Check_In_as_and_Check_Out_as(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LibraryFunctions.user_Click_the_search()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LibraryFunctions.user_Click_the_Choose_room()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LibraryFunctions.user_Click_the_chooseRoom_butoon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LibraryFunctions.user_close_br()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 436475000,
  "status": "passed"
});
});