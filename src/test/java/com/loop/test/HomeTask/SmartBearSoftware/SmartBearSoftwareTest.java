package com.loop.test.HomeTask.SmartBearSoftware;

import com.github.javafaker.Faker;
import com.loop.pages.SmartBearSoftwarePage;
import com.loop.test.utilities.BrowserUtils;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import com.loop.test.utilities.SmartBearConstant;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SmartBearSoftwareTest {



    SmartBearSoftwarePage smartBearSoftwarePage;

    @BeforeClass
    public void setUp() {
        smartBearSoftwarePage = new SmartBearSoftwarePage();
        Driver.getDriver().get(ConfigurationReader.getProperty("smartbear"));
    }

    @AfterClass
    public void tearDown() {
        BrowserUtils.justWait(3);
//        Driver.getDriver().close();
    }

    @Test(priority = 1)
    public void count_links_and_get_text() {
        smartBearSoftwarePage.username.sendKeys(SmartBearConstant.USERNAME);
        smartBearSoftwarePage.password.sendKeys(SmartBearConstant.PASSWORD);
        smartBearSoftwarePage.loginButton.click();

        System.out.println("there are " + smartBearSoftwarePage.allLinks.size() + " LINKS");

        List<String> alltexts = new ArrayList<>();
        for (WebElement each : smartBearSoftwarePage.allLinks) {
            alltexts.add(each.getText());
        }
        System.out.println("all TEXTS:");
        System.out.println(alltexts);
    }

    @Test(priority = 2)
    public void confirm_success_message() {
        smartBearSoftwarePage.username.sendKeys(SmartBearConstant.USERNAME);
        smartBearSoftwarePage.password.sendKeys(SmartBearConstant.PASSWORD);
        smartBearSoftwarePage.loginButton.click();
        smartBearSoftwarePage.orderButton.click();
        new Select(smartBearSoftwarePage.selectDropDown).selectByIndex(1);
        smartBearSoftwarePage.quantity.sendKeys(Keys.BACK_SPACE + "2");
        smartBearSoftwarePage.calculate.click();
        Faker faker = new Faker();
        smartBearSoftwarePage.nameField.sendKeys(faker.name().fullName());
        smartBearSoftwarePage.streetField.sendKeys(faker.address().streetAddress());
        smartBearSoftwarePage.cityField.sendKeys(faker.address().city());
        smartBearSoftwarePage.stateField.sendKeys(faker.address().state());
        smartBearSoftwarePage.zipCodeField.sendKeys(faker.address().zipCode().substring(0, 5));
        smartBearSoftwarePage.visaRadioButton.click();

        smartBearSoftwarePage.cardNumberField.sendKeys(faker.business().creditCardNumber().replace("-", ""));
        smartBearSoftwarePage.expireDate.sendKeys(faker.business().creditCardExpiry().substring(0, 2) + "/" + faker.business().creditCardExpiry().substring(2, 4));
        BrowserUtils.justWait(3);
        smartBearSoftwarePage.processButton.click();

        assertTrue(smartBearSoftwarePage.successMessage.getText().equals(smartBearSoftwarePage.ExpectedMessage));

    }
}


