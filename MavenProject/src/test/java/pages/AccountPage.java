package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage {

    WebDriver driver;
    WebDriverWait wait;

    // ─── Elements on the Account Overview page (shown after login) ────────

    // "Accounts Overview" heading
    @FindBy(xpath = "//div[@id='rightPanel']//h1")
    private WebElement pageHeading;

    // Welcome text — "Welcome FirstName LastName"
    @FindBy(xpath = "//p[@class='smallText']")
    private WebElement welcomeText;

    // Log Out link
    @FindBy(xpath = "//a[text()='Log Out']")
    private WebElement logOutLink;

    // ─── Constructor ──────────────────────────────────────────────────────
    public AccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait   = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    // ─── Methods ──────────────────────────────────────────────────────────

    public boolean isLoginSuccessful() {
        try {
            // Login is successful when Accounts Overview heading is visible
            wait.until(ExpectedConditions.visibilityOf(pageHeading));
            String heading = pageHeading.getText();
            System.out.println("[ACCOUNT] Page heading after login: " + heading);
            return heading.contains("Accounts Overview") || heading.contains("Account");
        } catch (Exception e) {
            System.out.println("[ACCOUNT] Login verification failed: " + e.getMessage());
            return false;
        }
    }

    public String getWelcomeText() {
        try {
            wait.until(ExpectedConditions.visibilityOf(welcomeText));
            return welcomeText.getText();
        } catch (Exception e) {
            return "";
        }
    }

    public String getPageHeading() {
        try {
            wait.until(ExpectedConditions.visibilityOf(pageHeading));
            return pageHeading.getText();
        } catch (Exception e) {
            return driver.getTitle();
        }
    }

    public void clickLogOut() {
        wait.until(ExpectedConditions.elementToBeClickable(logOutLink));
        logOutLink.click();
        System.out.println("[ACTION] Logged out successfully");
    }

    public boolean isLogOutVisible() {
        try {
            wait.until(ExpectedConditions.visibilityOf(logOutLink));
            return logOutLink.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
