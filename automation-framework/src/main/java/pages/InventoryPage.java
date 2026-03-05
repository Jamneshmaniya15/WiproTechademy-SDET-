package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverManager;

public class InventoryPage {

    public InventoryPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
    WebElement addToCartBtn;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    public void addProductToCart() {
        addToCartBtn.click();
    }

    public void clickCart() {
        cartIcon.click();
    }
}