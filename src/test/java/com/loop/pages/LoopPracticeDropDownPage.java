package com.loop.pages;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopPracticeDropDownPage {


    @FindBy(id ="dropdown")
    public WebElement simpleDropdown;

    @FindBy(id = "month")
    public WebElement month;

    @FindBy (id = "day")
        public WebElement day;

    @FindBy (id ="year")
    public WebElement year;

    @FindBy(id = "state")
    public WebElement state;

    @FindBy(name = "Languages")
    public WebElement language;



    public LoopPracticeDropDownPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
