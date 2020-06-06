package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummary extends BasePage {

    @FindBy(xpath = "//a[contains(@href,'1')]")
    public WebElement savings1;
    @FindBy(xpath = "//a[contains(@href,'3')]")
    public WebElement savings2;
    @FindBy(xpath = "//a[contains(@href,'2')]")
    public WebElement checking;
    @FindBy(xpath = "//a[contains(@href,'4')]")
    public WebElement loan;
    @FindBy(xpath = "//a[contains(@href,'5')]")
    public WebElement creditCard;
    @FindBy(xpath = "//a[contains(@href,'6')]")
    public WebElement brokarage;



}
