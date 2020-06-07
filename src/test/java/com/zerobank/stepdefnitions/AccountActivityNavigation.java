package com.zerobank.stepdefnitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigation {

    @When("the	user	clicks	on	{string} link	on	the	Account	Summary	page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String string) {
       AccountActivityPage accountActivityPage = new AccountActivityPage();
       accountActivityPage.navigateTo("Account Activity");
       accountActivityPage.getSelected(string);
       // BrowserUtils.waitFor(2);

    }

    @Then("the	Account	Activity page	should	be	displayed")
    public void the_Account_Activity_page_should_be_displayed() {
       String actualTitle= Driver.get().getTitle();

      // String expectedTitle=""
    }

    @Then("Account	drop	down	should	have	{string}	selected")
    public void account_drop_down_should_have_selected(String expectedOption) {
       AccountActivityPage accountActivityPage= new AccountActivityPage();
        Select select=new Select(accountActivityPage.selectAccount);
        String actualOption = select.getFirstSelectedOption().getText();
        System.out.println("actualOption = " + actualOption);
        Assert.assertEquals(expectedOption,actualOption);
    }

    @Then("the	{string} page	should	be	displayed")
    public void thePageShouldBeDisplayed(String expectedTitle) {
        String actualTitle= Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        System.out.println("actualTitle = " + actualTitle);
        BrowserUtils.waitFor(3);
    }
}
