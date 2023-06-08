package com.loop.test.day7_windows_webtables;
   /*
    1. login as an advisor
    2. go to users
    3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
    4. validate that user name for alex.de.souza@gmail.com is alexdesouze
    5. validate that phone number for alex.de.souza@gmail.com is +994512060042
    6. validate that role for alex.de.souza@gmail.com is client
    7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
     */


import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T3_webtables extends TestBase {

@Test
public void test_web_tables(){
    DocuportUtils.login(driver, DocuportConstants.ADVISOR);
    WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
    users.click();
    String actual = DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "Full name");
    String expected = "Alex De Souza";
    System.out.println("actual = " + actual);
    assertEquals(actual, expected);

    String actualUserName = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com", "Username");
    String expectedUserName = "alexdesouze";
    System.out.println("actualUserName = " + actualUserName);
    assertEquals(actualUserName, expectedUserName);

    String actualPhoneNumber = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com", "phone number");
    String expectPhoneNumber = "+994512060042";
    System.out.println("actualUserPhoneNumber= " + actualPhoneNumber);
    assertEquals(actualPhoneNumber, expectPhoneNumber);

    String actualRole = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com", "role");
    String expectedRole = "Client";
    System.out.println("actualRole= " + actualRole);
    assertEquals(actualRole, expectedRole);

    String actualAdvisor = DocuportWebTableUtils.returnAnyField(driver,"alex.de.souza@gmail.com", "advisor");
    String expectedAdvisor = "Batch1 Group1";
    System.out.println("actualAdvisor= " + actualAdvisor);
    assertEquals(actualAdvisor, expectedAdvisor);


}
}


