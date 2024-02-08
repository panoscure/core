package selenium.page.objects.terminal.ui;

import com.intralot.qa.automation.core.driver.engine.common.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;

import selenium.page.objects.PageObject;

public class InventoryPage extends PageObject {

    @FindBy(xpath = "//span[text()='Order Consumables']")
    private WebElement orderConsumablesPage;


    public InventoryPage(WebDriver webDriver) {
        super(webDriver);
    }

    public OrderConsumablesPage goToOrderConsumablesPage() {
        SeleniumWaits.elementToBeClickable(webDriver, orderConsumablesPage);
        clickElement(orderConsumablesPage);
        return new OrderConsumablesPage(webDriver);
    }

    public InstantGamesPage goToInstantGamesPage() {
        By instantGames = By.xpath("//span[text()='" +
                Properties.getPropertyValue("instants.games") + "']");
        SeleniumWaits.elementToBeClickable(webDriver, instantGames);
        clickElement(webDriver.findElement(instantGames));
        return new InstantGamesPage(webDriver);
    }

}
