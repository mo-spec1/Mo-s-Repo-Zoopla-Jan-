package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//extend is inheritance
public class HomePage extends BasePage
{
    //driver referencing driver in base page which has driver class in it
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "search-input-location")
    private WebElement SearchBox;

    public void EnterLocation(String location)
    {
        SearchBox.sendKeys(location);
    }

    @FindBy (id = "property_type")
    private WebElement PropertyType;

    public void PropertySelect(String Type)
    {
        selectByText(PropertyType, Type);
    }

    @FindBy (id = "forsale_price_min")
    private WebElement MinimumPrice;

    public void MinimumPrice (String minPrice)
    {
        selectByText(MinimumPrice, minPrice);
    }

    @FindBy (id = "forsale_price_max")
    private WebElement MaxPrice;

    public void MaxPrice (String maxPrice)
    {
        selectByText(MaxPrice, maxPrice);
    }

    @FindBy (id = "beds_min")
    private WebElement SelectBed;

    public void SelectBed (String bed)
    {
        selectByText(SelectBed, bed);
    }

    @FindBy (id = "search-submit")
    private WebElement SearchButton;

    public SearchResultPage clickOnSearchButton()
    {
        SearchButton.click();
        return new SearchResultPage(driver);
    }
}
