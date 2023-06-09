package com.loop.test.HomeTask.Task_5_extraTask;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Thread.sleep(1000);

        WebElement allMenu = driver.findElement(By.cssSelector("a[id='nav-hamburger-menu']>i"));
        allMenu.click();
        Thread.sleep(1000);
        WebElement newRelease = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[2]"));
        newRelease.click();
        Thread.sleep(1000);

        WebElement kingCharl = driver.findElement(By.cssSelector("div[id='B0C1C7GTX6']"));
        kingCharl.click();
        Thread.sleep(1000);

        WebElement buyNowButton = driver.findElement(By.cssSelector("input[id='buy-now-button']"));
        buyNowButton.click();
        Thread.sleep(1000);

        WebElement createAcc = driver.findElement(By.cssSelector("a[id='createAccountSubmit']"));
        createAcc.click();
        Thread.sleep(1000);

        WebElement firstName = driver.findElement(By.cssSelector("input[autocomplete='name']"));
        firstName.sendKeys("Ruslan PO");
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
        email.sendKeys("571-0101-111");
        Thread.sleep(1000);

        WebElement password1 = driver.findElement(By.cssSelector("input[id='ap_password']"));
        password1.sendKeys("1234567!");
        Thread.sleep(1000);

        WebElement password2 = driver.findElement(By.cssSelector("input[id='ap_password_check']"));
        password2.sendKeys("1234567!");
        Thread.sleep(1000);

        WebElement conbutton = driver.findElement(By.cssSelector("input[id='continue']"));
        conbutton.click();


        Thread.sleep(2000);

        driver.quit();


    }
}
