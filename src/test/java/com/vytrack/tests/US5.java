package com.vytrack.tests;

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

public class US5 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void storeManager1() throws InterruptedException {

        // 1. Navigate to home page
        driver.get("https://qa2.vytrack.com/user/login");

        // 2. Enter username: “storemanager55”
        WebElement usernameInput = driver.findElement(By.id("prependedInput"));
        usernameInput.sendKeys(ConfigurationReader.getProperty("storeManager1"));

        // 3. Enter password: “UserUser123”
        WebElement passwordInput = driver.findElement(By.id("prependedInput2"));
        passwordInput.sendKeys("UserUser123");

        // 4.Click Login Button
        WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        LoginBtn.click();
        BrowserUtils.sleep(2);

        // 5. Click the Fleet tab
        WebElement fleetTab = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetTab.click();
        BrowserUtils.sleep(2);

        // 6. Click the Vehicle Model page
        //    Select VehicleModel = new Select(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")));
        WebElement VehicleModel = driver.findElement(By.xpath(" //span[.='Vehicles Model']"));
        VehicleModel.click();
        BrowserUtils.sleep(2);

        // 7. Verify column name
        WebElement columnModelName = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[1]"));
        Assert.assertEquals(columnModelName.getText(), "MODEL NAME", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnMake = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[2]"));
        Assert.assertEquals(columnMake.getText(), "MAKE", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCanBeReq = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[3]"));
        Assert.assertEquals(columnCanBeReq.getText(), "CAN BE REQUESTED", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCvvi = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[4]"));
        Assert.assertEquals(columnCvvi.getText(), "CVVI", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCO2Fee = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[5]"));
        Assert.assertEquals(columnCO2Fee.getText(), "CO2 FEE (/MONTH)", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCostDep = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[6]"));
        Assert.assertEquals(columnCostDep.getText(), "COST (DEPRECIATED)", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnTotalCostDep = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[7]"));
        Assert.assertEquals(columnTotalCostDep.getText(), "TOTAL COST (DEPRECIATED)", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCO2Emissions = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[8]"));
        Assert.assertEquals(columnCO2Emissions.getText(), "CO2 EMISSIONS", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnFuelType = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[9]"));
        Assert.assertEquals(columnFuelType.getText(), "FUEL TYPE", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnVendors = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[10]"));
        Assert.assertEquals(columnVendors.getText(), "VENDORS", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);


    }


    @Test
    public void storeManager2() throws InterruptedException {

        // 1. Navigate to home page
        driver.get("https://qa2.vytrack.com/user/login");

        // 2. Enter username: “storemanager58”
        WebElement usernameInput = driver.findElement(By.id("prependedInput"));
        usernameInput.sendKeys(ConfigurationReader.getProperty("storeManager4"));

        // 3. Enter password: “UserUser123”
        WebElement passwordInput = driver.findElement(By.id("prependedInput2"));
        passwordInput.sendKeys("UserUser123");

        // 4.Click Login Button
        WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        LoginBtn.click();
        BrowserUtils.sleep(2);

        // 5. Click the Fleet tab
        WebElement fleetTab = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetTab.click();
        BrowserUtils.sleep(2);

        // 6. Click the Vehicle Model page
        //    Select VehicleModel = new Select(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")));
        WebElement VehicleModel = driver.findElement(By.xpath(" //span[.='Vehicles Model']"));
        VehicleModel.click();
        BrowserUtils.sleep(2);

        // 7. Verify column name
        WebElement columnModelName = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[1]"));
        Assert.assertEquals(columnModelName.getText(), "MODEL NAME", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnMake = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[2]"));
        Assert.assertEquals(columnMake.getText(), "MAKE", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCanBeReq = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[3]"));
        Assert.assertEquals(columnCanBeReq.getText(), "CAN BE REQUESTED", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCvvi = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[4]"));
        Assert.assertEquals(columnCvvi.getText(), "CVVI", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCO2Fee = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[5]"));
        Assert.assertEquals(columnCO2Fee.getText(), "CO2 FEE (/MONTH)", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCostDep = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[6]"));
        Assert.assertEquals(columnCostDep.getText(), "COST (DEPRECIATED)", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnTotalCostDep = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[7]"));
        Assert.assertEquals(columnTotalCostDep.getText(), "TOTAL COST (DEPRECIATED)", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCO2Emissions = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[8]"));
        Assert.assertEquals(columnCO2Emissions.getText(), "CO2 EMISSIONS", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnFuelType = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[9]"));
        Assert.assertEquals(columnFuelType.getText(), "FUEL TYPE", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnVendors = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[10]"));
        Assert.assertEquals(columnVendors.getText(), "VENDORS", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);


    }

    @Test
    public void salesManager1() throws InterruptedException {

        // 1. Navigate to home page
        driver.get("https://qa2.vytrack.com/user/login");

        // 2. Enter username: “salesmanager105”
        WebElement usernameInput = driver.findElement(By.id("prependedInput"));
        usernameInput.sendKeys(ConfigurationReader.getProperty("salesManager1"));

        // 3. Enter password: “UserUser123”
        WebElement passwordInput = driver.findElement(By.id("prependedInput2"));
        passwordInput.sendKeys("UserUser123");

        // 4.Click Login Button
        WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        LoginBtn.click();
        BrowserUtils.sleep(2);

        // 5. Click the Fleet tab
        WebElement fleetTab = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetTab.click();
        BrowserUtils.sleep(2);

        // 6. Click the Vehicle Model page
        //    Select VehicleModel = new Select(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")));
        WebElement VehicleModel = driver.findElement(By.xpath(" //span[.='Vehicles Model']"));
        VehicleModel.click();
        BrowserUtils.sleep(2);

        // 7. Verify column name
        WebElement columnModelName = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[1]"));
        Assert.assertEquals(columnModelName.getText(), "MODEL NAME", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnMake = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[2]"));
        Assert.assertEquals(columnMake.getText(), "MAKE", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCanBeReq = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[3]"));
        Assert.assertEquals(columnCanBeReq.getText(), "CAN BE REQUESTED", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCvvi = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[4]"));
        Assert.assertEquals(columnCvvi.getText(), "CVVI", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCO2Fee = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[5]"));
        Assert.assertEquals(columnCO2Fee.getText(), "CO2 FEE (/MONTH)", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCostDep = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[6]"));
        Assert.assertEquals(columnCostDep.getText(), "COST (DEPRECIATED)", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnTotalCostDep = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[7]"));
        Assert.assertEquals(columnTotalCostDep.getText(), "TOTAL COST (DEPRECIATED)", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCO2Emissions = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[8]"));
        Assert.assertEquals(columnCO2Emissions.getText(), "CO2 EMISSIONS", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnFuelType = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[9]"));
        Assert.assertEquals(columnFuelType.getText(), "FUEL TYPE", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnVendors = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[10]"));
        Assert.assertEquals(columnVendors.getText(), "VENDORS", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);


    }
    @Test
    public void salesManager2() throws InterruptedException {

        // 1. Navigate to home page
        driver.get("https://qa2.vytrack.com/user/login");

        // 2. Enter username: “salesmanager108”
        WebElement usernameInput = driver.findElement(By.id("prependedInput"));
        usernameInput.sendKeys(ConfigurationReader.getProperty("salesManager4"));

        // 3. Enter password: “UserUser123”
        WebElement passwordInput = driver.findElement(By.id("prependedInput2"));
        passwordInput.sendKeys("UserUser123");

        // 4.Click Login Button
        WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        LoginBtn.click();
        BrowserUtils.sleep(2);

        // 5. Click the Fleet tab
        WebElement fleetTab = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetTab.click();
        BrowserUtils.sleep(2);

        // 6. Click the Vehicle Model page
        //    Select VehicleModel = new Select(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")));
        WebElement VehicleModel = driver.findElement(By.xpath(" //span[.='Vehicles Model']"));
        VehicleModel.click();
        BrowserUtils.sleep(2);

        // 7. Verify column name
        WebElement columnModelName = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[1]"));
        Assert.assertEquals(columnModelName.getText(), "MODEL NAME", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnMake = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[2]"));
        Assert.assertEquals(columnMake.getText(), "MAKE", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCanBeReq = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[3]"));
        Assert.assertEquals(columnCanBeReq.getText(), "CAN BE REQUESTED", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCvvi = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[4]"));
        Assert.assertEquals(columnCvvi.getText(), "CVVI", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCO2Fee = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[5]"));
        Assert.assertEquals(columnCO2Fee.getText(), "CO2 FEE (/MONTH)", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCostDep = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[6]"));
        Assert.assertEquals(columnCostDep.getText(), "COST (DEPRECIATED)", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnTotalCostDep = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[7]"));
        Assert.assertEquals(columnTotalCostDep.getText(), "TOTAL COST (DEPRECIATED)", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnCO2Emissions = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[8]"));
        Assert.assertEquals(columnCO2Emissions.getText(), "CO2 EMISSIONS", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnFuelType = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[9]"));
        Assert.assertEquals(columnFuelType.getText(), "FUEL TYPE", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);

        WebElement columnVendors = driver.findElement(By.xpath("(//span[@class='grid-header-cell__label'])[10]"));
        Assert.assertEquals(columnVendors.getText(), "VENDORS", "Column name matching test FAILED!");
        BrowserUtils.sleep(2);


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
