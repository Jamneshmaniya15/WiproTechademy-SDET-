package Jamnesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelinium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.selenium.dev/");
			
			//To check the url  is correct
			if(!driver.getCurrentUrl().equals("https://www.selenium.dev/")) {
				driver.close();
			}
			
			WebElement downloadLink = driver.findElement(By.linkText("Download"));
			downloadLink.click();
			
			driver.navigate().back();
			
			driver.manage().window().maximize();
			System.out.println("Title :" +driver.getTitle());
		} catch(Exception e) {
			System.out.println("Err Occ : " +e.getMessage());
		} finally {
			driver.close();
		}
		
	}

}
