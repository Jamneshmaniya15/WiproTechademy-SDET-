package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverManager;

public class LoginPage {

    WebDriver driver;

    public LoginPage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    @FindBy(xpath = "//h3")
    WebElement errorMsg;

    public LoginPage enterUsername(String user) {
        username.sendKeys(user);
        return this;
    }

    public LoginPage enterPassword(String pass) {
        password.sendKeys(pass);
        return this;
    }

    public void clickLogin() {
        loginBtn.click();
    }

    public String getErrorMessage() {
        return errorMsg.getText();
    }
}