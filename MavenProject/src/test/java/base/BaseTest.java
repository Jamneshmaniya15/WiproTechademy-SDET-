package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class BaseTest {

    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public WebDriver getDriver() {
        return driver.get();
    }

    @Parameters("browser")
    @BeforeMethod
    public void setup(String browser) {

        WebDriver webDriver;

        if(browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();

        } else if(browser.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            webDriver = new FirefoxDriver();

        } else if(browser.equalsIgnoreCase("edge")) {

            WebDriverManager.edgedriver().setup();
            webDriver = new EdgeDriver();

        } else {

            throw new RuntimeException("Browser not supported: " + browser);
        }

        webDriver.manage().window().maximize();
        driver.set(webDriver);

        System.out.println("[SETUP] Browser opened: " + browser);
    }

    @AfterMethod
    public void tearDown() {

        if(getDriver() != null) {
            getDriver().quit();
        }

        System.out.println("[TEARDOWN] Browser closed.");
    }
}