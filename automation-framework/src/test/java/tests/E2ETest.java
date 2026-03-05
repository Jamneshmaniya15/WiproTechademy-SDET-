package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class E2ETest extends BaseTest {

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {

        LoginPage loginPage = new LoginPage(driver);  // ⭐ PASS DRIVER

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @DataProvider
    public Object[][] loginData() {
        return new Object[][] {
            {"standard_user", "secret_sauce"},
            {"wrong_user", "wrong_pass"}
        };
    }
}