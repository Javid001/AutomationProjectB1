package com.loop.test.HomeTask.Task_5_extraTask;


    //extra task
//=============
//go to https://app.docuport.app/company-formation/resident
//What type of business do you want to start? - choose corporation
//Validate that corporation has been selected
//Formation State - choose Virginia
//Validate Virginia is selected
//Validate order summer as below:
//
//State registration fee $100
//Payment processing $6
//Service fee $150
//Total $256
//
//Formation State - choose Maryland
//Validate Maryland is selected
//Validate order summer as below:
//
//State registration fee $170
//Payment processing $10.20
//Service fee $150
//Total $330.20


import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.time.Duration;
import java.util.*;


public class Extra_TaskSolution2 {
        WebDriver driver;

        @BeforeMethod

        public void setUpMethod() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }

        @AfterMethod
        public void tearDownMethod() {
            //driver.close();
        }

        @Test
        public void docuport() {
            driver.get("https://app.docuport.app/company-formation/resident");
            selectBusinessTypeOf("Corporation");



            //Validate Virginia is selected
            selectStateTypeOf("Virginia");

            // Validate Virginia Price Summary
            validateSummaryAndPrice("Virginia");


            selectStateTypeOf("Maryland");

            validateSummaryAndPrice("Maryland");


            //Validate order summer as below:
            WebElement orderSummery = driver.findElement(By.xpath("//h3[.=' Order summary ']"));


        }

        public void selectBusinessTypeOf(String business) {
            WebElement button1 = driver.findElement(By.xpath("//label[contains(text(),'" + business + "')]"));
            button1.click();
            WebElement button2 = driver.findElement(By.xpath("//label[contains(text(),'" + business + "')]/..//input"));
            System.out.println(button2.isSelected()+" Business type button selected is validated");

        }
        public void selectStateTypeOf(String state) {
            WebElement button1 = driver.findElement(By.xpath("//label[text()='"+state+"']"));
            button1.click();
            WebElement button2 = driver.findElement(By.xpath("//label[text()='"+state+"']/..//input"));
            System.out.println(button2.isSelected()+" State type button selected is validated");
        }


        public void validateSummaryAndPrice(String state) {

            List<WebElement> elements = driver.findElements(By.xpath("//p[contains(@class,'subtitle-2')]"));
            List<WebElement> elementsPrices = driver.findElements(By.xpath("//p[contains(@class,'text-right body-2')]"));
            Map<String, String> actualMap = new LinkedHashMap<>();

            Map<String, String> expectedMap = new LinkedHashMap<>();

            if (state.equals("Virginia")) {
                expectedMap.put("State registration fee", "$50");
                expectedMap.put("Payment processing", "$3");
                expectedMap.put("Service fee", "$150");
                expectedMap.put("Total", "$203");
            } else if (state.equals("Maryland")) {
                expectedMap.put("State registration fee", "$170");
                expectedMap.put("Payment processing", "$10.20");
                expectedMap.put("Service fee", "$150");
                expectedMap.put("Total", "$330.20");

            }


            for (int i = 0; i < elements.size(); i++) {
                actualMap.put(elements.get(i).getText(), elementsPrices.get(i).getText());
            }


            for (String eachKey : actualMap.keySet()) {
                System.out.println(eachKey + " " + actualMap.get(eachKey));
            }


            if (expectedMap.equals(actualMap)) {
                System.out.println("True");
            }

            Assert.assertEquals(actualMap,expectedMap);


        }
    }


