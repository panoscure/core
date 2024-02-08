package selenium.page.objects.terminal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class CancelPage extends PageObject {

    CancelPage(WebDriver webDriver) {
        super(webDriver);
        PageObject.webDriver = webDriver;
    }

    public CancelPage enterBarcodeForCancellation(String barcode) {
        char[] barcodeDigits = barcode.toCharArray();
        for (char barcodeDigit : barcodeDigits) {
            webDriver.findElement(By.xpath("//div[@class='numpad p_rel']//span[text()='" + barcodeDigit + "']")).click();
        }
        return this;
    }

    public CancelPage clickCancelButton() {
        By ticketImage = By.xpath("//div[@class='col-24 row-12 p_rel ticketScreen']//img");
        WebElement validate = webDriver.findElement(By.xpath("//a[text()='Cancel']"));
        SeleniumWaits.presenceOfElementLocated(webDriver, ticketImage);
        SeleniumWaits.elementToBeClickable(webDriver, validate);
        validate.click();
        return this;
    }

    public String getCancellationSuccessMessage() {
        By successMessage = By.xpath("//*[@id='app']/div[2]/div[2]/div[2]/div/aside/div/div[2]/div[1]/ul/li[1]/div[2]/div[1]/div/span[2]");
        SeleniumWaits.presenceOfElementLocated(webDriver, successMessage);
        return webDriver.findElement(successMessage).getText();
    }

    public String getCancellationSuccessAmount() {
        By successAmount = By.xpath("//*[@id='app']/div[2]/div[2]/div[2]/div/aside/div/div[2]/div[1]/ul/li[1]/div[2]/div[2]/span");
        SeleniumWaits.presenceOfElementLocated(webDriver, successAmount);
        return webDriver.findElement(successAmount).getText();
    }
}
