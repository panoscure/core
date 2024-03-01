package selenium.page.objects.terminal.ui.lnlo;

import com.intralot.qa.automation.core.driver.engine.common.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class EurojackpotPage extends PageObject {

    @FindBy(xpath = "//div[@class='addTab p_rel row-12']")
    private WebElement addBoardPlusSign;

    public EurojackpotPage(WebDriver webDriver) {
        super(webDriver);
        webDriver.manage().window().setSize(new Dimension(1200, 1000));
    }

    public void enterFirstPanelNumbers(int[] firstPanelSelectionNumbers) {
        for (int number : firstPanelSelectionNumbers) {
            clickElement(webDriver.findElement(By.xpath("//span[@class='board-section p_rel col-24 divider']//div[text()='" + number + "']")));
        }
    }

    public void enterSecondPanelNumbers(int[] secondPanelSelectionNumbers) {
        for (int number : secondPanelSelectionNumbers) {
            clickElement(webDriver.findElement(By.xpath("//span[@class='board-section p_rel col-24']//div[text()='" + number + "']")));
        }
    }

    public void enterMultipleDraws(String draws) {
        clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[" + draws + "]")));
    }

    public void clickPlay() {
        clickElement(webDriver.findElement(By.xpath("//div[text()='" + Properties.getPropertyValue("PlayAll") + "']")));
    }

    public void addBoard() {
        clickElement(addBoardPlusSign);
    }

    public boolean isPlusButtonPresent() {
        try {
            return SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("//div[@class='addTab p_rel row-12']"))
                    .isDisplayed();
        } catch (TimeoutException notFound) {
            return false;
        }
    }

    public EurojackpotPage clickMultipleDrawsArrow() {
        clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[1]/div[2]/div[10]")));
        return this;
    }

    public void enterMultiDrawsFromPopup(int draws) {
        for (char digit : String.valueOf(draws).toCharArray()) {
            clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[1]/div[1]/div[2]/div//span[.='" + digit + "']")));
        }
    }

    public boolean isMultiDrawsErrorMessagePresent() {
        try {
            return SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("/html/body/div[1]/div/div/div/div[1]/div//div[@class='message error']"))
                    .isDisplayed();
        } catch (TimeoutException notFound) {
            return false;
        }
    }

    public void clearMultipleDraws() {
        clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[1]/div[1]/div[2]/div[10]/div[3]/span")));
    }

    public void closeMultipleDrawsPopup() {
        clickElement(webDriver.findElement(By.xpath("//div[@class='closeButton button p_abs top right']")));
    }

    public String getTotalPrice() {
        WebElement totalPriceElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/footer/div[2]/div[1]/div[3]"));
        return totalPriceElement.getText();
    }
}
