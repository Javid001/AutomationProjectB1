package com.loop.test.day10_jsexecutor_pom;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_drag_and_drop {
    @Test
    public void practice_drag_drop_test() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.drag"));

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(smallCircle)
                .clickAndHold()
                .moveToElement(bigCircle)
                .release()
                .perform();

        WebElement successMsg = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'great')]"));
        String actual = successMsg.getText();
        String expected = "You did great!";
        Assert.assertEquals(actual, expected, "Actual does not match expected");
    }
}
