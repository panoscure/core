package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;

import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ModifyDrawTimePage extends PageObject {

    private String activeDraw;

    @FindBy(xpath = "//div[./label[text()='Draw Time']]//input")
    private WebElement dateInput;

    @FindBy(xpath = "//*[@id='uncontrolled-tab-example-pane-mdt']/div/div/div/div/form/div[1]/div/p")
    private WebElement activeDrawElement;

    @FindBy(xpath = "//*[@id='uncontrolled-tab-example-pane-mdt']/div/div/div/div/form/div[5]/div/button")
    private WebElement saveButton;

    @FindBy(name = "game")
    private WebElement dropdownGames;


    public ModifyDrawTimePage(WebDriver webDriver) {
        super(webDriver);
    }


    public ModifyDrawTimePage selectGame(String gameId) {
        selectFromDropdownByValue(dropdownGames, gameId);
        return this;
    }

    public ModifyDrawTimePage selectActiveDraw() {
        WebElement dropdownDraws = SeleniumWaits.visibilityOfElementLocated(webDriver, By.name("draw"));
        Select selectMenu = new Select(dropdownDraws);
        selectMenu.selectByIndex(1);
        activeDraw = activeDrawElement.getText();
        return this;
    }

    public ModifyDrawTimePage modifyDrawTime(int secondsToClose) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        dateInput.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        dateInput.sendKeys(LocalDateTime.now().plusSeconds(secondsToClose).format(formatter));
        return this;
    }

    public String clickModifyButton() {
        JavaScriptExecutors.clickElement(webDriver, saveButton);
        SeleniumWaits.presenceOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        return activeDraw;
    }

}
