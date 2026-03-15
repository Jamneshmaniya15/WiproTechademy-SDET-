package login;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
 
public class LoginDataProviderTest
{
 
	@Test (dataProvider="loginData")
	public void loginTest(String username, String password)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login");
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		System.out.println("username : "+username);
		
		driver.findElement(By.id("submit")).click();
		
		String check = driver.findElement(By.className("post-title")).getText();
		
		Assert.assertTrue(check.equalsIgnoreCase("Logged in successfully"), "Unsuccessful login");
		
		driver.quit();
	}
		@DataProvider(name="loginData")
		public Object[][] getData()
		{
			return new Object[][]
		{
				{"user1", "pass1"},	
				{"student", "Password123"},	
				{"user3", "pass3"}	
 
		};
		
	}
	
	
}
