package selenium.page.objects.terminal.ui;

import com.intralot.qa.automation.core.driver.engine.common.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class ReturnTicketsPage extends PageObject {

    @FindBy(id = "fromBarcode")
    private WebElement inputFromBarcode;

    @FindBy(id = "endBarcode")
    private WebElement inputEndBarcode;

    @FindBy(xpath = "//a[text()='Place Order']")
    private WebElement buttonPlaceOrder;


    public ReturnTicketsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ReturnTicketsPage clickInputFromBarcode() {
        inputFromBarcode.click();
        return this;
    }

    public ReturnTicketsPage clickInputEndBarcode() {
        inputEndBarcode.click();
        return this;
    }

    public ReturnTicketsPage fillFromBarcode(String fromBarcode) {
        inputFromBarcode.click();
        char[] fromBarcodeDigits = fromBarcode.toCharArray();
        for (char barcodeDigit : fromBarcodeDigits) {
            webDriver.findElement(By.xpath("//div[@class='numpad p_rel']//span[text()='" + barcodeDigit + "']")).click();
        }
        return this;
    }

    public ReturnTicketsPage fillEndBarcode(String endBarcode) {
        inputEndBarcode.click();
        char[] endBarcodeDigits = endBarcode.toCharArray();
        for (char barcodeDigit : endBarcodeDigits) {
            webDriver.findElement(By.xpath("//div[@class='numpad p_rel']//span[text()='" + barcodeDigit + "']")).click();
        }
        return this;
    }

    public ReturnTicketsPage clickButtonPlaceOrder() {
        buttonPlaceOrder.click();
        SeleniumWaits.textToBe(webDriver, By.xpath("//p"), "Successful reception of instants pack.");
        webDriver.findElement(By.xpath("//a[text()='OK']")).click();
        return this;
    }

    public ReturnTicketsPage clickButtonAddToOrder() {
        webDriver.findElement(By.xpath("//a[text()='Add to Order']")).click();
        return this;
    }

    public ReturnTicketsPage clickButtonAddToReturn() {
        webDriver.findElement(By.xpath("//a[text()='"+ Properties.getPropertyValue("add.to.return")+"']")).click();
        return this;
    }

    public ReturnTicketsPage clickButtonReturn() {
        webDriver.findElement(By.xpath("//a[text()='"+Properties.getPropertyValue("return")+"']")).click();
        return this;
    }

    public ReturnTicketsPage clickButtonConfirm() {
        webDriver.findElement(By.xpath("//a[text()='Confirm']")).click();
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("//p[text()=' Successful return of instants pack.']"));
        SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(By.xpath("//a[text()='OK']"))).click();
        return this;
    }

}
