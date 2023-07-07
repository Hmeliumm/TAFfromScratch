package com.example.tests;

import com.example.BaseTest;
import com.example.pages.BingHomePage;
import com.example.pages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WeatherSearchTest extends BaseTest {

    @Test
    public void testWeatherInLvivSearch() {
        logger.info("Navigating to Bing homepage"); // Log the navigation step
        BingHomePage homePage = new BingHomePage(driver);
        homePage.open();

        logger.info("Entering weather search terms"); // Log the search action
        homePage.searchFor("weather in Lviv");

        logger.info("Checking search results"); // Log the assertion
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        boolean containsWeatherInfo = searchResultsPage.containsWeatherInfo();

        Assert.assertTrue(containsWeatherInfo, "Search results did not contain weather info.");
    }
}
