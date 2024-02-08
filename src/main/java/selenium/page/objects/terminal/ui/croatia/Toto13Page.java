package selenium.page.objects.terminal.ui.croatia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.page.objects.PageObject;

public class Toto13Page extends PageObject {

    @FindBy(xpath = "//div[text()='Play All']")
    private WebElement playAll;

    @FindBy(xpath = "/html/body/div[1]/div/div/footer/div[2]/div[1]/div[2]/span")
    private WebElement cost;

    @FindBy(xpath = "//div[./label[text()='System']]/div")
    private WebElement systemInput;

    @FindBy(xpath = "//div[@class='addTab p_rel row-12']")
    private WebElement addBoardPlusSign;

    public Toto13Page(WebDriver webDriver) {
        super(webDriver);
    }

    public Toto13Page selectSystemFromPopUp(int columns) {
        clickElement(systemInput);
        clickElement(webDriver.findElement(By.xpath("//div[@class='draws']//span[text()='" + columns + "']")));
        return this;
    }

    public Toto13Page selectSystem(int columns) {
        clickElement(webDriver.findElement(By.xpath("//div[@class='qpbt button' and text()='" + columns + "']")));
        return this;
    }

    public Toto13Page clickSelection(int selectionRow, String selection) throws InterruptedException {
        clickElement(webDriver.findElement(By.xpath("//span[./div[@class='board-name' and text()=" + selectionRow + "]]//div[@class='p_rel choise']//div[text()='" + selection + "']")));
        return this;
    }

    public Toto13Page clickBoard(String boardId) throws InterruptedException {
        clickElement(webDriver.findElement(By.xpath("//div[@class='gamePanelNums-box__wrapper']//span[text()='" + boardId + "']")));
        return this;
    }

    public void addBoard() {
        clickElement(addBoardPlusSign);
    }

    public void clickPlay() throws InterruptedException {
        clickElement(playAll);
    }

    public String getTotalPrice() {
        return cost.getText();
    }

}
