package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class CheckWinningsPage extends PageObject {

    public CheckWinningsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public CheckWinningsPage fillSerialNumber(String serialNumber) {
        WebElement serialInput = webDriver.findElement(By.xpath("//input[@name='serial']"));
        serialInput.sendKeys(serialNumber);
        return this;
    }

    public CheckWinningsPage fillWagerId(String wagerId) {
        WebElement wagerInput = webDriver.findElement(By.xpath("//input[@name='wagerId']"));
        wagerInput.sendKeys(wagerId);
        return this;
    }

    public void clickSearchButton() {
        By searchBtn = By.xpath("//button[contains(text(), 'Search')]");
        SeleniumWaits.elementToBeClickable(webDriver, searchBtn).click();
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("(//table)[2]/tbody/tr[1]/td[2]"));
    }

    public String getBarcodeId() {
        By barcodeId = By.xpath("(//table)[2]/tbody/tr[1]/td[2]");
        return webDriver.findElement(barcodeId).getText();
    }

    public String getTotalGrossAmount() {
        By barcodeId = By.xpath("(//table)[2]/tbody/tr[1]/td[6]");
        return webDriver.findElement(barcodeId).getText();
    }

    public String getFirstGrossAmount() {
        By barcodeId = By.xpath("//*[@id='app-main']/div/div[2]/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr[2]/td/div/div/div[1]/div[2]/table/tbody/tr[1]/td[5]");
        return webDriver.findElement(barcodeId).getText();
    }

    public String getSecondGrossAmount() {
        By barcodeId = By.xpath("//*[@id='app-main']/div/div[2]/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr[2]/td/div/div/div[1]/div[2]/table/tbody/tr[2]/td[5]");
        return webDriver.findElement(barcodeId).getText();
    }

    public void expandTable() {
        By plusIcon = By.xpath("//*[@id='app-main']//table[@class='table table-striped table-hover']/tbody/tr[1]/td[1]");
        SeleniumWaits.elementToBeClickable(webDriver, plusIcon).click();
    }

    public int getNumberOfDraws() {
        By draws = By.xpath("//*[@id='app-main']/div/div[2]/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr[2]/td/div/div/div[1]/div[2]/table/tbody/tr/td[2]");
        return webDriver.findElements(draws).size();
    }
}
