package com.spartaglobal.BBCSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BBCHomepage {

    private WebDriver driver;

    private String homepageURL = "https://www.bbc.co.uk/";

    private By signinLinkID = By.id("idcta-link");

    public BBCHomepage (WebDriver driver) {
        this.driver = driver;
    }

    public void goToTheBBCHomepage () {
        driver.navigate().to(homepageURL);
    }

    public void ClickSignInLink () {
        driver.findElement(signinLinkID).click();
    }

    public void closeDriver () {
        driver.close();
    }
}
