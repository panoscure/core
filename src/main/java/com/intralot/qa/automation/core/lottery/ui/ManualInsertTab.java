package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;

import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class ManualInsertTab extends PageObject {

    public ManualInsertTab(WebDriver webDriver) {
        super(webDriver);
    }

    public ManualInsertTab selectExtraDraw(String draw) {
        selectFromDropdownByValue(By.xpath("//div[@id='uncontrolled-tab-pane-3']//*[@name='raffleDraw']"), draw);
        return this;
    }

    public ManualInsertTab fillExtraDrawId(Integer extraDrawId) {
        SeleniumWaits.visibilityOfElementLocated(webDriver, By.name("RAFFLE_DRAW")).sendKeys(extraDrawId.toString());
        return this;
    }

    public ManualInsertTab fillExtraDrawDate(String extraDrawDate) {
        SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("//div[@class='rdt']//input")).sendKeys(extraDrawDate);
        return this;
    }

    public ManualInsertTab selectGame(String gameId) {
        By gamesDropdown = By.xpath("//div[./label[text()='Game']]//select");
        selectFromDropdownByValue(gamesDropdown, gameId);
        return this;
    }

    public ManualInsertTab clickPlusSignToAddPrize() {
        WebElement plusButtonElement = webDriver.findElement(By.xpath("//i[@class='fa fa-plus']"));
        JavaScriptExecutors.scrollToElement(webDriver, plusButtonElement);
        clickElement(plusButtonElement);
        return this;
    }

    public ManualInsertTab clearPrizeEntriesExceptLastRow(int lastRowIndex) {

        for (int i = 1; i < lastRowIndex; i++) {
            WebElement prizeRow = webDriver.findElement(By.xpath("//div[@class='row' and ./div[.//p[text()='" + i + "']]]//i[@class='fa fa-trash']"));
            JavaScriptExecutors.scrollToElement(webDriver, prizeRow);
            clickElement(prizeRow);
        }
        return this;
    }

    public ManualInsertTab fillPrizeDescriptionOfCategoryId(int categoryId, String description) {
        webDriver.findElement(By.xpath("//div[@class='row' and ./div[.//p[text()='" + categoryId + "']]]//input[@name='PRIZE_DESCRIPTION']")).sendKeys(description);
        SeleniumWaits.visibilityOfAllElementsLocatedBy(webDriver, By.xpath("//div[@class='row' and ./div[.//p[text()='" + categoryId + "']]]//input[@name='PRIZE_DESCRIPTION' and @value='" + description + "']"));
        return this;
    }

    public ManualInsertTab fillPrizeWinnersOfCategoryId(int categoryId, String winnersNumber) {
        webDriver.findElement(By.xpath("//div[@class='row' and ./div[.//p[text()='" + categoryId + "']]]//input[@name='NUMBER_OF_WINNERS']")).sendKeys(winnersNumber);
        return this;
    }

    public ManualInsertTab fillPrizeGrossAmountOfCategoryId(int categoryId, String grossAmount) {
        webDriver.findElement(By.xpath("//div[@class='row' and ./div[.//p[text()='" + categoryId + "']]]//input[@name='PRIZE_GROSS_AMOUNT']")).sendKeys(grossAmount);
        return this;
    }

    public ManualInsertTab fillPrizeTaxAmountOfCategoryId(int categoryId, String taxAmount) {
        webDriver.findElement(By.xpath("//div[@class='row' and ./div[.//p[text()='" + categoryId + "']]]//input[@name='PRIZE_TAX_AMOUNT']")).sendKeys(taxAmount);
        return this;
    }

    public ManualInsertTab clickSaveButton() throws InterruptedException {
        Thread.sleep(1000);
        WebElement saveButton = SeleniumWaits.elementToBeClickable(webDriver,
                webDriver.findElement(By.xpath("//*[@id='uncontrolled-tab-pane-3']//button[text()='Save']")));
        JavaScriptExecutors.scrollToElement(webDriver, saveButton);
        clickElement(saveButton);
        SeleniumWaits.visibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        return this;
    }
}
