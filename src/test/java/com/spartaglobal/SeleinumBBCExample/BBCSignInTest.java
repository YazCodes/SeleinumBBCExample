package com.spartaglobal.SeleinumBBCExample;

import com.spartaglobal.BBCSite.BBCHomepage;
import com.spartaglobal.BBCSite.BBCSigninPage;
import com.spartaglobal.BBCSite.BBCSite;
import com.spartaglobal.SeleniumConfig.SeleniumConfig;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCSignInTest {

    private static BBCSite bbcSite;

    private static String passwordErrorMessage = "Sorry, that password is too short. It needs to be eight characters or more.";
    private static String usernameErrorMessage = "Something's missing. Please check and try again.";
    private static String passwordMustIncludeALetter = "Sorry, that password isn't valid. Please include a letter.";
    private static String PasswordIsTooEasyError = "Sorry, that password isn't valid. Make sure it's hard to guess.";



    @BeforeClass
    public static void setup() {
       SeleniumConfig chromeDriverConfig = new SeleniumConfig("chrome", "C:\\Users\\Yasmin Jones\\Downloads\\chromedriver_win32\\chromedriver.exe");
        bbcSite = new BBCSite(chromeDriverConfig.getDriver());

    }

    @Test
        public void testPasswordError() {
            Assert.assertEquals(passwordErrorMessage,bbcSite.bbcSigninPage().goToSignInPage().inputPassword("12fh6").sendTabKey().getPasswordError());
    }

    @Test
    public void testUsernameNoCharacter(){
        Assert.assertEquals(usernameErrorMessage,bbcSite.bbcSigninPage().goToSignInPage().inputUserName(" ").sendTabKey().getUsernameError());
    }

    @Test
    public void testForPasswordMustIncludeALetter () {
        Assert.assertEquals(passwordMustIncludeALetter, bbcSite.bbcSigninPage().goToSignInPage().inputPassword("1224567898").sendTabKey().getPasswordError());
    }

    @Test
    public void testForPasswordIsTooEasy () {

    }
    }




