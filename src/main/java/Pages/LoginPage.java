package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Locators
    private By accountList = By.id("nav-link-accountList");

    private By mobileNumberField = By.id("ap_email_login");
    
    private By continueButton =
            By.xpath("//*[@id=\"continue\"]/span/input");

    private By passwordField = By.id("ap_password");

    private By signInButton = By.id("signInSubmit");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions

    public void clickAccountList() {
        driver.findElement(accountList).click();
    }

    public void enterMobileNumber(String mobileNumber) {
        driver.findElement(mobileNumberField).sendKeys(mobileNumber);
    }


    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }
}