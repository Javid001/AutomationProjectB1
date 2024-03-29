package com.loop.test.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverFactory {

    /**
     * @param browserType
     * @return the browser
     */
    public static WebDriver getDriver(String browserType) {

        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();


        } else if (browserType.equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver().setup();
            return new SafariDriver();

        } else {

            System.out.println("No drivee found");
            System.out.println("Driver is null");
            return null;
        }

    }

    public static WebDriver.Timeouts wait(WebDriver driver, int seconds) {
        WebDriver.Timeouts wait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
        return wait;
    }
    public static WebDriverWait invisible (WebDriver driver, int seconds , String element){
        WebDriverWait waiting= new WebDriverWait(driver,Duration.ofSeconds(seconds));
        waiting.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(element)));
        return  waiting;
    }

    public static WebDriverWait visible (WebDriver driver, int seconds , String element){
        WebDriverWait waiting= new WebDriverWait(driver,Duration.ofSeconds(seconds));
        waiting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
        return  waiting;
    }


    public static WebDriverWait visibleOf (WebDriver driver, int seconds , WebElement element){
        WebDriverWait waiting= new WebDriverWait(driver,Duration.ofSeconds(seconds));
        waiting.until(ExpectedConditions.visibilityOf(element));
        return  waiting;
    }
    }

