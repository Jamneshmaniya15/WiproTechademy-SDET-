package capstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlightBookingTest {

WebDriver driver;

@BeforeClass
public void setup() {

driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://blazedemo.com/");
}

@Test
public void bookFlightTest() throws InterruptedException {

Select fromCity = new Select(driver.findElement(By.name("fromPort")));
fromCity.selectByVisibleText("Boston");

Select toCity = new Select(driver.findElement(By.name("toPort")));
toCity.selectByVisibleText("London");

driver.findElement(By.cssSelector("input[type='submit']")).click();

WebElement flightsTable = driver.findElement(By.xpath("//table"));
Assert.assertTrue(flightsTable.isDisplayed());

driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[1]")).click();

WebElement purchaseHeader = driver.findElement(By.xpath("//h2"));
Assert.assertTrue(purchaseHeader.getText().contains("Your flight from"));

driver.findElement(By.id("inputName")).sendKeys("John Doe");
driver.findElement(By.id("address")).sendKeys("123 Main Street");
driver.findElement(By.id("city")).sendKeys("New York");
driver.findElement(By.id("state")).sendKeys("NY");
driver.findElement(By.id("zipCode")).sendKeys("10001");

Select cardType = new Select(driver.findElement(By.id("cardType")));
cardType.selectByVisibleText("Visa");

driver.findElement(By.id("creditCardNumber")).sendKeys("1234567812345678");
driver.findElement(By.id("creditCardMonth")).clear();
driver.findElement(By.id("creditCardMonth")).sendKeys("12");
driver.findElement(By.id("creditCardYear")).clear();
driver.findElement(By.id("creditCardYear")).sendKeys("2027");

driver.findElement(By.id("nameOnCard")).sendKeys("John Doe");

driver.findElement(By.cssSelector("input[value='Purchase Flight']")).click();

WebElement confirmation = driver.findElement(By.xpath("//h1"));
Assert.assertEquals(confirmation.getText(), "Thank you for your purchase today!");

System.out.println("Flight booking completed successfully");

}

@AfterClass
public void tearDown() {

driver.quit();
}
}