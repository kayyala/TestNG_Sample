package com.test;


import com.utility.Capturescreenshots;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Sudhakar on 31/12/2017.
 */

//https://www.youtube.com/watch?v=4ldt-KIgPUQ&t=985s
public class TakeScreenshoot {
    WebDriver driver;

    @Test
    public void open() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        Capturescreenshots.capturescreens(driver, "broserstart");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("susuusuusus@gmail.com");
        Capturescreenshots.capturescreens(driver, "   --afterenteremail");
//    TakesScreenshot ts= (TakesScreenshot) driver;
//File source =ts.getScreenshotAs(OutputType.FILE);
//    FileUtils.copyFile(source,new File(".\\screenshots\\facebook.png"));
//    System.out.println("its Screenshot taken");
    }
}

