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

    public BBCHomepage goToTheBBCHomepage () {
        driver.navigate().to(homepageURL);
        return this;
    }

    public BBCHomepage ClickSignInLink () {
        driver.findElement(signinLinkID).click();
        return this;
    }

    public BBCHomepage closeDriver () {
        driver.close();
        return this;
    }
}
