package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 29/12/2017.
*/
    //passing parameter
    //using grouping
    //running in parrlal testing
    // enable true/false
    //priority testing
    //dependsongroup/methods/test etc...


public class WatchShop {
    WebDriver driver;
    Logger log = Logger.getLogger(WatchShop.class);

    @Test(priority = 0,groups = {"sanity", "regration"})
    @Parameters({"url", "browser", "email", "password"})
    public void open(String url, String browser, String email, String password) throws InterruptedException {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "C:\\Program Files\\SeleniumDrivers\\IEDriver\\IEDriverServer.exe");
            driver = (new InternetExplorerDriver());

        } else {
            driver = (new FirefoxDriver());
        }
//        driver.get("http://www.watchshop.com/");
        driver.get(url);
        log.info("entering URL");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        Thread.sleep(500);
        driver.findElement(By.xpath("//a[@class='my-account subsite-toggle-item pull-right hidden-md hidden-sm hidden-xs']")).click();
        log.info("clicking login");
        driver.findElement(By.xpath(".//*[@id='ajaxbox']/form/div[1]/div[2]/div[1]/div/input")).sendKeys(email);
        driver.findElement(By.xpath(".//*[@id='ajaxbox']/form/div[1]/div[2]/div[2]/div/input")).sendKeys(password);
        driver.findElement(By.xpath(".//*[@id='ajaxbox']/form/div[2]/div[2]/div/div/button")).click();

        driver.quit();
    }

    @Test(priority = 4,groups = {"sanity", "sudha"})
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://youtube.com");
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

        System.out.println("cheing test1");
        driver.close();
    }

    @Test(priority = 2,groups = "regration")
    public void test2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.bbc.com");
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

        System.out.println("cheing test2");
        driver.close();
    }

    @Test(priority = 3,enabled = true)
    public void test3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.bbc.com");
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

        System.out.println("cheing test3");
        driver.close();
    }
        @Test(priority = 1,enabled = false)
        public void test4(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

            driver.get("http://www.bbc.com");
            System.out.println("cheing test4");
            driver.close();
    }
}