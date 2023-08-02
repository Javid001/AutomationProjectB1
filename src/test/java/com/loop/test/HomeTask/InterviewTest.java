package com.loop.test.HomeTask;

import java.util.*;

public class InterviewTest {

    public static List<String>test(List<String>arr){

        Collections.sort(arr);
        return arr;

    }


    public static void main(String[] args) {

        List<String>name = new ArrayList<>(Arrays.asList("John","Tom","Apple"));

        System.out.println(test(name));


    }

}
