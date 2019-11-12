package com.spartaglobal.BBCSite;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BBCSite {
    private WebDriver driver;
    private BBCHomepage bbcHomepage;
    private BBCSigninPage bbcSigninPage;

    public BBCSite(WebDriver driver) {
        this.driver = driver;
        this.bbcHomepage = new BBCHomepage(driver);
        this.bbcSigninPage = new BBCSigninPage(driver);

        //driver.manage().window().setSize(new Dimension(1200, 600 ));
       // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public BBCHomepage bbcHomepage () {
        return bbcHomepage;
    }

    public BBCSigninPage bbcSigninPage() {
        return bbcSigninPage;
    }
}
