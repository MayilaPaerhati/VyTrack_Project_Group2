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

public class US_13 {


    WebDriver driver ;

        @BeforeMethod

        public void setUp(){
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://qa2.vytrack.com/user/login");
        }
        @Test
        public void Vytrack() throws InterruptedException {

            // Log in as store or sales managers
            WebElement userName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
            userName.sendKeys("salesmanager105");
            WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
            password.sendKeys("UserUser123");

            WebElement loginBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
            loginBtn.click();
            Thread.sleep(5000);


            //Click the “Accounts” under the Customers

            WebElement customerBtn= driver.findElement(By.xpath("(//span[@class='title title-level-1'])[3]"));
            customerBtn.click();
            Thread.sleep(5000);

            WebElement accountBtn= driver.findElement(By.xpath("(//span[.='Accounts'])[1]"));
            accountBtn.click();
            Thread.sleep(5000);

            //Verify there are 8 filter options
            // Account Name, Contact Name, Contact Email, Contact Phone, Owner,  Business Unit, Created At, Updated At
            WebElement filterBtn = driver.findElement(By.xpath("//i[@class='fa-filter hide-text']"));
            filterBtn.click();
            Thread.sleep(5000);

            WebElement accountName = driver.findElement(By.xpath("(//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[1]"));
            Assert.assertTrue(accountName.isDisplayed(),"Account name is not displayed !");

            WebElement contactName = driver.findElement(By.xpath("(//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[2]"));
            Assert.assertTrue(contactName.isDisplayed(),"Contact name is not displayed !");

            WebElement contactEmail = driver.findElement(By.xpath("(//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[3]"));
            Assert.assertTrue(contactEmail.isDisplayed(),"Contact email is not displayed !");

            WebElement contactPhone = driver.findElement(By.xpath("(//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[4]"));
            Assert.assertTrue(contactPhone.isDisplayed(),"Contact phone is not displayed !");

            WebElement ownerName = driver.findElement(By.xpath("(//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[5]"));
            Assert.assertTrue(ownerName.isDisplayed(),"Owner name is not displayed !");

            WebElement BusinessUnit = driver.findElement(By.xpath("(//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[6]"));
            Assert.assertTrue(BusinessUnit.isDisplayed(),"Business unit is not displayed !");

            WebElement createdAt = driver.findElement(By.xpath("(//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[7]"));
            Assert.assertTrue(createdAt.isDisplayed(),"Created At is not displayed !");

            WebElement updatedAt = driver.findElement(By.xpath("(//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[8]"));
            Assert.assertTrue(updatedAt.isDisplayed(),"Updated At is not displayed !");
        }






        @AfterMethod

        public void tearDownMethod(){
            driver.quit();
        }










    }
