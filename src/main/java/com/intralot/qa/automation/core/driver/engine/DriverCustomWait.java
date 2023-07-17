package com.intralot.qa.automation.core.driver.engine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverCustomWait {

    public static WebElement isElementVisible(WebDriver webDriver, WebElement webElement, Long timeOut) {
        try {

            WebDriverWait customWait = new WebDriverWait(webDriver, Duration.ofSeconds(timeOut));
            return customWait.until(ExpectedConditions.visibilityOf(webElement));

        } catch (Exception ex) {
            return null;
        }
    }
}
