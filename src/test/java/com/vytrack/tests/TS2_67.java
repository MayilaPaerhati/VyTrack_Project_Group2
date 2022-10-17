package com.vytrack.tests;

// As a user, I should be to select any vehicle from the Vehicle page(web-table)

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TS2_67 {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void myUserStory67_Test1() {

        driver.get(ConfigurationReader.getProperty("env"));

        // Login: users are on the homepage
        WebElement userNameInfo = driver.findElement(By.id("prependedInput"));
        userNameInfo.sendKeys(ConfigurationReader.getProperty("storeManager1"));

        WebElement passwordInfo = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInfo.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();
        ;

        // Click the Vehicle button under the Fleet module
        WebElement fleetBtn = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]"));
        fleetBtn.click();
        BrowserUtils.sleep(3);

        WebElement vehicleBtn = driver.findElement(By.xpath("//span[.='Vehicles']"));
        vehicleBtn.click();
        BrowserUtils.sleep(3);

        // Verify all the checkboxes are unchecked
        WebElement allCheckboxBtn = driver.findElement(By.xpath("//button[@class='btn btn-default btn-small dropdown-toggle']/input"));
        allCheckboxBtn.isDisplayed();
        BrowserUtils.sleep(3);

        //Verify if users can check the first checkbox to check all the cars
        // click the 1st checkbox in the web-table
        WebElement firstCheckboxBtn = driver.findElement(By.xpath("//button[@class='btn btn-default btn-small dropdown-toggle']/input"));
        firstCheckboxBtn.click();
        //verify all the checkboxes also checked
        firstCheckboxBtn.isDisplayed();
        BrowserUtils.sleep(3);

        firstCheckboxBtn.click();
        BrowserUtils.sleep(3);

        //Verify if users check any car’s checkbox
        //user should check any car's checkbox
        WebElement anyCarCheckboxBtn = driver.findElement(By.xpath("(//input[@tabindex='-1'])[6]"));
        anyCarCheckboxBtn.click();

        //verify the box is checked
        anyCarCheckboxBtn.isDisplayed();
        BrowserUtils.sleep(3);

    }
    @Test
    public void myUserStory67_Test2() {

        driver.get(ConfigurationReader.getProperty("env"));

        // Log in the homepage
        WebElement userNameInfo = driver.findElement(By.id("prependedInput"));
        userNameInfo.sendKeys(ConfigurationReader.getProperty("salesManager1"));

        WebElement passwordInfo = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInfo.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();
        BrowserUtils.sleep(3);

        // Click the Vehicle button under the Fleet module
        WebElement fleetBtn = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]"));
        fleetBtn.click();
        BrowserUtils.sleep(3);

        WebElement vehicleBtn = driver.findElement(By.xpath("//span[.='Vehicles']"));
        vehicleBtn.click();
        BrowserUtils.sleep(3);

        // Verify all the checkboxes are unchecked
        WebElement allCheckboxBtn = driver.findElement(By.xpath("//button[@class='btn btn-default btn-small dropdown-toggle']/input"));
        allCheckboxBtn.isDisplayed();
        BrowserUtils.sleep(3);

        //Verify if users can check the first checkbox to check all the cars
        // click the 1st checkbox in the web-table
        WebElement firstCheckboxBtn = driver.findElement(By.xpath("//button[@class='btn btn-default btn-small dropdown-toggle']/input"));
        firstCheckboxBtn.click();
        //verify all the checkboxes also checked
        firstCheckboxBtn.isDisplayed();
        BrowserUtils.sleep(3);

        firstCheckboxBtn.click();
        BrowserUtils.sleep(3);

        //Verify if users check any car’s checkbox
        //user should check any car's checkbox
        WebElement anyCarCheckboxBtn = driver.findElement(By.xpath("(//input[@tabindex='-1'])[6]"));
        anyCarCheckboxBtn.click();

        //verify the box is checked
        anyCarCheckboxBtn.isDisplayed();
        BrowserUtils.sleep(3);
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();


    }
}