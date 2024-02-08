package selenium.page.objects.terminal.ui;

import com.intralot.qa.automation.core.driver.engine.common.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class TicketsPage extends PageObject {

    public TicketsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ValidatePage goToValidatePage() {
        SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//span[text()='"+ Properties.getPropertyValue("Validate") +"']")).click();
        return new ValidatePage(webDriver);
    }

    public ReplayPage goToReplayPage() {
        SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//span[text()='"+ Properties.getPropertyValue("Replay") +"']"))
                .click();
        return new ReplayPage(webDriver);
    }

    public CancelPage goToCancelPage() {
        SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//span[text()='"+ Properties.getPropertyValue("Cancel") +"']"))
                .click();
        return new CancelPage(webDriver);
    }
}
