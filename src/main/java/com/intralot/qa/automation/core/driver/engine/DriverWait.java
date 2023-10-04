package com.intralot.qa.automation.core.driver.engine;

import com.intralot.qa.automation.core.driver.engine.common.api.Locators;
import com.intralot.qa.automation.core.utilities.CustomProperties;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DriverWait {

    // Using By locator
    public static WebElement forPresenceOfElementBy(WebDriver webDriver, By by, final Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }


    // Using Object (By) locator (from enums)
    public static WebElement forPresenceOfElementBy(WebDriver webDriver, Object locator, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.presenceOfElementLocated(Locators.findByLocator((String) locator).determineLocator((String) locator)));
    }


    // Using By locator
    public static List<WebElement> forPresenceOfElementsBy(WebDriver webDriver, By by, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }


    // Using Objects (By) locators (from enums)
    public static List<WebElement> forPresenceOfElementsBy(WebDriver webDriver, Object locator, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(Locators.findByLocator((String) locator).determineLocator((String) locator)));
    }


    // Using By locator
    public static WebElement forVisibilityOfElementBy(WebDriver webDriver, By by, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }


    // Using Object (By) locator (from enums)
    public static WebElement forVisibilityOfElementBy(WebDriver webDriver, Object locator, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.visibilityOfElementLocated(Locators.findByLocator((String) locator).determineLocator((String) locator)));
    }


    // Using WebElement
    public static WebElement forVisibilityOfElement(WebDriver webDriver, WebElement webElement, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.visibilityOf(webElement));
    }


    // Using By locator
    public static List<WebElement> forVisibilityOfElementsBy(WebDriver webDriver, By by, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }


    // Using Object (By) locator (from enums)
    public static List<WebElement> forVisibilityOfElementsBy(WebDriver webDriver, Object locator, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Locators.findByLocator((String) locator).determineLocator((String) locator)));
    }


    // Using WebElement
    public static List<WebElement> forVisibilityOfElements(WebDriver webDriver, WebElement webElements, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);
        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.visibilityOfAllElements(webElements));
    }


    // Using By locator
    public static Boolean forInvisibilityOfElementBy(WebDriver webDriver, By by, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.invisibilityOfElementLocated(by));
    }


    // Using Object (By) locator (from enums)
    public static Boolean forInvisibilityOfElementBy(WebDriver webDriver, Object locator, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.invisibilityOfElementLocated(Locators.findByLocator((String) locator).determineLocator((String) locator)));
    }

    // Using WebElement
    public static Boolean forInvisibilityOfElement(WebDriver webDriver, WebElement webElement, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.invisibilityOf(webElement));
    }

    // Using By locator
    public static WebElement forElementToBeClickableBy(WebDriver webDriver, By by, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.elementToBeClickable(by));
    }

    // Using Object (By) locator (from enums)
    public static WebElement forElementToBeClickableBy(WebDriver webDriver, Object locator, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.elementToBeClickable(Locators.findByLocator((String) locator).determineLocator((String) locator)));
    }

    // Using Object (By) locator (from enums)
    public static WebElement forElementToBeClickableBy(WebDriver webDriver, WebElement element, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    // Using WebElement
    public static WebElement forElementToBeClickable(WebDriver webDriver, WebElement webElement, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.elementToBeClickable(webElement));
    }

    // Wait method(s) which do NOT throw exceptions - use with caution!
    // Using By locator
    public static WebElement forVisibilityAndIgnoreExceptionsOfElementBy(WebDriver webDriver, By by, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .ignoring(TimeoutException.class, NoSuchElementException.class)
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    // Using Object (By) locator (from enums)
    public static WebElement forVisibilityAndIgnoreExceptionsOfElement(WebDriver webDriver, Object locator, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .ignoring(TimeoutException.class, NoSuchElementException.class)
                .until(ExpectedConditions.visibilityOfElementLocated(Locators.findByLocator((String) locator).determineLocator((String) locator)));
    }

    // Using WebElement
    public static WebElement forVisibilityAndIgnoreExceptionsOfElement(WebDriver webDriver, WebElement webElement, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .ignoring(TimeoutException.class, NoSuchElementException.class)
                .until(ExpectedConditions.visibilityOf(webElement));
    }

    // Using By locator
    public static Boolean forInvisibilityAndIgnoreExceptionsOfElementBy(WebDriver webDriver, By by, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .ignoring(TimeoutException.class, NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    // Using Object (By) locator (from enums)
    public static Boolean forInvisibilityAndIgnoreExceptionsOfElementBy(WebDriver webDriver, Object locator, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .ignoring(TimeoutException.class, NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated(Locators.findByLocator((String) locator).determineLocator((String) locator)));
    }

    // Using WebElement
    public static Boolean forInvisibilityAndIgnoreExceptionsOfElement(WebDriver webDriver, WebElement webElement, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .ignoring(TimeoutException.class, NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOf(webElement));
    }

    // Fluent wait(s)
    // Using By locator
    public static WebElement fluentWaitForPresenceOfElementBy(WebDriver webDriver, By by, Long pollingTimer, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        FluentWait<? extends WebDriver> wait =
                new FluentWait<>(webDriver)
                        .pollingEvery(Duration.ofSeconds(pollingTimer))
                        .withTimeout(Duration.ofSeconds(timeOut));

        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    // Using Object (By) locator (from enums)
    public static WebElement fluentWaitForPresenceOfElementBy(WebDriver webDriver, Object locator, Long pollingTimer, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        FluentWait<? extends WebDriver> wait =
                new FluentWait<>(webDriver)
                        .pollingEvery(Duration.ofSeconds(pollingTimer))
                        .withTimeout(Duration.ofSeconds(timeOut));

        return wait.until(ExpectedConditions.presenceOfElementLocated(Locators.findByLocator((String) locator).determineLocator((String) locator)));
    }


    // Miscellaneous
    public static boolean forStalenessOfElement(WebDriver webDriver, WebElement webElement, Long customTimeOut) {
        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);
        return new WebDriverWait(webDriver, Duration.ofSeconds(timeOut))
                .until(ExpectedConditions.stalenessOf(webElement));
    }

    public static void forPageToLoad(WebDriver driver, Long customTimeOut) {

        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);

        new WebDriverWait(driver, Duration.ofSeconds(timeOut))
                .until(
                        webDriver ->
                                ((JavascriptExecutor) webDriver)
                                        .executeScript("return document.readyState")
                                        .equals("complete"));
    }

}
