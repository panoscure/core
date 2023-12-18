package com.intralot.qa.automation.core.driver.engine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SeleniumCommons {

    public static Boolean isElementPresent(WebDriver webDriver, By by) {
        return webDriver.findElements(by).size() != 0;
    }

    public static void navigateToTab(WebDriver webDriver, int tabIndex) {
        Set<String> windowHandles = webDriver.getWindowHandles();
        List<String> windowHandlesStringsList = new ArrayList<>(windowHandles);
        String tabToNavigate = windowHandlesStringsList.get(tabIndex);
        webDriver.switchTo().window(tabToNavigate);
    }

}
