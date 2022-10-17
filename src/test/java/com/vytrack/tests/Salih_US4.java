package com.vytrack.tests;

import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.BrowserType;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Salih_US4 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void TC64_AC1() throws InterruptedException {
        // Expected Page Title: "All - Vehicle Contract - Entities - System - Car - Entities - System"

        driver.get("https://qa2.vytrack.com/");

        WebElement userName1 = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userName1.sendKeys("storemanager55");

        WebElement password1 = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password1.sendKeys("UserUser123");

        WebElement login = driver.findElement(By.xpath("//button[@id='_submit']"));
        login.click();

        WebElement fleetClick = driver.findElement(By.xpath("//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][1]"));
        Thread.sleep(2000);
        fleetClick.click();

        WebElement vehicleContracts = driver.findElement(By.xpath("(//ul[@class='dropdown-menu dropdown-menu-level-1 menu menu-level-1'])[2]/li[6]/a/span"));
        Thread.sleep(3000);
        vehicleContracts.click();

        Thread.sleep(3000);

        String actualTitlePage = driver.getTitle();
        String expectedTitle ="All - Vehicle Contract - Entities - System - Car - Entities - System";

        Thread.sleep(4000);

        Assert.assertEquals(actualTitlePage, expectedTitle);
        System.out.println("PASSED AC1");

    }

    @Test (priority = 2)
    public void TC64_AC2() {
        // Drivers should NOT able to access the Vehicle contracts page, the app should display, Expected:
        //   "You do not have permission to perform this action."

        driver.get("https://qa2.vytrack.com/");

        WebElement userName1 = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userName1.sendKeys("user10");

        WebElement password1 = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password1.sendKeys("UserUser123");

        WebElement login = driver.findElement(By.xpath("//button[@id='_submit']"));
        login.click();

        WebElement fleetClick = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetClick.click();

        WebElement vehicleContract = driver.findElement(By.xpath("(//div[@class='dropdown-menu-wrapper dropdown-menu-wrapper__placeholder'])[1]/div/ul/li[6]"));
        vehicleContract.click();

        WebElement actualAlertMessage = driver.findElement(By.xpath("(//div[@class='alert alert-error fade in top-messages '])[2]//div"));

        String expectedAlertMessage = "You do not have permission to perform this action.";

        Assert.assertTrue( expectedAlertMessage.contains(actualAlertMessage.getText()));
        System.out.println("PASSED AC2");

    }

}
