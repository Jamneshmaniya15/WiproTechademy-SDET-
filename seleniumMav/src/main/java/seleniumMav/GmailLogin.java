package seleniumMav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		
		try {
			driver.get("https://workspace.google.com/intl/en-US/gmail/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/gws-header/header/div/div[3]/span[3]/a")).click();
			
			driver.findElement(By.id("identifierId")).sendKeys("jamneshmaniya102@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[3]")).click();
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
