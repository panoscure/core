package selenium.page.objects.terminal.ui.lnlo;

import com.intralot.qa.automation.core.driver.engine.common.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class LuckyDayPage extends PageObject {

    @FindBy(xpath = "//span[@class='toggle-button p_rel toggle-on']")
    private WebElement switchBonus;

    @FindBy(xpath = "/html/body/div[1]/div/div/footer/div[1]/div[3]/div[1]/div")
    private WebElement stakeButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/footer/div[2]/div[1]/div[2]/span")
    private WebElement cost;

    public LuckyDayPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void switchBonus() {
        SeleniumWaits.elementToBeClickable(webDriver, switchBonus);
        clickElement(switchBonus);
    }

    public void enterRequestedNumbers(int number) {
        clickElement(SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(
                By.xpath("//div[@class='numbers p_rel padding-bt cf']//div[contains(@class,'qpbt button')][" + number + "]"))));
    }

    public void enterMultiDraws(int draws) {
        clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div[2]/div[" + draws + "]")));
    }

    public void enterMultiDrawsFromPopup(int draws) {
        for (char digit : String.valueOf(draws).toCharArray()) {
            clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div[1]/div[1]/div[2]//span[.='" + digit + "']")));
        }
    }

    public void clickMultipleDrawsArrow() {
        clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div[1]/div[1]")));
    }

    public String getMultiDrawsErrorMessage() {
        return webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div[1]/div[1]/div[3]")).getText();
    }

    public boolean isMultiDrawsErrorMessagePresent() {
        try {
            return SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div[1]/div[1]/div[3][@class='message error']"))
                    .isDisplayed();
        } catch (TimeoutException notFound) {
            return false;
        }
    }

    public void clearMultipleDraws() {
        clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div[1]/div[1]/div[2]/div[10]/div[3]/span")));
    }

    public void enterPanelNumbers(int[] firstPanelSelectionNumbers) {
        for (int number : firstPanelSelectionNumbers) {
            clickElement(webDriver.findElement(By.xpath("//span[@class='board-section p_rel col-24']//div[text()='" + number + "']")));
        }
    }

    public void enterStakeAmount(String stakeAmount) {
        clickElement(stakeButton);
        clickElement(webDriver.findElement(By.xpath("//span[contains(text(),'" + stakeAmount + "')]")));
    }

    public void clickPlay() {
        clickElement(webDriver.findElement(By.xpath("//div[text()='" + Properties.getPropertyValue("PlayAll") + "']")));
    }

    public String getPlayAllButtonStatus() {
        return webDriver.findElement(By.xpath("//div[text()='" + Properties.getPropertyValue("PlayAll") + "']")).getAttribute("class");
    }

    public String getCost() {
        return cost.getText();
    }
}
