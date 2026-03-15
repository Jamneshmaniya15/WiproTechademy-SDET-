package daily_Assessment;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Day23AdvancedControlsTest {

    @Test
    public void handleAdvancedControls() {

        // TODO 1: Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // TODO 2: Create WebDriverWait with 10 seconds timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {

            // TODO 3: Navigate to JavaScript Alerts page
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            // TODO 4: Click "Click for JS Alert" button
            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

            // TODO 5: Wait for alert to be present
            wait.until(ExpectedConditions.alertIsPresent());

            // TODO 6: Accept the alert
            driver.switchTo().alert().accept();


            // TODO 7: Navigate to Multiple Windows page
            driver.get("https://the-internet.herokuapp.com/windows");

            // TODO 9: Capture parent window handle (before clicking)
            String parentHandle = driver.getWindowHandle();

            // TODO 8: Click "Click Here" link
            driver.findElement(By.linkText("Click Here")).click();

            // TODO 10: Switch to the newly opened window
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));
            Set<String> allHandles = driver.getWindowHandles();
            for (String handle : allHandles) {
                if (!handle.equals(parentHandle)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }
            System.out.println("New window title: " + driver.getTitle());



            // TODO 11: Navigate to Iframe page
            driver.get("https://the-internet.herokuapp.com/iframe");

            // TODO 12: Switch to iframe using id "mce_0_ifr"
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("mce_0_ifr")));

            // TODO 13: Locate editor element and retrieve text
            WebElement editor = driver.findElement(By.id("tinymce"));
            String editorText = editor.getText();
            System.out.println("Iframe editor text: " + editorText);

        } catch (Exception e) {
            // TODO 14: Handle exception
            System.out.println("Test failed due to exception: " + e.getMessage());
            e.printStackTrace();

        } finally {
            // TODO 15: Quit the browser
            driver.quit();
        }
    }
}
