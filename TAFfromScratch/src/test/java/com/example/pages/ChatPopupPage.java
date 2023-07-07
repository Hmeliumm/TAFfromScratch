package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPopupPage {

    WebDriver driver;
    @FindBy(id = "sydneyPayWall_Content")
    WebElement chatPopUp;

    public ChatPopupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isChatPopUpDisplayed() {
        return chatPopUp.isDisplayed();
    }

    public WebElement getChatPopUp() {
        return chatPopUp;
    }
}
