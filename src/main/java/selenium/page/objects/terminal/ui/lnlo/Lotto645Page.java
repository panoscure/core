package selenium.page.objects.terminal.ui.lnlo;

import common.utils.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import selenium.SeleniumWaits;
import selenium.page.objects.PageObject;

public class Lotto645Page extends PageObject {

    @FindBy(xpath = "//div[@class='addTab p_rel row-12']")
    private WebElement addBoardPlusSign;

    @FindBy(xpath = "//span[@class='toggle-button p_rel toggle-on']")
    private WebElement switchXL;

    public Lotto645Page(WebDriver webDriver) {
        super(webDriver);
        webDriver.manage().window().setSize(new Dimension(1200, 1000));
    }

    public Lotto645Page enterFirstPanelNumbers(int[] firstPanelSelectionNumbers) {
        for (int number : firstPanelSelectionNumbers) {
            clickElement(webDriver.findElement(By.xpath("//span[@class='board-section p_rel col-24']//div[text()='" + number + "']")));
        }
        return this;
    }

    public void enterMultipleDraws(String draws) {
        clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[.='" + draws + "']")));
    }

    public void clickPlay() {
        clickElement(webDriver.findElement(By.xpath("//div[text()='" + Properties.getPropertyValue("PlayAll") + "']")));
    }

    public Lotto645Page clickBoard(String boardId) {
        clickElement(webDriver.findElement(By.xpath("//div[@class='gamePanelNums-box__wrapper']//span[text()='" + boardId + "']")));
        return this;
    }

    public Lotto645Page addBoard() {
        clickElement(addBoardPlusSign);
        return this;
    }

    public Lotto645Page addXBoard(int boardNumber) {
        clickElement(webDriver.findElement(By.xpath("//div[@class='p_rel row-12 inactive' and ./span[text()='0" + boardNumber + "']]")));
        return this;
    }

    public boolean isPlusButtonPresent() {
        try {
            return SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("//div[@class='addTab p_rel row-12']")).isDisplayed();
        } catch (TimeoutException notFound) {
            return false;
        }
    }

    public Lotto645Page clickMultipleDrawsArrow() {
        clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[1]/div")));
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
        WebElement totalPriceElement = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/footer/div[2]/div[1]/div[2]"));
        return totalPriceElement.getText();
    }

    public void switchXL() {
        SeleniumWaits.elementToBeClickable(webDriver, switchXL);
        clickElement(switchXL);
    }
}
