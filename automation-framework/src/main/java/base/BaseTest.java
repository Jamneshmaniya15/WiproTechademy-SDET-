package base;

import driver.DriverFactory;
import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest {

    protected WebDriver driver;
    protected Properties prop;

    @BeforeMethod
    public void setup() throws Exception {

        prop = new Properties();
        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
        prop.load(fis);

        driver = DriverFactory.initDriver(prop.getProperty("browser"));
        driver.get(prop.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}