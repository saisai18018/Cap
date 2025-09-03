package pages;

import org.openqa.selenium.WebDriver;
import utils.TestUtil;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) { this.driver = driver; }

    public void login(String email, String password) {
        TestUtil.type(Locators.INPUT_EMAIL, email);
        TestUtil.type(Locators.INPUT_PASSWORD, password);
        TestUtil.safeClick(Locators.BTN_LOGIN);
    }
}
