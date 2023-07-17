package com.intralot.qa.automation.core.driver.engine;

import com.intralot.qa.automation.core.driver.engine.common.api.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverCheck {
    public static boolean elementByExists(WebDriver webDriver, By by) {
        return webDriver.findElements(by).size() > 0;
    }

    public static boolean elementByExists(WebDriver webDriver, Object locator) {
        return webDriver.findElements(Locators.findByLocator((String) locator).determineLocator((String) locator)).size() > 0;
    }


    /*
    public static boolean elementByIsDisplayed(WebDriver webDriver, By by) {
        return DriverWait.forVisibilityOfElementBy(webDriver, by, null).isDisplayed();
    }
    */

    // Using By locator
    public static boolean elementByIsDisplayed(WebDriver webDriver, By by, Long timeOut) {
        // return DriverWait.forVisibilityOfElementBy(webDriver, by, timeOut).isDisplayed();
        return DriverWait.forVisibilityAndIgnoreExceptionsOfElementBy(webDriver, by, timeOut).isDisplayed();

    }

    // Using Object (By) locator (from enums)
    public static boolean elementByIsDisplayed(WebDriver webDriver, Object locator, Long timeOut) {
        // return DriverWait.forVisibilityOfElementBy(webDriver, locator, timeOut).isDisplayed();
        return DriverWait.forVisibilityAndIgnoreExceptionsOfElement(webDriver, locator, timeOut).isDisplayed();
    }


    /*
    public static boolean elementIsDisplayed(WebDriver webDriver, WebElement webElement) {
        return DriverWait.forVisibilityOfElement(webDriver, webElement, null).isDisplayed();
    }
    */

    public static boolean elementIsDisplayed(WebDriver webDriver, WebElement webElement, Long timeOut) {
        return DriverWait.forVisibilityOfElement(webDriver, webElement, timeOut).isDisplayed();
    }

    /*
    public static boolean elementByExistsAndIsDisplayed(WebDriver webDriver, By by) {
        return elementByIsDisplayed(webDriver, by) && elementByExists(webDriver, by);
    }
    */

    // Using By locator
    public static boolean elementByExistsAndIsDisplayed(WebDriver webDriver, By by, Long timeOut) {
        return elementByIsDisplayed(webDriver, by, timeOut) && elementByExists(webDriver, by);
    }

    // Using Object (By) locator (from enums)
    public static boolean elementByExistsAndIsDisplayed(WebDriver webDriver, Object locator, Long timeOut) {
        return elementByIsDisplayed(webDriver, locator, timeOut) && elementByExists(webDriver, locator);
    }

    public static boolean elementIsClickable(WebElement webElement) {
        return webElement.isEnabled();
    }

    public static boolean elementByContainsText(WebDriver webDriver, By by, String text) {
        return webDriver.findElement(by).getText().contains(text);
    }

    public static boolean elementByContainsText(WebDriver webDriver, Object locator, String text) {
        return webDriver.findElement(Locators.findByLocator((String) locator).determineLocator((String) locator)).getText().contains(text);
    }

    public static boolean elementContainsText(WebElement webElement, String text) {
        return webElement.getText().contains(text);
    }

    // Using By locator
    public static boolean isElementByPresent(WebDriver webDriver, By by, Long timeOut) {
        try {
            DriverWait.forPresenceOfElementBy(webDriver, by, timeOut);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    // Using Object (By) locator (from enums)
    public static boolean isElementByPresent(WebDriver webDriver, Object locator, Long timeOut) {
        try {
            DriverWait.forPresenceOfElementBy(webDriver, locator, timeOut);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static boolean isElementVisible(WebDriver webDriver, WebElement webElement, Long timeOut) {
        try {
            DriverWait.forVisibilityOfElement(webDriver, webElement, timeOut);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static boolean isElementByVisible(WebDriver webDriver, Object locator, Long timeOut) {
        try {
            DriverWait.forVisibilityOfElementBy(webDriver, locator, timeOut);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
