package com.loop.pages;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class SmartBearSoftwarePage {
    public SmartBearSoftwarePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement username;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;
    @FindBy(className = "button")
    public WebElement loginButton;
    @FindBy(tagName = "a")
    public List<WebElement> allLinks;
    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderButton;
    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement selectDropDown;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;
    @FindBy(xpath = "//input[@value='Calculate']")
    public WebElement calculate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement nameField;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetField;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityField;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateField;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipCodeField;
    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaRadioButton;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumberField;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDate;
    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;
    @FindBy(xpath = "//strong[contains(text(),'New order')]")
    public WebElement successMessage;

    public String ExpectedMessage = "New order has been successfully added.";

}
