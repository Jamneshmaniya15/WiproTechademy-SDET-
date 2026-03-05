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

public class Katamari {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("detach", true);
        options.addArguments("--disable-blink-features=AutomationControlled");

        WebDriver driver = new ChromeDriver(options);
        
        Actions action = new Actions(driver);

        try {
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
            
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Katamari");
            searchBox.submit();
            

            Thread.sleep(3000);
            
            Thread.sleep(3000);
            
            driver.findElement(By.xpath("//*[@id=\"rcnt\"]/div[2]/div/div/div/div[3]/div[1]/div/div/div[1]/div/div/div[1]/img")).click();
            
            Thread.sleep(3000);
            
        
            

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}