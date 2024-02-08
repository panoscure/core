package selenium.page.objects.terminal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;

import selenium.page.objects.PageObject;

public class OrderPage extends PageObject {

    public OrderPage(WebDriver webDriver) {
        super(webDriver);
    }

    public OrderPage selectProduct(String product) {
        SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(By.xpath("//div[text()='" + product + "']")));
        clickElement(webDriver.findElement(By.xpath("//div[text()='" + product + "']")));
        return this;
    }

    public OrderPage enterQuantity(String quantity) {
        for (char digit : String.valueOf(quantity).toCharArray()) {
            SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(
                    By.xpath("//div[@class='numpad p_rel']//span[text()='" + digit + "']")));
            clickElement(webDriver.findElement(By.xpath("//div[@class='numpad p_rel']//span[text()='" + digit + "']")));
        }
        return this;
    }

    public OrderPage clickAddOrderButton() {
        SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(By.xpath("//a[text()='Add to Order']")));
        clickElement(webDriver.findElement(By.xpath("//a[text()='Add to Order']")));
        return this;
    }

    public OrderPage clickPlaceOrderButton() {
        SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(By.xpath("//a[text()='Place Order']")));
        clickElement(webDriver.findElement(By.xpath("//a[text()='Place Order']")));
        return this;
    }

}
