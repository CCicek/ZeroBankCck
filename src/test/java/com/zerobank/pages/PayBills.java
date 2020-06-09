package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PayBills extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'Pay Saved Payee')]")
    public WebElement paySavedPayee;

    @FindBy(xpath = "//a[contains(text(),'Add New Payee')]")
    public WebElement addNewPayee;

    @FindBy(xpath = "//a[contains(text(),'Purchase Foreign Currency')]")
    public WebElement purchaseForeignCurrency;

    @FindBy(id = "sp_payee")
    public WebElement selectPayee;

    @FindBy(id = "sp_account")
    public WebElement selectAccount;

    @FindBy(id = "sp_amount")
    public WebElement amount;

    @FindBy(id = "sp_date")
    public WebElement date;

    @FindBy(id = "sp_description")
    public WebElement description;

    @FindBy(id = "pay_saved_payees")
    public WebElement pay;

    @FindBy(id = "np_new_payee_name")
    public WebElement newPayeeName;

    @FindBy(id = "np_new_payee_address")
    public WebElement payeeAdress;

    @FindBy(id= "np_new_payee_account")
    public WebElement payeeAccount;

    @FindBy(id = "np_new_payee_details")
    public WebElement payeeDetails;

    @FindBy(id = "add_new_payee")
    public WebElement addButton;

    @FindBy(id = "pc_currency")
    public WebElement selectCurrency;

    @FindBy(id="pc_amount")
    public WebElement amountCurrency;

    @FindBy(xpath = "//body//label[2]")
    public WebElement currencyDollar;

    @FindBy(xpath = "//body//label[3]")
    public WebElement currencySelected;

    @FindBy(id = "pc_calculate_costs")
    public WebElement calculateCost;

    @FindBy(id ="pc_calculate_costs")
    public WebElement currencyPurchaseButton;





    public void setPayee(String account){
        Select select = new Select(selectPayee);
        select.selectByVisibleText(account);
    }
    public void getSelected(String account){
        Select select = new Select(selectAccount);
        select.selectByVisibleText(account);
    }
    public void currencyType(String account){
        Select select = new Select(selectCurrency);
        select.selectByVisibleText(account);
    }




}
