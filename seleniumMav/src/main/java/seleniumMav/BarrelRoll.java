package seleniumMav;

import java.time.Duration;
import java.util.Collections;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BarrelRoll {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("detach", true);
        options.addArguments("--disable-blink-features=AutomationControlled");

        WebDriver driver = new ChromeDriver(options);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
            
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("do a barrel roll");
            searchBox.submit();
            Thread.sleep(8000);

            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	driver.close();
        }
    }
}