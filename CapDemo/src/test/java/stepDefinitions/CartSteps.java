package stepDefinitions;

import io.cucumber.java.en.*;
import pages.CartPage;

public class CartSteps {
    CartPage cart = new CartPage();

    @And("User opens cart from success bar and proceeds to checkout")
    public void user_opens_cart_and_checkout() {
        cart.goToCartFromBar();
        cart.proceedToCheckout();
    }
}
