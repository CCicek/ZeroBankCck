package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewPayeePage extends PayBills {

    @FindBy(id = "alert_content")
    public WebElement alertContent;
}
