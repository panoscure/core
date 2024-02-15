package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class RafflesPage extends PageObject {

    public RafflesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ManualInsertTab clickManualInsertTab() {
        SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(By.xpath("//a[text()='Manual Insert']"))).click();
        return new ManualInsertTab(webDriver);
    }

    public InformationTab clickInformationTab() {
        SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(By.xpath("//a[text()='Information']"))).click();
        return new InformationTab(webDriver);
    }

    public OperationsTab clickOperationsTab() {
        SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(By.xpath("//a[text()='Operations']"))).click();
        return new OperationsTab(webDriver);
    }

}
