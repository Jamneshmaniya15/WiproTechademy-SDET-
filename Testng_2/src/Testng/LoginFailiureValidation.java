package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginFailiureValidation {

	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
	}
	
	@Test
	public void login() {
		try {
		driver.findElement(By.id("username")).sendKeys("wronguser");
		driver.findElement(By.name("password")).sendKeys("wronguser");
		driver.findElement(By.xpath("//button[text()='login']")).click();
		
		String capture = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
		
		Assert.assertTrue(capture.contains("Your username is invalid!"), "its does not contains");
		}catch(Exception e) {
			System.out.println("Err : " +e.getMessage());
		}
	}
	
	@AfterMethod
	public void terminate() {
		driver.close();
	}
	
}
