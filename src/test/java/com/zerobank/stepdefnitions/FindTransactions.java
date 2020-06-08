package com.zerobank.stepdefnitions;

import com.zerobank.pages.FindTransactionsPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindTransactions {

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPage().login();
        new FindTransactionsPage().navigateTo("Account Activity");
        new FindTransactionsPage().findTransactions.click();
    }

    @When("the user enters date range from “{int}-{int}-{int}” to “{int}-{int}-{int}”")
    public void the_user_enters_date_range_from_to(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
        BrowserUtils.waitFor(1);
        FindTransactionsPage fc = new FindTransactionsPage();
        fc.fromDate.sendKeys(int1 + "-" + int2 + "-" + int3);
        fc.toDate.sendKeys(int4 + "-" + int5 + "-" + int6);
    }

    @When("clicks search")
    public void clicks_search() {
        new FindTransactionsPage().findButton.click();
        //System.exit(1);
        BrowserUtils.waitFor(1);
    }

    @Then("results table should only show transactions dates between “{int}-{int}-{int}” to “{int}-{int}-{int}”")
    public void results_table_should_only_show_transactions_dates_between_to(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {

        FindTransactionsPage ft = new FindTransactionsPage();
        // System.out.println(BrowserUtils.getElementsText(ft.tableDates));
      //  System.out.println(ft.tableDates.size());
        for (WebElement alltransactionsDates : ft.tableDates) {
            String str = alltransactionsDates.getText();
            str = str.replace("-", "");
           // System.out.println(str);

            //System.out.println(str.charAt(4));
            // System.out.println(str);
            // String[] splitStr = str.split("-");
            //System.out.println("Arrays.toString(splitStr) = " + Arrays.toString(splitStr));

            //  System.out.println(str.toString());
            //  System.out.println(str.toString().length());
        }
    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {

        FindTransactionsPage ft = new FindTransactionsPage();
        int firstDate=Integer.valueOf(ft.tableDates.get(0).getText().replace("-",""));
        int lastDate=Integer.valueOf(ft.tableDates.get(ft.tableDates.size()-1).getText().replace("-",""));
        //System.out.println(firstDate);
        //System.out.println(lastDate);
        Assert.assertTrue("lastdate bigger than first date",(lastDate>firstDate));

    }

    @Then("the results table should only not contain transactions dated “{int}-{int}-{int}”")
    public void the_results_table_should_only_not_contain_transactions_dated(Integer int1, Integer int2, Integer int3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user enters description “ONLINE”")
    public void the_user_enters_description_ONLINE() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should only show descriptions containing “ONLINE”")
    public void results_table_should_only_show_descriptions_containing_ONLINE() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user enters description “OFFICE”")
    public void the_user_enters_description_OFFICE() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should only show descriptions containing “OFFICE”")
    public void results_table_should_only_show_descriptions_containing_OFFICE() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should not show descriptions containing “OFFICE”")
    public void results_table_should_not_show_descriptions_containing_OFFICE() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user enters description “online”")
    public void the_user_enters_description_online() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should show at least one result under Deposit")
    public void results_table_should_show_at_least_one_result_under_Deposit() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should show at least one result under Withdrawal")
    public void results_table_should_show_at_least_one_result_under_Withdrawal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user selects type “Deposit”")
    public void user_selects_type_Deposit() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should show no result under Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user selects type “Withdrawal”")
    public void user_selects_type_Withdrawal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should show no result under Deposit")
    public void results_table_should_show_no_result_under_Deposit() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void resultsTableShouldOnlyShowTransactionsDatesBetweenTo(String fromDate, String toDate) {
        fromDate =fromDate.replace("-","");
        toDate=toDate.replace("-","");
        int tDate=Integer.valueOf(toDate);
        int fDate=Integer.valueOf(fromDate);
        FindTransactionsPage ft = new FindTransactionsPage();
       // System.out.println(ft.tableDates.size());
        for (WebElement alltransactionsDates : ft.tableDates) {
            String str = alltransactionsDates.getText();
            str = str.replace("-", "");
            int s=Integer.valueOf(str);
           // System.out.println(tDate + "----" + fDate + "----" + s);

            Assert.assertTrue("no Problem",(s>=fDate && s<=tDate));


        }
    }
/*
    @When("the user enters date range from “{int} {int} {int}” to “{int} {int} {int}”")
    public void theUserEntersDateRangeFromTo(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        //System.out.println(arg5);
        BrowserUtils.waitFor(1);
        FindTransactionsPage fc=new FindTransactionsPage();
        fc.fromDate.sendKeys(arg0 +  "-" + arg1 + "-" + arg2);
        fc.toDate.sendKeys(arg3 + "-" + arg4 + "-" + arg5);

    }
}*/
}