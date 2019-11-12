package com.spartaglobal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQAWebsite {
    private WebDriver driver;

    private String homepageURL = "https://www.toolsqa.com/automation-practice-form/";

    private By TypeFirstName = By.id("input");


    public ToolsQAWebsite(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHomePage() {
        driver.navigate().to(homepageURL);
    }

    public void addFirstName() {
        driver.findElement(By.name("ID"));


    }

    public void FirstName() {
        driver.findElement(By.xpath("<input name=\"firstname\" type=\"text\">"));
    }

    public void FirstNameOne() {
        WebElement Element1 = driver.findElement(By.name("firstname"));
        Element1.sendKeys("Yasmin");
    }

    public void LastName () {
        WebElement Element1 = driver.findElement(By.id("lastname"));
        Element1.sendKeys("Jones");
    }

    public void FemaleButton () {
       // WebElement Element1 = driver.findElement(By.id("sex-1"));
        driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();

    }

    public void MaleButton () {
        driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
    }

    public void OneYearOfExperince () {
        driver.findElement(By.id(String.valueOf(1))).click();

        //input[@id='exp-0']")).click();
    }

    }





