package com.vytrack.tests;

import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Ts2_71 {

    //by Anaris

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
    public void testSalesmanager() throws InterruptedException {
        WebElement enterUsername = driver.findElement(By.xpath("//input[@placeholder='Username or Email']"));
        enterUsername.sendKeys("salesmanager105");

        WebElement enterPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        enterPassword.sendKeys("UserUser123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement fleetButton = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetButton.click();

        WebElement odometerBtn = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[5]"));
        odometerBtn.click();

        WebElement errorMsg = driver.findElement(By.xpath("//div[.='You do not have permission to perform this action.']"));
        errorMsg.isDisplayed();
    }

    @Test
    public void testStoremanager() throws InterruptedException {

        WebElement enterUsername = driver.findElement(By.xpath("//input[@placeholder='Username or Email']"));
        enterUsername.sendKeys("storemanager55");

        WebElement enterPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        enterPassword.sendKeys("UserUser123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement fleetButton = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetButton.click();

        WebElement odometerBtn = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[5]"));
        odometerBtn.click();

        WebElement errorMsg = driver.findElement(By.xpath("//div[.='You do not have permission to perform this action.']"));
        errorMsg.isDisplayed();
    }

    @Test
    public void testUserAccount() throws InterruptedException {

        WebElement enterUsername = driver.findElement(By.xpath("//input[@placeholder='Username or Email']"));
        enterUsername.sendKeys("user10");

        WebElement enterPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        enterPassword.sendKeys("UserUser123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement fleetButton = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetButton.click();

        WebElement odometerBtn = driver.findElement(By.xpath("//span[.='Vehicle Odometer']"));
        odometerBtn.click();

        WebElement showOneAsDefault = driver.findElement(By.xpath("//input[@value='1']"));
        showOneAsDefault.isDisplayed();

        WebElement showTwentyFiveAsDefault = driver.findElement(By.xpath("//div[@class='btn-group']/button"));
        showTwentyFiveAsDefault.isDisplayed();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

