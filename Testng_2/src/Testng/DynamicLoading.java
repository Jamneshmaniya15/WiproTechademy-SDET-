package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoading {
	@Test
	public void test() {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Start']"))).click();
	
	WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"finish\"]/h4")));
	String capture = text.getText();
	
	Assert.assertTrue(capture.contains("Hello World!"),"its not there");
	driver.quit();
	}
}
