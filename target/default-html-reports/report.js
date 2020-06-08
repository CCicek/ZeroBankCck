$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FindTransactions.feature");
formatter.feature({
  "name": "Find Transactions in Account Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search date range",
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
  "name": "the user accesses the Find Transactions tab",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.FindTransactions.the_user_accesses_the_Find_Transactions_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters date range from “2012-9-1” to “2012-9-6”",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.FindTransactions.the_user_enters_date_range_from_to(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.FindTransactions.clicks_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should only show transactions dates between \"2012-09-01\" to \"2012-09-06\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.FindTransactions.resultsTableShouldOnlyShowTransactionsDatesBetweenTo(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the results should be sorted by most recent date",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.FindTransactions.the_results_should_be_sorted_by_most_recent_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters date range from “2012-9-2” to “2012-9-6”",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.FindTransactions.the_user_enters_date_range_from_to(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.FindTransactions.clicks_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should only show transactions dates between “2012-9-2” to “2012-9-6”",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.FindTransactions.results_table_should_only_show_transactions_dates_between_to(java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the results table should only not contain transactions dated “2012-9-1”",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefnitions.FindTransactions.the_results_table_should_only_not_contain_transactions_dated(java.lang.Integer,java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "error_message": "io.cucumber.java.PendingException: TODO: implement me\r\n\tat com.zerobank.stepdefnitions.FindTransactions.the_results_table_should_only_not_contain_transactions_dated(FindTransactions.java:77)\r\n\tat ✽.the results table should only not contain transactions dated “2012-9-1”(file:///C:/Users/muham/Desktop/SDET/Coding/ZeroBankCck/src/test/resources/features/FindTransactions.feature:13)\r\n",
  "status": "pending"
});
formatter.after({
  "status": "passed"
});
});