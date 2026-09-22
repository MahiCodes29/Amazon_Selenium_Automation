package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {

    private WebDriver driver;

    // Locator
    private By searchBox = By.id("twotabsearchtextbox");

    // Constructor
    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Search Product
    public void searchProduct(String keyword) {

        driver.findElement(searchBox).sendKeys(keyword, Keys.ENTER);
    }
}