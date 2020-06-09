$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PurchaseForeignCurrency.feature");
formatter.feature({
  "name": "Purchase Foreign Currency",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@www"
    }
  ]
});
formatter.scenario({
  "name": "Available\tcurrencies",
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
  "name": "the user accesses the Purchase\tforeign\tcurrency\tcash tab",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.PurchaseForeignCurrency.theUserAccessesThePurchaseForeignCurrencyCashTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "following\tcurrencies should be available",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.PurchaseForeignCurrency.following_currencies_should_be_available(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Error\tmessage for\tnot\tselecting\tcurrency",
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
  "name": "the user accesses the Purchase\tforeign\tcurrency\tcash tab",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.PurchaseForeignCurrency.theUserAccessesThePurchaseForeignCurrencyCashTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tries\tto\tcalculate\tcost\twithout\tselecting\ta\tcurrency",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.PurchaseForeignCurrency.user_tries_to_calculate_cost_without_selecting_a_currency()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error\tmessage\tshould\tbe\tdisplayed \"Please, ensure that you have filled all the required fields with valid values.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.PurchaseForeignCurrency.errorMessageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Error\tmessage for\tnot\tentering\tvalue",
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
  "name": "the user accesses the Purchase\tforeign\tcurrency\tcash tab",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.PurchaseForeignCurrency.theUserAccessesThePurchaseForeignCurrencyCashTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tries\tto\tcalculate\tcost\twithout\tentering\ta\tvalue",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.PurchaseForeignCurrency.user_tries_to_calculate_cost_without_entering_a_value()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error\tmessage\tshould\tbe\tdisplayed \"Please, ensure that you have filled all the required fields with valid values.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.PurchaseForeignCurrency.errorMessageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});