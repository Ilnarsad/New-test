package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DetailsPage;
import pages.SearchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleTests {
    private static WebDriver driver;
    private static SearchPage searchPage;
    private static DetailsPage detailsPage;

    @BeforeAll
    public static void init() {
        driver = new ChromeDriver();
        driver.get("http://google.com");
        searchPage = new SearchPage(driver);
        detailsPage = new DetailsPage(driver);
    }
    @BeforeEach
    public void setup() {
        searchPage.search("Calculator");
    }

    @Test
    public void case1() {
        driver.findElement(By.xpath("//*[@jsname='j93WEe']")).click(); //(
        driver.findElement(By.xpath("//*[@jsname='N10B9']")).click(); //1
        driver.findElement(By.xpath("//*[@jsname='XSr6wc']")).click(); //+
        driver.findElement(By.xpath("//*[@jsname='lVjWed']")).click(); //2
        driver.findElement(By.xpath("//*[@jsname='qCp9A']")).click(); //)
        driver.findElement(By.xpath("//*[@jsname='YovRWb']")).click(); //*
        driver.findElement(By.xpath("//*[@jsname='KN1kY']")).click(); //3
        driver.findElement(By.xpath("//*[@jsname='pPHzQc']")).click(); //-
        driver.findElement(By.xpath("//*[@jsname='xAP7E']")).click(); //4
        driver.findElement(By.xpath("//*[@jsname='bkEvMb']")).click(); //0
        driver.findElement(By.xpath("//*[@jsname='WxTTNd']")).click(); //деление
        driver.findElement(By.xpath("//*[@jsname='Ax5wH']")).click(); //5
        driver.findElement(By.xpath("//*[@jsname='Pt8tGc']")).click(); //=
        assertEquals("1", detailsPage.result.getText());
        assertEquals("(1 + 2) × 3 - 40 ÷ 5", detailsPage.formula.getText());

    }
    @Test
    public void case2() {
        driver.findElement(By.xpath("//*[@jsname='abcgof']")).click(); //6
        driver.findElement(By.xpath("//*[@jsname='WxTTNd']")).click(); //деление
        driver.findElement(By.xpath("//*[@jsname='bkEvMb']")).click(); //0
        driver.findElement(By.xpath("//*[@jsname='Pt8tGc']")).click(); //=
        assertEquals("Infinity", detailsPage.result.getText());
        assertEquals("6 ÷ 0 =", detailsPage.formula.getText());
    }
    @Test
    public void case3() {
        driver.findElement(By.xpath("//*[@jsname='aN1RFf']")).click(); //sin()
        driver.findElement(By.xpath("//*[@jsname='Pt8tGc']")).click(); //=
        assertEquals("Error", detailsPage.result.getText());
        assertEquals("sin() =", detailsPage.formula.getText());
    }
    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}
