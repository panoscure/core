package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

import java.io.File;


public class ImportGameRecordPage extends PageObject {

    protected static final By SUCCESSFUL_GAME_IMPORT_ALERT_MESSAGE =
            By.xpath("//*[@class = 'top-right']//*[text()='rsImportGameRecordSuccess']");

    @FindBy(xpath = "//*[@id='app-main']/div[3]/div/div/div[2]/div[1]/input")
    private WebElement importFileInput;

    @FindBy(name = "gameId")
    private WebElement gameIdSelectDropdown;

    @FindBy(name = "newGameName")
    private WebElement newGameNameInput;

    @FindBy(xpath = "//*[@id='app-main']/div[3]/div/div/div[2]/div[4]/button")
    private WebElement importBtn;

    @FindBy(name = "customGameCode")
    private WebElement customGameCodeInput;

    @FindBy(xpath = "//*[@id='app-main']/div[3]/div/div/div[2]/div[5]/a")
    private WebElement goToNewGameRecordButton;


    public ImportGameRecordPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ImportGameRecordPage chooseFile(String pathname) {
        SeleniumWaits.elementToBeClickable(webDriver, importFileInput);
        File file = new File(pathname);
        importFileInput.sendKeys(file.getAbsolutePath());
        return this;
    }

    public ImportGameRecordPage fillGameId(String gameIdValue) {
        Select gameId = new Select(gameIdSelectDropdown);
        gameId.selectByValue(gameIdValue);
        return this;
    }

    public ImportGameRecordPage fillNewGameName(String newGameNameValue) {
        newGameNameInput.sendKeys(newGameNameValue);
        return this;
    }

    public ImportGameRecordPage fillCustomGameCode(String customGameCodeValue) {
        customGameCodeInput.sendKeys(customGameCodeValue);
        return this;
    }

    public ImportGameRecordPage clickImportButton() {
        SeleniumWaits.elementToBeClickable(webDriver, importBtn);
        JavaScriptExecutors.clickElement(webDriver, importBtn);
        SeleniumWaits.presenceOfElementLocated(webDriver, SUCCESSFUL_GAME_IMPORT_ALERT_MESSAGE);
        return this;
    }

    public GameRecordPage clickGoToNewGameRecordButton() {
        SeleniumWaits.elementToBeClickable(webDriver, goToNewGameRecordButton);
        JavaScriptExecutors.clickElement(webDriver, goToNewGameRecordButton);
        return new GameRecordPage(webDriver);
    }

}
