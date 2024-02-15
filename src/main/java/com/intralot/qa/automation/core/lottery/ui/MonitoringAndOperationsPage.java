package com.intralot.qa.automation.core.lottery.ui;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;

import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class MonitoringAndOperationsPage extends PageObject {

    @FindBy(xpath = "//span[text()='Draw Operations']")
    private WebElement drawOperations;

    @FindBy(linkText = "Draw Status")
    private WebElement drawStatus;

    @FindBy(linkText = "Summary Draw")
    private WebElement summaryDraw;

    @FindBy(linkText = "Raffle Game Management")
    private WebElement raffles;

    @FindBy(linkText = "Release Payments")
    private WebElement releasePayments;

    public MonitoringAndOperationsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public DrawOperationsPage clickDrawOperations() {
        SeleniumWaits.elementToBeClickable(webDriver, drawOperations);
        JavaScriptExecutors.clickElement(webDriver, drawOperations);
        return new DrawOperationsPage(webDriver);
    }

    public MonitorDrawStatusPage clickDrawStatus() {
        SeleniumWaits.elementToBeClickable(webDriver, drawStatus);
        JavaScriptExecutors.clickElement(webDriver, drawStatus);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        return new MonitorDrawStatusPage(webDriver);
    }

    public void clickSummaryDraw() {
        SeleniumWaits.elementToBeClickable(webDriver, summaryDraw);
        JavaScriptExecutors.clickElement(webDriver, summaryDraw);
    }

    public RafflesPage clickRaffles() {
        SeleniumWaits.elementToBeClickable(webDriver, raffles);
        JavaScriptExecutors.clickElement(webDriver, raffles);
        return new RafflesPage(webDriver);
    }

    public ReleasePaymentsPage clickReleasePayments() {
        SeleniumWaits.elementToBeClickable(webDriver, releasePayments);
        JavaScriptExecutors.clickElement(webDriver, releasePayments);
        return new ReleasePaymentsPage(webDriver);
    }

}
