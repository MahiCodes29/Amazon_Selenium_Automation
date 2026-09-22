package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

    private WebDriver driver;

    // Locators
    private By accountList = By.id("nav-link-accountList");

    private By emailField = By.id("ap_email_login");

    private By continueButton = By.xpath("//*[@id=\"continue\"]/span/input");

    private By createAccountButton = By.xpath("//*[@id=\"intention-submit-button\"]/span/input");

    private By phoneNumberField = By.id("ap_phone_number");

    private By firstLastNameField = By.id("ap_customer_name");
    
    private By registercontinueButton = By.id("continue");
    
    private By cancelButton = By.id("cancel");
    
    private By startPuzzleButton =
            By.xpath("//*[@id='root']/div/div[1]/button");
    
    
    
    
    // Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickAccountList() {
        driver.findElement(accountList).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public void clickCreateAccount() {
        driver.findElement(createAccountButton).click();
    }

    public void enterPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void enterFirstLastName(String name) {
        driver.findElement(firstLastNameField).sendKeys(name);
    }

    public void clickRegisterContinue() {
        driver.findElement(registercontinueButton).click();
    }
    
    public void clickStartPuzzle() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(
            ExpectedConditions.elementToBeClickable(startPuzzleButton)
        ).click();
    }
    
    public void clickCancel() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

        wait.until(
            ExpectedConditions.elementToBeClickable(cancelButton)
        ).click();
    }
}