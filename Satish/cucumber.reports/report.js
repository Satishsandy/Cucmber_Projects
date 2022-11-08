$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Facebook.feature");
formatter.feature({
  "line": 2,
  "name": "facebook login module",
  "description": "",
  "id": "facebook-login-module",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 4679942000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "validate the facebook",
  "description": "",
  "id": "facebook-login-module;validate-the-facebook",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user navigate the Url of facebook",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user login the Username as \"9701749847\" and password as \"Satish@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click the yourProfile",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click the logout button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user closebr",
  "keyword": "Then "
});
formatter.match({
  "location": "LibraryFunctions.user_navigate_the_Url_of_facebook()"
});
formatter.result({
  "duration": 20737335000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9701749847",
      "offset": 28
    },
    {
      "val": "Satish@123",
      "offset": 57
    }
  ],
  "location": "LibraryFunctions.user_login_the_Username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 334692400,
  "status": "passed"
});
formatter.match({
  "location": "LibraryFunctions.user_click_the_login_button()"
});
formatter.result({
  "duration": 155250300,
  "status": "passed"
});
formatter.match({
  "location": "LibraryFunctions.user_click_the_yourProfile()"
});
formatter.result({
  "duration": 10121715500,
  "error_message": "org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: 5.000\n  (Session info: chrome\u003d106.0.5249.103)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-6IT123O\u0027, ip: \u0027192.168.231.142\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.103, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: C:\\Users\\satish\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:57018}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 3fd42098529a7c17a710737ff912ed66\n*** Element info: {Using\u003dxpath, value\u003d(//*[name()\u003d\u0027image\u0027])[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat stepDefination.LibraryFunctions.user_click_the_yourProfile(LibraryFunctions.java:439)\r\n\tat ✽.When user click the yourProfile(FeatureFiles/Facebook.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LibraryFunctions.user_click_the_logout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LibraryFunctions.user_closebr()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 225240500,
  "status": "passed"
});
});