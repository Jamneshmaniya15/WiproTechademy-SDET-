package tests;

import base.BaseTest;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.ConfirmationPage;
import pages.LoginPage;
import pages.RegisterPage;
import utils.ExtentReportManager;

import java.util.UUID;

public class ParaBankTest extends BaseTest {

    @DataProvider(name = "registrationData")
    public Object[][] getRegistrationData() {
        return new Object[][] {
            { "Jamnesh", "Maniya",  "123 MG Road", "Mumbai",    "Maharashtra", "400001", "9876543210", "111-22-3333", "Test@1234" },
            { "Rahul",   "Sharma",  "456 Park St",  "Pune",     "Maharashtra", "411001", "9123456780", "222-33-4444", "Test@5678" },
            { "Priya",   "Patel",   "789 Lake Ave", "Bangalore","Karnataka",   "560001", "9988776655", "333-44-5555", "Test@9012" }
        };
    }

    @Test(dataProvider = "registrationData", description = "Register new user and verify login on ParaBank")
    public void registerAndLoginTest(
            String firstName, String lastName,
            String address,   String city,
            String state,     String zipCode,
            String phone,     String ssn,
            String password) {

        // ── UUID guarantees unique username EVERY run, NO duplicates ever ──
        // UUID example: a3f2c1 → username: jamnesh_a3f2c1
        String uniqueId = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
        String username  = firstName.toLowerCase() + "_" + uniqueId;

        ExtentReportManager.createTest(
            "ParaBank Test — " + username,
            "Register new user and verify login | User: " + username
        );
        ExtentReportManager.getTest().log(Status.INFO,
            "<b>Test Data:</b> username=" + username + " | name=" + firstName + " " + lastName + " | city=" + city);

        // ── STEP 1: Navigate ───────────────────────────────────────────────
        System.out.println("\n[STEP 1] Navigating to registration page...");
        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.navigateTo("https://parabank.parasoft.com/parabank/register.htm");
        Assert.assertTrue(registerPage.isPageLoaded(), "Registration page should be loaded");
        ExtentReportManager.getTest().log(Status.PASS, "Step 1 ✅ Registration page loaded");

        // ── STEP 2: Fill form ──────────────────────────────────────────────
        System.out.println("[STEP 2] Filling form for: " + username);
        registerPage.fillRegistrationForm(firstName, lastName, address, city, state, zipCode, phone, ssn, username, password);
        ExtentReportManager.getTest().log(Status.PASS, "Step 2 ✅ Form filled — username: " + username);

        // ── STEP 3: Submit ─────────────────────────────────────────────────
        System.out.println("[STEP 3] Submitting form...");
        registerPage.clickRegister();
        ExtentReportManager.getTest().log(Status.PASS, "Step 3 ✅ Register clicked");

        // ── STEP 4: Verify registration success ───────────────────────────
        System.out.println("[STEP 4] Verifying registration...");
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver());
        Assert.assertTrue(confirmationPage.isRegistrationSuccessful(),
            "Registration failed — URL still at register.htm. Check for errors on page.");
        Assert.assertTrue(confirmationPage.isLogoutVisible(), "Log Out should be visible");
        ExtentReportManager.getTest().log(Status.PASS, "Step 4 ✅ Registration successful!");

        // ── STEP 5: Logout ─────────────────────────────────────────────────
        System.out.println("[STEP 5] Logging out...");
        confirmationPage.clickLogOut();
        LoginPage loginPage = new LoginPage(getDriver());
        Assert.assertTrue(loginPage.isLoginPageLoaded(), "Login page should show after logout");
        ExtentReportManager.getTest().log(Status.PASS, "Step 5 ✅ Logged out successfully");

        // ── STEP 6: Login ──────────────────────────────────────────────────
        System.out.println("[STEP 6] Logging in as: " + username);
        loginPage.login(username, password);
        ExtentReportManager.getTest().log(Status.PASS, "Step 6 ✅ Login attempted: " + username);

        // ── STEP 7: Verify login success ───────────────────────────────────
        System.out.println("[STEP 7] Verifying login...");
        AccountPage accountPage = new AccountPage(getDriver());
        Assert.assertTrue(accountPage.isLoginSuccessful(), "Accounts Overview should be visible");
        Assert.assertTrue(accountPage.isLogOutVisible(), "Log Out should be visible after login");
        ExtentReportManager.getTest().log(Status.PASS,
            "Step 7 ✅ Login verified! " + accountPage.getPageHeading());

        System.out.println("[DONE] All 7 steps PASSED for: " + username + "\n");
    }
}