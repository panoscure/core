package selenium.page.objects.terminal.ui;

import com.intralot.qa.automation.core.driver.engine.common.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class ReplayPage extends PageObject {

    @FindBy(xpath = "//div/div[2]/div[2]/div[2]/div[1]/span/div//input")
    private WebElement switchL5;

    @FindBy(xpath = "//span[text()='Checkout']")
    private WebElement checkout;

    public ReplayPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ReplayPage switchToL5() {
        SeleniumWaits.elementToBeClickable(webDriver, switchL5);
        JavaScriptExecutors.clickElement(webDriver, switchL5);
        return this;
    }

    public ReplayPage enterBarcodeForReplay(String barcode) {
        char[] barcodeDigits = barcode.toCharArray();
        for (char barcodeDigit : barcodeDigits) {
            webDriver.findElement(By.xpath("//div[@class='numpad p_rel']//span[text()='" + barcodeDigit + "']")).click();
        }
        return this;
    }

    public ReplayPage clickReplayButton() {
        By ticketImage = By.xpath("//*[@id='app']//div/div[2]/div[1]/div[1]/img");
        SeleniumWaits.presenceOfElementLocated(webDriver, ticketImage);
        By replayButton = By.xpath("//a[text()='Replay']");
        SeleniumWaits.presenceOfElementLocated(webDriver, replayButton);
        SeleniumWaits.elementToBeClickable(webDriver, replayButton);
        webDriver.findElement(replayButton).click();
        return this;
    }

    public void clickCheckout() {
        clickElement(webDriver.findElement(By.xpath("//span[text()='" + Properties.getPropertyValue("Checkout") + "']")));
        SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("//aside/span/div/a"));
    }
}
