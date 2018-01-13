package com.test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Sudhakar on 31/12/2017.
 */

//watchshop username london@gmail.com   password London1987
public class Log4j {
    WebDriver driver;
Logger logger =  Logger.getLogger(Log4j.class.getName());
@BeforeTest
public void loadlog4j(){
    String log4jConfipath =System.getProperty("user.dir")+"\\src\\main\\resources\\log4J.properties";
    PropertyConfigurator.configure(log4jConfipath);
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
}
 @Test
    public void logintest(){
     driver.get("http://www.watchshop.com/");
     driver.manage().window().maximize();
     logger.info("starting login test");
     driver.findElement(By.xpath("//a[@class='my-account subsite-toggle-item pull-right hidden-md hidden-sm hidden-xs']")).click();

     logger.info("clicking  login test");
     driver.findElement(By.xpath(".//*[@id='ajaxbox']/form/div[1]/div[2]/div[1]/div/input")).sendKeys("london@gmail.com");

     logger.info("entering email login test");
     logger.debug("checking debugging......");
     logger.fatal("  ");
     logger.warn("  ");


 }

}
