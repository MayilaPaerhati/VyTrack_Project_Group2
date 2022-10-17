package com.vytrack.tests;

import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Ts2_66 {

    // by Anaris


    /*
As a user, I want to view edit car info icons from the Vehicle page
 TC #1: Verify see “view, edit, delete” when they hover the mouse to the three dots
1. Open browser
2. Go to website: https://qa2.vytrack.com/user/login
3. Click to “Fleet” button
4. Click to "Vehicles" button
5. Click to three dot to see “view, edit, delete” options
5. Verify “view, edit, delete” options are displaying.
    */

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");
        Thread.sleep(2000);
    }

    @Test
    public void viewEditCarInfoSalesManager() throws InterruptedException {
        Thread.sleep(2000);
        WebElement enterUsername = driver.findElement(By.xpath("//input[@placeholder='Username or Email']"));
        enterUsername.sendKeys("salesmanager105");

        WebElement enterPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        enterPassword.sendKeys("UserUser123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement fleetButton = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetButton.click();

        WebElement vehiclesButton = driver.findElement(By.xpath("//span[.='Vehicles']"));
        vehiclesButton.click();

        Thread.sleep(2000);

        WebElement threeDotButton = driver.findElement(By.xpath("//td[@data-column-label='test']/div/div/a"));

        new Actions(driver).moveToElement(threeDotButton).perform();

        WebElement verifyThreeOptions = driver.findElement(By.xpath("(//div[@class='more-bar-holder']/div)[1]"));
        verifyThreeOptions.isDisplayed();

        Assert.assertTrue(verifyThreeOptions.isDisplayed(), "Displaying hover over three buttons FAILED!");
        System.out.println("Displaying hover over three buttons - " + verifyThreeOptions.isDisplayed());

    }

    @Test
    public void viewEditCarInfoStoreManager() throws InterruptedException {
        Thread.sleep(2000);
        WebElement enterUsername = driver.findElement(By.xpath("//input[@placeholder='Username or Email']"));
        enterUsername.sendKeys("storemanager55");

        WebElement enterPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        enterPassword.sendKeys("UserUser123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement fleetButton = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetButton.click();

        WebElement vehiclesButton = driver.findElement(By.xpath("//span[.='Vehicles']"));
        vehiclesButton.click();

        Thread.sleep(2000);

        WebElement threeDotButton = driver.findElement(By.xpath("//td[@data-column-label='test']/div/div/a"));

        new Actions(driver).moveToElement(threeDotButton).perform();

        WebElement verifyThreeOptions = driver.findElement(By.xpath("(//div[@class='more-bar-holder']/div)[1]"));
        verifyThreeOptions.isDisplayed();

        Assert.assertTrue(verifyThreeOptions.isDisplayed(), "Displaying hover over three buttons FAILED!");
        System.out.println("Displaying hover over three buttons - " + verifyThreeOptions.isDisplayed());
    }

    @Test
    public void viewEditCarInfoUser() throws InterruptedException {
        WebElement enterUsername = driver.findElement(By.xpath("//input[@placeholder='Username or Email']"));
        enterUsername.sendKeys("User10");

        WebElement enterPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        enterPassword.sendKeys("UserUser123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement fleetButton = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetButton.click();

        WebElement vehiclesButton = driver.findElement(By.xpath("//span[.='Vehicles']"));
        vehiclesButton.click();

        Thread.sleep(2000);

        WebElement threeDotButton = driver.findElement(By.xpath("//td[@data-column-label='test']/div/div/a"));

        new Actions(driver).moveToElement(threeDotButton).perform();

        WebElement verifyThreeOptions = driver.findElement(By.xpath("(//div[@class='more-bar-holder']/div)[1]"));
        verifyThreeOptions.isDisplayed();

        Assert.assertTrue(verifyThreeOptions.isDisplayed(), "Displaying hover over three buttons FAILED!");
        System.out.println("Displaying hover over three buttons - " + verifyThreeOptions.isDisplayed());

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}