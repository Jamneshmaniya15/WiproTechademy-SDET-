package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="first-name")
    WebElement firstName;

    @FindBy(id="last-name")
    WebElement lastName;

    @FindBy(id="postal-code")
    WebElement postalCode;

    @FindBy(id="continue")
    WebElement continueBtn;

    @FindBy(id="finish")
    WebElement finishBtn;

    @FindBy(className="complete-header")
    WebElement confirmationMsg;

    public CheckoutPage enterDetails() {
        firstName.sendKeys("John");
        lastName.sendKeys("Doe");
        postalCode.sendKeys("400001");
        return this;
    }

    public CheckoutPage continueCheckout() {
        continueBtn.click();
        return this;
    }

    public CheckoutPage finishOrder() {
        finishBtn.click();
        return this;
    }

    public String getConfirmation() {
        return confirmationMsg.getText();
    }
}