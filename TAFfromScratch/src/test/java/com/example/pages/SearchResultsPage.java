package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage {

    WebDriver driver;

    @FindBy(css = ".b_algo")
    List<WebElement> searchResults;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean containsWeatherInfo() {
        for (WebElement result : searchResults) {
            if (result.getText().toLowerCase().contains("weather")) {
                return true;
            }
        }
        return false;
    }
}
