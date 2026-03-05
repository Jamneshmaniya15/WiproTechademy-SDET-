package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement addToCart;

    @FindBy(className="shopping_cart_link")
    WebElement cartIcon;

    public ProductsPage addProductToCart() {
        addToCart.click();
        return this;
    }

    public CartPage goToCart() {
        cartIcon.click();
        return new CartPage(driver);
    }
}