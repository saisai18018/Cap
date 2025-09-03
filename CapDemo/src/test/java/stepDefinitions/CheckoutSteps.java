package stepDefinitions;

import io.cucumber.java.en.*;
import pages.CheckoutPage;
import utils.DriverFactory;

public class CheckoutSteps {

    CheckoutPage checkout = new CheckoutPage(DriverFactory.getDriver());

    @When("User checks out as guest if needed")
    public void user_checkout_as_guest() {
        checkout.checkoutAsGuestIfShown();
    }

    @And("User fills billing with default data")
    public void user_fills_billing_default() {
        checkout.fillBillingAddress(
                "John", "Doe", "john.doe+demo@nop.com",
                "India", "Hyderabad", "Road 1", "500001", "9999999999"
        );
    }

    @And("User selects shipping, payment and confirms order")
    public void user_selects_and_confirms() {
        checkout.chooseShippingMethodAndContinue();
        checkout.choosePaymentMethodCheckMoneyOrder();
        checkout.continuePaymentInfo();
        checkout.confirmOrder();
    }

    @Then("Order should be placed successfully")
    public void order_success() {
        assert checkout.isOrderSuccess() : "Order not successful";
    }
}
