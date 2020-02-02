package co.uk.zoopla.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerSearchSaleSteps {
    @Given("I navigate to the Zoopla Homepage")
    public void i_navigate_to_the_Zoopla_Homepage() {
    }

    @When("I search for Houses in Manchester")
    public void i_search_for_Houses_in_Manchester() {
    }

    @When("I enter between {int} and {int} price")
    public void i_enter_between_and_price(Integer int1, Integer int2) {
    }

    @When("select {int} Bedrooms")
    public void select_Bedrooms(Integer int1) {
    }

    @Then("search result page displays Houses")
    public void search_result_page_displays_Houses() {
    }
}
