package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    @FindBy(id = "customer.firstName")    private WebElement firstNameField;
    @FindBy(id = "customer.lastName")     private WebElement lastNameField;
    @FindBy(id = "customer.address.street") private WebElement addressField;
    @FindBy(id = "customer.address.city") private WebElement cityField;
    @FindBy(id = "customer.address.state") private WebElement stateField;
    @FindBy(id = "customer.address.zipCode") private WebElement zipCodeField;
    @FindBy(id = "customer.phoneNumber")  private WebElement phoneField;
    @FindBy(id = "customer.ssn")          private WebElement ssnField;
    @FindBy(id = "customer.username")     private WebElement usernameField;
    @FindBy(id = "customer.password")     private WebElement passwordField;
    @FindBy(id = "repeatedPassword")      private WebElement confirmPasswordField;
    @FindBy(xpath = "//input[@value='Register']") private WebElement registerButton;

    public RegisterPage(WebDriver driver) {
        this.driver  = driver;
        this.wait    = new WebDriverWait(driver, Duration.ofSeconds(30));
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateTo(String url) {
        driver.get(url);
        System.out.println("[PAGE] Navigated to: " + url);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer.firstName")));
        pause(1000); // wait 1s after load — mimics human landing on page
        System.out.println("[PAGE] Registration form loaded successfully");
    }

    public boolean isPageLoaded() {
        try {
            wait.until(ExpectedConditions.visibilityOf(firstNameField));
            return firstNameField.isDisplayed();
        } catch (Exception e) { return false; }
    }

    // ── Type like a human — click field, small pause, then type ──────────
    private void type(WebElement field, String value) {
        wait.until(ExpectedConditions.visibilityOf(field));
        actions.moveToElement(field).click().perform(); // click like human
        pause(200);
        field.clear();
        // Type character by character with tiny delay — avoids bot detection
        for (char c : value.toCharArray()) {
            field.sendKeys(String.valueOf(c));
            pause(50); // 50ms between each character
        }
        field.sendKeys(Keys.TAB); // tab out of field like human
        pause(150);
    }

    public void enterFirstName(String val)       { type(firstNameField, val); }
    public void enterLastName(String val)        { type(lastNameField, val); }
    public void enterAddress(String val)         { type(addressField, val); }
    public void enterCity(String val)            { type(cityField, val); }
    public void enterState(String val)           { type(stateField, val); }
    public void enterZipCode(String val)         { type(zipCodeField, val); }
    public void enterPhone(String val)           { type(phoneField, val); }
    public void enterSSN(String val)             { type(ssnField, val); }
    public void enterUsername(String val)        { type(usernameField, val); }
    public void enterPassword(String val)        { type(passwordField, val); }
    public void enterConfirmPassword(String val) { type(confirmPasswordField, val); }

    public void clickRegister() {
        wait.until(ExpectedConditions.elementToBeClickable(registerButton));
        pause(500); // small pause before clicking — human behaviour
        // Use Actions to move to button then click — more human-like than direct click
        actions.moveToElement(registerButton).pause(300).click().perform();
        System.out.println("[ACTION] Register button clicked");
    }

    public void fillRegistrationForm(String firstName, String lastName,
                                     String address,   String city,
                                     String state,     String zipCode,
                                     String phone,     String ssn,
                                     String username,  String password) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterAddress(address);
        enterCity(city);
        enterState(state);
        enterZipCode(zipCode);
        enterPhone(phone);
        enterSSN(ssn);
        enterUsername(username);
        enterPassword(password);
        pause(300);
        enterConfirmPassword(password);

        System.out.println("[FORM] Filled — username: " + username
            + " | password length: " + password.length()
            + " | city: " + city);
    }

    // ── Small pause helper ────────────────────────────────────────────────
    private void pause(long ms) {
        try { Thread.sleep(ms); }
        catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}