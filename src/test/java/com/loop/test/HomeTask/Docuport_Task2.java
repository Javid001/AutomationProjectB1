package com.loop.test.HomeTask;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Docuport_Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");
        WebDriverFactory.wait(driver,30);
        WebElement userNamePlaceholder = driver.findElement(By.cssSelector("label[for='input-14']"));
        String actualUserNamePlaceholderName = userNamePlaceholder.getText();
        String expectedUserNamePlaceholderName = "Username or email";
        if (actualUserNamePlaceholderName.equals(expectedUserNamePlaceholderName)) {
            System.out.println("Actual login placeholder name \"" + actualUserNamePlaceholderName + "\" matches to expected login placeholder name \"" + expectedUserNamePlaceholderName + "\" TEST PASSED!");
        } else {
            System.err.println("TEST FAILED!");
            System.out.println("Actual login placeholder name \"" + actualUserNamePlaceholderName + "\" DOESN'T MATCH to expected login placeholder name \"" + expectedUserNamePlaceholderName + "\"");

        }

        WebElement passwordPlaceholder = driver.findElement(By.cssSelector("label[for='input-15']"));
        String actualPasswordPlaceholderName = passwordPlaceholder.getText();
        String expectedPasswordPlaceholderName = "Password";

        if (actualPasswordPlaceholderName.equals(expectedPasswordPlaceholderName)) {
            System.out.println("Actual login placeholder name \"" + actualPasswordPlaceholderName + "\" matches to expected login placeholder name \"" + expectedPasswordPlaceholderName + "\" TEST PASSED!");
        } else {
            System.err.println("TEST FAILED!");
            System.out.println("Actual login placeholder name \"" + actualPasswordPlaceholderName + "\" DOESN'T MATCH to expected login placeholder name \"" + expectedPasswordPlaceholderName + "\"");

        }


        WebElement loginButton = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
        loginButton.click();

        WebElement loginError = driver.findElement(By.xpath("(//div[@class='v-messages__message'])[1]"));
        String actualLoginErrorMessage = loginError.getText();
        String expectedLoginErrorMessage = "Please enter your username or email address";
        System.out.println("--------");
        if(expectedLoginErrorMessage.equals(actualLoginErrorMessage)){
            System.out.println("TEST PASSED! Actual login error message \"" + actualLoginErrorMessage + "\" matches to expected login error message \"" + expectedLoginErrorMessage + "\"");
        }else{
            System.err.println("TEST FAILED!");
            System.out.println("Actual login error message \"" + actualLoginErrorMessage + "\" DIDN'T match to expected login error message \"" + expectedLoginErrorMessage + "\"");

        }
        WebElement passwordError = driver.findElement(By.xpath("(//div[@class='v-messages__message'])[2]"));

        String actualPasswordErrorMEssage = passwordError.getText();

        String expectedPasswordErrorMessage = "Please enter your password";
        System.out.println("------");

        if(expectedPasswordErrorMessage.equals(actualPasswordErrorMEssage)){
            System.out.println("TEST PASSED! Actual password error message \"" + actualPasswordErrorMEssage + "\" matches to expected password error message \"" + expectedPasswordErrorMessage + "\"");
        }else{
            System.err.println("TEST FAILED!");
            System.out.println("Actual password error message \"" + actualPasswordErrorMEssage + "\" DIDN'T match to expected password error message \"" + expectedPasswordErrorMessage + "\"");

        }
//        Thread.sleep(2000);
//        System.out.println("-----");
//        WebElement qwerty = driver.findElement(By.cssSelector("div.v-messages__message:nth-of-type(2)"));
//        String str = qwerty.getText();
//        System.out.println(str);
//        System.out.println("------");
//        WebElement qwerty1 = driver.findElement(By.cssSelector("div.v-messages__message:nth-of-type(1)"));
//        String str1 = qwerty1.getText();
//        System.out.println(str1);
//        System.out.println("-------");

        Thread.sleep(3000);
        driver.quit();

    }
}
