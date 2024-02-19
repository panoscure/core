package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

import java.time.Duration;

public class ReleasePaymentsPage extends PageObject {

    @FindBy(xpath = "//button[text()='Release Payments']")
    private WebElement releasePaymentsButton;

    @FindBy(xpath = "//button[text()='Modify Draw Status']")
    private WebElement modifyDrawStatusButton;

    public ReleasePaymentsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ReleasePaymentsPage selectGame(String code) {
        By gameDropDown = By.xpath("//select[@name='game']");
        WebElement gameDropDownElement = webDriver.findElement(gameDropDown);
        SeleniumWaits.elementToBeClickable(webDriver, gameDropDownElement);
        gameDropDownElement.click();

        Select selectGameMenu = new Select(gameDropDownElement);
        new FluentWait<>(webDriver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(100))
                .until((webDriver -> (selectGameMenu.getOptions().size() > 1)));
        selectGameMenu.selectByValue(code);

        new WebDriverWait(webDriver, WEB_DRIVER_WAIT_TIMEOUT)
                .until(ExpectedConditions.presenceOfNestedElementsLocatedBy(gameDropDown, By.xpath("//*[@value=" + code + "]")));

        selectFromDropdownByValue(gameDropDown, code);
        SeleniumWaits.presenceOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        return new ReleasePaymentsPage(webDriver);
    }

    public ReleasePaymentsPage clickActionsButton(String drawId) {
        By actionsButton = By.xpath("//td[text()='" + drawId + "'][1]/following-sibling::td[4]//button");
        SeleniumWaits.elementToBeClickable(webDriver, actionsButton);
        JavaScriptExecutors.clickElementBy(webDriver, actionsButton);
        return this;
    }

    public ReleasePaymentsPage clickViewButton(String drawId) {
        WebElement viewButton = webDriver.findElement(By.xpath("//td[text()='" + drawId + "'][1]/following-sibling::td[4]//a"));
        SeleniumWaits.elementToBeClickable(webDriver, viewButton);
        JavaScriptExecutors.clickElement(webDriver, viewButton);
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/h4"));
        return this;
    }

    public ReleasePaymentsPage releasePayments() {
        SeleniumWaits.elementToBeClickable(webDriver, releasePaymentsButton).click();
        SeleniumWaits.elementToBeClickable(webDriver, modifyDrawStatusButton).click();
        SeleniumWaits.visibilityOfElementLocated(webDriver, ALERT_SUCCESS_MESSAGE);
        return this;
    }
}
