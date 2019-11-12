package com.spartaglobal.ToolsQAWebExample;

import com.google.errorprone.annotations.Var;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ToolsQAWebsite {

    private WebDriver driver;
    private String homepageURL = "https://www.toolsqa.com/automation-practice-form/";

    private By cookieButtonID = By.id("cookie_action_close_header");
    private By privateLinkText = By.linkText("partial Link Test");
    private By linkTest = By.linkText("Link Test");
    private By firstname = By.name("firstname");
    private By lastname = By.id("lastname");
    private By sexElements = By.name("sex");
    private By exp = By.name("exp");
    private By datepicker = By.id("datepicker");
    private By profession = By.name("profession");
    private By tool = By.name("tool");
    private By continents = By.id("continents");


    public ToolsQAWebsite(WebDriver driver) {
        this.driver = driver;
    }

    public void backBroswer() {
        driver.navigate().back();
    }

    public void goToHomePage() {
        driver.navigate().to(homepageURL);
    }

    public void clickCookieButton() {
        driver.findElement(cookieButtonID).click();
    }

    public void clickLinkText() {
        driver.findElement(linkTest).click();
    }

    public String getcurrentURL() {
        return driver.getCurrentUrl();
    }

    public void inputFirstName(String firstnameText) {
        driver.findElement(firstname).sendKeys(firstnameText);

    }

    public void inputlastName(String lastnameText) {
        driver.findElement(lastname).sendKeys(lastnameText);
    }

    public String getfirstnamefieldtesxt() {
        return driver.findElement(firstname).getAttribute("value");
    }

    public String getlastnamefieldtesxt() {
        return driver.findElement(lastname).getAttribute("value");
    }

    public void getSexElement() {

        List<WebElement> sexItems = driver.findElements(sexElements);

        // System.out.println(driver.findElements(sexElements).size());
        // for (int i = 0; i < driver.findElements(sexElements).size(); i++) {
        //System.out.println(sexItems.getAttribute("id"));

        for (org.openqa.selenium.WebElement sexItem : sexItems) {
            driver.findElement(By.id(sexItem.getAttribute("id"))).click();
            driver.findElement(By.id(sexItem.getAttribute("id"))).isSelected();

        }
    }

    public void getYearsOfExperince() {

        List<WebElement> numbersOfYears = driver.findElements(exp);

        for (org.openqa.selenium.WebElement number : numbersOfYears) {
            driver.findElement(By.id(number.getAttribute("id"))).click();
            driver.findElement(By.id(number.getAttribute("id"))).isSelected();


        }
    }

    public void inputDate(String dateText) {
        driver.findElement(datepicker).sendKeys(dateText);
    }

    public String getDatefieldtext() {
        return driver.findElement(datepicker).getAttribute("value");
    }


    public void getProfession() {

        List<WebElement> typeOfProfession = driver.findElements(profession);


        for (org.openqa.selenium.WebElement DiffProfesions : typeOfProfession) {
            driver.findElement(By.id(DiffProfesions.getAttribute("id"))).click();
            driver.findElement(By.id(DiffProfesions.getAttribute("id"))).isSelected();

        }

    }

    public void getAutomationTool() {
        List<WebElement> typeOfTool = driver.findElements(tool);


        for (org.openqa.selenium.WebElement Difftool : typeOfTool) {
            driver.findElement(By.id(Difftool.getAttribute("id"))).click();
            driver.findElement(By.id(Difftool.getAttribute("id"))).isSelected();

        }

    }

    public  void checkContienetOptions() {
       WebElement continent = driver.findElement(continents);
        Select option = new Select(continent);

        for (int i = 0; i < option.getOptions().size(); i++) {
            option.selectByIndex(i);
            System.out.println(option.getFirstSelectedOption().getText());


        }


    }



}






