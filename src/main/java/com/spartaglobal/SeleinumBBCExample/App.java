package com.spartaglobal.SeleinumBBCExample;

import com.spartaglobal.BBCSite.BBCHomepage;
import com.spartaglobal.ToolsQAWebsite;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
    public static void main( String[] args ) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yasmin Jones\\Downloads\\chromedriver_win32\\chromedriver.exe");

        ChromeDriver chromeDriver = new ChromeDriver();

       // chromeDriver.navigate().to("https://www.bbc.co.uk/");
       // chromeDriver.findElementById("idcta-link").click();

     // chromeDriver.findElementById("username").sendKeys("");

        //BBCHomepage bbcHomepage = new BBCHomepage(chromeDriver);

       // bbcHomepage.goToTheBBCHomepage();
       // bbcHomepage.ClickSignInLink();
       // bbcHomepage.closeDriver(); //it doesn't wait for the page to render, so it may close before getting to the other page

        ToolsQAWebsite toolsQAWebsite = new ToolsQAWebsite(chromeDriver);

        toolsQAWebsite.goToHomePage();

        toolsQAWebsite.clickCookieButton();
        toolsQAWebsite.clickLinkText();
       System.out.println(toolsQAWebsite.getcurrentURL());
       toolsQAWebsite.backBroswer();
        toolsQAWebsite.inputFirstName("yasmin");
        toolsQAWebsite.inputlastName("Jones");
       System.out.println(toolsQAWebsite.getfirstnamefieldtesxt());
       System.out.println(toolsQAWebsite.getlastnamefieldtesxt());

        //toolsQAWebsite.getSexElement();

       toolsQAWebsite.getSexElement();
      // toolsQAWebsite.getYearsOfExperince();

       toolsQAWebsite.inputDate("12/11/2019");
        System.out.println(toolsQAWebsite.getDatefieldtext());

        toolsQAWebsite.getProfession();

        toolsQAWebsite.getAutomationTool();








    }
}