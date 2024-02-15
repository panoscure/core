package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;

import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class PaymentOrdersPage extends PageObject {

    @FindBy(xpath = "//*[@id='app-main']/div/div[1]/div[2]/button")
    private WebElement addNewButton;

    @FindBy(xpath = "//*[@id='paymentOrders-pane-1']/div/div/div/div[2]/div/div[1]/div/div/div[1]/span/input")
    private WebElement inputFromDate;

    @FindBy(xpath = "//*[@id='paymentOrders-pane-1']/div/div/div/div[2]/div/div[2]/div/div/div[1]/span/input")
    private WebElement inputToDate;

    @FindBy(xpath = "//*[@id='paymentOrders-pane-1']/div/div/div/div[2]/div/div[4]/button[2]")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@name='payment_id']")
    private WebElement paymentIdInput;

    @FindBy(xpath = "//*[@id='app-main']/div/div[3]/div/div/div/table/tbody/tr[1]/td[9]/a")
    private WebElement viewButton;

    public PaymentOrdersPage(WebDriver webDriver) {
        super(webDriver);
    }

    public PaymentOrdersAddNewPage clickAddNewButton() {
        SeleniumWaits.elementToBeClickable(webDriver, addNewButton);
        JavaScriptExecutors.clickElement(webDriver, addNewButton);
        return new PaymentOrdersAddNewPage(webDriver);
    }

    public PaymentOrdersPage fillFromDate(String fromDate) {
        this.inputFromDate.sendKeys(new CharSequence[]{Keys.chord(new CharSequence[]{Keys.CONTROL, "a"})});
        this.inputFromDate.sendKeys(new CharSequence[]{fromDate});
        return this;
    }

    public PaymentOrdersPage fillToDate(String fromDate) {
        this.inputToDate.sendKeys(new CharSequence[]{Keys.chord(new CharSequence[]{Keys.CONTROL, "a"})});
        this.inputToDate.sendKeys(new CharSequence[]{fromDate});
        return this;
    }

    public PaymentOrdersPage fillPaymentOrderId(String id) {
        SeleniumWaits.elementToBeClickable(webDriver, paymentIdInput);
        paymentIdInput.sendKeys(id);
        return this;
    }

    public PaymentOrdersPage clickSearchButton() throws InterruptedException {
        Thread.sleep(1000);
        SeleniumWaits.elementToBeClickable(webDriver, searchButton);
        JavaScriptExecutors.clickElement(webDriver, searchButton);
        return this;
    }

    public PaymentOrdersAddNewPage clickViewButton() {
        SeleniumWaits.visibilityOf(webDriver, viewButton);
        SeleniumWaits.elementToBeClickable(webDriver, viewButton);
        JavaScriptExecutors.clickElement(webDriver, viewButton);
        return new PaymentOrdersAddNewPage(webDriver);
    }
}
