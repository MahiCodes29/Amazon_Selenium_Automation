package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.AmazonHomePage;
import Pages.AmazonSearchResultsPage;
import Pages.ProductDetailsPage;

public class ProductDetailsTest extends BaseTest {

    @Test
    public void verifyMacBookProductDetails() {

        // Search Apple laptop MacBook
        AmazonHomePage homePage =
                new AmazonHomePage(driver);

        homePage.searchProduct("Apple laptop MacBook");

        // Search Results
        AmazonSearchResultsPage resultsPage =
                new AmazonSearchResultsPage(driver);

        // Verify MacBook is displayed
        Assert.assertTrue(
                resultsPage.isMacBookDisplayed(),
                "Apple MacBook product is not displayed"
        );

        // Store current window
        String parentWindow = driver.getWindowHandle();

        // Select MacBook
        resultsPage.clickMacBook();

        // Switch to product page
        for (String windowHandle : driver.getWindowHandles()) {

            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Product Details Page
        ProductDetailsPage productDetailsPage =
                new ProductDetailsPage(driver);

        // Verify Product Details Page
        Assert.assertTrue(
                productDetailsPage.isProductDetailsDisplayed(),
                "Product Details page is not displayed"
        );

        // Print Product Details
        System.out.println(
                "Product Title: " +
                productDetailsPage.getProductTitle()
        );

        System.out.println(
                "Price: " +
                productDetailsPage.getProductPrice()
        );

        System.out.println(
                "Memory: " +
                productDetailsPage.getMemory()
        );

        System.out.println(
                "Size: " +
                productDetailsPage.getSize()
        );

        System.out.println(
                "Color: " +
                productDetailsPage.getColor()
        );

        System.out.println(
                "Brand: " +
                productDetailsPage.getBrand()
        );

        System.out.println(
                "Model Name: " +
                productDetailsPage.getModelName()
        );

        System.out.println(
                "Screen Size: " +
                productDetailsPage.getScreenSize()
        );
    }
}