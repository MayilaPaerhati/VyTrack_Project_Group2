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

public class us10_writeDescription_createCalendarEvent {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");
    }

    @Test
    public void drivers_write_description() throws InterruptedException {
        // Login
        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
        inputUsername.sendKeys("user7");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@type='password']"));
        inputPassword.sendKeys("UserUser123");

        WebElement loginBtn = driver.findElement(By.xpath("//button[.='Log in']"));
        loginBtn.click();

        // Click Calendar Events under Activities
        WebElement activities = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[3]"));
        activities.click();

        WebElement calendarEvents = driver.findElement(By.linkText("Calendar Events"));
        Thread.sleep(2000);
        calendarEvents.click();

        // Click Create Calendar Event button
        WebElement createCalendarEventBtn = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));
        Thread.sleep(3000);
        createCalendarEventBtn.click();

        // Users write a message in input field
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'oro')]")));

        WebElement descriptionInput = driver.findElement(By.id("tinymce"));
        descriptionInput.sendKeys("Last day of java class");

        WebElement message = driver.findElement(By.xpath("//body[@id = 'tinymce']/p"));
        String actualMessage = message.getText();
        Thread.sleep(2000);
        String expectedMessage = "Last day of java class";

        Assert.assertTrue(message.isDisplayed(), "There is no message in input field");
        Thread.sleep(2000);
        Assert.assertEquals(actualMessage, expectedMessage, "Message verification is Failed.");
        driver.switchTo().defaultContent();
    }

    @Test
    public void storeManage_write_description() throws InterruptedException {
        // Login
        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
        inputUsername.sendKeys("storemanager55");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@type='password']"));
        inputPassword.sendKeys("UserUser123");

        WebElement loginBtn = driver.findElement(By.xpath("//button[.='Log in']"));
        loginBtn.click();

        //
        WebElement activities = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]"));
        Thread.sleep(3000);
        activities.click();

        WebElement calendarEvents = driver.findElement(By.xpath("//span[.='Calendar Events']"));
        Thread.sleep(2000);
        calendarEvents.click();

        WebElement createCalendarEventBtn = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));
        Thread.sleep(2000);
        createCalendarEventBtn.click();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'oro')]")));

        WebElement descriptionInput = driver.findElement(By.id("tinymce"));
        descriptionInput.sendKeys("Sprint2 is start");
        Thread.sleep(2000);

        WebElement message = driver.findElement(By.xpath("//body[@id = 'tinymce']/p"));
        String actualMessage = message.getText();
        Thread.sleep(2000);
        String expectedMessage = "Sprint2 is start";

        Assert.assertTrue(message.isDisplayed(), "There is no message in input field");
        Assert.assertEquals(actualMessage, expectedMessage, "Message verification is Failed.");
        driver.switchTo().defaultContent();
    }

    @Test
    public void salesManage_write_description() throws InterruptedException {
        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
        inputUsername.sendKeys("salesmanager105");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@type='password']"));
        inputPassword.sendKeys("UserUser123");

        WebElement loginBtn = driver.findElement(By.xpath("//button[.='Log in']"));
        loginBtn.click();

        WebElement activities = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]"));
        Thread.sleep(3000);
        activities.click();

        WebElement calendarEvents = driver.findElement(By.xpath("//span[.='Calendar Events']"));
        Thread.sleep(2000);
        calendarEvents.click();

        WebElement createCalendarEventBtn = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));
        Thread.sleep(2000);
        createCalendarEventBtn.click();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'oro')]")));

        WebElement descriptionInput = driver.findElement(By.id("tinymce"));
        descriptionInput.sendKeys("Hello hello!");
        Thread.sleep(2000);

        WebElement message = driver.findElement(By.xpath("//body[@id = 'tinymce']/p"));
        String actualMessage = message.getText();
        Thread.sleep(1000);
        String expectedMessage = "Hello hello!";

        Assert.assertTrue(message.isDisplayed(), "There is no message in input field");
        Assert.assertEquals(actualMessage, expectedMessage, "Message verification is Failed.");
        driver.switchTo().defaultContent();
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }
}
