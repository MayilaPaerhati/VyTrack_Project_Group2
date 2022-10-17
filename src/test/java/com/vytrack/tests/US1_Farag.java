package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US1_Farag {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperty("env"));
        BrowserUtils.sleep(2);
    }

    @Test (priority = 1)
    public void us1_ac1() {

        WebElement usernameOrEmail = driver.findElement(By.id("prependedInput"));
        usernameOrEmail.sendKeys("storemanager55");
        BrowserUtils.sleep(2);
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123" + Keys.ENTER);
        BrowserUtils.sleep(2);


        //3. Verify webElement
        WebElement dashboards = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a"));
        String dashboardsTextActual = dashboards.getText();
        String dashboardsTextExpected = "Dashboards";

        if (dashboardsTextActual.equals(dashboardsTextExpected)) {
            System.out.println("Dashboards module text verification passed!");
        } else {
            System.out.println("Dashboards module text verification failed!");
        }

        WebElement fleet = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a"));
        String fleetTextActual = fleet.getText();
        String fleetTextExpected = "Fleet";

        if (fleetTextActual.equals(fleetTextExpected)) {
            System.out.println("Fleet module text verification passed!");
        } else {
            System.out.println("Fleet module text verification failed!");
        }


        WebElement customers = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a"));
        String customersTextActual = customers.getText();
        String customersTextExpected = "Customers";

        if (customersTextActual.equals(customersTextExpected)) {
            System.out.println("Customers module text verification passed!");
        } else {
            System.out.println("Customers module text verification failed!");
        }



        WebElement sales = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[4]/a"));
        String salesTextActual = sales.getText();
        String salesTextExpected = "Sales";

        if (salesTextActual.equals(salesTextExpected)) {
            System.out.println("Sales module text verification passed!");
        } else {
            System.out.println("Sales module text verification failed!");
        }



        WebElement activities = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/a"));
        String activitiesTextActual = activities.getText();
        String activitiesTextExpected = "Activities";

        if (activitiesTextActual.equals(activitiesTextExpected)) {
            System.out.println("Activities module text verification passed!");
        } else {
            System.out.println("Activities module text verification failed!");
        }


        WebElement marketing = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[6]/a"));
        String marketingTextActual = marketing.getText();
        String marketingTextExpected = "Marketing";

        if (marketingTextActual.equals(marketingTextExpected)) {
            System.out.println("Marketing module text verification passed!");
        } else {
            System.out.println("Marketing module text verification failed!");
        }




        WebElement reports_Segments = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[7]/a"));
        String reports_SegmentsTextActual = reports_Segments.getText();
        String reports_SegmentsTextExpected = "Reports & Segments";

        if (reports_SegmentsTextActual.equals(reports_SegmentsTextExpected)) {
            System.out.println("Reports & Segments module text verification passed!");
        } else {
            System.out.println("Reports & Segments module text verification failed!");
        }


        WebElement system = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[8]/a"));
        String systemTextActual = system.getText();
        String systemTextExpected = "System";

        if (systemTextActual.equals(systemTextExpected)) {
            System.out.println("System module text verification passed!");
        } else {
            System.out.println("System module text verification failed!");
        }

    }

    @Test (priority = 2)
    public void us1_ac2()  {

        WebElement usernameOrEmail = driver.findElement(By.id("prependedInput"));
        usernameOrEmail.sendKeys("user7");
        BrowserUtils.sleep(2);
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123" + Keys.ENTER);
        BrowserUtils.sleep(2);

        //3. Verify webElement




        WebElement fleet = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a"));
        String fleetTextActual = fleet.getText();
        String fleetTextExpected = "Fleet";

        if (fleetTextActual.equals(fleetTextExpected)) {
            System.out.println("Fleet module text verification passed!");
        } else {
            System.out.println("Fleet module text verification failed!");
        }


        WebElement customers = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a"));
        String customersTextActual = customers.getText();
        String customersTextExpected = "Customers";

        if (fleetTextActual.equals(fleetTextExpected)) {
            System.out.println("Customers module text verification passed!");
        } else {
            System.out.println("Customers module text verification failed!");
        }


        WebElement activities = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a"));
        String activitiesTextActual = activities.getText();
        String activitiesTextExpected = "Activities";

        if (activitiesTextActual.equals(activitiesTextExpected)) {
            System.out.println("Activities module text verification passed!");
        } else {
            System.out.println("Activities module text verification failed!");
        }


        WebElement system = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[4]/a"));
        String systemTextActual = system.getText();
        String systemTextExpected = "System";

        if (systemTextActual.equals(systemTextExpected)) {
            System.out.println("System module text verification passed!");
        } else {
            System.out.println("System module text verification failed!");
        }

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
