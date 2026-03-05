package seleniumMav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	public static void main(String[] args) {
	    WebDriverManager.chromedriver().setup();

	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--headless=new"); // MUST HAVE: Runs in background
	    options.addArguments("--disable-gpu");
	    options.addArguments("--window-size=1920,1080");

	    WebDriver driver = new ChromeDriver(options);
	    driver.get("https://www.google.com/");
	    System.out.println("Title : " + driver.getTitle());
	    driver.quit();
	}
}