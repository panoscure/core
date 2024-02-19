package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class OperationsTab extends PageObject {

    public OperationsTab(WebDriver webDriver) {
        super(webDriver);
    }

    public OperationsTab selectExtraDraw(Integer draw) {
        By extraDrawDropdown = By.xpath("//div[@id='uncontrolled-tab-pane-1']//select[@name='raffleDraw']");
        selectFromDropdownByValue(extraDrawDropdown, draw.toString());
        return this;
    }

    public OperationsTab clickExportPartitipants() {
        SeleniumWaits.elementToBeClickable(webDriver, By.xpath("(//button[text()='Export'])[1]")).click();
        SeleniumWaits.invisibilityOfElementLocated(webDriver, FETCHING_DATA_LOADER);
        return this;
    }
}
