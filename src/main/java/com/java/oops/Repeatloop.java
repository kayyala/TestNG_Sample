package com.java.oops;

import org.testng.annotations.Test;

/**
 * Created by Sudhakar on 04/12/2017.
 */
public class Repeatloop {

    @Test
    public void printignum() {
        int rc = 10;


        for (int i = 1; i <= rc; i++) {
            System.out.println(i);
        }

    }

    @Test
    public void test() {
        String name = "india";

        for (int n = 0; n < 5; n++) {
            for (int m = 0; m < n; m++) {

                System.out.print(" " + name);
            }
            System.out.println(" " + name);
        }
    }

    @Test
    public void test1() {
        String s1 = "sudhakar";
        String s2 = "sudhakar";
        String s3 = "india";


        // Result

        s1.equals(s2);
        s1.compareTo(s3);
        s2.compareTo(s3);

        System.out.println(s1.equals(s2));
        int a = 365;
        int b = 3765;
        int c = 365;
        int d = a + b;

        // Result
        System.out.println(d == b);
        System.out.println(a == b);
        System.out.println(a == c);


    }

    @Test
    public void comparesion() {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        System.out.println(s1 == s2);//true (because both refer to same instance)
        System.out.println(s1 == s3);//false(because s3 r
        System.out.println(s3 == s1);
        String s4 = s1.concat(s3);
        System.out.println(s4);//
        System.out.println("substring  " + s1.substring(0, 2));


    }

    @Test
    public void palandrom() {

        String country = "india";
        for (int i = 0; i< 5; i++) {
            for (int j = 0; j < i; j++){

                System.out.print("" + country);
            }
            System.out.println("" + country);
        }
    }
}
//for (int n = 0; n < 5; n++) {
// for (int m = 0; m < n; m++) {
//
//        System.out.print(" " + name);
//        }
//        System.out.println(" " + name);
//        }
