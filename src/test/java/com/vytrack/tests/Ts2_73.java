package com.cydeo.tests.myprojects;

import com.vytrack.utilities.*;
import com.vytrack.utilities.WebDriverFactory;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Ts2_73 {

    /*
    As a user, I want to manage filters on the Vehicle Costs page. (Web-table and checkbox)

    AC #1: Users should see three columns on the Vehicle Cost page.
               Expected Column names:
               TYPE, TOTAL PRICE, DATE
     */


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperty("env"));
        BrowserUtils.sleep(2);
    }

    @Test (priority = 1)
    public void testThreeColumnAsDriver(){

        WebElement enterUsername = driver.findElement(By.xpath("//input[@placeholder='Username or Email']"));
        enterUsername.sendKeys("user6");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("UserUser123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        BrowserUtils.sleep(2);

        WebElement fleetButton = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetButton.click();
        BrowserUtils.sleep(2);

        WebElement vehicleCostsBtn = driver.findElement(By.xpath("//span[.='Vehicle Costs']"));
        vehicleCostsBtn.click();
        BrowserUtils.sleep(2);

        WebElement typeDisplay = driver.findElement(By.xpath("//span[.='Type']"));
        Assert.assertEquals(typeDisplay.getText(), "TYPE", "Displaying TYPE FAILED!");

        WebElement totalPriceDisplay = driver.findElement(By.xpath("//span[.='Total Price']"));
        Assert.assertEquals(totalPriceDisplay.getText(), "TOTAL PRICE", "Displaying TOTAL PRICE FAILED!");

        WebElement dateDisplay = driver.findElement(By.xpath("//span[.='Date']"));
        Assert.assertEquals(dateDisplay.getText(),"DATE", "Displaying DATE FAILED!");
    }

    @Test (priority = 2)
    public void testThreeColumnAsStoremanager(){

        WebElement enterUsername = driver.findElement(By.xpath("//input[@placeholder='Username or Email']"));
        enterUsername.sendKeys("storemanager56");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("UserUser123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        BrowserUtils.sleep(2);

        WebElement fleetButton = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetButton.click();
        BrowserUtils.sleep(2);

        WebElement vehicleCostsBtn = driver.findElement(By.xpath("//span[.='Vehicle Costs']"));
        vehicleCostsBtn.click();
        BrowserUtils.sleep(2);

        WebElement typeDisplay = driver.findElement(By.xpath("//span[.='Type']"));
        Assert.assertEquals(typeDisplay.getText(), "TYPE", "Displaying TYPE FAILED!");

        WebElement totalPriceDisplay = driver.findElement(By.xpath("//span[.='Total Price']"));
        Assert.assertEquals(totalPriceDisplay.getText(), "TOTAL PRICE", "Displaying TOTAL PRICE FAILED!");

        WebElement dateDisplay = driver.findElement(By.xpath("//span[.='Date']"));
        Assert.assertEquals(dateDisplay.getText(),"DATE", "Displaying DATE FAILED!");
    }

    @Test (priority = 3)
    public void testThreeColumnAsSalesmanager(){

        WebElement enterUsername = driver.findElement(By.xpath("//input[@placeholder='Username or Email']"));
        enterUsername.sendKeys("salesmanager106");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("UserUser123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        BrowserUtils.sleep(2);

        WebElement fleetButton = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetButton.click();
        BrowserUtils.sleep(2);

        WebElement vehicleCostsBtn = driver.findElement(By.xpath("//span[.='Vehicle Costs']"));
        vehicleCostsBtn.click();
        BrowserUtils.sleep(2);

        WebElement typeDisplay = driver.findElement(By.xpath("//span[.='Type']"));
        Assert.assertEquals(typeDisplay.getText(), "TYPE", "Displaying TYPE FAILED!");

        WebElement totalPriceDisplay = driver.findElement(By.xpath("//span[.='Total Price']"));
        Assert.assertEquals(totalPriceDisplay.getText(), "TOTAL PRICE", "Displaying TOTAL PRICE FAILED!");

        WebElement dateDisplay = driver.findElement(By.xpath("//span[.='Date']"));
        Assert.assertEquals(dateDisplay.getText(),"DATE", "Displaying DATE FAILED!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
