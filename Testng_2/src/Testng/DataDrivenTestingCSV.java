package Testng;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestingCSV {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login");
	}
		
	@Test(dataProvider ="Csvfile")
	public void loginTest(String username, String password)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@DataProvider(name="Csvfile")
	public Object[][] getData() throws Exception{
		String filePath = "C:\\Users\\Jamnesh Maniya\\eclipse-workspace\\Testng_2\\src\\Testng\\LoginData.csv";
		
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line;
		
		List<Object[]> data = new ArrayList<>();
		br.readLine();
		
		while((line=br.readLine())!=null) {
			String[] values = line.split(",");
			data.add(new Object[] {values[0],values[1]});
		}
		
		br.close();
		
		Object [][] result = new Object[data.size()][2];
		
		for(int i = 0;i<data.size();i++) {
			result[i]=data.get(i);
		}
		
		return result;
	}

}
