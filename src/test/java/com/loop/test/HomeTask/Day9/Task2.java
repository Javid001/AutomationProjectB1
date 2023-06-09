package com.loop.test.HomeTask.Day9;
/*
1. Go to https://loopcamp.vercel.app/hovers.html
2. Hover over to first image
3. Assert:
	a. “name: user1” is displayed
	b. “view profile” is displayed
4. Hover over to second image
5. Assert:
	a. “name: user2” is displayed
	b. “view profile” is displayed
6. Hover over to third image
7. Confirm:
	a. “name: user3” is displayed
	b. “view profile” is displayed
 */

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2 {

    @Test
    public void hoverFunction(){

        WebDriver driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("loop.hover"));

        Actions action = new Actions(driver);

        //move to first element
        action.moveToElement(driver.findElement(By.xpath("//h5[contains(text(),'user1')]/../.."))).perform();
        //verify user1 -“name: user1” is displayed
        String expected = "name: user1";
        assertEquals(driver.findElement(By.xpath("//h5[.='name: user1']")).getText(),expected);
        //verify view profile
        expected = "View profile";
        assertEquals(driver.findElement(By.xpath("//h5[.='name: user1']/following-sibling::a")).getText(),expected);

//----------------------------------------//

        //move to SECOND element
        action.moveToElement(driver.findElement(By.xpath("//h5[contains(text(),'user2')]/../.."))).perform();
        //verify user2
        expected = "name: user2";
        assertEquals(driver.findElement(By.xpath("//h5[.='name: user2']")).getText(),expected);
        //verify view profile
        expected = "View profile";
        assertEquals(driver.findElement(By.xpath("//h5[.='name: user2']/following-sibling::a")).getText(),expected);

        //----------------------------------------//

        //move to third element
        action.moveToElement(driver.findElement(By.xpath("//h5[contains(text(),'user3')]/../.."))).perform();
        //verify user3
        expected = "name: user3";
        assertEquals(driver.findElement(By.xpath("//h5[.='name: user3']")).getText(),expected);
        //verify view profile
        expected = "View profile";
        assertEquals(driver.findElement(By.xpath("//h5[.='name: user3']/following-sibling::a")).getText(),expected);

    }

}
