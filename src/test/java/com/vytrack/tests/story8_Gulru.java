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

public class story8_Gulru {
    public class Gulru {
        WebDriver driver;
        @BeforeMethod

        public void setUp(){
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        @Test

        public void defaultNum() throws InterruptedException {

            driver.get("https://qa2.vytrack.com/user/login");
            WebElement inputUsername = driver.findElement(By.id("prependedInput"));
            inputUsername.sendKeys("user12 ");

            WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
            inputPassword.sendKeys("UserUser123");

            WebElement login = driver.findElement(By.id("_submit"));
            login.click();

            Thread.sleep(3000);
            WebElement activities = driver.findElement(By.xpath("(//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'])[3]"));
            Thread.sleep(3000);
            activities.click();

            WebElement Calender = driver.findElement(By.xpath("//span[.='Calendar Events']"));

            Calender.click();

            WebElement CalendarEvent = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));
            Thread.sleep(3000);
            CalendarEvent.click();


            Thread.sleep(3000);
            WebElement Re = driver.findElement(By.xpath("//input[starts-with(@id,'recurrence')]")) ;
            Thread.sleep(3000);
            Re.click();
            Thread.sleep(3000);
            WebElement ReDay= driver.findElement(By.xpath("(//label[@class='fields-row'])[1]//input[@type='text']"));

            String actual = ReDay.getAttribute("value");
            String wanted = "1";

            Assert.assertEquals(actual,wanted);











        }

        @Test

        public void noNum() throws InterruptedException {
            driver.get("https://qa2.vytrack.com/user/login");
            WebElement inputUsername = driver.findElement(By.id("prependedInput"));
            inputUsername.sendKeys("storemanager55 ");

            WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
            inputPassword.sendKeys("UserUser123");

            WebElement login = driver.findElement(By.id("_submit"));
            login.click();

            Thread.sleep(3000);
            WebElement Act= driver.findElement(By.xpath("//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][4]"));
            Thread.sleep(3000);
            Act.click();


            Thread.sleep(3000);
            WebElement calIv =driver.findElement(By.xpath("//span[.='Calendar Events']"));
            Thread.sleep(3000);
            calIv.click();

            Thread.sleep(3000);
            WebElement Create = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));
            Thread.sleep(3000);
            Create.click();

            Thread.sleep(3000);
            WebElement repeat = driver.findElement(By.xpath("//input[starts-with(@id,'recurrence-repeat-view')]"));
            Thread.sleep(3000);
            repeat.click();

            WebElement days = driver.findElement(By.xpath("(//label[@class='fields-row'])[1]//input[@type='text']"));
            Thread.sleep(3000);
            days.clear();


            Thread.sleep(3000);
            WebElement clear = driver.findElement(By.xpath("//span[starts-with(@id,'temp-validation-name')]//span[@style='top: 445px; left: 872.5px;']"));
            String actual = clear.getText();
            String wanted = "This value should not be blank.";
            Thread.sleep(3000);
            Assert.assertTrue( actual.contains(wanted));


        }
        @AfterMethod
        public void finish(){driver.quit();}


    }
}
