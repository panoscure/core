package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;

import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class SummaryDrawPage extends PageObject {

    @FindBy(xpath = "//div[//label[text()='Draw']]/input")
    private WebElement drawInput;

    /** LuckyDay - Summary Draw - Match 4/6 Winners */
    @FindBy(xpath = "//*[@id='app-main']/div[2]/div/div/div[3]/table/tbody/tr/td[2][contains(text(),'4/6')]//following-sibling::td[1]")
    private WebElement match4Of6CategoryWinneres;

    /** LuckyDay - Summary Draw - Match 4/8 Winners */
    @FindBy(xpath = "//*[@id='app-main']/div[2]/div/div/div[3]/table/tbody/tr[20]/td[3]")
    private WebElement match4Of8CategoryWinneres;

    @FindBy(xpath = "//*[@id='app-main']/div[2]/div/div/div[2]/table/tbody/tr/td[8]")
    private WebElement drawWinners;

    @FindBy(xpath = "//*[@id='app-main']/div[2]/div/div/div[2]/table/tbody/tr/td[4]")
    private WebElement drawStatus;

    @FindBy(xpath = "//*[@id='app-main']/div[2]/div/div/div[2]/table/tbody/tr/td[7]/ol/li")
    private WebElement winningNumbers;

    @FindBy(xpath = "//button[text()='Search']")
    private WebElement searchButton;

    public SummaryDrawPage(WebDriver webDriver) {
        super(webDriver);
    }

//    public SummaryDrawPage selectGame(int code) {
//        SeleniumWaits.elementToBeClickable(webDriver, By.name("game"));
//        new WebDriverWait(webDriver, WEB_DRIVER_WAIT_TIMEOUT)
//                .until(ExpectedConditions.presenceOfNestedElementsLocatedBy(By.name("game"), By.xpath("//*[@value='" + code + "']")));
//        selectFromDropdownByValue(By.name("game"), String.valueOf(code));
//        SeleniumWaits.invisibilityOfElementLocated(webDriver, By.className("block-ui-container"));
//        return this;
//    }

    public SummaryDrawPage selectDate() {
        By calendarButton = By.xpath("//*[@id='app-main']/div[2]/div/div/div[1]/div[2]/form/div/div/div/div/div[2]/div/div/div[1]/span/span/span");
        SeleniumWaits.elementToBeClickable(webDriver, calendarButton).click();
        WebElement today = webDriver.findElement(By.xpath("//*[contains(@class,'rdtToday')]"));
        SeleniumWaits.visibilityOf(webDriver, today).click();
        SeleniumWaits.presenceOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        return this;
    }

    public SummaryDrawPage selectDraw(int drawNumber) {
        SeleniumWaits.visibilityOf(webDriver, drawInput);
        drawInput.clear();
        drawInput.sendKeys(String.valueOf(drawNumber));
        return this;
    }

    public void clickSearch() {
        SeleniumWaits.elementToBeClickable(webDriver, searchButton);
        JavaScriptExecutors.clickElement(webDriver, searchButton);
        SeleniumWaits.invisibilityOfElementLocated(webDriver, By.className("block-ui-container"));
    }

    public int getVisualDraw() {
        WebElement visualDraw = webDriver.findElement(By.xpath("//*[@id='app-main']/div[2]/div/div/div[2]/table/tbody/tr/td[2]"));
        return Integer.parseInt(visualDraw.getText());
    }

    public int getFourthCategoryWinners() {
        WebElement winners = webDriver.findElement(By.xpath("//*[@id='app-main']/div[2]/div/div/div[3]/table/tbody/tr[4]/td[3]"));
        return Integer.parseInt(winners.getText());
    }

    public int getSixthCategoryWinners() {
        WebElement winners = webDriver.findElement(By.xpath("//*[@id='app-main']/div[2]/div/div/div[3]/table/tbody/tr[6]/td[3]"));
        return Integer.parseInt(winners.getText());
    }

    public int getNinthCategoryWinners() {
        WebElement winners = webDriver.findElement(By.xpath("//*[@id='app-main']/div[2]/div/div/div[3]/table/tbody/tr[9]/td[3]"));
        return Integer.parseInt(winners.getText());
    }

    public int getKenoTwentyEighthCategoryWinners() {
        WebElement winners = webDriver.findElement(By.xpath("//*[@id='app-main']/div[2]/div/div/div[3]/table/tbody/tr[28]/td[3]"));
        return Integer.parseInt(winners.getText());
    }

    public int getMatch4Of6CategoryWinners() {
        return Integer.parseInt(match4Of6CategoryWinneres.getText());
    }

    public int getMatch4Of8CategoryWinners() {
        return Integer.parseInt(match4Of8CategoryWinneres.getText());
    }

    public int getDrawWinners() {
        return Integer.parseInt(drawWinners.getText());
    }

    public String getDrawStatus() {
        return drawStatus.getText();
    }

    public String getWinningNumbers() {
        return winningNumbers.getText();
    }

    public String getDividentAmount(int category) {
        WebElement divident = webDriver.findElement(By.xpath("//*[@id='app-main']/div[2]/div/div/div[3]/table/tbody/tr["+category+"]/td[5]"));
        return divident.getText();
    }
}
