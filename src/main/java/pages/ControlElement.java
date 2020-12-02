package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ControlElement {

    @FindBy(xpath = "//*[@jsname='j93WEe']")
    public WebElement bracket1;
    @FindBy(xpath = "//*[@jsname='N10B9']")
    public WebElement one;
    @FindBy(xpath = "//*[@jsname='XSr6wc']")
    public WebElement plus;
    @FindBy(xpath = "//*[@jsname='lVjWed']")
    public WebElement two;
    @FindBy(xpath = "//*[@jsname='qCp9A']")
    public WebElement bracket2;
    @FindBy(xpath = "//*[@jsname='YovRWb']")
    public WebElement multiply;
    @FindBy(xpath = "//*[@jsname='KN1kY']")
    public WebElement three;
    @FindBy(xpath = "//*[@jsname='pPHzQc']")
    public WebElement minus;
    @FindBy(xpath = "//*[@jsname='xAP7E']")
    public WebElement four;
    @FindBy(xpath = "//*[@jsname='bkEvMb']")
    public WebElement zero;
    @FindBy(xpath = "//*[@jsname='WxTTNd']")
    public WebElement divided;
    @FindBy(xpath = "//*[@jsname='Ax5wH']")
    public WebElement five;
    @FindBy(xpath = "//*[@jsname='Pt8tGc']")
    public WebElement equals;
    @FindBy(xpath = "//*[@jsname='abcgof']")
    public WebElement six;
    @FindBy(xpath = "//*[@jsname='aN1RFf']")
    public WebElement sine;

    public ControlElement(WebDriver driver) {
        initElements(driver, this);
    }
}
