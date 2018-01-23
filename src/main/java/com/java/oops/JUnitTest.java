package com.java.oops;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



/**
 * Created by Sudhakar on 13/01/2018.
 */
public class JUnitTest {
    @BeforeClass
    public void beforecalss(){
        System.out.println("beforeclass ");
    }
    @AfterClass
    public void aftercalss(){
        System.out.println("Afterclassgggggggggg");
    }
    @Test
    public void test1(){
        System.out.println("this is testing ");
    }
    @Test
    public void test2(){
        System.out.println("this is my second test");

    }
}

