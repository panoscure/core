package selenium.page.objects;

import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Duration;

public class PageObject {

    protected static WebDriver webDriver;
    protected static final By ALERT_SUCCESS_MESSAGE =
            By.xpath("//*[contains(@class, 'top-right')]//*[contains(text(),'Success') or contains(text(),'Save') or contains(text(),'success') or contains(text(),'Fetch')]");
    protected static final By FETCHING_DATA_LOADER = By.className("block-ui-overlay");
    protected static final int WEB_DRIVER_WAIT_TIMEOUT = 30;

    public PageObject(WebDriver webDriver) {
        PageObject.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    protected void selectFromDropdownByValue(By element, String selection) {
        WebElement dropDown = SeleniumWaits.elementToBeClickable(webDriver, element);
        JavaScriptExecutors.scrollToElement(webDriver, dropDown);
        Select select = new Select(dropDown);
        new FluentWait<>(webDriver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(100))
                .until((webDriver -> (select.getOptions().size() > 1)));
        select.selectByValue(selection);
    }

    protected void selectFromDropdownByValue(WebElement dropDown, String selection) {
        SeleniumWaits.visibilityOf(webDriver, dropDown);
        SeleniumWaits.elementToBeClickable(webDriver, dropDown);
        Select select = new Select(dropDown);
        new FluentWait<>(webDriver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(100))
                .until((webDriver -> (select.getOptions().size() > 1)));
        select.selectByValue(selection);
    }

    protected void selectFromDropdownByVisibleText(WebElement dropDown, String text) {
        SeleniumWaits.elementToBeClickable(webDriver, dropDown);
        Select select = new Select(dropDown);
        new FluentWait<>(webDriver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(100))
                .until((webDriver -> (select.getOptions().size() > 1)));
        select.selectByVisibleText(text);
    }

    protected void clickElement(WebElement webElement) {
        SeleniumWaits.elementToBeClickable(webDriver, webElement);
        webElement.click();
    }

    public String getCssClassesForWebElement(WebElement webElement) {
        return webElement.getAttribute("class");
    }

}
