package com.test;

import com.utility.Capturescreenshots;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Sudhakar on 31/12/2017.
 *///
public class FailedTestScreenshot {
    WebDriver driver;

    @Test
    public void open() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.facebook.com");


        driver.manage().window().maximize();
        driver.findElement(By.id("emailll")).sendKeys("susuusuusus@gmail.com");

    }
    @AfterMethod
    public void tearDown(ITestResult result)
    {
        if (ITestResult.FAILURE==result.getStatus())
        {
            Capturescreenshots.capturescreens(driver,result.getName());
        }
        driver.close();
    }
}