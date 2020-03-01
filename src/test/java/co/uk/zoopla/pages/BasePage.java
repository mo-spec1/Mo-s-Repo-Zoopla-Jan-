package co.uk.zoopla.pages;

import co.uk.zoopla.common.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.net.URL;

public class BasePage extends Driver
{
    //Described as variables
    public String BaseURL = "https://www.zoopla.co.uk/";
    public Select select;

    public void launchURL()
    {
        driver.navigate().to(BaseURL);
    }
    public void selectByText(WebElement element, String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void selectByValue(WebElement element, String value)
    {
        select = new Select(element);
        select.selectByValue(value);
    }
    public void selectByIndex(WebElement element, int index)
            //remember that index is 0-9 and refers to counting so (int) is used
    {
        select = new Select(element);
        select.selectByIndex(index);
    }
}
