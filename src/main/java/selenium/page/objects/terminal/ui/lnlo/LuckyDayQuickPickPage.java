package selenium.page.objects.terminal.ui.lnlo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.page.objects.PageObject;

public class LuckyDayQuickPickPage extends PageObject {

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/input")
    private WebElement quickPickGameType;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[2]/div/div[1]/input")
    private WebElement quickPickStake;

    @FindBy(xpath = "/html/body/div[1]/div/div/footer/div[2]/div[2]")
    private WebElement playQuickPickButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/footer/div[2]/div[2]")
    private WebElement playButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/footer/div[2]/div[1]/div[2]/span")
    private WebElement cost;


    public LuckyDayQuickPickPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getQuickPickGameType() {
        return quickPickGameType.getAttribute("value");
    }

    public String getQuickStake() {
        return quickPickStake.getAttribute("value");
    }

    public void clickPlayQuickPick() {
        clickElement(playQuickPickButton);
    }

    public LuckyDayQuickPickPage selectGameType(int gameType) {
        clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[1]/div/div[2]/div[" + gameType + "]")));
        return this;
    }

    public LuckyDayQuickPickPage selectStake(int stake) {
        clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div[2]/div[" + stake + "]")));
        return this;
    }

    public LuckyDayQuickPickPage selectConsecutiveDraws(int consecutiveDraws) {
        clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[3]/div/div[2]/div[" + consecutiveDraws + "]")));
        return this;
    }

    public String getWagerCost() {
        return cost.getText();
    }

    public void clickPlay() {
        clickElement(playButton);
    }

}
