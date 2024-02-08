package selenium.page.objects.terminal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class ShoppingCart extends PageObject {

    public ShoppingCart(WebDriver webDriver) {
        super(webDriver);
    }

    public String getCostOfShoppingCartAtRow(int row) {
        return webDriver.findElement(By.xpath("//aside[@class='cart']//li[" + row + "]//span[@class='TotalCostPerGame']")).getText();
    }

    public String getDescriptionAtRow(int row) {
        return webDriver.findElement(By.xpath("//aside[@class='cart']//li[" + row + "]//span[@class='gameType']")).getText();
    }

    public int getShoppingCartSizeList() {
        return webDriver.findElements(By.xpath("//aside[@class='cart']//li")).size();
    }

    public String getPayoutMessageOfShoppingCartAtRow(int row) {
        By successMessage = By.xpath("//aside[@class='cart']//li[" + row + "]//div[@class='visual']/span");
        SeleniumWaits.presenceOfElementLocated(webDriver, successMessage);
        return webDriver.findElement(successMessage).getText();
    }
}
