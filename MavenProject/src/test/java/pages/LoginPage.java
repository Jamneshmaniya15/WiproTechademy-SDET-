package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    // ─── Login form elements on ParaBank home page ────────────────────────
    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement loginButton;

    // Error message shown on failed login
    @FindBy(xpath = "//p[@class='error']")
    private WebElement errorMessage;

    // ─── Constructor ──────────────────────────────────────────────────────
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait   = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    // ─── Methods ──────────────────────────────────────────────────────────

    public void navigateToLoginPage() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        System.out.println("[PAGE] Navigated to Login page");
    }

    public boolean isLoginPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(usernameField));
        return usernameField.isDisplayed();
    }

    public void enterUsername(String username) {
        wait.until(ExpectedConditions.visibilityOf(usernameField));
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    // ─── Login in one step ────────────────────────────────────────────────
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
        System.out.println("[ACTION] Login attempted with username: " + username);
    }

    public boolean isErrorDisplayed() {
        try {
            wait.until(ExpectedConditions.visibilityOf(errorMessage));
            return errorMessage.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
