package com.intralot.qa.automation.core.driver.engine;

import com.intralot.qa.automation.core.driver.engine.common.api.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DriverFind {

    public static WebElement getElementBy(WebDriver webDriver, Object locator) {
        //return DriverWait.forPresenceOfElementBy(webDriver, Locators.findByLocator(locator).determineLocator(locator), null);
        return webDriver.findElement(Locators.findByLocator((String) locator).determineLocator((String) locator));
    }

    public static WebElement getElementBy(WebDriver webDriver, String locator) {
        return webDriver.findElement(Locators.findByLocator(locator).determineLocator(locator));
    }

    public static List<WebElement> getElementsBy(WebDriver webDriver, String locator) {
        return webDriver.findElements(Locators.findByLocator(locator).determineLocator(locator));
    }

    public static WebElement getElementBy(WebDriver webDriver, By by) {
        //return DriverWait.forPresenceOfElementBy(webDriver, by, null);
        return webDriver.findElement(by);
    }

    /*
    public static WebElement getElement(WebDriver webDriver, WebElement webElement) {
        return DriverWait.forVisibilityOfElement(webDriver, webElement, null);
    }
    */

}

