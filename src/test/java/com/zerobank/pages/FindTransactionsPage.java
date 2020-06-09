package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FindTransactionsPage extends AccountActivityPage{

    @FindBy(id = "aa_description")
    public WebElement description;
    @FindBy(id="aa_fromDate")
    public WebElement fromDate;
    @FindBy(id = "aa_toDate")
    public WebElement toDate;
    @FindBy(id = "aa_fromAmount")
    public WebElement fromAmount;
    @FindBy(id = "aa_toAmount")
    public WebElement toAmount;
    @FindBy(id = "aa_type")
    public WebElement selectType;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement findButton;
    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//td[contains(text(),'ONLINE')]")
    public WebElement transactionTableOnline;
    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//td[contains(text(),'OFFICE')]")
    public WebElement transactionTableOffice;
    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//td[1]")
    public List<WebElement> tableDates;
    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//td[2]")
    public List<WebElement> tableDescription;
    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//td[3]")
    public List<WebElement> tableDeposit;
    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//td[4]")
    public List<WebElement> tableWithdrawal;

    @Override
    public void getSelected(String type){
        Select select = new Select(selectType);
        select.selectByVisibleText(type);
    }




}
