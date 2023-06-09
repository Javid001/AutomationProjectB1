package com.loop.test.HomeTask.Task_5_extraTask;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task1_day15May {
    @Test
    public void TestDocuport() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://beta.docuport.app");
        WebDriverFactory.wait(driver, 30);

        WebElement findByIdUSerName = driver.findElement(By.xpath("//input[@id='input-14']"));
        findByIdUSerName.sendKeys(DocuportConstants.USERNAME_ADVISOR);

        WebElement findByIdPassword = driver.findElement(By.xpath("//input[@id='input-15']"));

        findByIdPassword.sendKeys(DocuportConstants.PASSWORD_ADVISOR);

        WebElement findLogin = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        findLogin.click();

        WebDriverFactory.wait(driver, 30);
        WebElement findHome = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
        System.out.println((findHome.isDisplayed()) ? "HOME BUTTON IS DISPLAYED ==> TEST PASSED" : "HOME BUTTON IS NOT DISPLAYED ==> TEST FAILED");

        WebElement findReceiveDocs = driver.findElement(By.xpath("//span[starts-with(text(),'Received')]"));
        System.out.println((findReceiveDocs.isDisplayed()) ? "RECEIVE DOCS BUTTON IS DISPLAYED ==> TEST PASSED" : "RECEIVE DOCS BUTTON IS NOT DISPLAYED ==> TEST FAILED");

        WebElement findMyUploads = driver.findElement(By.xpath("//span[contains(text(),'My uploads')]"));
        System.out.println((findMyUploads.isDisplayed()) ? "MY UPLOADS BUTTON IS DISPLAYED ==> TEST PASSED" : "MY UPLOADS  BUTTON IS NOT DISPLAYED ==> TEST FAILED");

        WebElement findInvitations = driver.findElement(By.xpath("//span[starts-with(text(),'Invitations')]"));
        System.out.println((findInvitations.isDisplayed()) ? "INVITATIONS BUTTON IS DISPLAYED ==> TEST PASSED" : "INVITATIONS  BUTTON IS NOT DISPLAYED ==> TEST FAILED");

        System.out.println("--------after pressing three lines-------");

        WebElement threeLines = driver.findElement(By.xpath("//i[@class='v-icon notranslate mdi mdi-menu theme--light']"));
        threeLines.click();

      //  WebDriverFactory.wait(driver, 10, "//span[contains(text(),'Home')]");

        WebElement findHome1 = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
        System.out.println((findHome1.isDisplayed()) ? "HOME BUTTON IS DISPLAYED ==> TEST FAILED" : "HOME BUTTON IS NOT DISPLAYED ==> TEST PASSED");

        WebElement findReceiveDocs1 = driver.findElement(By.xpath("//span[starts-with(text(),'Received')]"));
        System.out.println((findReceiveDocs1.isDisplayed()) ? "RECEIVE DOCS BUTTON IS DISPLAYED ==> TEST FAILED" : "RECEIVE DOCS BUTTON IS NOT DISPLAYED ==> TEST PASSED");

        WebElement findMyUploads1 = driver.findElement(By.xpath("//span[contains(text(),'My uploads')]"));
        System.out.println((findMyUploads1.isDisplayed()) ? "MY UPLOADS BUTTON IS DISPLAYED ==> TEST FAILED" : "MY UPLOADS  BUTTON IS NOT DISPLAYED ==> TEST PASSED");

        WebElement findInvitations1 = driver.findElement(By.xpath("//span[starts-with(text(),'Invitations')]"));
        System.out.println((findInvitations1.isDisplayed()) ? "INVITATIONS BUTTON IS DISPLAYED ==> TEST FAILED" : "INVITATIONS  BUTTON IS NOT DISPLAYED ==> TEST PASSED");

        driver.quit();
    }
}
