package pages;

import utils.TestUtil;

public class CartPage {

    public void goToCartFromBar() {
        // The success bar usually contains a link "shopping cart"
        TestUtil.safeClick(Locators.LINK_SHOPPING_CART);
    }

    public void proceedToCheckout() {
        TestUtil.safeClick(Locators.CART_TOS_CHECKBOX);
        TestUtil.safeClick(Locators.CART_CHECKOUT_BUTTON);
    }
}
