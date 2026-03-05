package JamnesTng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class First {
	
    WebDriver driver; 

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleTitle() {
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}