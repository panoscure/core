package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;

import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class MonitorAllDrawsPage extends PageObject {
    private static final int ITEMS_PER_PAGE = 10;

    public MonitorAllDrawsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void fillGameDropDown(String gameName) {
        By gameDropDown = By.xpath("//*[@id='uncontrolled-tab-example-pane-2']//*[@name='game']");
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("//*[@id='uncontrolled-tab-example-pane-2']//*[@name='game']//option"));
        JavaScriptExecutors.clickElementBy(webDriver, gameDropDown);
        WebElement gameOption = webDriver.findElement(By.xpath("//*[@id='uncontrolled-tab-example-pane-2']//*[@name='game']//*[contains(text(),'" + gameName + "')]"));
        SeleniumWaits.visibilityOf(webDriver, gameOption).click();
        SeleniumWaits.presenceOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
    }

    public String getDrawStatusForDrawdId(int drawId) {
        By statusFieldOfDrawId = By.xpath("//tr[./td[text()='" + drawId + "']]//td[5]");
        return webDriver.findElement(statusFieldOfDrawId).getText();
    }

    private void navigateToPreviousPage() {
        WebElement previousPageButton = webDriver.findElement(By.xpath("//*[@id='uncontrolled-tab-example-pane-2']/div/div/div/div/div[2]/table[2]/tbody/tr/td[2]/div/div/div[1]/ul/li[1]/a"));
        JavaScriptExecutors.clickElement(webDriver, previousPageButton);
        SeleniumWaits.presenceOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
    }
}
