package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

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







}
