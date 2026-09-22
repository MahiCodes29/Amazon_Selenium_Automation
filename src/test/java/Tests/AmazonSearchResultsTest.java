package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.AmazonHomePage;
import Pages.AmazonSearchResultsPage;

public class AmazonSearchResultsTest extends BaseTest {

    @Test
    public void verifyMacBookSearchResult() {

        AmazonHomePage homePage =
                new AmazonHomePage(driver);

        // Search Apple laptop MacBook
        homePage.searchProduct("Apple laptop MacBook");

        AmazonSearchResultsPage resultsPage =
                new AmazonSearchResultsPage(driver);

        // Verify MacBook is displayed
        Assert.assertTrue(
                resultsPage.isMacBookDisplayed(),
                "Apple MacBook product is not displayed"
        );

        // Select MacBook
        resultsPage.clickMacBook();

        System.out.println(
                "Apple MacBook selected successfully"
        );
    }
}