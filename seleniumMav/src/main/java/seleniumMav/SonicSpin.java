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

public class SonicSpin {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        
        // Use 'detach' so the browser stays open to see Super Sonic!
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("detach", true);
        options.addArguments("--disable-blink-features=AutomationControlled");

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
            
            // 1. Search for Sonic
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Sonic the Hedgehog");
            searchBox.submit();
            Thread.sleep(3000);

            // 2. Locate the Sonic Sprite
            WebElement sonic = driver.findElement(By.xpath("//*[@id=\"rcnt\"]/div[2]/div/div/div/div[3]/div[1]/div/div/div[1]/div/div/div/img[1]"));

            for (int i = 1; i <= 25; i++) {
                sonic.click();
                Thread.sleep(600); 
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}