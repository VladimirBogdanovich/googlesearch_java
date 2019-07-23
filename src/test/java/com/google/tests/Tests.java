package com.google.tests;
import com.google.pages.GoogleMainPage;
import com.google.pages.GoogleSearchResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Tests {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/Volumes/Home/Autotests/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com.ua/");
    }

    @Test
    public void inputSearchResult() {
        GoogleMainPage googleMainPage = new GoogleMainPage(driver);
        googleMainPage.sendSearchQuery();
        GoogleSearchResultPage googleSearchResultPage = new GoogleSearchResultPage(driver);
        googleSearchResultPage.gehHadlineTextt();
        googleSearchResultPage.getLinkText();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
   }
}