package daily_assessment;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Map;



@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue     = "",
    plugin   = { "pretty", "html:target/cucumber-report.html" }
)
public class day29LoginCucumberTest {

    public static void main(String[] args) {
        System.out.println("Feature: Login functionality - BDD Cucumber Test");

        System.out.println("Step definitions implemented in this file.");

        System.out.println("Run via JUnit runner using @RunWith(Cucumber.class)");
    }

    static WebDriver driver;

    @Before
    public void initDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Background step
    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get("https://example.com/login");
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("user clicks on login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("login should be {string}")
    public void login_should_be(String result) {
        if (result.equals("successful")) {
            String url = driver.getCurrentUrl();
            assert url.contains("dashboard") : "Expected dashboard URL, got: " + url;
            System.out.println("Login successful - validated.");
        } else {
            String errorMsg = driver.findElement(By.id("errorMessage")).getText();
            assert errorMsg != null && !errorMsg.isEmpty() : "Expected error message but got none.";
            System.out.println("Login unsuccessful - error message: " + errorMsg);
        }
    }

    @When("user logs in with following credentials")
    public void user_logs_in_with_credentials(DataTable dataTable) {
        List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> row : credentials) {
            String username = row.get("username");
            String password = row.get("password");

            driver.findElement(By.id("username")).clear();
            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("loginButton")).click();

            System.out.println("Attempted login with username: " + username);

            driver.get("https://example.com/login");
        }
    }
}
