package com.intralot.qa.automation.core.driver.engine;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import com.intralot.qa.automation.core.utilities.Log;
import org.openqa.selenium.*;


public class DriverJsExecutors {

    // Web-based ones
    public static void clickElement(WebDriver webDriver, WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", webElement);
    }

    public static void doubleClickElement(WebDriver webDriver, WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].dispatchEvent(new MouseEvent('dblclick', { bubbles: true }));", webElement);
    }

    public static void sendKeysToElement(
            WebDriver webDriver, WebElement webElement, String typedText) {
        ((JavascriptExecutor) webDriver)
                .executeScript("arguments[0].value='" + typedText + "';", webElement);
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

    public static void scrollToElementBy(WebDriver webDriver, Object elementLocator) {

        ((JavascriptExecutor) webDriver)
                .executeScript("arguments[0].scrollIntoView(true);", DriverFind.getElementBy(webDriver, elementLocator));
    }

    public static void scrollAtTheBottomOfThePage(WebDriver webDriver) {

        ((JavascriptExecutor) webDriver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public static void scrollAtTheBottomOfThePage(WebDriver webDriver, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        boolean atTheBottomOfThePage = false;

        Object totalHeight;
        long scrollPixelRatio = 0;

        while (!atTheBottomOfThePage) {

            totalHeight = ((JavascriptExecutor) webDriver)
                    .executeScript(
                            "return document.body.scrollHeight");
            ((JavascriptExecutor) webDriver)
                    .executeScript("window.scrollTo(0, " + scrollPixelRatio + ");");

            try {
                Thread.sleep(timeOut);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (scrollPixelRatio > ((long) totalHeight))
                atTheBottomOfThePage = true;

            scrollPixelRatio = scrollPixelRatio + ((long) ((JavascriptExecutor) webDriver)
                    .executeScript("var viewPortHeight = Math.max(document.documentElement.clientHeight || 0, window.innerHeight || 0);"
                            + "return viewPortHeight/2"));

            Log.info("Vertical scroll in pixels is: " + scrollPixelRatio);

        }

    }

    public static void scrollAtTheTopOfThePage(WebDriver webDriver) {

        ((JavascriptExecutor) webDriver)
                .executeScript("window.scrollTo(0, 0);");
    }

    public static WebElement scrollElementIntoView(WebDriver webDriver, WebElement webElement) {

        ((JavascriptExecutor) webDriver).
                executeScript("arguments[0].scrollIntoView({behavior: \"auto\", block: \"center\", inline: \"center\"});", webElement);
        return webElement;
    }

    public static WebElement scrollElementByIntoView(WebDriver webDriver, String elementLocator, Long customTimeOut) {

        WebElement webElement = DriverWait.forPresenceOfElementBy(webDriver, elementLocator, customTimeOut);
        ((JavascriptExecutor) webDriver).
                executeScript("arguments[0].scrollIntoView({behavior: \"auto\", block: \"center\", inline: \"center\"});", webElement);
        return webElement;
    }

    public static void scrollByPixelRatio(WebDriver webDriver, double percentageRatio) {

        ((JavascriptExecutor) webDriver)
                .executeScript(
                        "var scrollYPercent = " + percentageRatio + ";"
                                + "var scrollYPx = document.documentElement.scrollHeight * scrollYPercent;"
                                + "window.scrollTo(0, scrollYPx)"

                );
    }

    public static void scrollToElementByUntilPresent(WebDriver webDriver, Object elementLocator, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        boolean atTheBottomOfThePage = false;
        boolean elementFound = false;

        Object totalHeight;
        long scrollPixelRatio = 0;

        while (!atTheBottomOfThePage) {

            totalHeight = ((JavascriptExecutor) webDriver)
                    .executeScript(
                            "return document.body.scrollHeight");
            ((JavascriptExecutor) webDriver)
                    .executeScript("window.scrollTo(0, " + scrollPixelRatio + ");");

            /*
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            */

            if (DriverCheck.isElementByPresent(webDriver, elementLocator, timeOut)) {
                elementFound = true;
                atTheBottomOfThePage = true;
            }

            if (scrollPixelRatio > ((long) totalHeight))
                atTheBottomOfThePage = true;

            scrollPixelRatio = scrollPixelRatio + ((long) ((JavascriptExecutor) webDriver)
                                .executeScript("var viewPortHeight = Math.max(document.documentElement.clientHeight || 0, window.innerHeight || 0);"
                                        + "return viewPortHeight/2"));

            Log.info("Vertical scroll in pixels is: " + scrollPixelRatio);

        }

        if ((atTheBottomOfThePage) && (!elementFound))
            throw new NoSuchElementException("Element with locator: " + elementLocator + " not found");

    }

    public static String getHtmlContentOfElement(WebDriver webDriver, WebElement webElement) {
        return (String) ((JavascriptExecutor) webDriver).executeScript("return arguments[0].innerHTML;", webElement);
    }

    public static String getHtmlContentOfElementBy(WebDriver webDriver, Object elementLocator) {
        return (String) ((JavascriptExecutor) webDriver).executeScript("return arguments[0].innerHTML;", DriverFind.getElementBy(webDriver, elementLocator));
    }

    public static void setNoneDisplayOnElementByJs(WebDriver webDriver, String elementLocator) {

        ((JavascriptExecutor) webDriver).executeScript("arguments[0].setAttribute(\'style\',arguments[1]);",
                DriverFind.getElementBy(webDriver, elementLocator), "display: none");
    }

    public static void removeWebElement(WebDriver webDriver, String elementLocator) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].parentNode.removeChild(arguments[0])",
                DriverFind.getElementBy(webDriver, elementLocator));
    }

    public static void removeReadOnlyAttribute(WebDriver webDriver, String elementLocator) {
        String readOnlyValue = DriverFind.getElementBy(webDriver, elementLocator).getAttribute("readonly");

        if (readOnlyValue != null)
            ((JavascriptExecutor) webDriver).executeScript("arguments[0].removeAttribute(arguments[1]);",
                    DriverFind.getElementBy(webDriver, elementLocator),
                    "readonly");
    }

    public static void openNewTabAndSwitchToIt(WebDriver webDriver) {
        ((JavascriptExecutor) webDriver).executeScript("window.open('');");
        DriverActions.switchToLastWindow(webDriver);
    }

    public static void changeElementAttribute(WebDriver webDriver, WebElement webElement, String attributeName, String attributeValue) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].setAttribute(\'" + attributeName + "\', \'" + attributeValue + "\')", webElement);
    }

    public static void selectElementFromIndex(WebDriver webDriver, WebElement webElement, int index) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].selectedIndex=" + index + ";", webElement);
    }

    public static void selectElementFromText(WebDriver webDriver, WebElement webElement, String keyword) {
        ((JavascriptExecutor) webDriver).executeScript("const textToFind = '" + keyword + "';" +
                "const dd = arguments[0];" +
                "dd.selectedIndex = [...dd.options].findIndex (option => option.text === textToFind);", webElement);
    }

    public static void triggerElementChangeEvent(WebDriver webDriver, WebElement webElement) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].dispatchEvent(new Event('change'));", webElement);
    }

    public static void triggerElementChangeEventBy(WebDriver webDriver, String elementLocator) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].dispatchEvent(new Event('change'));", DriverFind.getElementBy(webDriver, elementLocator));
    }

    public static void centerViewElement(WebDriver webDriver, By by, Long timeout) {
        DriverWait.forPresenceOfElementBy(webDriver, by, timeout);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", DriverFind.getElementBy(webDriver, by));
    }

    public static void centerViewElement(WebDriver webDriver, WebElement element) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", element);
    }

    public static void scrollDown(WebDriver webDriver) {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
}
