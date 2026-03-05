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

public class MultipleWindowHandleing {
	@Test
	public void test() {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	driver.get("https://the-internet.herokuapp.com/windows");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Click Here']"))).click();
	
	String parentWindow = driver.getWindowHandle();
	
	Set <String> allWindow = driver.getWindowHandles();
	
	for(String handle:allWindow) {
		if(handle.equals(parentWindow)) {
			driver.switchTo().window(handle);
			break;
		}
	}
	
	String text = driver.findElement(By.className("example")).getText();
	Assert.assertTrue(text.equals("New Window"),"not equal");
	
	
	driver.quit();
	}
}
