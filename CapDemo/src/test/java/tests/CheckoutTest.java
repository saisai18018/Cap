package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductPage;
import utils.ConfigReader;
import utils.DriverFactory;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CheckoutTest {

    @BeforeEach
    void setUp() {
        DriverFactory.initDriver();
        DriverFactory.getDriver().get(ConfigReader.get("baseUrl"));
    }

    @AfterEach
    void tearDown() { DriverFactory.quitDriver(); }

    @Test @Order(1)
    void fullCheckoutFlowGuest() {
        WebDriver d = DriverFactory.getDriver();
        HomePage home = new HomePage(d);
        ProductPage product = new ProductPage(d);
        CartPage cart = new CartPage();
        CheckoutPage checkout = new CheckoutPage(d);

        home.searchFor("book");
        product.addFirstTwoVisibleToCart();
        cart.goToCartFromBar();
        cart.proceedToCheckout();

        checkout.checkoutAsGuestIfShown();
        checkout.fillBillingAddress("Jane","Doe","jane.doe+demo@nop.com","India","Hyderabad","Street 2","500002","8888888888");
        checkout.chooseShippingMethodAndContinue();
        checkout.choosePaymentMethodCheckMoneyOrder();
        checkout.continuePaymentInfo();
        checkout.confirmOrder();

        Assertions.assertTrue(checkout.isOrderSuccess(), "Order not successful");
    }
}
