package com.loop.test.HomeTask.Task_5_extraTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */
public class Gmail {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();//create a driver
        WebDriver driver=new ChromeDriver(); //create a method
        driver.get("https://google.com");//go to url
        driver.manage().window().maximize();
        //WebElement gmail=driver.findElement(By.linkText("Gmail" + Keys.ENTER));
        WebElement gmail=driver.findElement(By.linkText("Gmail"));
        gmail.click();
        String expectTitle="Gmail";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectTitle)){
            System.out.println("Actual title : "+ actualTitle + "Matched the expected title "+expectTitle+"=Test Passed");
        }else {
            System.out.println("Actual title : "+ actualTitle + "Doesnt matched the expected title "+expectTitle+"=Test Failed");

        }
        driver.navigate().back();
        String expectTitle1="Google";
        String actualTitle1 = driver.getTitle();
        if(actualTitle1.equals(expectTitle1)){
            System.out.println("Actual title : \""+ actualTitle1 + "\" Matched the expected title \""+expectTitle1+"\"=Test Passed");
        }else {
            System.out.println("Actual title : \"" + actualTitle1 + "\" Doesnt matched the expected title \""+expectTitle1+"\"=Test Failed");

        }





        Thread.sleep(3000);
        driver.quit();


    }
}
