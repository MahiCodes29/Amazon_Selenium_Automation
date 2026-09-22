package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Product Title
    private By productTitle = By.id("productTitle");

    // Product Price
    private By productPrice = By.xpath(
        "//*[@id=\"corePriceDisplay_desktop_feature_div\"]/div/div[1]/span[3]/span[2]/span[2]"
    );

    // Memory
    private By memory = By.xpath(
        "//*[@id=\"poExpander\"]/div[1]/div/table/tbody/tr[6]/td[2]/span"
    );

    // Size
    private By size = By.xpath(
        "//*[@id=\"poExpander\"]/div[1]/div/table/tbody/tr[3]/td[2]/span"
    );

    // Color
    private By color = By.xpath(
        "//*[@id=\"poExpander\"]/div[1]/div/table/tbody/tr[4]/td[2]/span"
    );

    // Brand
    private By brand = By.xpath(
        "//*[@id=\"poExpander\"]/div[1]/div/table/tbody/tr[1]/td[2]/span"
    );

    // Model Name
    private By modelName = By.xpath(
        "//*[@id=\"poExpander\"]/div[1]/div/table/tbody/tr[2]/td[2]/span"
    );

    // Screen Size
    private By screenSize = By.xpath(
        "//*[@id=\"poExpander\"]/div[1]/div/table/tbody/tr[3]/td[2]/span"
    );

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Verify Product Details page
    public boolean isProductDetailsDisplayed() {
        wait.until(
            ExpectedConditions.visibilityOfElementLocated(productTitle)
        );

        return driver.findElement(productTitle).isDisplayed();
    }

    // Get Product Title
    public String getProductTitle() {
        wait.until(
            ExpectedConditions.visibilityOfElementLocated(productTitle)
        );

        return driver.findElement(productTitle).getText();
    }

    // Get Product Price
    public String getProductPrice() {
        return driver.findElement(productPrice).getText();
    }

    // Get Memory
    public String getMemory() {
        return driver.findElement(memory).getText();
    }

    // Get Size
    public String getSize() {
        return driver.findElement(size).getText();
    }

    // Get Color
    public String getColor() {
        return driver.findElement(color).getText();
    }

    // Get Brand
    public String getBrand() {
        return driver.findElement(brand).getText();
    }

    // Get Model Name
    public String getModelName() {
        return driver.findElement(modelName).getText();
    }

    // Get Screen Size
    public String getScreenSize() {
        return driver.findElement(screenSize).getText();
    }
}