package jamnesh;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    // Called on test METHOD failure (by TestListener)
    public static void captureOnFailure(WebDriver driver, ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            saveScreenshot(driver, result.getName());
        }
    }

    // Called on LOGIN failure (by loginTest)
    public static void captureOnFailure(WebDriver driver, String username) {
        saveScreenshot(driver, "LoginFailed_" + username);
    }

    // Common save logic
    private static void saveScreenshot(WebDriver driver, String name) {
        try {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            new File("screenshots").mkdirs();
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String filePath = "screenshots/" + name + "_" + timestamp + ".png";
            Files.write(Paths.get(filePath), screenshot);
            System.out.println("Screenshot saved: " + filePath);
        } catch (IOException e) {
            System.err.println("Screenshot failed: " + e.getMessage());
        }
    }
}
