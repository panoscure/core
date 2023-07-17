package com.intralot.qa.automation.core.driver.engine.common.api;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public enum Locators {

    XPATH("xpath") {
        @Override
        public By determineLocator(String locator) {
            return By.xpath(findLocatorSubstring(locator));
        }
    },

    CSS("css") {
        @Override
        public By determineLocator(String locator) {
            return By.cssSelector(findLocatorSubstring(locator));
        }
    },

    /*
    XPATHEXPR("//"){

        @Override
        public By determineLocator(String locator) {
            return By.xpath(locator);
        }
    },
    */

    NAME("name") {
        @Override
        public By determineLocator(String locator) {
            return By.name(findLocatorSubstring(locator));
        }
    },

    ID("id") {
        @Override
        public By determineLocator(String locator) {
            return By.id(findLocatorSubstring(locator));
        }
    },

    ACCESSIBILITY_ID("accessibilityId") {
        @Override
        public By determineLocator(String locator) {
            return AppiumBy.accessibilityId(findLocatorSubstring(locator));
        }
    },

    IOS_CLASSCHAIN("iOSClassChain") {
        @Override
        public By determineLocator(String locator) {
            return AppiumBy.iOSClassChain(findLocatorSubstring(locator));
        }
    },

    IOS_NSPREDICATE_STRING("iOSNsPredicateString") {
        @Override
        public By determineLocator(String locator) {
            return AppiumBy.iOSNsPredicateString(findLocatorSubstring(locator));
        }
    },

    ;

    public abstract By determineLocator(String locator);

    private final String value;

    Locators(final String locator) {
        this.value = locator;

    }

    public synchronized static String findLocatorSubstring(String locator) {
        return locator.substring(locator.indexOf('=') + 1);
    }

    public String getLocator() {
        return value;
    }

    static synchronized public Locators findByLocator(String locator) {
        if (locator != null) {
            for (Locators locatorUsed : Locators.values()) {
                if (locator.startsWith(locatorUsed.getLocator())) {
                    return locatorUsed;
                }
            }
        }

        return null;
    }

}
