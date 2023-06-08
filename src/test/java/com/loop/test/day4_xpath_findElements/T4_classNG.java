package com.loop.test.day4_xpath_findElements;

import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_classNG {
    @Test
    public void test1(){
        System.out.println("Running");
        System.out.println("TestNG is running");
        String actual = "Nadir";
        String expected = "Feyruz";

        Assert.assertEquals(actual, expected);


    }
}
