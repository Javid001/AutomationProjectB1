package com.loop.test.day1_Selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        // setting up the web driver
        WebDriverManager.chromedriver().setup();

        // create an instance of driver
        WebDriver driver = new ChromeDriver();
       // Thread.sleep(3000);

        //driver.get("https://www.etsy.com/");

        //maximize
        driver.manage().window().maximize();
       // Thread.sleep(3000);
        // driver.manage().window().fullscreen();

        // navigate to
        driver.navigate().to("https://www.etsy.com/");
       // Thread.sleep(3000);

        // lets slow things a bit in order to be able to see what is going on
      //  Thread.sleep(3000);

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();


    }
}