package com.intralot.qa.automation.core.lottery.ui.croatia;

import com.intralot.qa.automation.core.lottery.ui.CheckWinningsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckWinningsPageCroatia extends CheckWinningsPage {

    public CheckWinningsPageCroatia(WebDriver webDriver) {
        super(webDriver);
    }

    public String getTotalGrossAmount() {
        By barcodeId = By.xpath("(//table)[2]/tbody/tr[1]/td[7]");
        return webDriver.findElement(barcodeId).getText();
    }

    public String getFirstGrossAmount() {
        By barcodeId = By.xpath("((//tbody)[2]//tr/td[6])[1]");
        return webDriver.findElement(barcodeId).getText();
    }

    public String getSecondGrossAmount() {
        By barcodeId = By.xpath("((//tbody)[2]//tr/td[6])[2]");
        return webDriver.findElement(barcodeId).getText();
    }

    public int getNumberOfDraws() {
        By draws = By.xpath("(//tbody)[2]//tr");
        return webDriver.findElements(draws).size();
    }
}
