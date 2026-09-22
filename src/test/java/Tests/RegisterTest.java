package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.RegisterPage;

public class RegisterTest extends BaseTest {

    @Test
    public void verifyUserRegistration() {

        RegisterPage registerPage = new RegisterPage(driver);

        // 1. Click Account & Lists
        registerPage.clickAccountList();

        // 2. Dummy email
        registerPage.enterEmail("automation.test@example.com");

        // 3. Continue
        registerPage.clickContinue();

        // 4. Create Account
        registerPage.clickCreateAccount();

        // 5. Dummy phone number
        registerPage.enterPhoneNumber("9000000000");

        // 6. Dummy name
        registerPage.enterFirstLastName("Test Automation");

        // 7. Continue
        registerPage.clickRegisterContinue();
        
        // Security Puzzle appears here
        System.out.println("Security Puzzle displayed. Complete it manually.");
    }
}