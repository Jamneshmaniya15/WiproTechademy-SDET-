package JamnesTng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestingDB {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login");
	}
		
	@Test (dataProvider="database")
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
	
	@DataProvider(name="database")
	public Object[][] getData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","J@mmy2810");
		//Statement stmt = con.createStatement();
		Statement stmt = con.createStatement(
		        ResultSet.TYPE_SCROLL_INSENSITIVE,
		        ResultSet.CONCUR_READ_ONLY);

		ResultSet rs = stmt.executeQuery("SELECT username,password FROM user");
		
		rs.last();
		int rowCount=rs.getRow();
		rs.beforeFirst();
		
		Object [][] data = new Object[rowCount][2];
		
		int i = 0;
		while(rs.next()) {
			data[i][0] = rs.getString("username");
			data[i][1] = rs.getString("password");
			i++;
		}
		con.close();
		return data;
	}
	

}
