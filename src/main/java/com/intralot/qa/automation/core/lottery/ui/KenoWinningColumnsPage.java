package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;


public class KenoWinningColumnsPage extends WinningColumnsPage {

    public KenoWinningColumnsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public KenoWinningColumnsPage pickWinningNumbers(String winningNumbers) {
        String[] numbers = winningNumbers.split(",");
        System.out.println("Inserting winning numbers");
        pickLuckyDayNumber(numbers);
        return this;
    }

    private void pickLuckyDayNumber(String[] numbers) {
        for (String number : numbers) {
            WebElement selection = webDriver.findElement(By.xpath(
                    "//*[@id='app-main']/div/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[" + number + "]/a"));
            JavaScriptExecutors.clickElement(webDriver, selection);
        }
    }
}
