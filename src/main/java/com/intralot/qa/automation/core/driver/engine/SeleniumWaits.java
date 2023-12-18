package com.intralot.qa.automation.core.driver.engine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class SeleniumWaits {
    static Duration timeOutIn30seconds = Duration.ofSeconds(30);

    public static Boolean invisibilityOf(WebDriver webDriver, WebElement webElement) {
        return new WebDriverWait(webDriver, timeOutIn30seconds)
                .until(ExpectedConditions.invisibilityOf(webElement));
    }

    public static WebElement visibilityOf(WebDriver webDriver, WebElement webElement) {
        return new WebDriverWait(webDriver, timeOutIn30seconds)
                .until(ExpectedConditions.visibilityOf(webElement));
    }

    public static WebElement visibilityOfElementLocated(WebDriver webDriver, By by) {
        return new WebDriverWait(webDriver, timeOutIn30seconds)
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static List<WebElement> visibilityOfAllElementsLocatedBy(WebDriver webDriver, By by) {
        return new WebDriverWait(webDriver, timeOutIn30seconds)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public static List<WebElement> presenceOfAllElementsLocatedByTimeout1Sec(WebDriver webDriver, By by) {
        return new WebDriverWait(webDriver, Duration.ofSeconds(60))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public static Boolean invisibilityOfElementLocated(WebDriver webDriver, By by) {
        return new WebDriverWait(webDriver, timeOutIn30seconds)
                .until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static WebElement elementToBeClickable(WebDriver webDriver, By by) {
        return new WebDriverWait(webDriver, timeOutIn30seconds)
                .until(ExpectedConditions.elementToBeClickable(by));
    }

    public static List<WebElement> elementsToBeClickable(WebDriver webDriver, By by) {
        new WebDriverWait(webDriver,timeOutIn30seconds)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return webDriver.findElements(by);
    }

    public static WebElement elementToBeClickable(WebDriver webDriver, WebElement webElement) {
        return new WebDriverWait(webDriver, timeOutIn30seconds)
                .until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static Boolean textToBe(WebDriver webDriver, By by, String text) {
        return new WebDriverWait(webDriver, timeOutIn30seconds)
                .until(ExpectedConditions.textToBe(by, text));
    }

    public static Boolean textToBe(WebDriver webDriver, WebElement webElement, String text) {
        return new WebDriverWait(webDriver, timeOutIn30seconds)
                .until(ExpectedConditions.textToBePresentInElement(webElement, text));
    }

    public static void presenceOfElementLocated(WebDriver webDriver, By by) {
        new WebDriverWait(webDriver, timeOutIn30seconds)
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(by, 0));
    }

    public static Boolean attributeToBe(WebDriver webDriver, WebElement webElement, String attributeName, String attributeValue) {
        return new WebDriverWait(webDriver, timeOutIn30seconds)
                .until(ExpectedConditions.attributeToBe(webElement, attributeName, attributeValue));
    }

    public static Boolean attributeToBe(WebDriver webDriver, By by, String attributeName, String attributeValue) {
        return new WebDriverWait(webDriver, timeOutIn30seconds)
                .until(ExpectedConditions.attributeToBe(by, attributeName, attributeValue));
    }

    public static Boolean attributeToBeNotEmpty(WebDriver webDriver, WebElement webElement, String attributeName) {
        return new WebDriverWait(webDriver, timeOutIn30seconds)
                .until(ExpectedConditions.attributeToBeNotEmpty(webElement, attributeName));
    }

    public static Boolean textMatches(WebDriver webDriver, By by, Pattern pattern) {
        return new WebDriverWait(webDriver, timeOutIn30seconds)
                .until(ExpectedConditions.textMatches(by, pattern));
    }
}
