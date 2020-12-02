package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ControlElement;
import pages.DetailsPage;
import pages.SearchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleTests {
    private static WebDriver driver;
    private static SearchPage searchPage;
    private static DetailsPage detailsPage;
    private static ControlElement controlElement;

    @BeforeAll
    public static void init() {
        driver = new ChromeDriver();
        driver.get("http://google.com");
        searchPage = new SearchPage(driver);
        detailsPage = new DetailsPage(driver);
        controlElement = new ControlElement(driver);
    }

    @BeforeEach
    public void setup() {
        searchPage.search("Calculator");
    }

    @Test
    public void case1() {
        controlElement.bracket1.click(); //(
        controlElement.one.click(); //1
        controlElement.plus.click(); //+
        controlElement.two.click(); //2
        controlElement.bracket2.click(); //)
        controlElement.multiply.click(); //*
        controlElement.three.click(); //3
        controlElement.minus.click(); //-
        controlElement.four.click(); //4
        controlElement.zero.click(); //0
        controlElement.divided.click(); //деление
        controlElement.five.click(); //5
        controlElement.equals.click(); //=
        assertEquals("1", detailsPage.result.getText());
        assertEquals("(1 + 2) × 3 - 40 ÷ 5", detailsPage.formula.getText());

    }
    @Test
    public void case2() {
        controlElement.six.click(); //6
        controlElement.divided.click(); //деление
        controlElement.zero.click(); //0
        controlElement.equals.click(); //=
        assertEquals("Infinity", detailsPage.result.getText());
        assertEquals("6 ÷ 0 =", detailsPage.formula.getText());
    }
    @Test
    public void case3() {
        controlElement.sine.click(); //sin()
        controlElement.equals.click(); //=
        assertEquals("Error", detailsPage.result.getText());
        assertEquals("sin() =", detailsPage.formula.getText());
    }
    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}
