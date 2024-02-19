package com.intralot.qa.automation.core.lottery.ui.croatia;

import com.intralot.qa.automation.core.lottery.ui.SummaryDrawPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;

public class SummaryDrawPageCroatia extends SummaryDrawPage {

    @FindBy(xpath = "//div[//label[text()='Visual Draw']]/input")
    private WebElement drawInput;

    public SummaryDrawPageCroatia(WebDriver webDriver) {
        super(webDriver);
    }

    public SummaryDrawPageCroatia selectVisualDraw(int visualDraw) {
        SeleniumWaits.visibilityOf(webDriver, this.drawInput);
        this.drawInput.clear();
        this.drawInput.sendKeys(String.valueOf(visualDraw));
        return this;
    }

}
