package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GreenCart {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}

	@Test
	public void Buy() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[3]/button"))).click();;
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[4]/div[2]/a[2]"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[4]/div[3]/button"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promocode"))).sendKeys("rahulshettyacademy");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoBtn"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/button"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/button"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select/option[41]"))).click();
		
		WebElement chkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("chkAgree")));
		if(!chkbox.isSelected()){
			chkbox.click();
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div/button"))).click();
		
	}
	
	@AfterClass
	public void terminated() {
		driver.close();
	}
}
