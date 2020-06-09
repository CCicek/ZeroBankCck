package com.zerobank.stepdefnitions;

import com.zerobank.pages.ForeignCurrencyPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PurchaseForeignCurrency {
    ForeignCurrencyPage fc = new ForeignCurrencyPage();

    @Then("following	currencies should be available")
    public void following_currencies_should_be_available(io.cucumber.datatable.DataTable dataTable) {
        BrowserUtils.waitFor(1);
        List<String> expectedcurrency = dataTable.asList();
        Select select = new Select(fc.selectCurrency);
        List<String> actualCurrency = BrowserUtils.getElementsText(select.getOptions());
        Assert.assertTrue("its not contains all currency",actualCurrency.containsAll(expectedcurrency));
    }

    @When("user tries	to	calculate	cost	without	selecting	a	currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {
        BrowserUtils.waitFor(1);
        fc.calculateCost.click();
    }

    @Then("error	message	should	be	displayed")
    public void error_message_should_be_displayed() {

    }

    @When("user tries	to	calculate	cost	without	entering	a	value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {
        BrowserUtils.waitFor(1);
        fc.currencyDollar.click();
        fc.calculateCost.click();

    }

    @Given("the user accesses the Purchase	foreign	currency	cash tab")
    public void theUserAccessesThePurchaseForeignCurrencyCashTab() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPage().login();
        fc.navigateTo("Pay Bills");
        fc.purchaseForeignCurrency.click();
    }

    @Then("error	message	should	be	displayed {string}")
    public void errorMessageShouldBeDisplayed(String expectedErrorMessage) {
        String actualErrorMessage=Driver.get().switchTo().alert().getText();
        Assert.assertEquals("error message is displayed",expectedErrorMessage,actualErrorMessage);
    }
}
