package stepDefinitions;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.DriverFactory;

public class LoginSteps {

    HomePage home = new HomePage(DriverFactory.getDriver());
    LoginPage login = new LoginPage(DriverFactory.getDriver());

    @Given("User navigates to homepage")
    public void user_navigates_home() {
        DriverFactory.getDriver().get(ConfigReader.get("baseUrl"));
    }

    @When("User opens login")
    public void user_opens_login() {
        home.openLogin();
    }

    @And("User logs in with email {string} and password {string}")
    public void user_logs_in(String email, String pwd) {
        login.login(email, pwd);
    }

    @Then("User should be logged in")
    public void user_should_be_logged_in() {
        assert home.isLoggedIn() : "Login not successful";
    }
}
