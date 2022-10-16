package com.vytrack.tests;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Ts2_73 {

    /*
    As a user, I want to manage filters on the Vehicle Costs page. (Web-table and checkbox)

    AC #1: Users should see three columns on the Vehicle Cost page.
               Expected Column names:
               TYPE, TOTAL PRICE, DATE
     */

    @Test
    public void testThreeColumn() {

        //Driver.getDriver().get("https://qa2.vytrack.com/user/login");
        //Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://qa2.vytrack.com/user/login");
        driver.get(ConfigurationReader.getProperty("env"));

    }
}
