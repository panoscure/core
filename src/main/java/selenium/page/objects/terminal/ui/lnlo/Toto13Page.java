package selenium.page.objects.terminal.ui.lnlo;

import com.intralot.qa.automation.core.driver.engine.common.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class Toto13Page extends PageObject {

    @FindBy(xpath = "/html/body/div[1]/div/div/footer/div[2]/div[1]/div[2]/span")
    private WebElement cost;

    @FindBy(xpath = "//div[@class='addTab p_rel row-12']")
    private WebElement addBoardPlusSign;

    public Toto13Page(WebDriver webDriver) {
        super(webDriver);
    }

    public Toto13Page clickSelection(int selectionRow, String selection) {
        clickElement(webDriver.findElement(By.xpath("//span[./div[@class='board-name' and text()=" + selectionRow + "]]//div[@class='p_rel choise']//div[text()='" + selection + "']")));
        return this;
    }

    public Toto13Page clickBoard(String boardId) {
        clickElement(webDriver.findElement(By.xpath("//div[@class='gamePanelNums-box__wrapper']//span[text()='" + boardId + "']")));
        return this;
    }

    public void addBoard() {
        clickElement(addBoardPlusSign);
    }

    public void clickPlay() {
        By playAll = By.xpath("//div[text()='" + Properties.getPropertyValue("PlayAll") + "']");
        SeleniumWaits.elementToBeClickable(webDriver, playAll).click();
    }

    public String getTotalPrice() {
        return cost.getText();
    }

}
