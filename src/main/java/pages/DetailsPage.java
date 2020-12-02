package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class DetailsPage {

    @FindBy(css = "span[jsname='VssY5c']")
    public WebElement result;

    @FindBy(css = "span[jsname*='ubtiRe']")
    public WebElement formula;


    public DetailsPage(WebDriver driver) {
        initElements(driver, this);
    }
    public String getResult() {
        return result.getText();



        }
    }
