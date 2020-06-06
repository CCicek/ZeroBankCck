$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "LoginPage",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@www"
    }
  ]
});
formatter.scenario({
  "name": "Logining to page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@www"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.login.the_user_is_logged_in()"
});
