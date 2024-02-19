package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GameRecordPage extends PageObject {

    protected static final By SUCCESSFUL_GAME_RECORD_DELETION =
            By.xpath("//*[@class = 'top-left']//*[text()='Delete done']");

    @FindBy(xpath = "//*[@id='app-main']/div/div[4]/div/div/div/button//div[text()='Game Channel Parameters']")
    private WebElement gameChannelParameters;

    @FindBy(xpath = "//*[@id='app-main']/div/div[4]/div/div/div/button//div[text()='Participation Channel Parameters']")
    private WebElement participationChannelParameters;

    @FindBy(xpath = "//*[@id='app-main']/div/div[4]/div/div/div[7]/button")
    private WebElement lottoParameters;

    @FindBy(xpath = "//*[@id='app-main']/div/div[4]/div/div/div[3]/button/span[1]/span[2]/span/div/div")
    private WebElement generalSettings;

    @FindBy(xpath = "//*[@id='app-main']/div/div[4]/div/div/div[5]/button/span[1]/span[2]/span/div/div")
    private WebElement drawParameters;

    @FindBy(xpath = "//div[./div[text()='NLO - Online']]//div[./label[text()='Repeat']]//select")
    private WebElement repeatDropdownMenu;

    @FindBy(xpath = "//div[@class='tab-content']//div[./div[text()='NLO - Online']]//div[./label[text()='Release Payments']]//select")
    private WebElement releasePaymentsMenuForChannelOnline;

    @FindBy(xpath = "//div[@class='tab-content']//div[./div[text()='NLO - Online']]//div[./label[text()='Draw Time Offset']]//input")
    private WebElement autoPaymentDrawTimeOffsetForChannelOnline;

    @FindBy(xpath = "//*[@id='tabswrapper1-pane-7']/div/div[2]/div[2]/div[1]/div[3]/div/div[2]/div/div[3]/div/input")
    private WebElement autoPaymentInterval;

    @FindBy(name = "saveButton")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@id='app-main']/div/div[1]/div[2]/button[4]")
    private WebElement activateBtn;

    @FindBy(xpath = "//ul//div[text()='NLO - Online']")
    private WebElement onlineTabGameChannelParameters;

    @FindBy(id = "tabswrapper1-tab-3")
    private WebElement terminalTabGameChannelParameters;

    @FindBy(id = "tabswrapper1-tab-7")
    private WebElement onlineTabParticipationChannelParameters;

    @FindBy(xpath = "//*[@id='app-main']/div/div[4]/div/div/div[3]/div/div/div/div/div[3]/div/div/div[2]/div/div[2]/div/input")
    private WebElement pilotCheckbox;

    @FindBy(xpath = "//*[@id='tabswrapper1-pane-3']/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div[2]/div/input")
    private WebElement exchangeCheckBox;

    @FindBy(xpath = "//*[@id='app-main']/div/div[4]/div/div/div[5]/div/div/div/div/div[1]/div/div/div[2]/div/div[3]/div/div/span/button[1]")
    private WebElement drawBreakDeleteButton;

    @FindBy(xpath = "//*[@id='tabswrapper2-pane-7']/div/div[4]/div[2]/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div/span/button[1]")
    private WebElement salesStartDeleteButtonParticipationOnlineChannel;

    @FindBy(xpath = "//*[@id='tabswrapper2-pane-7']/div/div[4]/div[2]/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/span/button[1]")
    private WebElement salesEndDeleteButtonParticipationOnlineChannel;

    @FindBy(xpath = "//*[@id='app-main']/div/div[4]/div/div/div[5]/div/div/div/div/div[1]/div/div/div[2]/div/div[3]/div/div/span/button[2]")
    private WebElement drawBreakEditButton;

    @FindBy(xpath = "//*[@id='app-main']/div/div[4]/div/div/div[5]/div/div/div/div/div[1]/div/div/div[2]/div/div[3]/div/div/span/button[2]")
    private WebElement editButtonDrawBreak;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div/div[6]/span/input")
    private WebElement drawBreakInputSeconds;

    @FindBy(xpath = "//*[@id='app-main']/div/div[4]/div/div/div[5]/div/div/div/div/div[1]/div/div/div[2]/div/div[3]/div/div/input")
    private WebElement drawBreakValue;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[3]/button")
    private WebElement drawBreakSaveButton;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[3]/button")
    private WebElement salesStartSaveButton;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[3]/button")
    private WebElement salesEndSaveButton;

    @FindBy(xpath = "//*[@id='app-main']/div/div[4]/div/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/div[2]/div[3]/p")
    private WebElement gameCode;

    @FindBy(xpath = "//*[@id='app-main']/div/div[4]/div/div/div[5]/div/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/input")
    private WebElement maximumFutureDrawsInput;

    @FindBy(name = "deleteButton")
    private WebElement deleteGameRecordButton;

    @FindBy(xpath = "//*[@id='root']/span/div/div[1]/div[1]")
    private WebElement deleteGameRecordConfirmationModal;

    @FindBy(xpath = "//*[@id='root']/span/div/div[1]/div[2]/button[1]")
    private WebElement deleteGameRecordConfirmationModalYesOption;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div/div[6]/span/input")
    private WebElement inputSecondsSalesStartOnlineChannel;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div/div[6]/span/input")
    private WebElement inputSecondsSalesEndOnlineChannel;

    @FindBy(xpath = "//*[@id='tabswrapper2-pane-7']/div/div[2]/div[2]/div/button[1]")
    private WebElement saveButtonOnlineParticipationChannel;

    @FindBy(xpath = "//*[@id='tabswrapper2-pane-7']/div/div[2]/div[2]/div/button[4]")
    private WebElement activationButtonParticipationOnlineChannel;

    @FindBy(xpath = "//div[@aria-hidden='false']//div[./label[text()='Before Draw Time']]//input")
    private WebElement beforeDrawTimeValue;


    public GameRecordPage(WebDriver webDriver) {
        super(webDriver);
    }

    public GameRecordPage expandGameChannelParameters() {
        SeleniumWaits.elementToBeClickable(webDriver, gameChannelParameters);
        JavaScriptExecutors.clickElement(webDriver, gameChannelParameters);
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("//*[@id='tabswrapper1-pane-0']/div/div[2]/div[1]"));
        return this;
    }

    public GameRecordPage expandParticipationChannelParameters() {
        SeleniumWaits.elementToBeClickable(webDriver, participationChannelParameters);
        JavaScriptExecutors.clickElement(webDriver, participationChannelParameters);
        return this;
    }

    public GameRecordPage selectTabParticipationChannelParameters(String tabText) {
        By tab = By.xpath("//div[contains(@class, 'l10-section-wrapper') and .//div[text()='Participation Channel Parameters']]//div[text()='" + tabText + "']");
        SeleniumWaits.elementToBeClickable(webDriver, tab);
        JavaScriptExecutors.clickElementBy(webDriver, tab);
        SeleniumWaits.attributeToBe(webDriver, By.xpath("//a[./div[text()='" + tabText + "']]"), "aria-selected", "true");
        return this;
    }

    public GameRecordPage clickChannelTabGameChannelParameters(String channel) {
        WebElement channelTabGameChannelParameters = webDriver.findElement(By.xpath("//ul//div[text()='" + channel + "']"));
        SeleniumWaits.elementToBeClickable(webDriver, channelTabGameChannelParameters);
        JavaScriptExecutors.clickElement(webDriver, channelTabGameChannelParameters);
        return this;
    }

    public GameRecordPage clickTerminalTabGameChannelParameters() {
        SeleniumWaits.elementToBeClickable(webDriver, terminalTabGameChannelParameters);
        JavaScriptExecutors.clickElement(webDriver, terminalTabGameChannelParameters);
        return this;
    }

    public String getSelectedOptionOfRepeat(String channel) {
        WebElement repeatDropdownMenu = SeleniumWaits.visibilityOf(webDriver,
                webDriver.findElement(By.xpath("//div[./div[text()='" + channel + "']]//div[./label[text()='Repeat']]//select")));
        Select select = new Select(repeatDropdownMenu);
        new FluentWait<>(webDriver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(100))
                .until((webDriver -> (select.getOptions().size() > 1)));
        return select.getFirstSelectedOption().getText();
    }

    public GameRecordPage clickSaveButtonAndGetMessage() {
        JavaScriptExecutors.clickElement(webDriver, saveButton);
        By confirmSaveBtn = By.xpath("//*[@id='root']/span/div/div[1]/div[2]/button[1]");
        SeleniumWaits.presenceOfElementLocated(webDriver, confirmSaveBtn);
        webDriver.findElement(confirmSaveBtn).click();

        new WebDriverWait(webDriver, TimeUnit.SECONDS.toSeconds(60L))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'top-right']//*")));
        By alertSuccessMessage = By.xpath("//*[@role='alert']//*[contains(text(),'Saved')]");
        new WebDriverWait(webDriver, TimeUnit.SECONDS.toSeconds(60L))
                .until(ExpectedConditions.visibilityOfElementLocated(alertSuccessMessage));
        return this;
    }

    public GameRecordPage clickSaveButtonOnlineParticipationChannel() {
        SeleniumWaits.elementToBeClickable(webDriver, saveButtonOnlineParticipationChannel);
        JavaScriptExecutors.clickElement(webDriver, saveButtonOnlineParticipationChannel);
        By confirmYesOptionDialogueOnlineParticipationChannel = By.xpath("//*[@id='root']/span/div/div[1]/div[2]/button[1]");
        SeleniumWaits.elementToBeClickable(webDriver, confirmYesOptionDialogueOnlineParticipationChannel);
        JavaScriptExecutors.clickElementBy(webDriver, confirmYesOptionDialogueOnlineParticipationChannel);
        SeleniumWaits.elementToBeClickable(webDriver, activationButtonParticipationOnlineChannel);
        return this;
    }

    public GameRecordPage clickActivateButtonParticipationChannelOnline() {
        JavaScriptExecutors.clickElement(webDriver, activationButtonParticipationOnlineChannel);
        SeleniumWaits.textToBe(webDriver, By.xpath("//*[@id='tabswrapper2-pane-7']/div/div[3]/div/div/span"), "Channel Record Activated");
        return this;
    }

    public GameRecordPage clickActivate() {
        SeleniumWaits.elementToBeClickable(webDriver, activateBtn);
        JavaScriptExecutors.clickElement(webDriver, activateBtn);
        new WebDriverWait(webDriver, TimeUnit.SECONDS.toSeconds(60L))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@role='alert']//*[contains(text(),'Activated')]")));
        SeleniumWaits.invisibilityOfElementLocated(webDriver, By.className("block-ui-container"));
        return this;
    }

    public GameRecordPage expandLottoParameters() {
        SeleniumWaits.elementToBeClickable(webDriver, lottoParameters);
        JavaScriptExecutors.clickElement(webDriver, lottoParameters);
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("//*[@id='app-main']/div/div[4]/div/div/div[7]/div/div/div/div/div[3]/div/div/div[2]/div/div/label"));
        return this;
    }

    public GameRecordPage selectResultsPerPage() {
        SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("//select[@name='limit']"));
        By resultNumberDropDown = By.xpath("//select[@name='limit']");
        JavaScriptExecutors.scrollToElementBy(webDriver, resultNumberDropDown);
        selectFromDropdownByValue(webDriver.findElement(resultNumberDropDown), "25");
        return this;
    }

    public List<String> getWinningCategories() {
        By winningCategoriesDescription = By.xpath("//*[@id='app-main']/div/div[4]/div/div/div[7]/div/div/div/div/div[3]/div/div/div[2]/div/div/div/div[2]/table[1]/tbody/tr/td[2]");
        List<WebElement> elements = webDriver.findElements(winningCategoriesDescription);
        List<String> categories = new ArrayList<>();
        for (WebElement element : elements) {
            categories.add(element.getText());
        }
        return categories;
    }

    public GameRecordPage fillReleasePaymentsParameterForChannel(String channel, String value) {
        WebElement releasePaymentsMenuForChannel = webDriver.findElement(By.xpath("//div[@class='tab-content']//div[./div[text()='" + channel + "']]//div[./label[text()='Release Payments']]//select"));
        Select select = new Select(releasePaymentsMenuForChannel);
        SeleniumWaits.visibilityOf(webDriver, releasePaymentsMenuForChannel);
        JavaScriptExecutors.scrollToElement(webDriver, releasePaymentsMenuForChannel);
        select.selectByVisibleText(value);
        return this;
    }

    public GameRecordPage fillCancellationDeadlinesBeforeDrawTimeOfActiveTab(String minutes) {
        JavaScriptExecutors.clickElementBy(webDriver,
                By.xpath("//div[@role='tabpanel' and @aria-hidden='false']//div[./label[text()='Before Draw Time']]//i[@class='fa fa-trash']"));
        JavaScriptExecutors.clickElementBy(webDriver,
                By.xpath("//div[@role='tabpanel' and @aria-hidden='false']//div[./label[text()='Before Draw Time']]//i[@class='fa fa-edit']"));
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("//h4[text()='Columns 1 - 1000 : Before Draw Time']"));
        webDriver.findElement(By.name("minutes")).clear();
        webDriver.findElement(By.name("minutes")).sendKeys(minutes);
        JavaScriptExecutors.clickElementBy(webDriver, By.xpath("//button[@class='btn btn-danger' and text()='Save']"));
        JavaScriptExecutors.clickElement(webDriver, SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//div[@role='tabpanel' and @aria-hidden='false']//button[@name='saveButton']")));
        JavaScriptExecutors.clickElement(webDriver, SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//div[@class='rrt-confirm animated fadeIn']//button[text()='Yes']")));
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("//div[@class='alert alert-success']//span[text()='Save Done']"));
        JavaScriptExecutors.clickElementBy(webDriver, By.xpath("//div[@role='tabpanel' and @aria-hidden='false']//button[@name='activateButton']"));
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("//div[@class='alert alert-success']//span[text()='Channel Record Activated']"));
        return this;
    }

    public String getReleasePaymentsParameterForChannel(String channel) {
        Select select = new Select(webDriver.findElement(By.xpath("//div[@class='tab-content']//div[./div[text()='" + channel + "']]//div[./label[text()='Release Payments']]//select")));
        return select.getFirstSelectedOption().getAttribute("innerHTML");
    }

    public GameRecordPage fillAutoPaymentDrawTimeOffset(String channel, String value) {
        WebElement autoPaymentDrawTimeOffsetForChannel = webDriver.findElement(By.xpath("//div[@class='tab-content']//div[./div[text()='" + channel + "']]//div[./label[text()='Draw Time Offset']]//input"));
        autoPaymentDrawTimeOffsetForChannel.sendKeys(value);
        return this;
    }

    public GameRecordPage fillDrawBreak(String valueDrawBreak) {
        JavaScriptExecutors.clickElement(webDriver, drawBreakDeleteButton);
        JavaScriptExecutors.clickElement(webDriver, drawBreakEditButton);
        SeleniumWaits.elementToBeClickable(webDriver, drawBreakInputSeconds);
        drawBreakInputSeconds.sendKeys(valueDrawBreak);
        JavaScriptExecutors.clickElement(webDriver, drawBreakSaveButton);
        return this;
    }

    public GameRecordPage clickDeleteButtonDrawBreak() {
        JavaScriptExecutors.clickElement(webDriver, drawBreakDeleteButton);
        return this;
    }

    public GameRecordPage clickDeleteButtonSalesStartOnlineParticipationChannel() {
        JavaScriptExecutors.clickElement(webDriver, salesStartDeleteButtonParticipationOnlineChannel);
        return this;
    }

    public GameRecordPage clickDeleteButtonSalesEndOnlineParticipationChannel() {
        JavaScriptExecutors.clickElement(webDriver, salesEndDeleteButtonParticipationOnlineChannel);
        return this;
    }

    public GameRecordPage fillSalesStartValueForChannel(String channel, String valueSalesStart) {
        String tabId = webDriver.findElement(By.xpath("//a[div[text()='" + channel + "']]")).getAttribute("id");
        String tabNumber = tabId.substring(tabId.length() - 1);
        WebElement editButtonSalesStartOnlineChannel = webDriver.findElement(
                By.xpath("//*[@id='tabswrapper2-pane-" + tabNumber + "']/div/div[4]/div[2]/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div/span/button[2]"));
        JavaScriptExecutors.clickElement(webDriver, editButtonSalesStartOnlineChannel);
        SeleniumWaits.elementToBeClickable(webDriver, inputSecondsSalesStartOnlineChannel);
        inputSecondsSalesStartOnlineChannel.sendKeys(valueSalesStart);
        JavaScriptExecutors.clickElement(webDriver, salesStartSaveButton);
        return this;
    }

    public GameRecordPage fillSalesEndValueForChannel(String channel, String valueSalesStart) {
        String tabId = webDriver.findElement(By.xpath("//a[div[text()='" + channel + "']]")).getAttribute("id");
        String tabNumber = tabId.substring(tabId.length() - 1);
        WebElement editButtonSalesEndOnlineChannel = webDriver.findElement(
                By.xpath("//*[@id='tabswrapper2-pane-" + tabNumber + "']/div/div[4]/div[2]/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/span/button[2]"));
        JavaScriptExecutors.clickElement(webDriver, editButtonSalesEndOnlineChannel);
        SeleniumWaits.elementToBeClickable(webDriver, inputSecondsSalesStartOnlineChannel);
        inputSecondsSalesStartOnlineChannel.sendKeys(valueSalesStart);
        JavaScriptExecutors.clickElement(webDriver, salesStartSaveButton);
        return this;
    }

    public GameRecordPage fillSalesEndValueOnlineChannel(String valueSalesStart) {
        SeleniumWaits.elementToBeClickable(webDriver, inputSecondsSalesEndOnlineChannel);
        inputSecondsSalesEndOnlineChannel.sendKeys(valueSalesStart);
        JavaScriptExecutors.clickElement(webDriver, salesEndSaveButton);
        return this;
    }

    public String getDrawBreakValue() {
        return drawBreakValue.getAttribute("defaultValue");
    }

    public String getSalesStartValueForChannel(String channel) {
        String tabId = webDriver.findElement(By.xpath("//a[div[text()='" + channel + "']]")).getAttribute("id");
        String tabNumber = tabId.substring(tabId.length() - 1);
        WebElement salesStartField = webDriver.findElement(By.xpath("//*[@id='tabswrapper2-pane-" + tabNumber + "']/div/div[4]/div[2]/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div/input"));
        return salesStartField.getAttribute("value");
    }

    public String getSalesEndValueForChannel(String channel) {
        String tabId = webDriver.findElement(By.xpath("//a[div[text()='" + channel + "']]")).getAttribute("id");
        String tabNumber = tabId.substring(tabId.length() - 1);
        WebElement salesEndField = webDriver.findElement(By.xpath("//*[@id='tabswrapper2-pane-" + tabNumber + "']/div/div[4]/div[2]/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/input"));
        return salesEndField.getAttribute("value");
    }

    public GameRecordPage clearAutoPaymentDrawTimeOffsetForGameChannel(String channel) {
        WebElement autoPaymentDrawTimeOffsetForChannel = webDriver.findElement(By.xpath("//div[@class='tab-content']//div[./div[text()='" + channel + "']]//div[./label[text()='Draw Time Offset']]//input"));
        autoPaymentDrawTimeOffsetForChannel.clear();
        return this;
    }

    public GameRecordPage fillAutoPaymentInterval(String channel, String value) {
        WebElement autoPaymentInterval = webDriver.findElement(By.xpath("//div[@class='tab-content']//div[./div[text()='" + channel + "']]//div[./label[text()='Interval']]//input"));
        autoPaymentInterval.sendKeys(value);
        return this;
    }

    public GameRecordPage clearAutoPaymentInterval(String channel) {
        WebElement autoPaymentInterval = webDriver.findElement(By.xpath("//div[@class='tab-content']//div[./div[text()='" + channel + "']]//div[./label[text()='Interval']]//input"));
        autoPaymentInterval.clear();
        return this;
    }

    public GameRecordPage expandGeneralSettings() {
        SeleniumWaits.elementToBeClickable(webDriver, generalSettings);
        JavaScriptExecutors.clickElement(webDriver, generalSettings);
        return this;
    }

    public GameRecordPage expandDrawParameters() {
        SeleniumWaits.elementToBeClickable(webDriver, drawParameters);
        JavaScriptExecutors.clickElement(webDriver, drawParameters);
        return this;
    }

    public boolean isPilotFlagSelected() {
        return pilotCheckbox.isSelected();
    }

    public GameRecordPage tickPilotFlag() {
        JavaScriptExecutors.clickElement(webDriver, pilotCheckbox);
        return this;
    }

    public boolean isExchangeCheckBoxSelected() {
        return exchangeCheckBox.isSelected();
    }

    public String getGameCode() {
        SeleniumWaits.elementToBeClickable(webDriver, gameCode);
        return gameCode.getText();
    }

    public String getMaximumFutureDraws() {
        return maximumFutureDrawsInput.getAttribute("value");
    }

    public GameRecordPage deleteGameRecord() {
        SeleniumWaits.elementToBeClickable(webDriver, deleteGameRecordButton);
        JavaScriptExecutors.clickElement(webDriver, deleteGameRecordButton);
        SeleniumWaits.visibilityOf(webDriver, deleteGameRecordConfirmationModal);
        JavaScriptExecutors.clickElement(webDriver, deleteGameRecordConfirmationModalYesOption);
        SeleniumWaits.presenceOfElementLocated(webDriver, SUCCESSFUL_GAME_RECORD_DELETION);
        return this;
    }

    public GameRecordPage clickEditButtonSalesStartForChannel(String channel) {
        String tabId = webDriver.findElement(By.xpath("//a[div[text()='" + channel + "']]")).getAttribute("id");
        String tabNumber = tabId.substring(tabId.length() - 1);
        WebElement editButtonSalesStartOnlineChannel = webDriver.findElement(By.xpath(
                "//*[@id='tabswrapper2-pane-" + tabNumber + "']/div/div[4]/div[2]/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div/span/button[2]"));
        SeleniumWaits.elementToBeClickable(webDriver, editButtonSalesStartOnlineChannel);
        JavaScriptExecutors.clickElement(webDriver, editButtonSalesStartOnlineChannel);
        return this;
    }

    public GameRecordPage clickEditButtonSalesEndForChannel(String channel) {
        String tabId = webDriver.findElement(By.xpath("//a[div[text()='" + channel + "']]")).getAttribute("id");
        String tabNumber = tabId.substring(tabId.length() - 1);
        WebElement editButtonSalesEndOnlineChannel = webDriver.findElement(By.xpath(
                "//*[@id='tabswrapper2-pane-" + tabNumber + "']/div/div[4]/div[2]/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/span/button[2]"));
        SeleniumWaits.elementToBeClickable(webDriver, editButtonSalesEndOnlineChannel);
        JavaScriptExecutors.clickElement(webDriver, editButtonSalesEndOnlineChannel);
        return this;
    }

    public GameRecordPage fillInputSecondsForSalesStart() {
        JavaScriptExecutors.clickElement(webDriver, inputSecondsSalesStartOnlineChannel);
        return this;
    }

    public GameRecordPage fillInputSecondsForSalesEnd() {
        JavaScriptExecutors.clickElement(webDriver, inputSecondsSalesEndOnlineChannel);
        return this;
    }

    public String getBeforeDrawTimeValueFromVisibleTab() {
        SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//div[@role='tabpanel' and @aria-hidden='false']//button[@name='saveAllOperatorsButton']"));
        SeleniumWaits.visibilityOf(webDriver, beforeDrawTimeValue);
        return beforeDrawTimeValue.getAttribute("defaultValue");
    }

}
