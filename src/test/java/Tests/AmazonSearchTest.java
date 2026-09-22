package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.AmazonHomePage;

public class AmazonSearchTest extends BaseTest {

    @Test
    public void verifyProductSearch() {

        AmazonHomePage homePage = new AmazonHomePage(driver);

        // Search for Laptop
        homePage.searchProduct("apple laptop macbook");
    }
}