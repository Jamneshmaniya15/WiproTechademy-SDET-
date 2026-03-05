package Jamnesh;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriResumeupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://www.naukri.com/nlogin/login");
	        driver.manage().window().maximize();
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.id("usernameField")).sendKeys("jamneshmaniya@gmail.com");
	        driver.findElement(By.id("passwordField")).sendKeys("password");
	        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")).sendKeys("password");
	        
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[4]/div")).click();
	        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[4]/div[2]/div[2]/div/div[1]/div[2]/a")).click();
	        
	        Thread.sleep(3000);
	        
	        String s = "C:\\Users\\Jamnesh Maniya\\Downloads\\FakeResume.pdf";
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/span/div/div/div/div/div[1]/div[2]/div[1]/div/div/ul/li[2]/a")).sendKeys(s);
	
	        
	        
	        
	        driver.findElement(By.className("google-text")).click();
			
			Thread.sleep(1000);
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			driver.close();
		}

	}

}
