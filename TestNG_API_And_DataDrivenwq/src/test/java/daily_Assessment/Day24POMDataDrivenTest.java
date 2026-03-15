package daily_Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class LoginPage {

    WebDriver driver;

    // TODO 1: Create constructor to initialize WebDriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // TODO 2: Create login method
    // - Locate username field
    // - Locate password field
    // - Click login button
    public void login(String username, String password) {
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(username);

        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public String getFlashMessage() {
        return driver.findElement(By.id("flash")).getText();
    }
}


public class Day24POMDataDrivenTest {

    @DataProvider
    public Object[][] loginData() {
        // TODO 3: Return multiple sets of login credentials
        // - One valid
        // - One invalid
        return new Object[][] {
            { "tomsmith",   "SuperSecretPassword!", true  },  // valid credentials
            { "wronguser",  "wrongpassword",        false }   // invalid credentials
        };
    }

    @Test(dataProvider = "loginData")
    public void verifyLogin(String user, String pass, boolean isValid) {

        // TODO 4: Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // TODO 5: Navigate to login page
        driver.get("https://the-internet.herokuapp.com/login");

        try {
            // TODO 6: Create LoginPage object
            LoginPage loginPage = new LoginPage(driver);

            // TODO 7: Call login method using test data
            loginPage.login(user, pass);

            // TODO 8: Capture login result message
            String message = loginPage.getFlashMessage();
            System.out.println("Credentials [" + user + "/" + pass + "] → Message: " + message);

            // TODO 9: Validate success or failure using Assert
            if (isValid) {
                Assert.assertTrue(message.contains("You logged into a secure area"),
                        "Expected success message but got: " + message);
                System.out.println("✔ Valid login test PASSED");
            } else {
                Assert.assertTrue(message.contains("Your username is invalid"),
                        "Expected failure message but got: " + message);
                System.out.println("✔ Invalid login test PASSED");
            }

        } finally {
            // TODO 10: Close browser
            driver.quit();
        }
    }
}