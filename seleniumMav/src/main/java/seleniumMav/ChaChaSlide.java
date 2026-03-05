package seleniumMav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChaChaSlide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("detach", true);
        options.addArguments("--disable-blink-features=AutomationControlled");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		try {
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			WebElement search = driver.findElement(By.name("q"));
			search.sendKeys("Cha Cha Slide");
			search.submit();
			
			Thread.sleep(4000);
			
			
			
			for(int i = 0;i<15;i++) {
				WebElement s = driver.findElement(By.xpath("//*[@id=\"rcnt\"]/div[2]/div/div/div/div[3]/div[1]/div/div/div[1]/div/div/div/img"));
				s.click();
				Thread.sleep(3000);
			}
			
			driver.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
