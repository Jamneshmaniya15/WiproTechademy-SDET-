package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmationPage {

    WebDriver driver;
    WebDriverWait wait;

    By pageHeading = By.xpath("//h1");
    By logoutLink = By.linkText("Log Out");

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public boolean isRegistrationSuccessful() {

        try {

            // wait until Cloudflare page disappears
            wait.until(driver ->
                    !driver.getTitle().toLowerCase().contains("just a moment"));

            wait.until(ExpectedConditions.visibilityOfElementLocated(pageHeading));

            String heading = driver.findElement(pageHeading).getText();
            String title = driver.getTitle();

            System.out.println("[CONFIRM] Heading: " + heading);
            System.out.println("[CONFIRM] Title: " + title);

            if (heading.contains("Welcome") || title.contains("Customer Created")) {
                return true;
            }

            return false;

        } catch (Exception e) {

            System.out.println("[CONFIRM] Error verifying registration: " + e.getMessage());
            return false;
        }
    }

    public boolean isLogoutVisible() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(logoutLink));
            return driver.findElement(logoutLink).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickLogOut() {
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
        driver.findElement(logoutLink).click();
    }
}