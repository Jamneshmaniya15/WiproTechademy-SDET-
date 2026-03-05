package seleniumMav;

import java.time.Duration;
import java.util.Collections;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StrangerThings {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        
        // Use 'detach' so the browser stays open to see Super Sonic!
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("detach", true);
        options.addArguments("--disable-blink-features=AutomationControlled");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        Actions actions = new Actions(driver);

        try {
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
            
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Stranger Things");
            searchBox.submit();
            
            
            
            driver.findElement(By.xpath("//*[@id=\"gsr\"]/div[2]/div[2]/g-ripple")).click();
            Thread.sleep(10000);
            
            //actions.scrollByAmount(0, 1500).perform();
            
            int totalScroll = 1500;
            int step = 20; 

            for (int i = 0; i < (totalScroll / step); i++) {
            	actions.scrollByAmount(0, step).perform();
            	Thread.sleep(10); 
            }
            
            driver.close();
            
            

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}