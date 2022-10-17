package com.vytrack.tests;

import com.google.common.base.Verify;
import com.vytrack.utilities.WebDriverFactory;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US_11 {


    WebDriver driver;

    @BeforeMethod

    public void setUp(){
         driver = WebDriverFactory.getDriver("chrome");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("https://qa2.vytrack.com/user/login");


    }

    @Test

    public void vyTrack2() throws InterruptedException {
       // Log in as store or sales managers

        WebElement userName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userName.sendKeys("storemanager56");
        WebElement userPassword = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        userPassword.sendKeys("UserUser123");

        WebElement loginBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
        loginBtn.click();
        Thread.sleep(5000);




        // Click the “Vehicle Odometers” under the Fleet

        WebElement fleetBtn1 = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetBtn1.click();
        Thread.sleep(5000);

        WebElement vehicleOdometerBtn = driver.findElement(By.xpath("//span[.='Vehicle Odometer']"));

        vehicleOdometerBtn.click();
        Thread.sleep(5000);

      //  WebElement vehicleOdometerBtn = driver.findElement(By.xpath("(//div[@id = 'main-menu']//li[@class = 'dropdown-menu-single-item'][4])[1]"));
        //Thread.sleep(5000);
       // vehicleOdometerBtn.click();






        // Verify the managers see “You do not have permission to perform this action.”

        WebElement managerText = driver.findElement(By.xpath("//div[.='You do not have permission to perform this action.']"));
        String actualTextMessage = managerText.getText();
        String expectedTextMessage = "You do not have permission to perform this action.";





    }
    @Test

    public void vyTrack3() throws InterruptedException {

       // Log in as drivers

        WebElement driverName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        driverName.sendKeys("user7");
        WebElement driverPassword = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        driverPassword.sendKeys("UserUser123");

        WebElement loginBtn2 = driver.findElement(By.xpath("//button[@id='_submit']"));
        loginBtn2.click();
        Thread.sleep(5000);







        // Click the “Vehicle Odometers” under the Fleet

        WebElement fleetBtn = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        fleetBtn.click();
        Thread.sleep(5000);

        WebElement vehicleOdometerBtn = driver.findElement(By.xpath("(//div[@id = 'main-menu']//li[@class = 'dropdown-menu-single-item'][4])[1]"));
        vehicleOdometerBtn.click();
        Thread.sleep(5000);

       // WebElement vehicleOdometerBtn = driver.findElement(By.xpath("//span[text()='Vehicle Odometer']/.."));
       // BrowserUtils.sleep(5);
        //Thread.sleep(5000);
       // vehicleOdometerBtn.click();






        // Verify the default page number is 1

      //  WebElement defaultPage = driver.findElement(By.xpath("");
       // String actualTextMessage = defaultPage.getText();
        //String expectedTextMessage = "default page number is 1";


    }

    @Test

    public void vyTrack4() throws InterruptedException {


       // Log in as drivers

        WebElement fleetBtn = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        fleetBtn.click();
        Thread.sleep(5000);

        //Click the “Vehicle Odometers” under the Fleet

        WebElement vehicleOdometerBtn = driver.findElement(By.xpath("(//div[@id = 'main-menu']//li[@class = 'dropdown-menu-single-item'][4])[1]"));
        Thread.sleep(5000);
        vehicleOdometerBtn.click();



        //Verify the default view per page is 25


        //WebElement defaultPage = driver.findElement(By.xpath("");
        //String actualTextMessage = defaultPage.getText();
        //String expectedTextMessage = "default view per page is 25";







    }
}







