package stepdefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataDrivenUsingTable {
	WebDriver driver;
	
	@Given("I launch the new browser")
	public void i_launch_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	}
	
	@When("I enter valid username and password using list")
	public void I_enter_valid_username_and_password_using_list(DataTable dataTable) {
		
		List<List<String>> data = dataTable.asLists(String.class);
		
		for(List<String> row : data) {
			String username = row.get(0);
			String password = row.get(1);
		
			driver.findElement(By.id("user-name")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			
		}
       
		
}
	
	@And("I click on Login button")
    public void i_click_on_login_button() {
        driver.findElement(By.id("login-button")).click();
        
        driver.navigate().back();
        
    
     driver.quit();
    }
}
