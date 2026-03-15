package validation;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class UIElementValidation {

    WebDriver driver;
    WebDriverWait wait;
    private static final String URL = "https://practicetestautomation.com/practice-test-login";

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(URL);
    }

    @Test(priority = 1, description = "Verify login page elements are visible")
    public void verifyPageElementsVisible() {
        Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed(), 
            "Username field not visible");
        Assert.assertTrue(driver.findElement(By.id("password")).isDisplayed(), 
            "Password field not visible");
        Assert.assertTrue(driver.findElement(By.id("submit")).isDisplayed(), 
            "Submit button not visible");
    }

    @Test(priority = 2, description = "Verify input fields are enabled")
    public void verifyFieldsAreEnabled() {
        Assert.assertTrue(driver.findElement(By.id("username")).isEnabled(), 
            "Username field is disabled");
        Assert.assertTrue(driver.findElement(By.id("password")).isEnabled(), 
            "Password field is disabled");
    }

    @Test(priority = 3, description = "Verify correct page title")
    public void verifyPageTitle() {
        String expectedTitle = "Practice Test Login | Automation Practice";
        Assert.assertEquals(driver.getTitle(), expectedTitle, 
            "Page title mismatch");
    }

    @Test(priority = 4, description = "Verify error message for invalid login")
    public void verifyErrorMessageOnInvalidLogin() {
        driver.findElement(By.id("username")).sendKeys("wronguser");
        driver.findElement(By.id("password")).sendKeys("wrongpassword");
        driver.findElement(By.id("submit")).click();

        WebElement error = wait.until(ExpectedConditions
            .visibilityOfElementLocated(By.id("error")));

        Assert.assertTrue(error.isDisplayed(), 
            "Error message not displayed");
        Assert.assertTrue(error.getText().contains("Your username is invalid!"), 
            "Unexpected error message: " + error.getText());
    }

    @Test(priority = 5, description = "Verify successful login lands on correct page")
    public void verifySuccessfulLogin() {
        driver.get(URL);
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        WebElement successMsg = wait.until(ExpectedConditions
            .visibilityOfElementLocated(By.className("post-title")));

        Assert.assertTrue(successMsg.isDisplayed(), 
            "Success page element not visible");
        Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully"), 
            "URL did not change after login");
    }

    @Test(priority = 6, description = "Verify error shown when fields are empty")
    public void verifyEmptyFieldValidation() {
        driver.get(URL);
        driver.findElement(By.id("submit")).click();

        WebElement error = wait.until(ExpectedConditions
            .visibilityOfElementLocated(By.id("error")));

        Assert.assertTrue(error.isDisplayed(), 
            "No error shown for empty submission");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}