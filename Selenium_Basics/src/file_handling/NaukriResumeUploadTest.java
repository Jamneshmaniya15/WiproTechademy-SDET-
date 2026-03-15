package file_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukriResumeUploadTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));


        String resumePath = System.getProperty("user.dir") + "/src/resources/FakeResume.pdf";

        try {
            driver.get("https://www.naukri.com/nlogin/login");
            driver.manage().window().maximize();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernameField")))
                .sendKeys("jamneshmaniya1028@gmail.com");  

            driver.findElement(By.id("passwordField"))
                .sendKeys("your_password");          

            driver.findElement(By.xpath("//*[@id='loginForm']//button[@type='submit']"))
                .click();

            WebElement profileIcon = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//div[contains(@class,'nI-gNb-drawer__icon')]")
                )
            );
            profileIcon.click();

            WebElement updateResume = wait.until(
                ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(text(),'Update resume')]")
                )
            );
            updateResume.click();

            WebElement uploadInput = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//input[@type='file']")
                )
            );
            uploadInput.sendKeys(resumePath);

            WebElement successMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//*[contains(text(),'successfully')]")
                )
            );

            if (successMsg.isDisplayed()) {
                System.out.println("✅ Resume uploaded successfully");
            } else {
                System.out.println("❌ Upload may have failed");
            }

        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
        } finally {
            driver.quit();  
        }
    }
}