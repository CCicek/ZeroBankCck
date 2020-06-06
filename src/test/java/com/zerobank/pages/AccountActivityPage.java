package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy(linkText = "Show Transactions")
    public WebElement showTransactions;

    @FindBy(linkText = "Find Transactions")
    public WebElement findTransactions;

    @FindBy(id = "aa_accountId")
    public WebElement selectAccount;

    @FindBy (xpath = "//th")
    public List<WebElement> transactionsTableColumns;





    public void getSelected(String account){
        Select select = new Select(selectAccount);
        select.selectByVisibleText(account);
    }

}
