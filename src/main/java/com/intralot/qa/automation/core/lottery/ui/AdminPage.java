package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;
import com.intralot.qa.automation.core.lottery.ui.OverviewPage;

public class AdminPage extends PageObject {

    private static final By alertSuccessMessageTopRight =
            By.xpath("//*[@class = 'top-right']//*[contains(text(),'Fetch') or contains(text(),'Success') or contains(text(),'Ok')]");

    @FindBy(linkText = "WAGER OPERATIONS")
    private WebElement wagerOperationsBtn;

    @FindBy(xpath = "//span[text()='Monitoring and Operations']")
    private WebElement leftSideMenuMonitoringAndOperations;

    @FindBy(linkText = "Manual Entry")
    private WebElement manualEntryBtn;

    @FindBy(linkText = "Payment Orders")
    private WebElement paymentOrdersBtn;

    @FindBy(xpath = "//span[text()='Game Management']")
    private WebElement gameManagementBtn;

    @FindBy(linkText = "Overview")
    private WebElement overviewBtn;

    @FindBy(linkText = "Import Game Record")
    private WebElement importGameRecordBtn;

    @FindBy(linkText = "USER MANAGEMENT")
    private WebElement leftSideMenuUserManagement;

    @FindBy(linkText = "Permissions")
    private WebElement leftSideMenuPermissions;

    @FindBy(xpath = "//span[text()='Winning Numbers']")
    private WebElement leftSideMenuWinningNumbers;

    @FindBy(linkText = "Winning Columns")
    private WebElement leftSideMenuWinningColumns;

    @FindBy(id = "userDropdownMenu")
    private WebElement userDropdownMenu;

    @FindBy(name = "logout")
    private WebElement userDropdownMenuLogout;


    public AdminPage(WebDriver webDriver) {
        super(webDriver);
        SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("//h2[.='Welcome To L10 Lottery Platform']"));
    }

    public AdminPage(WebDriver webDriver, String url) {
        super(webDriver);
        webDriver.navigate().to(url);
    }


    /**
     * ------------------ Game Management ------------------
     **/
    public AdminPage clickGameManagement() {
        By gameManagementArrowLocator = By.xpath("//*[@id='side-menu']/li[1]/a/span[@class='fa arrow nav-icon-active']");

        boolean isGameManagementArrowPresent = false;
        try {
            isGameManagementArrowPresent = SeleniumWaits.visibilityOfElementLocated(webDriver, gameManagementArrowLocator).isDisplayed();
        } catch (TimeoutException notFound) {
        }

        if (!isGameManagementArrowPresent) {
            SeleniumWaits.elementToBeClickable(webDriver, gameManagementBtn);
            JavaScriptExecutors.clickElement(webDriver, gameManagementBtn);
        }
        return this;
    }


    /**
     * ------------------ Overview ------------------
     */
    public OverviewPage clickOverview() {
        SeleniumWaits.elementToBeClickable(webDriver, overviewBtn);
        JavaScriptExecutors.clickElement(webDriver, overviewBtn);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, By.className("loading-indicator"));
        return new OverviewPage(webDriver);
    }


    /**
     * ------------------ Import Game Record -----------------
     */
    public OverviewPage clickImportGameRecord() {
        SeleniumWaits.elementToBeClickable(webDriver, importGameRecordBtn);
        JavaScriptExecutors.clickElement(webDriver, importGameRecordBtn);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, By.className("block-ui-container"));
        return new OverviewPage(webDriver);
    }


    /**
     * ------------------ Winning Numbers ------------------
     */
    public AdminPage clickWinningNumbers() {
        SeleniumWaits.elementToBeClickable(webDriver, leftSideMenuWinningNumbers);
        JavaScriptExecutors.clickElement(webDriver, leftSideMenuWinningNumbers);
        return this;
    }

    /**
     * ------------------ Winning Columns ------------------
     */
    public void clickWinningColumns() {
        SeleniumWaits.elementToBeClickable(webDriver, leftSideMenuWinningColumns);
        JavaScriptExecutors.clickElement(webDriver, leftSideMenuWinningColumns);
        SeleniumWaits.presenceOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
    }


    /**
     * ------------------ Wager Operations ------------------
     */
    public AdminPage clickWagerOperations() {
        SeleniumWaits.elementToBeClickable(webDriver, wagerOperationsBtn);
        JavaScriptExecutors.clickElement(webDriver, wagerOperationsBtn);
        return this;
    }

    /**
     * ------------------ Manual Entry ------------------
     */
    public ManualEntryPage clickManualEntry() {
        SeleniumWaits.elementToBeClickable(webDriver, manualEntryBtn);
        JavaScriptExecutors.clickElement(webDriver, manualEntryBtn);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, By.className("block-ui-container"));
        return new ManualEntryPage(webDriver);
    }

    /**
     * ------------------ Payment Orders ------------------
     */
    public void clickPaymentOrders() {
        SeleniumWaits.elementToBeClickable(webDriver, paymentOrdersBtn);
        JavaScriptExecutors.clickElement(webDriver, paymentOrdersBtn);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, By.className("block-ui-container"));
    }


    /**
     * ------------------ Monitoring and Operations ------------------
     */
    public MonitoringAndOperationsPage clickMonitoringAndOperations() {
        SeleniumWaits.elementToBeClickable(webDriver, leftSideMenuMonitoringAndOperations);
        JavaScriptExecutors.clickElement(webDriver, leftSideMenuMonitoringAndOperations);
        return new MonitoringAndOperationsPage(webDriver);
    }

    /**
     * ------------------ User Management ------------------
     */
    public AdminPage clickUserManagement() {
        SeleniumWaits.elementToBeClickable(webDriver, leftSideMenuUserManagement);
        JavaScriptExecutors.clickElement(webDriver, leftSideMenuUserManagement);
        return this;
    }

    /**
     * ------------------ Permissions ------------------
     */
    public PermissionsOverviewPage clickPermissions() {
        SeleniumWaits.elementToBeClickable(webDriver, leftSideMenuPermissions);
        JavaScriptExecutors.clickElement(webDriver, leftSideMenuPermissions);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, By.className("block-ui-container"));
        return new PermissionsOverviewPage(webDriver);
    }

    /**
     * ------------------ Click User Dropdown Menu ------------------
     */
    public void logoutFromLotteryUi() {
        JavaScriptExecutors.clickElement(webDriver, userDropdownMenu);
        JavaScriptExecutors.clickElement(webDriver, userDropdownMenuLogout);
    }

    public void clickCheckWinnings() {
        WebElement checkWagersBtn = SeleniumWaits.elementToBeClickable(webDriver, By.linkText("Check Winnings"));
        JavaScriptExecutors.clickElement(webDriver, checkWagersBtn);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, By.className("block-ui-container"));
    }
}
