package com.intralot.qa.automation.core.driver.engine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverGet {

    public static int noOfElementsBy(WebDriver webDriver, By by) {
        return webDriver.findElements(by).size();
    }

    public static int noOfElementsBy(WebDriver webDriver, Object locator) {
        return DriverFind.getElementsBy(webDriver, (String) locator).size();
    }

    public static String attributeValueForElement(WebElement webElement, String whichAttribute) {
        return webElement.getAttribute(whichAttribute);
    }

    public static String attributeValueForElement(WebDriver webDriver, By by, String whichAttribute) {
        return DriverFind.getElementBy(webDriver, by).getAttribute(whichAttribute);
    }

    public static String elementCssValueForElement(WebElement webElement, String whichAttribute) {
        return webElement.getCssValue(whichAttribute);
    }

    // Using By locator
    public static String textOfElementBy(WebDriver webDriver, By by) {
        return DriverFind.getElementBy(webDriver, by).getText();
    }

    // Using Object (By) locator (from enums)
    public static String textOfElementBy(WebDriver webDriver,  Object locator) {
        return DriverFind.getElementBy(webDriver, locator).getText();
    }

    public static String textOfElement(WebElement webElement) {
        return webElement.getText();
    }
}
