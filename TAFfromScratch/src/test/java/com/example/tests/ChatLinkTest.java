package com.example.tests;

import com.example.BaseTest;
import com.example.pages.BingHomePage;
import com.example.pages.ChatPopupPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChatLinkTest extends BaseTest {

    @Test
    public void testChatLinkClick() {
        WebDriverWait wait = new WebDriverWait(driver, 10); // timeout of 10 seconds
        logger.info("Navigating to Bing homepage"); // Log the navigation step
        BingHomePage homePage = new BingHomePage(driver);
        homePage.open();

        logger.info("Clicking chat link"); // Log the action
        wait.until(ExpectedConditions.elementToBeClickable(homePage.getChatLink()));
        homePage.clickChatLink();

        ChatPopupPage chatPopupPage = new ChatPopupPage(driver);
        wait.until(ExpectedConditions.elementToBeClickable(chatPopupPage.getChatPopUp()));
        logger.info("Checking chat pop-up"); // Log the assertion
        boolean isChatPopUpDisplayed = chatPopupPage.isChatPopUpDisplayed();

        Assert.assertTrue(isChatPopUpDisplayed, "Chat pop-up window is not displayed after clicking the chat link.");
    }
}
