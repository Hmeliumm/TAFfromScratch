package com.example;

import com.example.utils.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected Logger logger; // Log4j2 logger

    @BeforeMethod
    public void setup() {
        driver = DriverManager.getDriver();
        logger = LogManager.getLogger(getClass()); // Initialize the logger
        logger.info("Test started"); // Log that the test has started
    }

    @AfterMethod
    public void tearDown() {
        logger.info("Test finished"); // Log that the test has finished
        DriverManager.quitDriver();
    }
}
