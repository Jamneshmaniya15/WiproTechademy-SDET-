package Testng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Iframe {
	@Test
	public void test() {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	driver.get("https://the-internet.herokuapp.com/iframe");
	driver.switchTo().frame("mce_0_ifr");
	String text =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tinymce"))).getText();
	
	System.out.println(text);
	Assert.assertFalse(text.isEmpty(),"text is empty");
	driver.switchTo().defaultContent();
	
	driver.quit();
	}
}
