package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage {

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
    @FindBy(xpath = "(//h2[contains(text(),'Cash Accounts')]/..//th)[7]")
    public WebElement creditCardAccount;
    @FindBy(xpath = "(//h2[contains(text(),'Cash Accounts')]/..//th)[8]")
    public WebElement creditCreditCard;
    @FindBy(xpath = "(//h2[contains(text(),'Cash Accounts')]/..//th)[9]")
    public WebElement creditCardBalance;

    @FindBy(className = "board-header")
    public List<WebElement> accountTypes;

    @FindBy(xpath = "//h2[contains(text(),'Credit Accounts')]//following-sibling::div[1]//thead")
    public List<WebElement> creditAccountsColumns;

    public List<String> getColumnNames (String accountType){
        String xpath = "//h2[contains(text(),'" +accountType+ "')]//following-sibling::div[1]//th";

        return BrowserUtils.getElementsText(By.xpath(xpath));
    }





}
