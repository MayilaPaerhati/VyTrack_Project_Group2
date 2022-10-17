package com.vytrack.tests;

import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class us9 {
    //public static void main(String[] args) {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");
    }
    @Test
    public void checkErrorMessage () throws InterruptedException{
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Username or Email']"));
        email.sendKeys("user1");
        Thread.sleep(6000);

        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");
        Thread.sleep(6000);

        WebElement loginBtn = driver.findElement(By.xpath("//button[@class='btn btn-uppercase btn-primary pull-right']"));
        loginBtn.click();
        Thread.sleep(6000);

        WebElement activitiesBtn = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span"));
        activitiesBtn.click();
        Thread.sleep(6000);

        WebElement calendarEvents = driver.findElement(By.linkText("Calendar Events"));
        calendarEvents.click();
        Thread.sleep(6000);

        WebElement creatEvent = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a"));
        creatEvent.click();
        Thread.sleep(6000);

          // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='oro_calendar_event_form_description-uid-6345b396f1e37_ifr']")));

        WebElement repeatCheckbox = driver.findElement(By.xpath("//*[@id='recurrence-repeat-view294']"));
        repeatCheckbox.click();

        WebElement inputRepeatDays = driver.findElement(By.xpath("(//input[@class='recurrence-subview-control__number'])[1]"));
        inputRepeatDays.click();
        inputRepeatDays.clear();
        inputRepeatDays.sendKeys("-1");
        String expectedErrorMessageNegativeInput = "The value have not to be less than 1.";
        String actualErrorMessageNegativeInput = driver.findElement(By.xpath("//span[@id='temp-validation-name-318-error']")).getText();
        Assert.assertEquals(actualErrorMessageNegativeInput, expectedErrorMessageNegativeInput, "The actual text didn't match for ErrorMessageNegativeInput");

        inputRepeatDays.click();
        inputRepeatDays.clear();
        inputRepeatDays.sendKeys("100");
        String expectedErrorMessageInputMoreThan99 = "The value have not to be more than 99.";
        String actualErrorMessageInputMoreThan99 = driver.findElement(By.xpath("//span[@id='temp-validation-name-318-error']")).getText();
        Assert.assertEquals(actualErrorMessageInputMoreThan99, expectedErrorMessageInputMoreThan99, "The actual text didn't match for ErrorMessageInputMoreThan99");
    }
}

