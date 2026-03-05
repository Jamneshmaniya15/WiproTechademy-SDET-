package utils;

import driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

    public static String capture(String testName) throws Exception {

        File src = ((TakesScreenshot) DriverManager.getDriver())
                .getScreenshotAs(OutputType.FILE);

        String path = "screenshots/" + testName + ".png";

        FileUtils.copyFile(src, new File(path));

        return path;
    }
}