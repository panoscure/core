package com.intralot.qa.automation.core.driver.engine;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutors  {

    public static void clickElementBy(WebDriver webDriver, By by) {
        WebElement webElement = SeleniumWaits.visibilityOfElementLocated(webDriver, by);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", webElement);
    }

    public static void clickElement(WebDriver webDriver, WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", webElement);
    }

    public static void makeElementVisibleBy(WebDriver webDriver, By by) {
        WebElement webElement = webDriver.findElement(by);
        ((JavascriptExecutor) webDriver)
                .executeScript(
                        "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';",
                        webElement);
    }

    public static void makeElementVisible(WebDriver webDriver, WebElement webElement) {
        ((JavascriptExecutor) webDriver)
                .executeScript(
                        "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';",
                        webElement);
    }

    public static void scrollToElementBy(WebDriver webDriver, By by) {
        WebElement webElement = webDriver.findElement(by);
        ((JavascriptExecutor) webDriver)
                .executeScript(
                        "arguments[0].scrollIntoView(true);"
                                + "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                                + "window.scrollBy(0, elementTop-(viewPortHeight/2));",
                        webElement);
    }

    public static void scrollToElement(WebDriver webDriver, WebElement webElement) {
        ((JavascriptExecutor) webDriver)
                .executeScript(
                        "arguments[0].scrollIntoView(true);"
                                + "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                                + "window.scrollBy(0, elementTop-(viewPortHeight/2));",
                        webElement);
    }

    public static void sendKeys(WebDriver webDriver, WebElement webElement, String value) {
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].setAttribute('value', '" + value + "')", webElement);
    }

    public static void createNewTab(WebDriver webDriver) {
        ((JavascriptExecutor) webDriver).executeScript("window.open()");
    }

    public static boolean isElementInViewport(WebDriver webDriver, WebElement element) {
        return (boolean) ((JavascriptExecutor) webDriver).executeScript(
                "var elem = arguments[0],                 " +
                        "  box = elem.getBoundingClientRect(),    " +
                        "  cx = box.left + box.width / 2,         " +
                        "  cy = box.top + box.height / 2,         " +
                        "  e = document.elementFromPoint(cx, cy); " +
                        "for (; e; e = e.parentElement) {         " +
                        "  if (e === elem)                        " +
                        "    return true;                         " +
                        "}                                        " +
                        "return false;                            ",
                element
        );
    }
}

