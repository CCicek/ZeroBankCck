package com.zerobank.stepdefnitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivitydef {

    @When("the user clicks {string} tab")
    public void the_user_clicks_tab(String tabName) {
        new AccountActivityPage().navigateTo(tabName);
    }

    @Then("the account dropdown default option should be {string}")
    public void the_account_dropdown_default_option_should_be(String defaultOption) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        Select select = new Select(accountActivityPage.selectAccount);

        String selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals("Verify the default option", defaultOption,selectedOption);

    }

    @Then("the account dropdown should have")
    public void the_account_dropdown_should_have(List<String> dropdownOptions) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        Select select = new Select(accountActivityPage.selectAccount);
        List<String> actualOptions = BrowserUtils.getElementsText(select.getOptions());
        Assert.assertEquals("Verify the options" , dropdownOptions,actualOptions);
    }

    @Then("the transaction table column names should be")
    public void the_transaction_table_column_names_should_be(List<String> expectedColumnNames) {
        List<String> actualColumnNames = BrowserUtils.getElementsText(new AccountActivityPage().transactionsTableColumns);
        Assert.assertEquals("Verify the column names", expectedColumnNames,actualColumnNames);
    }




}