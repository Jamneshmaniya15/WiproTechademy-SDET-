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

public class CheckBoxHandling {
	@Test
	public void test() {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	driver.get("https://the-internet.herokuapp.com/checkboxes");
	WebElement chkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"checkboxes\"]/input[1]")));
	if(!chkbox.isSelected()) {
		chkbox.click();
	}
	Assert.assertEquals(true, chkbox.isSelected());
	driver.quit();
	}
}
