package selenium.page.objects.terminal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;
import selenium.page.objects.terminal.ui.croatia.GamesPage;

public class SellTicketPackPage extends PageObject {

    @FindBy(xpath = "//input[@placeholder='Enter ticket barcode']")
    private WebElement inputTicketBarcode;


    public SellTicketPackPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SellTicketPackPage fillTicketBarcode(String ticketBarcode) {
        clickElement(inputTicketBarcode);
        for (char digit : String.valueOf(ticketBarcode).toCharArray()) {
            clickElement(webDriver.findElement(
                    By.xpath("//div[@class='numpad p_rel']//span[text()='" + digit + "']")));
        }
        return this;
    }

    public GamesPage addToCart() {
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("//a[text()='Add to cart']"));
        SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//a[text()='Add to cart']")).click();
        return new GamesPage(webDriver);
    }

}
