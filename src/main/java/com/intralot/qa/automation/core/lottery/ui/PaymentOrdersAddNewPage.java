package com.intralot.qa.automation.core.lottery.ui;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class PaymentOrdersAddNewPage extends PageObject {

    @FindBy(xpath = "//*[@id='app-main']/div/div[3]/div/div/div/div/div[2]/div/div[3]/div/input")
    private WebElement wagerIdInput;

    @FindBy(xpath = "//*[@id='app-main']/div/div[3]/div/div/div/div/div[2]/div/div[5]/button[2]")
    private WebElement addButton;

    @FindBy(xpath = "//*[@id='app-main']/div/div[4]/div/div[3]/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/span")
    private WebElement expandCross;

    @FindBy(xpath = "//*[@name='PLAYER_FNAME']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//*[@name='PLAYER_LNAME']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//*[@id='app-main']/div/div[1]/div/h2/span/button[2]")
    private WebElement createButton;

    @FindBy(xpath = "//button[text()='Payout']")
    private WebElement payoutButton;

    @FindBy(xpath = "//*[@name='BIC']")
    private WebElement BICNumberInput;

    @FindBy(xpath = "//input[@name='IBAN']")
    private WebElement IBANInput;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[3]/button")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@id='app-main']/div/div[3]/div/div[3]/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[10]")
    private WebElement grossAmount;

    @FindBy(xpath = "//*[@id='app-main']/div/div[1]/div/h2")
    private WebElement paymentId;

    @FindBy(xpath = "//button[text()='Approve']")
    private WebElement approveButton;

    @FindBy(xpath = "//button[text()='Print Receipt (File)']")
    private WebElement printFileButton;

    @FindBy(xpath = "//button[text()='Print Receipt (Customer)']")
    private WebElement printCustomerButton;

    @FindBy(xpath = "//*[@id='app-main']/div/div[2]/div/span")
    private WebElement statusPaid;

    @FindBy(xpath = "//*[@id='app-main']/div/div[3]/div/div[2]/div[2]/div/div[4]/p")
    private WebElement totalAmountPayable;

    public PaymentOrdersAddNewPage(WebDriver webDriver) {
        super(webDriver);
    }

    public PaymentOrdersAddNewPage fillWagerId(String wagerId) {
        SeleniumWaits.elementToBeClickable(webDriver, wagerIdInput);
        wagerIdInput.sendKeys(wagerId);
        return this;
    }

    public PaymentOrdersAddNewPage clickAddButton() {
        SeleniumWaits.elementToBeClickable(webDriver, addButton);
        JavaScriptExecutors.clickElement(webDriver, addButton);
        return this;
    }

    public PaymentOrdersAddNewPage fillFirstName(String firstName) {
        SeleniumWaits.visibilityOf(webDriver, expandCross);
        SeleniumWaits.elementToBeClickable(webDriver, firstNameInput);
        firstNameInput.sendKeys(firstName);
        return this;
    }

    public PaymentOrdersAddNewPage fillLastName(String lastName) {
        SeleniumWaits.visibilityOf(webDriver, expandCross);
        SeleniumWaits.elementToBeClickable(webDriver, lastNameInput);
        lastNameInput.sendKeys(lastName);
        return this;
    }

    public PaymentOrdersAddNewPage clickCreateButton() throws InterruptedException {
        // Wait for 2 seconds for the name inputs to be filled
        Thread.sleep(2 * 1000);
        SeleniumWaits.elementToBeClickable(webDriver, createButton);
        JavaScriptExecutors.clickElement(webDriver, createButton);
        return this;
    }

    public PaymentOrdersAddNewPage clickPayoutButton() {
        SeleniumWaits.visibilityOf(webDriver, payoutButton);
        SeleniumWaits.elementToBeClickable(webDriver, payoutButton);
        JavaScriptExecutors.clickElement(webDriver, payoutButton);
        return this;
    }

    public PaymentOrdersAddNewPage fillBICNumber(String BICNumber) {
        SeleniumWaits.visibilityOf(webDriver, BICNumberInput);
        SeleniumWaits.elementToBeClickable(webDriver, BICNumberInput);
        BICNumberInput.sendKeys(BICNumber);
        return this;
    }

    public PaymentOrdersAddNewPage fillIBAN(String iban) {
        SeleniumWaits.visibilityOf(webDriver, IBANInput);
        SeleniumWaits.elementToBeClickable(webDriver, IBANInput);
        IBANInput.sendKeys(iban);
        return this;
    }

    public PaymentOrdersAddNewPage clickSaveButton() {
        SeleniumWaits.elementToBeClickable(webDriver, saveButton);
        JavaScriptExecutors.clickElement(webDriver, saveButton);
        return this;
    }

    public String getPaymentId() {
        SeleniumWaits.visibilityOf(webDriver, paymentId);
        String paymentHeader = paymentId.getText();
        String paymentOrderId = StringUtils.substringBetween(paymentHeader, "ID: ", ")");
        return paymentOrderId;
    }

    public PaymentOrdersAddNewPage clickApproveButton() {
        SeleniumWaits.visibilityOf(webDriver, approveButton);
        SeleniumWaits.elementToBeClickable(webDriver, approveButton);
        JavaScriptExecutors.clickElement(webDriver, approveButton);
        return this;
    }

    public String getStatusPaid() {
        SeleniumWaits.visibilityOf(webDriver, statusPaid);
        return statusPaid.getText();
    }

    public boolean isPrintReceiptFileVisible() {
        SeleniumWaits.visibilityOf(webDriver, printFileButton);
        SeleniumWaits.elementToBeClickable(webDriver, printFileButton);
        return true;
    }

    public boolean isPrintReceiptCustomerVisible() {
        SeleniumWaits.visibilityOf(webDriver, printCustomerButton);
        SeleniumWaits.elementToBeClickable(webDriver, printCustomerButton);
        return true;
    }

    public String getGrossAmount() {
        SeleniumWaits.visibilityOf(webDriver, grossAmount);
        return grossAmount.getText();
    }

    public String getTotalAmountPayable() {
        SeleniumWaits.visibilityOf(webDriver, totalAmountPayable);
        return totalAmountPayable.getText();
    }
}
