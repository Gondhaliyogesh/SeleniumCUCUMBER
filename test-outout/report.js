$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/CUCUMBER/ParadigmCucumber/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Free Paradigm Login Feature",
  "description": "",
  "id": "free-paradigm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free Paradigm Login Test Scenario",
  "description": "",
  "id": "free-paradigm-login-feature;free-paradigm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Open Paradigm Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User Access Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage_StepDefination.open_Paradigm_Application()"
});
formatter.result({
  "duration": 17109482900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage_StepDefination.enter_username_and_Password()"
});
formatter.result({
  "duration": 173839600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage_StepDefination.user_Access_Login_Page()"
});
formatter.result({
  "duration": 232557600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage_StepDefination.close_the_browser()"
});
formatter.result({
  "duration": 6874791700,
  "status": "passed"
});
});