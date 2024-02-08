package selenium.page.objects.terminal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class ConfirmReceptionPage extends PageObject {

    @FindBy(id = "fromBarcode")
    private WebElement inputFromBarcode;

    @FindBy(id = "endBarcode")
    private WebElement inputEndBarcode;

    @FindBy(xpath = "//a[text()='Place Order']")
    private WebElement buttonPlaceOrder;

    @FindBy(xpath = "//a[text()='Add to Order']")
    private WebElement buttonAddToOrder;

    @FindBy(xpath = "//a[text()='Confirm']")
    private WebElement buttonConfirm;


    public ConfirmReceptionPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ConfirmReceptionPage clickInputFromBarcode() {
        inputFromBarcode.click();
        return this;
    }

    public ConfirmReceptionPage clickInputEndBarcode() {
        inputEndBarcode.click();
        return this;
    }

    public ConfirmReceptionPage fillFromBarcode(String fromBarcode) {
        char[] fromBarcodeDigits = fromBarcode.toCharArray();
        for (char barcodeDigit : fromBarcodeDigits) {
            webDriver.findElement(By.xpath("//div[@class='numpad p_rel']//span[text()='" + barcodeDigit + "']")).click();
        }
        return this;
    }

    public ConfirmReceptionPage fillEndBarcode(String endBarcode) {
        inputEndBarcode.click();
        char[] endBarcodeDigits = endBarcode.toCharArray();
        for (char barcodeDigit : endBarcodeDigits) {
            webDriver.findElement(By.xpath("//div[@class='numpad p_rel']//span[text()='" + barcodeDigit + "']")).click();
        }
        return this;
    }

    public ConfirmReceptionPage clickButtonPlaceOrder() {
        buttonPlaceOrder.click();
        SeleniumWaits.textToBe(webDriver, By.xpath("//p"), "Successful reception of instants pack.");
        webDriver.findElement(By.xpath("//a[text()='OK']")).click();
        return this;
    }

    public ConfirmReceptionPage clickButtonAddToOrder() {
        buttonAddToOrder.click();
        return this;
    }

    public ConfirmReceptionPage clickButtonConfirm() {
        buttonConfirm.click();
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("//p[text()='Successful reception of instants pack.']"));
        SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(By.xpath("//a[text()='OK']"))).click();
        return this;
    }

    public ConfirmReceptionPage confirm() {
        SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//a[@class='p_rel button activated alt2' and text()='" + System.getProperty("confirm") + "']"))
                .click();
        return this;
    }

    public boolean orderImageIsLoaded() {
        try {
            return SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("//div[@class='full-stretch ticketScreen']/img")).isDisplayed();
        } catch (TimeoutException notFound) {
            return false;
        }
    }

    public String getOrderConfirmationErrorMessage() {
        SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("/html/body/div[1]/div/span/span/div[@class='icon icon-error']"));
        return webDriver.findElement(By.xpath("/html/body/div[1]/div/span/span/div[2]/p")).getText();
    }
}
