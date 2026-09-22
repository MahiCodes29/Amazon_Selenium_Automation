package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyInvalidLogin() {

        LoginPage loginPage = new LoginPage(driver);

        // Step 1: Click Account & Lists
        loginPage.clickAccountList();

        // Step 2: Enter dummy mobile number
        loginPage.enterMobileNumber("9000000000");

        // Step 3: Click Continue
        loginPage.clickContinue();

        // Step 4: Enter dummy password
        loginPage.enterPassword("WrongPassword@123");

        // Step 5: Click Sign In
        loginPage.clickSignIn();

        // Security verification may appear here
        System.out.println("Security Puzzle displayed. Complete it manually.");
    }
}