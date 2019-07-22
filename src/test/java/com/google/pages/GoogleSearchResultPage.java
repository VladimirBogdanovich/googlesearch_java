package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertTrue;

public class GoogleSearchResultPage {
    public GoogleSearchResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    private WebDriver driver;

    /*Search Page*/
    @FindBy(xpath = "//*[@id=\"resultStats\"]")
    private WebElement headlineText;
    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div[4]/div/div/div[1]/a/h3")
    private WebElement searchResultLinkText;

    /*Methods*/
    public void gehHadlineTextt() {
        String actuaString = headlineText.getText();
        assertTrue(actuaString.contains("Приблизна"));
    }
    public void getLinkText() {
        String actuaString = searchResultLinkText.getText();
        assertTrue(actuaString.contains("Selenium IDE"));
    }

}