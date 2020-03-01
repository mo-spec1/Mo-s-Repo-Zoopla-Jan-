package co.uk.zoopla.stepdefinitions;

import co.uk.zoopla.pages.BasePage;
import co.uk.zoopla.pages.HomePage;
import co.uk.zoopla.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class CustomerSearchSaleSteps extends BasePage {

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver,SearchResultPage.class);

    @Given("I navigate to the Zoopla Homepage")
    public void i_navigate_to_the_Zoopla_Homepage()
    {
        homePage.launchURL();
    }

    @When("I search for a Property in {string}")
    public void i_search_for_a_Property_in(String location)
    {
        homePage.EnterLocation(location);
    }

    @When("I enter between {string} and {string} price")
     public void i_enter_between_and_price(String minPrice, String maxPrice)
     {
         homePage.MinimumPrice(minPrice);
         homePage.MaxPrice(maxPrice);
     }

    @When("select {string} Bedrooms")
    public void select_Bedrooms(String Bed)
    {
        homePage.SelectBed(Bed);
    }

    @Then("search result page displays the Property")
    public void search_result_page_displays_Houses()
    {
        searchResultPage = homePage.clickOnSearchButton();
    }
}
