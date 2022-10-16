package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class us10_write_description_when_create_calendar_event {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void users_write_description() {

        driver.get(ConfigurationReader.getProperty("env"));

        // Login: Users are on the homepage
        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("salesManager1"));

        WebElement inputPassword = driver.findElement(By.xpath("//input[@type='password']"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement loginBtn = driver.findElement(By.xpath("//button[.='Log in']"));
        loginBtn.click();

        // Click the “Calendar Events” under the Activities
        WebElement activities = driver.findElement(By.xpath("(//div[@id='main-menu']//span[contains(text(), 'Activities')])[1]"));
        activities.click();

        WebElement calendarEvents = driver.findElement(By.linkText("Calendar Events"));
        BrowserUtils.sleep(2);
        calendarEvents.click();

        // Click the “Create Calendar Event” button
        WebElement createCalendarEventBtn = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));
        BrowserUtils.sleep(3);
        createCalendarEventBtn.click();

        // Write a message in the Description field
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'oro')]")));

        WebElement descriptionInput = driver.findElement(By.id("tinymce"));
        descriptionInput.sendKeys("Last day of java class");

        // Verify the message is written in the input box
        WebElement message = driver.findElement(By.xpath("//body[@id = 'tinymce']/p"));
        String actualMessage = message.getText();
        BrowserUtils.sleep(2);
        String expectedMessage = "Last day of java class";

        Assert.assertTrue(message.isDisplayed(), "There is no message in input field");
        BrowserUtils.sleep(2);
        Assert.assertEquals(actualMessage, expectedMessage, "Message verification is Failed.");

        driver.switchTo().defaultContent();

    }


    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

}
