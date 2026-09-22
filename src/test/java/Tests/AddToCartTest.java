package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.AddToCartPage;
import Pages.AmazonHomePage;
import Pages.AmazonSearchResultsPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void verifyAddToCartAndProceedToBuy() {

        // Search Product
        AmazonHomePage homePage = new AmazonHomePage(driver);

        homePage.searchProduct("Apple laptop MacBook");

        // Search Results
        AmazonSearchResultsPage resultsPage =
                new AmazonSearchResultsPage(driver);

        Assert.assertTrue(
                resultsPage.isMacBookDisplayed(),
                "Apple MacBook product is not displayed"
        );

        // Store current window
        String parentWindow = driver.getWindowHandle();

        // Select MacBook
        resultsPage.clickMacBook();

        // Switch to Product Details window
        for (String windowHandle : driver.getWindowHandles()) {

            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Add Product to Cart
        AddToCartPage addToCartPage =
                new AddToCartPage(driver);

        addToCartPage.clickAddToCart();

        System.out.println("Product added to cart successfully.");

        // Go to Cart
        addToCartPage.clickGoToCart();

        System.out.println("Go to Cart clicked successfully.");
        

        // Proceed to Buy
        addToCartPage.clickProceedToBuy();

        System.out.println("Proceed to Buy clicked successfully.");
    }
}