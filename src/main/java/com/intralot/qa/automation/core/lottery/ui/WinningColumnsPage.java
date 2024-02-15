package com.intralot.qa.automation.core.lottery.ui;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public abstract class WinningColumnsPage extends PageObject {

    @FindBy(xpath = "//*[@id='app-main']/div/div[2]/div/div[1]/div[2]/div/div/form/div/div[1]/div/div")
    private WebElement selectGame;

    @FindBy(xpath = "//*[@id='app-main']/div/div[2]/div/div[1]/div[2]/div/div/form/div/div[1]/div/div//input")
    private WebElement gameName;

    @FindBy(xpath = "//button[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@id='app-main']//div[@class='l10-wn-switch-wrapper']/div/div[@class='react-switch-bg']")
    private WebElement manualInsertCheckbox;

    public WinningColumnsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WinningColumnsPage clickGameDropdown() {
        SeleniumWaits.elementToBeClickable(webDriver, selectGame);
        selectGame.click();
        return this;
    }

    public WinningColumnsPage fillGameName(String code) {
        SeleniumWaits.elementToBeClickable(webDriver, gameName);
        gameName.sendKeys(code + "\n");
        SeleniumWaits.invisibilityOfElementLocated(webDriver, By.className("block-ui-container"));
        SeleniumWaits.invisibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        return this;
    }

    public void clickSaveButton() {
        SeleniumWaits.elementToBeClickable(webDriver, saveButton);
        JavaScriptExecutors.clickElement(webDriver, saveButton);
        SeleniumWaits.presenceOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
    }

    public abstract WinningColumnsPage pickWinningNumbers(String winningNumbers);

    public boolean isSaveButtonPresent() {
        By saveButtonXPath = By.xpath("//button[text()='Save']");
        try {
            return SeleniumWaits.visibilityOfElementLocated(webDriver, saveButtonXPath)
                    .isDisplayed();
        } catch (TimeoutException notFound) {
            return false;
        }
    }

    public WinningColumnsPage allowManualInsert() {
        SeleniumWaits.elementToBeClickable(webDriver, manualInsertCheckbox);
        JavaScriptExecutors.scrollToElement(webDriver, manualInsertCheckbox);
        manualInsertCheckbox.click();
        return this;
    }
}
