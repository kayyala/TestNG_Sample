package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 02/12/2017.
 */
public class Google {
    WebDriver dirver;
    @BeforeMethod

    public void setup() {
//        System.setProperty("webdriver chrome.driver","");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\Sudhakar\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
        dirver = new ChromeDriver();
//        dirver.manage().window().maximize();
//        dirver.manage().deleteAllCookies();
        dirver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

    }
    @Test
    public void open(){
        dirver.navigate().to("https://www.google.co.uk/");

         String  title= dirver.getTitle();
        System.out.println(""+title);

    }
    @Test
    public void test2(){
        dirver.get("https://mvnrepository.com/artifact/net.htmlparser.jericho/jericho-html/3.4");

        String actual =  dirver.getTitle();
        String expected = "Maven Repository: net.htmlparser.jericho » jericho-html » 3.4";
        System.out.println(" this is secound test"+actual);
//        Assert.assertEquals(actual,"Maven Repository: net.htmlparser.jericho » jericho-html » 3.4");
        Assert.assertEquals(actual,expected);
    }
    @Test
    @Parameters({"url"})
    public void test3(String url){


        dirver.get(url);
        String actual1 =  dirver.getTitle();
        System.out.println(" printing parametarize "+actual1);



    }
@AfterMethod
    public void close(){
    dirver.close();
}

}
