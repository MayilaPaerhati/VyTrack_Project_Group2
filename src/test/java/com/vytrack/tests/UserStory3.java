package com.vytrack.tests;

import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UserStory3 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/");

    }

    @Test
    public void test1() throws InterruptedException {

        WebElement usernameInput =driver.findElement(By.name("_username"));
        usernameInput.sendKeys("User7");

        WebElement passwordInput =driver.findElement(By.name("_password"));
        passwordInput.sendKeys("UserUser123");

        WebElement signingBtn = driver.findElement(By.id("_submit"));
        signingBtn.click();

        Thread.sleep(2000);

        WebElement pinBar =driver.findElement(By.xpath("(//a[@href='/pinbar/help'])[3]"));
        pinBar.click();

       WebElement message1 =driver.findElement(By.xpath("//h3[.='How To Use Pinbar']"));
       //(//div[@class='clearfix'])[2]/h3 (parent/child)

        String expectedMessage1 = "How To Use Pinbar";
        String actualMessage1= message1.getText();

        Assert.assertEquals(actualMessage1,expectedMessage1);


       WebElement msg2 = driver.findElement(By.xpath("(//div[@class='clearfix'])[2]/p[1]"));

        String expectedMsg2 = "page to create fast access link in the pinbar.";
        String actualMsg2= msg2.getText();
        System.out.println(actualMsg2);
        System.out.println(expectedMsg2);
       Assert.assertTrue(actualMsg2.contains(expectedMsg2));


        WebElement src = driver.findElement(By.xpath("//p[2]/img"));
        String expectSrc = "/bundles/oronavigation/images/pinbar-location.jpg";
        String actualSrc= src.getAttribute("src");

        Assert.assertTrue(actualSrc.contains(expectSrc));





    }


}
