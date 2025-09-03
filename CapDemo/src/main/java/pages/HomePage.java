package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestUtil;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) { this.driver = driver; }

    public void openLogin() { TestUtil.safeClick(Locators.LINK_LOGIN); }

    public void searchFor(String query) {
        TestUtil.type(Locators.INPUT_SEARCH, query);
        TestUtil.safeClick(Locators.BTN_SEARCH);
    }

    public void openCart() { TestUtil.safeClick(Locators.LINK_CART_ICON); }

    public boolean isLoggedIn() {
        return TestUtil.isPresent(Locators.LINK_LOGOUT);
    }
}
