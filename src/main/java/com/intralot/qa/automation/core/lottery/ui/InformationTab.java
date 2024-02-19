package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

import java.util.List;

public class InformationTab extends PageObject {

    public InformationTab(WebDriver webDriver) {
        super(webDriver);
    }

    public InformationTab selectExtraDraw(String extraDraw) {
        WebElement dropDown = SeleniumWaits.visibilityOfAllElementsLocatedBy(webDriver, By.name("raffleDraw")).get(1);
        selectFromDropdownByValue(dropDown, extraDraw);
        return this;
    }

    public InformationTab clickSearch() {
        SeleniumWaits.invisibilityOfElementLocated(webDriver, FETCHING_DATA_LOADER);
        SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[text()='Search']")).click();
        SeleniumWaits.visibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        return this;
    }

    public InformationTab clickManage() {
        SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[text()='Manage']")).click();
        return this;
    }

    public InformationTab submitOneWinner(String leftLimit, int tab) {
        SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//*[@id='winnersTab-pane-key" + tab + "']/div/div/div/textarea"))
                .sendKeys(leftLimit);
        return this;
    }

    public InformationTab clickSecondCategoryTab() {
        webDriver.findElement(By.xpath("//*[@id='winnersTab-tab-key2']/span")).click();
        return this;
    }

    public InformationTab submitTwoWinners(String leftLimit, String rightLimit) {
        WebElement input = webDriver.findElement(By.xpath("//textarea"));
        input.sendKeys(leftLimit);
        input.sendKeys(Keys.RETURN);
        input.sendKeys(rightLimit);

        SeleniumWaits.visibilityOfAllElementsLocatedBy(webDriver, By.xpath("//textarea[contains(text(),'" + leftLimit + "') and contains(text(),'" + rightLimit + "')]"));
        return this;
    }

    public InformationTab submitWinners(List<Integer> limits) {

        WebElement input = webDriver.findElement(By.xpath("//textarea"));

        for (Integer limit : limits) {
            input.sendKeys(String.valueOf(limit));
            input.sendKeys(Keys.RETURN);

            SeleniumWaits.visibilityOfAllElementsLocatedBy(webDriver, By.xpath("//textarea[contains(text(),'" + limit + "')]"));
        }
        return this;
    }

    public void clickOnSave() {
        SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//div[@role='dialog']//button[text()='Save']"))
                .click();
        SeleniumWaits.visibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
    }
}
