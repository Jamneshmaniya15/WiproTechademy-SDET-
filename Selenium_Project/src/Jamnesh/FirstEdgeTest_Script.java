package Jamnesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstEdgeTest_Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jamnesh Maniya\\Desktop\\Selenium_Integration\\chromedriver-win64\\chromedriver-win64");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		try {
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			
			String title = driver.getTitle();
			System.out.println("Title: " +title);
			
			if(title.contains("Google")) {
				System.out.println("Test Pass");
			}else {
				System.out.println("Fail");
			}
		}catch(Exception e){
			System.out.println("Exception Occured : " +e.getMessage());
		}finally {
			driver.quit();
		}
		
	}

}
