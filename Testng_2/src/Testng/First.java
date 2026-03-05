package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class First {
	
    WebDriver driver; 

    @BeforeMethod
    public void setup() {
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