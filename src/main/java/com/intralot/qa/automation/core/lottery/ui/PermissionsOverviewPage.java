package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class PermissionsOverviewPage extends PageObject {

    @FindBy(linkText = "Winning Numbers")
    private WebElement winningNumbersTab;

    private By alertMessageOnRoleChange = By.xpath("//div[text()='Role has changed']");

    public PermissionsOverviewPage(WebDriver webDriver) {
        super(webDriver);
    }

    public PermissionsOverviewPage clickWinningNumbersTab() {
        JavaScriptExecutors.clickElement(webDriver, winningNumbersTab);
        return this;
    }

    public String isWinningColumnsViewCheckBoxSelected(String role) {
        return webDriver.findElement(By.xpath("(//*[@id='applicationElements-pane-3']//table/tbody/tr/td[.='" + role + "']/following-sibling::td[1]//ins)[1]"))
                .getAttribute("checked");
    }

    public String isWinningColumnsEditCheckBoxSelected(String role) {
        return webDriver.findElement(By.xpath("(//*[@id='applicationElements-pane-3']//table/tbody/tr/td[.='" + role + "']/following-sibling::td[1]//ins)[2]"))
                .getAttribute("checked");
    }

    public String isWinningColumnsAddCheckBoxSelected(String role) {
        return webDriver.findElement(By.xpath("(//*[@id='applicationElements-pane-3']//table/tbody/tr/td[.='" + role + "']/following-sibling::td[1]//ins)[3]"))
                .getAttribute("checked");
    }

    public void clickViewCheckBox(String role) {
        JavaScriptExecutors.clickElementBy(webDriver, By.xpath("(//*[@id='applicationElements-pane-3']//table/tbody/tr/td[.='" + role + "']/following-sibling::td[1]//ins)[1]"));
        SeleniumWaits.presenceOfElementLocated(webDriver, alertMessageOnRoleChange);
    }

    public void clickEditCheckBox(String role) {
        JavaScriptExecutors.clickElementBy(webDriver, By.xpath("(//*[@id='applicationElements-pane-3']//table/tbody/tr/td[.='" + role + "']/following-sibling::td[1]//ins)[2]"));
        SeleniumWaits.presenceOfElementLocated(webDriver, alertMessageOnRoleChange);
    }

    public void clickAddCheckBox(String role) {
        JavaScriptExecutors.clickElementBy(webDriver, By.xpath("(//*[@id='applicationElements-pane-3']//table/tbody/tr/td[.='" + role + "']/following-sibling::td[1]//ins)[3]"));
        SeleniumWaits.presenceOfElementLocated(webDriver, alertMessageOnRoleChange);
    }

}
