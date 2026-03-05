package JamnesTng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test(priority =1)
	public void search() {
		driver.findElement(By.id("searchDropdownBox")).click();
		driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[17]")).click();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Laptops");
		searchbox.submit();
	}
	
	@Test(priority=2)
	public void addToCart() {
		driver.findElement(By.id("a-autoid-1-announce")).click();
		driver.findElement(By.id("a-autoid-2-announce")).click();
		driver.findElement(By.id("nav-cart-count-container")).click();
	}
	
	@Test(priority=3)
	public void cart() {
		try {
			WebElement gift = driver.findElement(By.xpath("//*[@id=\"gutterCartViewForm\"]/div/div[1]/div[1]/span/div/label/i"));
			if(!gift.isSelected()) {
				gift.click();
			}
			driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span")).click();
			Thread.sleep(2000);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@Test(priority = 4)
	public void login() {
		try {
			driver.findElement(By.xpath("//*[@id=\"ap_email_login\"]")).sendKeys("jamneshmaniya102@gmail.com");
			driver.findElement(By.className("a-button-input")).click();
			WebElement pwd = driver.findElement(By.id("ap_password"));
			pwd.sendKeys("Qwer!234");
			pwd.submit();
			Thread.sleep(2000);
			driver.findElement(By.id("a-autoid-2-announce")).click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
		@Test(priority = 5)
		public void logout() {
			try {
				driver.findElement(By.id("nav-logo")).click();
				driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/button")).click();
				driver.findElement(By.xpath("//*[@id=\"nav-item-signout\"]/span")).click();
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
	}

}
