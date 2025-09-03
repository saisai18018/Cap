package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.TestUtil;

import java.util.List;

public class ProductPage {
    private final WebDriver driver;

    public ProductPage(WebDriver driver) { this.driver = driver; }

    public void openFirstResult() {
        List<WebElement> titles = driver.findElements(Locators.PRODUCT_TITLES);
        if (!titles.isEmpty()) titles.get(0).click();
        else throw new RuntimeException("No product results found");
    }

    public void addFirstTwoVisibleToCart() {
        List<WebElement> addButtons = driver.findElements(Locators.BTN_ADD_TO_CART_VISIBLE_CARDS);
        int count = Math.min(2, addButtons.size());
        for (int i = 0; i < count; i++) {
            addButtons.get(i).click();
            TestUtil.waitForVisible(Locators.BAR_NOTIFICATION_CONTENT, 10);
        }
        if (count == 0) throw new RuntimeException("No Add to cart buttons visible");
    }

    public void addDetailToCart() {
        // fallback for detail page
        TestUtil.safeClick(Locators.BTN_ADD_TO_CART_DETAIL);
        TestUtil.waitForVisible(Locators.BAR_NOTIFICATION_CONTENT, 10);
    }
}
