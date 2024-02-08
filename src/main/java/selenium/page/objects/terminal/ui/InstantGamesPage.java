package selenium.page.objects.terminal.ui;

import com.intralot.qa.automation.core.driver.engine.common.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.page.objects.PageObject;

public class InstantGamesPage extends PageObject {

    public InstantGamesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public OrderStatusPage goToOrderStatusPage() {
        clickElement(webDriver.findElement(By.xpath("//span[text()='Order Status']")));
        return new OrderStatusPage(webDriver);
    }

    public OrderPage goToOrderPage() {
        clickElement(webDriver.findElement(By.xpath("//span[text()='Order']")));
        return new OrderPage(webDriver);
    }

    public ConfirmReceptionPage goToConfirmReceptionPage() {
        clickElement(webDriver.findElement(By.xpath("//span[text()='Confirm Reception']")));
        return new ConfirmReceptionPage(webDriver);
    }

    public ReturnTicketsPage goToReturnTicketsPage() {
        clickElement(webDriver.findElement(By.xpath("//span[text()='Return Tickets']")));
        return new ReturnTicketsPage(webDriver);
    }

    public ReturnCompletePackPage goToReturnCompletePackTab() {
        clickElement(webDriver.findElement(By.xpath("//span[text()='"
                + Properties.getPropertyValue("return.complete.pack") + "']")));
        return new ReturnCompletePackPage(webDriver);
    }

    public ReturnTicketsPage goToReturnTicketRangeTab() {
        clickElement(webDriver.findElement(By.xpath("//span[text()='"
                + Properties.getPropertyValue("return.ticket.range") + "']")));
        return new ReturnTicketsPage(webDriver);
    }

    public SellTicketPackPage goToSellTicketPackPage() {
        clickElement(webDriver.findElement(By.xpath("//span[text()='Sell Ticket/Pack']")));
        return new SellTicketPackPage(webDriver);
    }

    public ConfirmReceptionPage clickOnConfirmReceptionTab() {
        clickElement(webDriver.findElement(By.xpath("//span[text()='" + System.getProperty("confirm.before.receipt") + "']")));
        return new ConfirmReceptionPage(webDriver);
    }
}
