package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import utils.DriverFactory;

public class CartTest extends BaseTest {

    @Test
    public void addItemsToCart() {
        HomePage home = new HomePage(DriverFactory.getDriver());
        ProductPage productPage = new ProductPage(DriverFactory.getDriver());
        CartPage cart = new CartPage();

        home.searchFor("laptop");
        productPage.addFirstTwoVisibleToCart();
        cart.goToCartFromBar();
    }
}
