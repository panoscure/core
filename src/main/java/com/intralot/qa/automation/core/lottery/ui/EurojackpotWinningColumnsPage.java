package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;

public class EurojackpotWinningColumnsPage extends WinningColumnsPage {

    public EurojackpotWinningColumnsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public EurojackpotWinningColumnsPage pickWinningNumbers(String winningNumbers) {
        String[] numbers = winningNumbers.split("]", 2);
        pickEurojackpotNumber(1, numbers[0].replaceAll("\\[|\\]", "").split("\\s*,\\s*"));
        pickEurojackpotNumber(2, numbers[1].replaceAll("\\[|\\]", "").split("\\s*,\\s*"));
        return this;
    }

    private void pickEurojackpotNumber(int panel, String[] numbers) {
        for (String number : numbers) {
            WebElement selection = webDriver.findElement(By.xpath(
                    "//*[@id='app-main']/div/div[2]/div/div[2]/div[2]/div[" + panel + "]/div[2]//a[.=" + number + "]"));
            JavaScriptExecutors.clickElement(webDriver, selection);
        }
    }

}