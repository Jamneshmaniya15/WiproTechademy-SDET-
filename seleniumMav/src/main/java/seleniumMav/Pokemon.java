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

public class Pokemon {
    public static void main(String[] args) {
        try {
            WebDriverManager.chromedriver().setup();
            
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-blink-features=AutomationControlled");
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            options.setExperimentalOption("useAutomationExtension", false);

            WebDriver driver = new ChromeDriver(options);
            // Initialize the wait tool (10-second timeout)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // 1. Go to Google and search
            driver.get("https://www.google.com/");
            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
            searchBox.sendKeys("Pokemon");
            searchBox.submit();
            
            // 2. Click the Pokeball
            WebElement pokeball = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//g-ripple")));
            pokeball.click();
            
            // 3. NEW: Click the "Get started" button in the pop-up
            WebElement getStartedBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(., 'Get started')]")
            ));
            getStartedBtn.click();
            
            // 4. Get the Hint
            // We wait for the hint text box to be visible
            WebElement hintElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@role='heading']")
            ));
            String pokemonHint = hintElement.getText();
            System.out.println("The Hint is: " + pokemonHint);
            
            // 5. Close the popup to search again
            // Clicking the 'X' or 'Search to catch' button
            driver.findElement(By.xpath("//button[contains(., 'Search to catch')]")).click();

            // 6. Enter the Hint/Answer into the search bar
            WebElement finalSearch = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
            finalSearch.clear();
            finalSearch.sendKeys(pokemonHint);
            finalSearch.submit();
            
            Thread.sleep(5000); 
            driver.quit(); 
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}