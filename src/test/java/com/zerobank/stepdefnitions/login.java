package com.zerobank.stepdefnitions;

import com.zerobank.pages.*;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;

public class login {
    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPage().login();

        AccountSummary accountSummary = new AccountSummary();
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
}
