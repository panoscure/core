package selenium.page.objects.terminal.ui.croatia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.page.objects.PageObject;

public class EurojackpotQuickPickPage extends PageObject {

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/input")
    private WebElement quickPickNumberOfColumns;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[2]/div/div[1]/input")
    private WebElement quickPickNumberOfDraws;

    @FindBy(xpath = "/html/body/div[1]/div/div/footer/div[2]/div[2]")
    private WebElement playQuickPickButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[1]/div/div[5]/div/span[2]/div/div[2]")
    private WebElement disableJokerSwitchQuickPickPageEjp;

    public EurojackpotQuickPickPage(WebDriver webDriver) {
        super(webDriver);
    }

    public EurojackpotQuickPickPage selectColumns(int columns) throws InterruptedException {
        By columnsXPath = By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div[" + columns + "]");
        clickElement(webDriver.findElement(columnsXPath));
        return this;
    }

    public EurojackpotQuickPickPage selectDraws(int draws) throws InterruptedException {
        By drawsXPath = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div/div[3]/div/div[2]/div[" + draws + "]");
        clickElement(webDriver.findElement(drawsXPath));
        return this;
    }

    public String getQuickPickNumberOfColumns() {
        return quickPickNumberOfColumns.getAttribute("value");
    }

    public String getQuickPickNumberOfDraws() {
        return quickPickNumberOfDraws.getAttribute("value");
    }

    public void clickPlayEurojackpotQuickPick() throws InterruptedException {
        clickElement(playQuickPickButton);
    }

    public EurojackpotQuickPickPage disableJokerSwitchQuickPickPageEjp() {
        clickElement(disableJokerSwitchQuickPickPageEjp);
        return this;
    }

}
