package com.zerobank.stepdefnitions;

import com.zerobank.pages.*;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Login {
    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPage().login();

        AccountSummaryPage accountSummary = new AccountSummaryPage();
        BrowserUtils.waitFor(1);
        accountSummary.navigateTo("Transfer Funds");
/*
        TransferFunds transferFunds = new TransferFunds();
        transferFunds.submitButton.click();
        System.out.println(Driver.get().switchTo().activeElement().getAttribute("validationMessage"));

        System.exit(1);
        transferFunds.setFromAccount("4");
        transferFunds.setToAccount("3");
        transferFunds.amount.sendKeys("3000");
        transferFunds.description.sendKeys("MyMoney");
        transferFunds.submitButton.click();
        transferFunds.submitButton.click();
        System.out.println(transferFunds.transoctionMessage.getText());*/
    }
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
        new LoginPage().login();
    }

    @Then("The page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals("Verify the title", actualTitle, expectedTitle);
    }

    @When("the user logs in with blank username or password")
    public void the_user_logs_in_with_blank_username_or_password() {
        new LoginPage().login(" ", " ");
    }

    @When("the user logs in with {string} {string}")
    public void the_user_logs_in_with(String username, String password) {
        new LoginPage().login(username,password);
    }

    @Then("the system should display error message {string}")
    public void the_system_should_display_error_message(String expectedMessage) {
        String actualMessage = new LoginPage().errorMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals(expectedMessage, actualMessage);

    }


}
