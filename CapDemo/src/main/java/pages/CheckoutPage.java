package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.TestUtil;

public class CheckoutPage {
    private final WebDriver driver;

    public CheckoutPage(WebDriver driver) { this.driver = driver; }

    public void checkoutAsGuestIfShown() {
        if (TestUtil.isPresent(Locators.CHECKOUT_AS_GUEST_BUTTON)) {
            TestUtil.safeClick(Locators.CHECKOUT_AS_GUEST_BUTTON);
        }
    }

    public void fillBillingAddress(String first, String last, String email, String country, String city,
                                   String address1, String zip, String phone) {

        TestUtil.type(Locators.BILLING_FIRSTNAME, first);
        TestUtil.type(Locators.BILLING_LASTNAME, last);
        TestUtil.type(Locators.BILLING_EMAIL, email);

        Select c = new Select(TestUtil.waitForVisible(Locators.BILLING_COUNTRY, 10));
        c.selectByVisibleText(country);

        TestUtil.type(Locators.BILLING_CITY, city);
        TestUtil.type(Locators.BILLING_ADDRESS1, address1);
        TestUtil.type(Locators.BILLING_ZIP, zip);
        TestUtil.type(Locators.BILLING_PHONE, phone);

        TestUtil.safeClick(Locators.BILLING_CONTINUE);
    }

    public void chooseShippingMethodAndContinue() {
        TestUtil.safeClick(Locators.SHIPPING_METHOD_CONTINUE);
    }

    public void choosePaymentMethodCheckMoneyOrder() {
        TestUtil.safeClick(Locators.PAYMENT_METHOD_CHECK_MONEY_ORDER);
        TestUtil.safeClick(Locators.PAYMENT_METHOD_CONTINUE);
    }

    public void continuePaymentInfo() {
        TestUtil.safeClick(Locators.PAYMENT_INFO_CONTINUE);
    }

    public void confirmOrder() {
        TestUtil.safeClick(Locators.CONFIRM_ORDER_BUTTON);
    }

    public boolean isOrderSuccess() {
        String title = TestUtil.waitForVisible(Locators.ORDER_SUCCESS_TITLE, 15).getText().trim();
        return title.equalsIgnoreCase("Your order has been successfully processed!");
    }
}
