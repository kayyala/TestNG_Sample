package com.java.oops;

import org.testng.annotations.Test;

/**
 * Created by Sudhakar on 05/12/2017.
 */
public class SwitchCase {

//    @Test
//    public void test() {
//        String color = "red";
//
//        switch (color) {
//            case "red":
//                System.out.println("Color is Red");
//                break;
//            case "green":
//                System.out.println("Color is Green");
//                break;
//            default:
//                System.out.println("Color not found");
//        }


//    }

    @Test
    public void test2() {
        int number = 20;
        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }
    }

}