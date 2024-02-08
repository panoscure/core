package selenium.page.objects.terminal.ui;

import com.intralot.qa.automation.core.driver.engine.common.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class ValidateInstantsPage extends PageObject {

    public ValidateInstantsPage(WebDriver webDriver) {
        super(webDriver);
        PageObject.webDriver = webDriver;
    }

    public ValidateInstantsPage enterBarcodeForValidation(String barcode) {
        char[] barcodeDigits = barcode.toCharArray();
        for (char barcodeDigit : barcodeDigits) {
            webDriver.findElement(By.xpath("//div[@class='numpad p_rel']//span[text()='" + barcodeDigit + "']")).click();
        }
        return this;
    }

    public ValidateInstantsPage clickValidateButton() {
        By ticketImage = By.xpath("//*[@id='react-tabs-11']/div/div[2]/div[1]/div[1]//*");
        WebElement validate = webDriver.findElement(By.xpath("//a[text()='" + Properties.getPropertyValue("Validate") + "']"));
        SeleniumWaits.presenceOfElementLocated(webDriver, ticketImage);
        clickElement(validate);
        SeleniumWaits.attributeToBe(webDriver, validate, "class", "button col-24 validate_bt deactivated");
        return this;
    }

    public ValidateInstantsPage clickClearButton() {
        WebElement validate = webDriver.findElement(By.xpath("//div[@class='numpad p_rel']/div[@class='p_rel lastrow']/div[3]/span]"));
        clickElement(validate);
        return this;
    }

    public String getValidationErrorMessage() {
        By popUpMessage = By.xpath("/html/body/div[1]/div/span/span/div[2]/p");
        SeleniumWaits.presenceOfElementLocated(webDriver, popUpMessage);
        return webDriver.findElement(popUpMessage).getText();
    }

}
