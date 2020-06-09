package com.zerobank.stepdefnitions;

import com.zerobank.pages.FindTransactionsPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class FindTransactions {
    FindTransactionsPage ft=new FindTransactionsPage();
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
        fc.fromDate.sendKeys(Keys.CONTROL + "a" +Keys.DELETE);
        fc.toDate.sendKeys(Keys.CONTROL + "a" +Keys.DELETE);

        fc.fromDate.sendKeys(  int1 + "-" + int2 + "-" + int3);
        fc.toDate.sendKeys( int4 + "-" + int5 + "-" + int6);
       // BrowserUtils.waitFor(3);
    }

    @When("clicks search")
    public void clicks_search() {
        BrowserUtils.waitFor(1);
        new FindTransactionsPage().findButton.click();
        //System.exit(1);

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
        Assert.assertFalse("lastdate bigger than first date",(lastDate>firstDate));

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

            Assert.assertTrue("no Problem",(s>=fDate && s<=tDate));


        }
    }

    @And("the results table should only not contain transactions dated {string}")
    public void theResultsTableShouldOnlyNotContainTransactionsDated(String arg0) {
        FindTransactionsPage fc = new FindTransactionsPage();
        Assert.assertFalse("this date inside the between days",fc.tableDates.contains(arg0));


    }
    @When("the user enters description {string}")
    public void the_user_enters_description(String string) {
        BrowserUtils.waitFor(1);
        FindTransactionsPage ft=new FindTransactionsPage();
        ft.description.sendKeys(Keys.CONTROL + "a" +Keys.DELETE);
        ft.description.sendKeys(string);

    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string) {
        FindTransactionsPage ft=new FindTransactionsPage();
        for (WebElement o : ft.tableDescription) {
            Assert.assertTrue("not only this decsription",o.getText().contains(string));
        }

    }

    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String string) {
        FindTransactionsPage ft=new FindTransactionsPage();
        for (WebElement o : ft.tableDescription) {
            Assert.assertFalse("not only this decsription",o.getText().contains(string));
        }
    }

    @Then("results table should show at least one result under {string}")
    public void results_table_should_show_at_least_one_result_under(String string) {
        BrowserUtils.waitFor(1);
       /* System.out.println(ft.tableDeposit.size());
        System.out.println(ft.tableWithdrawal.size());
        System.exit(1);*/
        if(string.equalsIgnoreCase("Deposit")){
            Assert.assertTrue("there is no result under the tab",ft.tableDeposit.size()>0);
        }else if(string.equalsIgnoreCase("Withdrawal")){
            Assert.assertTrue("there is no result under the tab",ft.tableWithdrawal.size()>0);
        }

    }

    @When("user selects type {string}")
    public void user_selects_type(String string) {
        ft.getSelected(string);
        ft.findButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("results table should show no result under {string}")
    public void results_table_should_show_no_result_under(String string) {
        if(string.equalsIgnoreCase("Deposit")){
            Assert.assertFalse("there is no result under the tab",ft.tableWithdrawal.contains(""));
        }else if(string.equalsIgnoreCase("Withdrawal")){
            Assert.assertFalse("there is no result under the tab",ft.tableDeposit.contains(""));
        }
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
