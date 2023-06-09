package com.loop.test.HomeTask.Day9;
/*
1. Open a chrome browser
2. Go to: https://loopcamp.vercel.app/
3. Scroll down to “Powered by LOOPCAMP”
4. Scroll using Actions class “moveTo(element)” method
2. Scroll back up to Loop Academy link/picture using PageUP button
 */

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task4 {
    @Test
    public void testPowered() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("loop.practice"));

        Actions action = new Actions(driver);
        Thread.sleep(1500);
        action.moveToElement(driver.findElement(By.xpath("//a[.='LOOPCAMP']"))).perform();

        action.sendKeys(Keys.PAGE_UP).moveToElement(driver.findElement(By.xpath("//div[@class = 'container']/preceding-sibling::nav"))).build().perform();
    }
}
