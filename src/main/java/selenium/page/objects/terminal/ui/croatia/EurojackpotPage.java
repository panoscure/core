package selenium.page.objects.terminal.ui.croatia;

import com.intralot.qa.automation.core.driver.engine.DriverWait;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.page.objects.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EurojackpotPage extends PageObject {

    @FindBy(xpath = "//div[text()='Speel alle']")
    private WebElement playAll;

    @FindBy(xpath = "//div[@class='addTab p_rel row-12']")
    private WebElement addBoardPlusSign;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[1]/div[2]/span[2]/div/div[2]")
    private WebElement disableJokerSwitch;

    @FindBy(xpath = "//div[./label[text()='System']]/input")
    private WebElement systemInput;

    public EurojackpotPage(WebDriver webDriver) {
        super(webDriver);
        webDriver.manage().window().setSize(new Dimension(1200, 1000));
    }

    public void enterFirstPanelNumbers(int[] firstPanelSelectionNumbers) throws InterruptedException {
        for (int number : firstPanelSelectionNumbers) {
            clickElement(webDriver.findElement(By.xpath("//span[@class='board-section p_rel col-24 divider']//div[text()='" + number + "']")));
        }
    }

    public void enterSecondPanelNumbers(int[] secondPanelSelectionNumbers) throws InterruptedException {
        for (int number : secondPanelSelectionNumbers) {
            clickElement(webDriver.findElement(By.xpath("//span[@class='board-section p_rel col-24']//div[text()='" + number + "']")));
        }
    }

    public void disableJokerSwitch() {
        clickElement(disableJokerSwitch);
    }

    public void selectSystem(String system) {
        clickElement(systemInput);
        clickElement(webDriver.findElement(By.xpath("//span[text()='" + system + "']")));
    }

    public void enterMultipleDraws(String draws) throws InterruptedException {
        clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[" + draws + "]")));
    }

    public void clickPlay() throws InterruptedException {
        clickElement(playAll);
    }

    public void addBoard() throws InterruptedException {
        clickElement(addBoardPlusSign);
    }

    public void selectBoard(String numberOfBoardToBeSelected) {
        WebElement boardToBeSelected = webDriver.findElement(By.xpath("//div[@class='gamePanelNums-box__wrapper']//span[text()='" + numberOfBoardToBeSelected + "']"));
        clickElement(boardToBeSelected);
    }

    public boolean isPlusButtonPresent() {
        try {
            return SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("//div[@class='addTab p_rel row-12']"))
                    .isDisplayed();
        } catch (TimeoutException notFound) {
            return false;
        }
    }

    public EurojackpotPage clickMultipleDrawsArrow() throws InterruptedException {
        clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[1]/div")));
        return this;
    }

    public void enterMultiDrawsFromPopup(int draws) {
        clickElement(webDriver.findElement(By.xpath("//div[@class='multiplier gameOptionsBalloon noNumpad']//span[text()='" + draws + "']")));
    }

    public boolean isMultiDrawsErrorMessagePresent() {
        try {
            return SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("/html/body/div[1]/div/div/div/div[1]/div//div[@class='message error']"))
                    .isDisplayed();
        } catch (TimeoutException notFound) {
            return false;
        }
    }

    public void clearMultipleDraws() throws InterruptedException {
        clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[1]/div[1]/div[2]/div[10]/div[3]/span")));
    }

    public void closeMultipleDrawsPopup() throws InterruptedException {
        clickElement(webDriver.findElement(By.xpath("//div[@class='closeButton button p_abs top right']")));
    }

    public String getTotalPrice() {
        WebElement totalPriceElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/footer/div[2]/div[1]/div[2]"));
        return totalPriceElement.getText();
    }
}
