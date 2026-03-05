package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sonic {
	WebDriver driver;
	
	
	
	@BeforeMethod
	public void setup() {
		ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("detach", true);
        options.addArguments("--disable-blink-features=AutomationControlled");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	public void test() {
		try {
			WebElement search = driver.findElement(By.name("q"));
			search.sendKeys("sonic");
			search.submit();
			
			WebElement click = driver.findElement(By.className("exzcre"));
			
			for(int i = 1;i<=25;i++) {
				click.click();
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	@AfterMethod
	public void end() {
		driver.quit();
	}

}
