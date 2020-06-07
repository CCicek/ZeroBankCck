$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivityNavigation.feature");
formatter.feature({
  "name": "Navigating\tto\tspecific\taccounts\tin\tAccounts\tActivity",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@www"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Savings\taccount\tredirect \u003cdropdown\u003e",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the\tuser\tis\tlogged\tin",
  "keyword": "Given "
});
formatter.step({
  "name": "the\tuser\tclicks\ton\t\"\u003cdropDown\u003e\" link\ton\tthe\tAccount\tSummary\tpage",
  "keyword": "When "
});
formatter.step({
  "name": "the\t\"Zero - Account Activity\" page\tshould\tbe\tdisplayed",
  "keyword": "Then "
});
formatter.step({
  "name": "Account\tdrop\tdown\tshould\thave\t\"\u003cdropDown\u003e\"\tselected",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "dropDown"
      ]
    },
    {
      "cells": [
        "Savings"
      ]
    },
    {
      "cells": [
        "Brokerage"
      ]
    },
    {
      "cells": [
        "CheckingA"
      ]
    },
    {
      "cells": [
        "Credit Card"
      ]
    },
    {
      "cells": [
        "Loan"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Savings\taccount\tredirect \u003cdropdown\u003e",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "the\tuser\tis\tlogged\tin",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.Login.theUserIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the\tuser\tclicks\ton\t\"Savings\" link\ton\tthe\tAccount\tSummary\tpage",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AccountActivityNavigation.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the\t\"Zero - Account Activity\" page\tshould\tbe\tdisplayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AccountActivityNavigation.thePageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account\tdrop\tdown\tshould\thave\t\"Savings\"\tselected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AccountActivityNavigation.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Savings\taccount\tredirect \u003cdropdown\u003e",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "the\tuser\tis\tlogged\tin",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.Login.theUserIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the\tuser\tclicks\ton\t\"Brokerage\" link\ton\tthe\tAccount\tSummary\tpage",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AccountActivityNavigation.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the\t\"Zero - Account Activity\" page\tshould\tbe\tdisplayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AccountActivityNavigation.thePageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account\tdrop\tdown\tshould\thave\t\"Brokerage\"\tselected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AccountActivityNavigation.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Savings\taccount\tredirect \u003cdropdown\u003e",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "the\tuser\tis\tlogged\tin",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.Login.theUserIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the\tuser\tclicks\ton\t\"CheckingA\" link\ton\tthe\tAccount\tSummary\tpage",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AccountActivityNavigation.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: CheckingA\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-9QKTLD8\u0027, ip: \u0027192.168.1.71\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.1\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:147)\r\n\tat com.zerobank.pages.AccountActivityPage.getSelected(AccountActivityPage.java:31)\r\n\tat com.zerobank.stepdefnitions.AccountActivityNavigation.the_user_clicks_on_link_on_the_Account_Summary_page(AccountActivityNavigation.java:18)\r\n\tat ✽.the\tuser\tclicks\ton\t\"CheckingA\" link\ton\tthe\tAccount\tSummary\tpage(file:///C:/Users/muham/Desktop/SDET/Coding/ZeroBankCck/src/test/resources/features/AccountActivityNavigation.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the\t\"Zero - Account Activity\" page\tshould\tbe\tdisplayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AccountActivityNavigation.thePageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Account\tdrop\tdown\tshould\thave\t\"CheckingA\"\tselected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AccountActivityNavigation.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Savings\taccount\tredirect \u003cdropdown\u003e",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "the\tuser\tis\tlogged\tin",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.Login.theUserIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the\tuser\tclicks\ton\t\"Credit Card\" link\ton\tthe\tAccount\tSummary\tpage",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AccountActivityNavigation.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the\t\"Zero - Account Activity\" page\tshould\tbe\tdisplayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AccountActivityNavigation.thePageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account\tdrop\tdown\tshould\thave\t\"Credit Card\"\tselected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AccountActivityNavigation.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Savings\taccount\tredirect \u003cdropdown\u003e",
  "description": "",
  "keyword": "Scenario Outline",
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
  "name": "the\tuser\tis\tlogged\tin",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.Login.theUserIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the\tuser\tclicks\ton\t\"Loan\" link\ton\tthe\tAccount\tSummary\tpage",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AccountActivityNavigation.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the\t\"Zero - Account Activity\" page\tshould\tbe\tdisplayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AccountActivityNavigation.thePageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account\tdrop\tdown\tshould\thave\t\"Loan\"\tselected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AccountActivityNavigation.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});