package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://qa2.vytrack.com/user/login");
        driver.get(ConfigurationReader.getProperty("env"));
    }

    @Test
    public void testThreeColumnAsDriver() {

        //Driver.getDriver().get("https://qa2.vytrack.com/user/login");
        //Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        WebElement enterUsername = driver.findElement(By.xpath("//input[@placeholder='Username or Email']"));
        enterUsername.sendKeys(ConfigurationReader.getProperty("driver1"));

        WebElement enterPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        enterPassword.sendKeys(ConfigurationReader.getProperty("password"));

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


        driver.quit();


    }
}
