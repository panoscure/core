package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

import java.util.List;

public class OverviewPage extends PageObject {

    @FindBy(xpath = "//*[@id='gameOverviewTab-pane-1']/div/div/div[1]/div[2]/form/div/div/div/div/div[1]/div[1]/div/div")
    private WebElement filter;

    @FindBy(xpath = "//*[@id='gameOverviewTab-pane-1']/div/div/div[1]/div[2]/form/div/div/div/div/div[1]/div[1]//input")
    private WebElement gameInput;

    @FindBy(xpath = "//*[@id='gameOverviewTab-pane-1']/div/div/div[1]/div[2]/form/div/div/div/div/div[2]/button[2]")
    private WebElement searchBtn;

    @FindBy(xpath = "//*[@id='gameOverviewTab-pane-1']/div/div/div[3]/table[1]/tbody/tr/td[3]")
    private WebElement name;

    @FindBy(xpath = "//*[@id='gameOverviewTab-pane-1']/div/div/div[3]/table[1]/tbody/tr[2]/td/div/div/div/table/tbody/tr/td[10]/div/a[2]/span")
    private WebElement editBtn;

    @FindBy(xpath = "//*[@id='gameOverviewTab-pane-1']/div/div/div[3]/table[1]/tbody/tr[2]/td/div/div/div/table/tbody/tr/td[10]/div/a[1]/span")
    private WebElement viewBtn;

    @FindBy(xpath = "//*[@id='app-main']/div/div[1]/div[2]/button[1]")
    private WebElement addNewBtn;

    @FindBy(xpath = "//*[@id='app-main']/div/div[1]/div[2]/button[2]")
    private WebElement importBtn;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[3]/button[2]")
    private WebElement deleteRecordConfirmDialogueBtn;


    public OverviewPage(WebDriver webDriver) {
        super(webDriver);
    }

    public OverviewPage clickGameFilter() {
        JavaScriptExecutors.scrollToElement(webDriver, filter);
        SeleniumWaits.elementToBeClickable(webDriver, filter);
        filter.click();
        return this;
    }

    public OverviewPage fillGameName(int gameCode) {
        SeleniumWaits.elementToBeClickable(webDriver, gameInput);
        gameInput.sendKeys(gameCode + "\n");
        return this;
    }

    public String getSelectedAutomationRecordName() {
        return gameInput.getAttribute("value");
    }

    public String getGameName() {
        return name.getText();
    }

    public OverviewPage clickSearchButton() {
        SeleniumWaits.elementToBeClickable(webDriver, searchBtn);
        JavaScriptExecutors.clickElement(webDriver, searchBtn);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, By.className("block-ui-container"));
        return this;
    }

    public OverviewPage clickAddNewButton() {
        SeleniumWaits.elementToBeClickable(webDriver, addNewBtn);
        JavaScriptExecutors.clickElement(webDriver, addNewBtn);
        return this;
    }

    public ImportGameRecordPage clickImportButton() {
        SeleniumWaits.elementToBeClickable(webDriver, importBtn);
        JavaScriptExecutors.clickElement(webDriver, importBtn);
        return new ImportGameRecordPage(webDriver);
    }

    public OverviewPage expandGameRecord(int gameId) {
        WebElement expandGameElement = webDriver.findElement(By.xpath("//*[@id='gameOverviewTab-pane-1']/div/div/div[3]/table[1]/tbody/tr/td[1]/button/span"));
        WebElement gameIdElement = webDriver.findElement(By.xpath("//*[@id='gameOverviewTab-pane-1']/div/div/div[3]/table[1]/tbody/tr/td[2]"));
        SeleniumWaits.textToBe(webDriver, gameIdElement, String.valueOf(gameId));
        SeleniumWaits.elementToBeClickable(webDriver, expandGameElement);
        JavaScriptExecutors.clickElement(webDriver, expandGameElement);
        return this;
    }

    public OverviewPage deleteDraftGameRecords() {
        List<WebElement> gameRecordsDeleteButton = webDriver.findElements(
                By.xpath("//div[@id='gameOverviewTab-pane-1']//tr[.//span[text()='Draft']]//button[.//span[@title='Delete']]"));
        while (!gameRecordsDeleteButton.isEmpty()) {
            JavaScriptExecutors.clickElement(webDriver, gameRecordsDeleteButton.get(0));
            JavaScriptExecutors.clickElement(webDriver, deleteRecordConfirmDialogueBtn);
            SeleniumWaits.visibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
            gameRecordsDeleteButton = webDriver.findElements(
                    By.xpath("//div[@id='gameOverviewTab-pane-1']//tr[.//span[text()='Draft']]//button[.//span[@title='Delete']]"));
        }
        return this;
    }

    public GameRecordPage clickEditButton() {
        SeleniumWaits.visibilityOf(webDriver, editBtn);
        JavaScriptExecutors.clickElement(webDriver, editBtn);
        SeleniumWaits.visibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        return new GameRecordPage(webDriver);
    }

    public GameRecordPage clickViewButton() {
        SeleniumWaits.elementToBeClickable(webDriver, viewBtn);
        JavaScriptExecutors.clickElement(webDriver, viewBtn);
        SeleniumWaits.visibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        return new GameRecordPage(webDriver);
    }

}
