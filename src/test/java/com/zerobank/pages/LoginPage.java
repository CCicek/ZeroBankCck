package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "user_login")
    public WebElement userName;


    @FindBy(id ="user_password")
    public WebElement password;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement loginButton;

    @FindBy (css = ".alert.alert-error")
    public WebElement errorMessage;

    public void login(){
        userName.sendKeys("username");
        password.sendKeys("password");
        loginButton.click();
    }


    public void login(String s, String s1) {
        userName.sendKeys(s);
        password.sendKeys(s1);
        loginButton.click();
    }
}
