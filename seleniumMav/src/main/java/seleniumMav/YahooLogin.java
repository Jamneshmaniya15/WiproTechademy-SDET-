package seleniumMav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		try {
			
			driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("login-username")).sendKeys("jamneshmaniya102@gmail.com");
			driver.findElement(By.id("login-signin")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("login-passwd")).sendKeys("Qwert!2345");
			driver.findElement(By.id("login-signin")).click();
			
			Thread.sleep(3000);
			
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
