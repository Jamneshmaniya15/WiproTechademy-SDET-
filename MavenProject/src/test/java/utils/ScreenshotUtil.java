package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    /**
     * Takes a screenshot and saves it to /screenshots folder.
     * Returns the file path so Extent Report can embed it.
     */
    public static String takeScreenshot(WebDriver driver, String testName) {
        try {
            // Create screenshots folder if it doesn't exist
            String folderPath = System.getProperty("user.dir") + "/screenshots/";
            Files.createDirectories(Paths.get(folderPath));

            // Unique file name using timestamp
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName  = testName + "_" + timestamp + ".png";
            String filePath  = folderPath + fileName;

            // Take screenshot and save
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] screenshotBytes = ts.getScreenshotAs(OutputType.BYTES);
            Files.write(Paths.get(filePath), screenshotBytes);

            System.out.println("[SCREENSHOT] Saved: " + filePath);
            return filePath;

        } catch (IOException e) {
            System.out.println("[SCREENSHOT] Failed to take screenshot: " + e.getMessage());
            return null;
        }
    }

    /**
     * Returns screenshot as Base64 string — used to EMBED image inside Extent Report.
     * No external file path needed — image is inside the HTML report itself.
     */
    public static String takeScreenshotAsBase64(WebDriver driver) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            return ts.getScreenshotAs(OutputType.BASE64);
        } catch (Exception e) {
            System.out.println("[SCREENSHOT] Base64 capture failed: " + e.getMessage());
            return null;
        }
    }
}
