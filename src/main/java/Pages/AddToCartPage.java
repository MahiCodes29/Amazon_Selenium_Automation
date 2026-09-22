package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {

    private WebDriver driver;

    // Add to Cart button
    private By addToCartButton = By.id("add-to-cart-button");

    // Go to Cart link
    private By goToCart = By.linkText("Go to Cart");

    // Proceed to Buy button
    private By proceedToBuyButton =
            By.name("proceedToRetailCheckout");

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void clickGoToCart() {
        driver.findElement(goToCart).click();
    }

    public void clickProceedToBuy() {
        driver.findElement(proceedToBuyButton).click();
    }
}