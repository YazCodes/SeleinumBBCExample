package com.spartaglobal.BBCSite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class BBCSigninPage {

    private WebDriver driver;

    private String bbcSignInPageURL = "https://account.bbc.com/signin";
    private By userNameFieldID = By.id("user-identifier-input");
    private By passWordFieldID = By.id("password-input");
    private By submitButtonID = By.id("submit-button");

    private By passwordErrorID =By.id("form-message-password");
    private By userNameErrorID = By.id("form-message-username");

    public BBCSigninPage(WebDriver driver) {
        this.driver = driver;
    }

    public BBCSigninPage goToSignInPage () {
        driver.navigate().to(bbcSignInPageURL);
        return this;
    }

    public BBCSigninPage inputUserName( String username) {
        driver.findElement(userNameFieldID).sendKeys(username);
        return this;
    }

    public BBCSigninPage inputPassword (String password) {
        driver.findElement(passWordFieldID).sendKeys(password);
        return this;
    }

    public BBCSigninPage clickSubmitButton () {
        driver.findElement(submitButtonID).click();
        return this;
    }

    public BBCSigninPage FindElementById ()
    { driver.findElement(By.id("form-message--password")).getText();
    return this;

    }


    public String getUsernameError () {
        return driver.findElement(userNameErrorID).getText();
    }


    public String getPasswordError () {
        return driver.findElement(passwordErrorID).getText();
    }

    public  BBCSigninPage sendTabKey () {
        driver.findElement(passWordFieldID).sendKeys(Keys.TAB);
        return this;
    }




}
