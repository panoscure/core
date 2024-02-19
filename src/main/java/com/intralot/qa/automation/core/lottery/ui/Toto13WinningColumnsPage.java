package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;

public class Toto13WinningColumnsPage extends WinningColumnsPage {

    public Toto13WinningColumnsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public WinningColumnsPage pickWinningNumbers(String winningNumbers) {
        System.out.println("Inserting winning numbers");
        String[] resultsArray = winningNumbers.replaceAll("\\[", "").replaceAll("\\]", "").split("\\s*,\\s*");
        pickToto13Matches(resultsArray);
        return this;
    }

    private void pickToto13Matches(String[] results) {
        for (int i = 0; i < results.length; i++) {
            WebElement selection = webDriver.findElement(By.xpath(
                    "//*[@id='app-main']//table/tbody/tr[" + (i + 1) + "]/td[6]/div/a[.='" + results[i] + "']"));
            JavaScriptExecutors.clickElement(webDriver, selection);
        }
    }
}
