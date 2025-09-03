package stepDefinitions;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.ProductPage;
import utils.DriverFactory;

public class SearchSteps {
    HomePage home = new HomePage(DriverFactory.getDriver());
    ProductPage productPage = new ProductPage(DriverFactory.getDriver());

    @When("User searches for {string}")
    public void user_searches_for(String query) {
        home.searchFor(query);
    }

    @And("User adds one or two items to cart from results")
    public void user_adds_items() {
        productPage.addFirstTwoVisibleToCart();
    }
}
