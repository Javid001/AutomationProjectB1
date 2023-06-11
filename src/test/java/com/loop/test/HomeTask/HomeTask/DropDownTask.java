package com.loop.test.HomeTask.HomeTask;

import com.loop.pages.LoopPracticeDropDownPage;
import com.loop.test.utilities.BrowserUtils;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTask {

    LoopPracticeDropDownPage loopPracticeDropDownPage;

    Select select ;


    @BeforeMethod
    public void SetUp(){
        loopPracticeDropDownPage = new LoopPracticeDropDownPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));


    }
    @Test
    public void dropDownTest(){
        BrowserUtils.loopLinkClick("Dropdown");
        select = new Select(loopPracticeDropDownPage.simpleDropdown);
        select.selectByValue("1");
        Assert.assertTrue(select.getFirstSelectedOption().getText().equals("Option 1"));
        select =new Select(loopPracticeDropDownPage.year);
        select.selectByValue("2021");
        Assert.assertTrue(select.getFirstSelectedOption().getText().equals("2021"));
        select = new Select(loopPracticeDropDownPage.month);
        select.selectByValue("7");
        Assert.assertTrue(select.getFirstSelectedOption().getText().equals("August"));
        select = new Select(loopPracticeDropDownPage.day);
        select.selectByValue("13");
        Assert.assertTrue(select.getFirstSelectedOption().getText().equals("13"));
        select = new Select(loopPracticeDropDownPage.state);
        select.selectByIndex(47);
        Assert.assertTrue(select.getFirstSelectedOption().getAttribute("value").equals("VA"));
        select = new Select(loopPracticeDropDownPage.language);
//        select.selectByVisibleText("Java");
        Assert.assertTrue(select.isMultiple());
        select.selectByIndex(0);
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);

        select.deselectByIndex(1);
        select.deselectByIndex(2);
        select.deselectByIndex(3);
        Assert.assertTrue(select.getFirstSelectedOption().getText().equals("Java"));


    }


}
