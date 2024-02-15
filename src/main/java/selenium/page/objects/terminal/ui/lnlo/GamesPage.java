package selenium.page.objects.terminal.ui.lnlo;

import com.intralot.qa.automation.core.driver.engine.common.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class GamesPage extends PageObject {

    @FindBy(xpath = "//div[1]/div/div[contains(@class, 'gamelogos')]/div[2]")
    private WebElement eurojackpotIcon;

    @FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div[2]/div/main/div[1]/div/div[2]/div")
    private WebElement eurojackpotQPButton;

    @FindBy(xpath = "//*[@id='app']//div[2]/div[2]/div/main/div[1]/div/div[3]")
    private WebElement eurojackpotFirstCategoryQP;

    @FindBy(xpath = "//aside/div/div[2]/div[1]/div/div/ul/li/div[2]/div[1]/div/span[1]")
    private WebElement playedCouponGameName;

    @FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div[2]/div/aside/div/div[3]/div[1]/span[2]")
    private WebElement couponCost;

    @FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div[2]/div/aside/div/div[3]/div[1]/span[2]")
    private WebElement processedCost;

    public GamesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickEurojackpotIcon() {
        clickElement(eurojackpotIcon);
    }

    public LuckyDayPage clickLuckyDayIcon() {
        clickElement(webDriver.findElement(By.xpath(Properties.getPropertyValue("luckyday.icon.location"))));
        return new LuckyDayPage(webDriver);
    }

    public Toto13Page clickToto13Icon() {
        clickElement(webDriver.findElement(By.xpath(Properties.getPropertyValue("toto13.icon.location"))));
        return new Toto13Page(webDriver);
    }

    public void clickLotto645Icon() {
        clickElement(webDriver.findElement(By.xpath(Properties.getPropertyValue("lotto645.icon.location"))));
    }

    public EurojackpotQuickPickPage clickEurojackpotQuickPick() {
        clickElement(eurojackpotQPButton);
        return new EurojackpotQuickPickPage(webDriver);
    }

    public GamesPage clickEurojackpotFastQuickPick2Euro() {
        clickElement(eurojackpotFirstCategoryQP);
        return this;
    }

    public LuckyDayQuickPickPage clickLuckyDayQuickPick() {
        clickElement(webDriver.findElement(By.xpath(Properties.getPropertyValue("luckyday.quickpick.icon.location"))));
        return new LuckyDayQuickPickPage(webDriver);
    }

    public Lotto645QuickPickPage clickLotto645QuickPick() {
        clickElement(webDriver.findElement(By.xpath(Properties.getPropertyValue("lotto645.quickpick.icon.location"))));
        return new Lotto645QuickPickPage(webDriver);
    }

    public void clickCheckout() {
        SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("//span[text()='" + Properties.getPropertyValue("Checkout") + "']"));
        clickElement(webDriver.findElement(By.xpath("//span[text()='" + Properties.getPropertyValue("Checkout") + "']")));
        SeleniumWaits.visibilityOfElementLocated(webDriver,
                By.xpath("//aside[@class='cart']/span[@class='btnplace']//a[text()='" + Properties.getPropertyValue("Print") + "']"));
    }

    public void clickCheckoutAndWaitForHighBetPopUp() {
        clickElement(webDriver.findElement(By.xpath("//span[text()='" + Properties.getPropertyValue("Checkout") + "']")));
        SeleniumWaits.visibilityOfElementLocated(webDriver,
                By.xpath("//span[@class='modalWrapper' and //p[text()='" + Properties.getPropertyValue("HighBetMessage") + "']]"));
    }

    public void clickYesOnHighBetAmountPopUpDialogue() {
        clickElement(SeleniumWaits.elementToBeClickable(webDriver,
                By.xpath("//span[@class='modalWrapper' and //p[text()='" + Properties.getPropertyValue("HighBetMessage") + "']]" +
                        "//a[text()='" + Properties.getPropertyValue("Yes") + "']")));
        SeleniumWaits.visibilityOfElementLocated(webDriver,
                By.xpath("//aside[@class='cart']/span[@class='btnplace']//a[text()='" + Properties.getPropertyValue("Print") + "']"));
    }

    public String getPlayedCouponGameName() {
        return playedCouponGameName.getText();
    }

    public String getCouponsCost() {
        SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("//*[@id='app']/div[2]/div[2]/div[2]/div/aside/div/div[3]/div[1]/span[2]"));
        return couponCost.getText();
    }

    public String getTotalCostOfFirstGameAtShoppingCart() {
        return webDriver.findElement(By.xpath("//*[@id='app']/div[2]/div[2]/div[2]/div/aside/div/div[2]/div[1]/ul/li/div[2]/div[2]/span[1]")).getText();
    }

    public String getGameDescriptionOfFirstGameAtShoppingCart() {
        return webDriver.findElement(By.xpath("//*[@id='app']/div[2]/div[2]/div[2]/div/aside/div/div[2]/div[1]/ul/li/div[2]/div[1]/div/span[1]")).getText();
    }

    public String getRemainingCostAtShoppingCart() {
        return webDriver.findElement(By.xpath("//aside[@class='cart']/div/div[3]/div[2]/span[2]")).getText();
    }

    public String getProcessedCost() {
        return processedCost.getText();
    }

    public String getStatusOfFirstTicketAtShoppingCart() {
        By statusOfFirstTicketLocator = By.xpath("//aside[@class='cart']/div/div[2]/div[1]/div/div/ul/li/div[2]/div[1]/div[2]/span");
        boolean isStatusPresent = false;
        try {
            isStatusPresent = SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div[1]/div[1]/div[3][@class='message error']"))
                    .isDisplayed();
        } catch (TimeoutException notFound) {
        }

        if (isStatusPresent)
            return webDriver.findElement(statusOfFirstTicketLocator).getText();
        else
            return "";
    }
}
