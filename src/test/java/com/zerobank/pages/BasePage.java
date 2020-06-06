package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "(//a[@class=\"dropdown-toggle\"])[2]")
public WebElement profileButton;

@FindBy(xpath = "(//a[@class=\"dropdown-toggle\"])[1]")
public WebElement settingsButton;

@FindBy(id = "logout_link")
public WebElement logout;

@FindBy(id = "help_link")
public WebElement help;

@FindBy(id = "searchTerm")
public WebElement search;












    public void navigateTo(String tab){
        String tabLocator = "//a[normalize-space(text())='" + tab +"']";
        Driver.get().findElement(By.xpath(tabLocator)).click();
    }
}
