package com.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingHomePage {
    @FindBy(xpath = "//*[@id='codex']/a")
    WebElement chatLink;

    @FindBy(id = "hbsettings")
    private WebElement settingsButton;

    @FindBy(css = "a[href*='/account/general']")
    private WebElement moreButton;

    @FindBy(id = "id_sc")
    private WebElement hamburgerMenu;

    WebDriver driver;
    @FindBy(name = "q")
    WebElement searchBox;

    public BingHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("https://www.bing.com/");
    }

    public void searchFor(String searchTerm) {
        searchBox.sendKeys(searchTerm, Keys.ENTER);
    }

    public void clickChatLink() {
        chatLink.click();
    }

    public WebElement getChatLink() {
        return chatLink;
    }

    public WebElement getHamburgerMenu() {
        return hamburgerMenu;
    }

    public WebElement getSettingsButton() {
        return settingsButton;
    }

    public void openHamburgerMenu() {
        hamburgerMenu.click();
    }

    public void clickOnSettings() {
        settingsButton.click();
    }

    public void clickOnMore() {
        moreButton.click();
    }
}
