$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddNewPayee.feature");
formatter.feature({
  "name": "Add\tnew\tpayee\tunder\tpay\tbills",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add\ta\tnew\tpayee",
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
  "name": "Add New Payee tab",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AddNewPayee.add_New_Payee_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "creates\tnew\tpayee\tusing following\tinformation",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AddNewPayee.creates_new_payee_using_following_information(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "message \"The new payee The Law Offices of Hyde, Price \u0026 Scharks was successfully created.\" should\tbe\tdisplayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.AddNewPayee.messageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});