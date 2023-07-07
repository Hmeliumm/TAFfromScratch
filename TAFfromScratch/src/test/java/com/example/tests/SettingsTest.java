package com.example.tests;

import com.example.BaseTest;
import com.example.pages.BingHomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SettingsTest extends BaseTest {

    @Test
    public void testOpenSettings() {
        WebDriverWait wait = new WebDriverWait(driver, 10); // timeout of 10 seconds
        logger.info("Navigating to Bing homepage"); // Log the navigation step
        BingHomePage homePage = new BingHomePage(driver);
        homePage.open();

        logger.info("Opening the hamburger menu"); // Log the action
        wait.until(ExpectedConditions.elementToBeClickable(homePage.getHamburgerMenu()));
        homePage.openHamburgerMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homePage.getSettingsButton()));
        logger.info("Navigating to settings"); // Log the action
        homePage.clickOnSettings();

        logger.info("Clicking on 'More'"); // Log the action
        homePage.clickOnMore();

        logger.info("Verifying that the settings page is opened"); // Log the assertion

        Assert.assertTrue(driver.getTitle().contains("Settings"), "Settings page is not opened.");
    }
}
