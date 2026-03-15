package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;
	
	@Given("I launch the browser")
	public void i_launch_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@When("I open the login page")
	public void I_open_the_login_page() {
		driver.get("https://www.saucedemo.com/");
	}
	
	@And("I enter valid username and password")
	public void I_enter_valid_username_and_password() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	
	@And("I click on login button")
    public void i_click_on_login_button() {
        driver.findElement(By.id("login-button")).click();
        
    
     driver.quit();
    }
	
	
}
