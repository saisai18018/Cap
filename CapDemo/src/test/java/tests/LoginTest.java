package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.DriverFactory;

public class LoginTest extends BaseTest {

    @Test
    public void loginWorks() {
        HomePage home = new HomePage(DriverFactory.getDriver());
        LoginPage login = new LoginPage(DriverFactory.getDriver());

        home.openLogin();
        login.login(ConfigReader.get("email"), ConfigReader.get("password"));
        Assert.assertTrue(home.isLoggedIn(), "Login failed");
    }
}
