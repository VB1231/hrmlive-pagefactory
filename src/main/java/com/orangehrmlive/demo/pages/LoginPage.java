package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(name = "username")
    WebElement userName;
    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[@type ='submit']")
    WebElement singIn;
    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement clickOnForgot;

    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']")
    WebElement resetText;

    public void enterUserName(String email) {
        Reporter.log("Enter user name"+email.toString());
        sendTextToElement(userName, email);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password"+passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnSignIn() {
        Reporter.log("click on sign in"+singIn.toString());
        clickOnElement(singIn);
    }

    public String verifyText() {
        Reporter.log("get welcome text"+welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnForgot() {
        Reporter.log("click on forgot button"+clickOnForgot.toString());
        clickOnElement(clickOnForgot);
    }

    public String verifyResetText() {
        Reporter.log("verify reset text"+resetText.toString());
        return getTextFromElement(resetText);
    }
}
