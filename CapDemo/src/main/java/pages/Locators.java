package pages;

import org.openqa.selenium.By;

public class Locators {

    // Header / Common
    public static final By LINK_LOGIN = By.className("ico-login");
    public static final By LINK_LOGOUT = By.className("ico-logout");
    public static final By LINK_CART_ICON = By.className("ico-cart");

    public static final By INPUT_SEARCH = By.id("small-searchterms");
    public static final By BTN_SEARCH = By.cssSelector("button.search-box-button");

    // Login Page
    public static final By INPUT_EMAIL = By.id("Email");
    public static final By INPUT_PASSWORD = By.id("Password");
    public static final By BTN_LOGIN = By.cssSelector("button.login-button");
    public static final By MSG_LOGIN_ERROR = By.cssSelector(".message-error");

    // Product Listing / Cards
    public static final By PRODUCT_TITLES = By.cssSelector(".product-title a");
    public static final By BTN_ADD_TO_CART_VISIBLE_CARDS = By.cssSelector(".product-box-add-to-cart-button");

    // Product Detail Page
    public static final By BTN_ADD_TO_CART_DETAIL = By.id("add-to-cart-button-1"); // fallback; may vary by product
    public static final By BAR_NOTIFICATION_CONTENT = By.cssSelector(".bar-notification.success");

    // Cart
    public static final By LINK_SHOPPING_CART = By.linkText("Shopping cart");
    public static final By CART_QTY_INPUTS = By.cssSelector("input.qty-input");
    public static final By CART_TOS_CHECKBOX = By.id("termsofservice");
    public static final By CART_CHECKOUT_BUTTON = By.id("checkout");

    // Checkout
    public static final By CHECKOUT_AS_GUEST_BUTTON = By.cssSelector("button.checkout-as-guest-button");
    public static final By BILLING_FIRSTNAME = By.id("BillingNewAddress_FirstName");
    public static final By BILLING_LASTNAME = By.id("BillingNewAddress_LastName");
    public static final By BILLING_EMAIL = By.id("BillingNewAddress_Email");
    public static final By BILLING_COUNTRY = By.id("BillingNewAddress_CountryId");
    public static final By BILLING_CITY = By.id("BillingNewAddress_City");
    public static final By BILLING_ADDRESS1 = By.id("BillingNewAddress_Address1");
    public static final By BILLING_ZIP = By.id("BillingNewAddress_ZipPostalCode");
    public static final By BILLING_PHONE = By.id("BillingNewAddress_PhoneNumber");
    public static final By BILLING_CONTINUE = By.cssSelector("#billing-buttons-container .button-1.new-address-next-step-button");

    public static final By SHIPPING_METHOD_CONTINUE = By.cssSelector("#shipping-method-buttons-container .button-1.shipping-method-next-step-button");
    public static final By PAYMENT_METHOD_CHECK_MONEY_ORDER = By.id("paymentmethod_0"); // "Check / Money Order"
    public static final By PAYMENT_METHOD_CONTINUE = By.cssSelector("#payment-method-buttons-container .button-1.payment-method-next-step-button");
    public static final By PAYMENT_INFO_CONTINUE = By.cssSelector("#payment-info-buttons-container .button-1.payment-info-next-step-button");
    public static final By CONFIRM_ORDER_BUTTON = By.cssSelector("#confirm-order-buttons-container .button-1.confirm-order-next-step-button");

    public static final By ORDER_SUCCESS_TITLE = By.cssSelector(".section.order-completed .title strong");
    public static final By ORDER_SUCCESS_TEXT = By.cssSelector(".section.order-completed .details");
}
