package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearchResultsPage {

    private WebDriver driver;

    // Apple MacBook product
    private By macBookProduct = By.xpath(
        "//div[@data-component-type='s-search-result']" +
        "//h2//span[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'macbook')]"
    );

    public AmazonSearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isMacBookDisplayed() {
        return driver.findElement(macBookProduct).isDisplayed();
    }

    public void clickMacBook() {
        driver.findElement(macBookProduct).click();
    }
}