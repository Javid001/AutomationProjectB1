package com.loop.test.HomeTask.Group1WindowHandle;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

import static org.testng.AssertJUnit.assertTrue;

public class WindowHandle {
    @Test
    public void WindowHandle() {
        Driver.getDriver().get("https://nxtgenaiacademy.com/multiplewindows/");


        String CurrentHandle = Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.xpath("//button[@name='newbrowserwindow123']")).click();
        Set<String>windowHandles = Driver.getDriver().getWindowHandles();
        for (String eachWindow:windowHandles) {
            Driver.getDriver().switchTo().window(eachWindow);
            //if()

        }

    }
}
