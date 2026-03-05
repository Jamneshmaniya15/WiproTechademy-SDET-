package Jamnesh;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://the-internet.herokuapp.com/upload");
	        driver.manage().window().maximize();
	        
	        Thread.sleep(2000);
			
			String s = "C:\\Users\\Jamnesh Maniya\\Downloads\\FakeResume.pdf";
			driver.findElement(By.id("file-upload")).sendKeys(s);
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("file-submit")).click();
			
			Thread.sleep(2000);
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			driver.close();
		}

	}

}
