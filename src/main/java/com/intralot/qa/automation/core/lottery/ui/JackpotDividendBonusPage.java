package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;

import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class JackpotDividendBonusPage extends PageObject {

    private By alertSuccessMessageTopRight = By.xpath("//*[@class='rrt-middle-container']//div[.='OK']");

    @FindBy(xpath = "(//select[@name='gameId'])[1]")
    private WebElement gamesDropDown;

    @FindBy(name = "drawId")
    private WebElement drawInput;

    @FindBy(xpath = "//*[@id='uncontrolled-tab-example-pane-jdb']//button[.='Load']")
    private WebElement fetchPrizeCategoriesBtn;

    @FindBy(xpath = "//*[@id='uncontrolled-tab-example-pane-jdb']//div[1]/div[3]/div/div/input[@name='dividentAmount']")
    private WebElement dividendAmountFirstWinningCategory;

    @FindBy(xpath = "//*[@id='uncontrolled-tab-example-pane-jdb']//button[.='Save']")
    private WebElement saveBtn;

    public JackpotDividendBonusPage(WebDriver webDriver) {
        super(webDriver);
    }

    public JackpotDividendBonusPage selectGameId(String gameId) {
        selectFromDropdownByValue(gamesDropDown, gameId);
        //*[@id="uncontrolled-tab-example-pane-3"]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[1]/div/select/option[contains(text(),'LuckyDay (1109.101)')]
        SeleniumWaits.visibilityOfElementLocated(webDriver, alertSuccessMessageTopRight);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, alertSuccessMessageTopRight);
        return this;
    }

    public JackpotDividendBonusPage fillDrawId(int drawId) {
        drawInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        drawInput.sendKeys(String.valueOf(drawId));
        return this;
    }

    public JackpotDividendBonusPage clickFetchPrizeCategories() {
        SeleniumWaits.elementToBeClickable(webDriver, fetchPrizeCategoriesBtn);
        JavaScriptExecutors.clickElement(webDriver, fetchPrizeCategoriesBtn);
        SeleniumWaits.visibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        SeleniumWaits.elementToBeClickable(webDriver, dividendAmountFirstWinningCategory);
        return this;
    }

    public JackpotDividendBonusPage clickLoad() {
        SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(By.xpath("(//button[text()='Load'])[1]"))).click();
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("//div[contains(text(),'FetchWinningCategoriesSuccess')]"));
        return this;
    }

    public JackpotDividendBonusPage fillDividendAmountForCategory(int category, String amount) {
        WebElement dividendAmount = webDriver.findElement(By.xpath("//*[@id='uncontrolled-tab-example-pane-jdb']//div[" + category + "]/div[3]/div/div/input[@name='dividentAmount']"));
        dividendAmount.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        dividendAmount.sendKeys(amount);
        return this;
    }

    public void clickSaveBtn() {
        JavaScriptExecutors.clickElement(webDriver, saveBtn);
        SeleniumWaits.visibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
    }

}
