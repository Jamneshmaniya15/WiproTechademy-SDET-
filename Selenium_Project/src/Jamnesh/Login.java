package Jamnesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			WebElement userfield = driver.findElement(By.id("user-name"));
			userfield.sendKeys("standard_user");
			
			WebElement userpassword = driver.findElement(By.id("password"));
			userpassword.sendKeys("secret_sauce");
			
			WebElement login = driver.findElement(By.id("login-button"));
			login.click();
			
			Thread.sleep(3000);
			
			
			String currURL = driver.getCurrentUrl();
			if(currURL.equals("https://www.saucedemo.com/inventory.html")) {
				System.out.println("Login Successful. ");
			}else {
				System.out.println("Login Fails ");
			}
			
			WebElement AtC = driver.findElement(By.id("add-to-cart-sauce-lab-backpack"));
			AtC.click();
			
			WebElement AtC2 = driver.findElement(By.id("add-to-cart-sauce-lab-backpack"));
			AtC2.click();
			
			WebElement Add2Cart = driver.findElement(By.className("shopping_cart_link"));
			Add2Cart.click();
			
			Thread.sleep(3000);
			
			WebElement checkout = driver.findElement(By.className("shopping_cart_link"));
			checkout.click();
			
			driver.findElement(By.id("first-name")).sendKeys("Jamnesh");
			driver.findElement(By.id("last-name")).sendKeys("Maniya");
			driver.findElement(By.id("postal-code")).sendKeys("400032");
			driver.findElement(By.id("continue")).click();
			
			driver.findElement(By.id("finish")).click();
			
			
			
		}catch(Exception e) {
			System.out.println("Error !!" +e.getMessage());
		}finally {
			driver.close();
		}

	}

}
