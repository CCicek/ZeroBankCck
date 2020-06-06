package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds extends BasePage{

    @FindBy(id = "tf_fromAccountId")
    public WebElement fromAccount;

    @FindBy(id = "tf_toAccountId")
    public WebElement toAccount;

    @FindBy(id = "tf_amount")
    public WebElement amount;

    @FindBy(id = "tf_description")
    public WebElement description;

    @FindBy(id = "btn_submit")
    public WebElement submitButton;

    @FindBy(id = "btn_cancel")
    public WebElement cancelButton;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement transoctionMessage;


    public void setFromAccount(String account){
        Select select = new Select(fromAccount);
        select.selectByValue(account);
    }

    public void setToAccount(String account){
        Select select = new Select(toAccount);
        select.selectByValue(account);
    }

}
