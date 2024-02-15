package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;

import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class MonitorDrawStatusPage extends PageObject {

    public MonitorDrawStatusPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MonitorAllDrawsPage goToAllDrawsTab() {
        By tab2 = By.id("uncontrolled-tab-example-tab-2");
        SeleniumWaits.elementToBeClickable(webDriver, tab2);
        JavaScriptExecutors.clickElementBy(webDriver, tab2);
        return new MonitorAllDrawsPage(webDriver);
    }
}
