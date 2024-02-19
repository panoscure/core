package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class DrawOperationsPage extends PageObject {

    @FindBy(linkText = "Jackpot Dividend Bonus")
    private WebElement jackpotDividendBonus;

    @FindBy(linkText = "Modify Draw Time")
    private WebElement modifyDrawTime;

    @FindBy(linkText = "Modify Draw Status")
    private WebElement modifyStatusTab;

    public DrawOperationsPage(WebDriver webDriver) {
        super(webDriver);
    }

    // ------------------ Jackpot Dividend Bonus ------------------ //
    public JackpotDividendBonusPage clickJackpotDividendBonus() {
        SeleniumWaits.elementToBeClickable(webDriver, jackpotDividendBonus);
        jackpotDividendBonus.click();
        return new JackpotDividendBonusPage(webDriver);
    }

    // ------------------ Modify Draw Time ------------------ //
    public ModifyDrawTimePage clickModifyDrawTime() {
        SeleniumWaits.elementToBeClickable(webDriver, modifyDrawTime);
        JavaScriptExecutors.clickElement(webDriver, modifyDrawTime);
        return new ModifyDrawTimePage(webDriver);
    }

    public ModifyDrawStatusPage clickModifyDrawStatusTab() {
        SeleniumWaits.elementToBeClickable(webDriver, modifyStatusTab);
        modifyStatusTab.click();
        return new ModifyDrawStatusPage(webDriver);
    }
}
