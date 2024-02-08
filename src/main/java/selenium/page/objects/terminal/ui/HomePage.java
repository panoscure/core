package selenium.page.objects.terminal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;

import selenium.page.objects.PageObject;


public class HomePage extends PageObject {

    @FindBy(xpath = "//*[@id='app']//nav[@class='main_nav p_abs top left z3']/a[2]")
    private WebElement leftSideMenu_Tickets;

    @FindBy(xpath = "//*[@id='app']//nav[@class='main_nav p_abs top left z3']/a[3]")
    private WebElement leftSideMenu_Inventory;

    @FindBy(linkText = "Close")
    private WebElement happyHoursCloseButton;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickLeftSideMenuGames() {
        By leftSideMenuGamesXpath = By.xpath("//*[@id='app']//nav[@class='main_nav p_abs top left z3']/a[1]");
        SeleniumWaits.presenceOfElementLocated(webDriver, leftSideMenuGamesXpath);
        SeleniumWaits.visibilityOfElementLocated(webDriver, leftSideMenuGamesXpath);
        SeleniumWaits.invisibilityOfElementLocated(webDriver,By.xpath("//div[@class='modal lockscreen modal_open']"));
        SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(leftSideMenuGamesXpath)).click();
    }

    public TicketsPage clickLeftSideMenuTickets() {
        SeleniumWaits.elementToBeClickable(webDriver, leftSideMenu_Tickets).click();
        return new TicketsPage(webDriver);
    }

    public InventoryPage clickLeftSideMenuInventory() {
        SeleniumWaits.elementToBeClickable(webDriver, leftSideMenu_Inventory).click();
        return new InventoryPage(webDriver);
    }

    public HomePage clickHappyHoursCloseButton() {
        try {
            SeleniumWaits.elementToBeClickable(webDriver, happyHoursCloseButton).click();
        } catch (org.openqa.selenium.TimeoutException e) {

        }
        return this;
    }

}
