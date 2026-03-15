package jamnesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginFunctionalityAutomation {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "loginData")
	public void loginTest(String username,String password,String expectedResult,String expectedText) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
		
		if(expectedResult.equals("success")) {
			String actualTextPass = driver.findElement(By.className("post-title")).getText();
			Assert.assertEquals(actualTextPass, expectedText,"Login failed");
			System.out.println("With username : " +username+ " and Password : "+password+ " Login Successful");
		}else {
			String actualTextFail = driver.findElement(By.id("error")).getText();
			ScreenshotUtil.captureOnFailure(driver, username);
			Assert.assertEquals(actualTextFail, expectedText,"Unexpected Error");
			System.out.println("With username : " +username+ " and Password : "+password+ " Login Unsuccessful");
		}
	}
	
	@DataProvider(name="loginData")
	public Object[][] getData(){
		return new Object[][] {
			{ "student",   "Password123", "success", "Logged In Successfully"    },
            { "student",   "wrongpass",   "failure", "Your password is invalid!" },
            { "wronguser", "Password123", "failure", "Your username is invalid!" },
            { "wronguse", "Password123", "failure", "Your username is invalid!" },
            { "student", "Password123", "success", "Wrong Title Here" },
            { "",          "",            "failure", "Your username is invalid!" }
		};
	}
	
	@AfterMethod
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
