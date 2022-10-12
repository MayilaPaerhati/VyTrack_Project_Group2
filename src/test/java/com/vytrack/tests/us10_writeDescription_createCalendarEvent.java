package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
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

public class us10_writeDescription_createCalendarEvent {

    WebDriver driver;

    @Test
    public void drivers_write_description() {

        List<String> usernames = new ArrayList<>(Arrays.asList("user7", "user8", "user9", "user10", "user11", "user12"));

        for (String eachUserName : usernames) {

            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://qa2.vytrack.com/user/login");

            // Login: Users are on the homepage
            WebElement inputUsername = driver.findElement(By.id("prependedInput"));
            inputUsername.sendKeys(eachUserName);

            WebElement inputPassword = driver.findElement(By.xpath("//input[@type='password']"));
            inputPassword.sendKeys("UserUser123");

            WebElement loginBtn = driver.findElement(By.xpath("//button[.='Log in']"));
            loginBtn.click();

            // Click the “Calendar Events” under the Activities
            WebElement activities = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[3]"));
            activities.click();

            WebElement calendarEvents = driver.findElement(By.linkText("Calendar Events"));
            BrowserUtils.sleep(2);
            calendarEvents.click();

            // Click the “Create Calendar Event” button
            WebElement createCalendarEventBtn = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));
            BrowserUtils.sleep(2);
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

            driver.close();
        }
    }

    @Test
    public void storeManage_write_description() {

        List<String> usernames = new ArrayList<>(Arrays.asList("storemanager55", "storemanager56", "storemanager57", "storemanager58"));

        for (String eachUserName : usernames) {

            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://qa2.vytrack.com/user/login");

            // Login: Users are on the homepage
            WebElement inputUsername = driver.findElement(By.id("prependedInput"));
            inputUsername.sendKeys(eachUserName);

            WebElement inputPassword = driver.findElement(By.xpath("//input[@type='password']"));
            inputPassword.sendKeys("UserUser123");

            WebElement loginBtn = driver.findElement(By.xpath("//button[.='Log in']"));
            loginBtn.click();

            // Click the “Calendar Events” under the Activities
            WebElement activities = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]"));
            BrowserUtils.sleep(2);
            activities.click();

            WebElement calendarEvents = driver.findElement(By.xpath("//span[.='Calendar Events']"));
            BrowserUtils.sleep(2);
            calendarEvents.click();

            // Click the “Create Calendar Event” button
            WebElement createCalendarEventBtn = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));
            BrowserUtils.sleep(2);
            createCalendarEventBtn.click();

            // Write a message in the Description field
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'oro')]")));

            WebElement descriptionInput = driver.findElement(By.id("tinymce"));
            descriptionInput.sendKeys("Sprint2 is start");
            BrowserUtils.sleep(2);

            // Verify the message is written in the input box
            WebElement message = driver.findElement(By.xpath("//body[@id = 'tinymce']/p"));
            String actualMessage = message.getText();
            BrowserUtils.sleep(2);
            String expectedMessage = "Sprint2 is start";

            Assert.assertTrue(message.isDisplayed(), "There is no message in input field");
            Assert.assertEquals(actualMessage, expectedMessage, "Message verification is Failed.");

            driver.switchTo().defaultContent();

            driver.close();
        }

    }

    @Test
    public void salesManage_write_description() {

        List<String> usernames = new ArrayList<>(Arrays.asList("salesmanager105", "salesmanager106", "salesmanager107", "salesmanager108"));

        for (String eachUserName : usernames) {

            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://qa2.vytrack.com/user/login");

            // Login: Users are on the homepage
            WebElement inputUsername = driver.findElement(By.id("prependedInput"));
            inputUsername.sendKeys(eachUserName);

            WebElement inputPassword = driver.findElement(By.xpath("//input[@type='password']"));
            inputPassword.sendKeys("UserUser123");

            WebElement loginBtn = driver.findElement(By.xpath("//button[.='Log in']"));
            loginBtn.click();

            // Click the “Calendar Events” under the Activities
            WebElement activities = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]"));
            BrowserUtils.sleep(2);
            activities.click();

            WebElement calendarEvents = driver.findElement(By.xpath("//span[.='Calendar Events']"));
            BrowserUtils.sleep(2);
            calendarEvents.click();

            // Click the “Create Calendar Event” button
            WebElement createCalendarEventBtn = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));
            BrowserUtils.sleep(2);
            createCalendarEventBtn.click();

            // Write a message in the Description field
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'oro')]")));

            WebElement descriptionInput = driver.findElement(By.id("tinymce"));
            descriptionInput.sendKeys("Hello hello!");
            BrowserUtils.sleep(2);

            // Verify the message is written in the input box
            WebElement message = driver.findElement(By.xpath("//body[@id = 'tinymce']/p"));
            String actualMessage = message.getText();
            BrowserUtils.sleep(2);
            String expectedMessage = "Hello hello!";

            Assert.assertTrue(message.isDisplayed(), "There is no message in input field");
            Assert.assertEquals(actualMessage, expectedMessage, "Message verification is Failed.");

            driver.switchTo().defaultContent();

            driver.close();
        }
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }
}
