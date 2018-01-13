package com.utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

/**
 * Created by Sudhakar on 31/12/2017.
 */
public class Capturescreenshots {
    public static void capturescreens(WebDriver driver, String screenshotname) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(source, new File(".\\Screenshots\\" + screenshotname + ".png"));
            System.out.println("its Screenshot taken");

        } catch (Exception e) {
            System.out.println("while taking screenshot" + e.getMessage());
        }

    }
}