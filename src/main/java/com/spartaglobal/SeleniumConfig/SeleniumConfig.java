package com.spartaglobal.SeleniumConfig;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumConfig {  //this is testing things on a chrome browser

    private WebDriver driver;

    public SeleniumConfig(String browser, String driverpath ) {
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", driverpath);
            driver = new ChromeDriver();

        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setImpliciateWaitTime (int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public void setScreenSize (int width, int height) {
        driver.manage().window().setSize(new Dimension(width,height));

    }
}

