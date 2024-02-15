package selenium.page.objects.terminal.ui.lnlo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.SeleniumWaits;
import selenium.page.objects.PageObject;

public class Lotto645QuickPickPage extends PageObject {

    @FindBy(xpath = "/html/body/div[1]/div/div/footer/div[2]/div[2]")
    private WebElement playButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/footer/div[2]/div[1]/div[2]/span")
    private WebElement cost;

    @FindBy(xpath = "//span[@class='toggle-button p_rel toggle-on']")
    private WebElement switchXL;

    public Lotto645QuickPickPage(WebDriver webDriver) {
        super(webDriver);
    }

    public Lotto645QuickPickPage selectConsecutiveDraws(int consecutiveDraws) {
        clickElement(webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div[.='" + consecutiveDraws + "']")));
        return this;
    }

    public void switchXL() {
        SeleniumWaits.elementToBeClickable(webDriver, switchXL);
        clickElement(switchXL);
    }

    public String getWagerCost() {
        return cost.getText();
    }

    public void clickPlay() {
        clickElement(playButton);
    }

}
