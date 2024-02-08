package selenium.page.objects.terminal.ui.croatia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class GamesPage extends PageObject {

    @FindBy(xpath = "(//div[./img[@alt='Game Logo']])[1]")
    private WebElement eurojackpotIconCroatia;

    @FindBy(xpath = "(//img[@alt='Game Logo'])[2]")
    private WebElement toto13IconCroatia;

    @FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div[2]/div/main/div/div/div[2]/div")
    private WebElement eurojackpotQPButton;

    @FindBy(xpath = "//*[@id='app']//div[2]/div[2]/div/main/div[1]/div/div[3]")
    private WebElement eurojackpotFirstCategoryQP;

    @FindBy(xpath = "//*[@id='app']//div[2]/div[2]/div/main/div[2]/div/div[2]/div")
    private WebElement luckydayQPButton;

    @FindBy(xpath = "//aside/div/div[2]/div[1]/div/div/ul/li/div[2]/div[1]/div/span[1]")
    private WebElement playedCouponGameName;

    @FindBy(xpath = "//span[@class='TotalCostPerGame']")
    private WebElement couponCost;

    @FindBy(xpath = "//aside[@class='cart']/div/div[3]/div[1]/span[2]")
    private WebElement processedCost;

    public GamesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public EurojackpotPage clickEurojackpotIconCroatia() {
        SeleniumWaits.visibilityOf(webDriver, eurojackpotIconCroatia);
        eurojackpotIconCroatia.click();
        return new EurojackpotPage(webDriver);
    }

    public Toto13Page clickToto13IconCroatia() {
        clickElement(toto13IconCroatia);
        return new Toto13Page(webDriver);
    }

    public EurojackpotQuickPickPage clickEurojackpotQuickPick() {
        clickElement(eurojackpotQPButton);
        return new EurojackpotQuickPickPage(webDriver);
    }

    public GamesPage clickEurojackpotFastQuickPick2euro() {
        clickElement(eurojackpotFirstCategoryQP);
        return this;
    }

    public void clickCheckout() {
        SeleniumWaits.invisibilityOfElementLocated(webDriver, By.xpath("//div[@class='ani_loader']"));
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("//span[text()='Checkout']"));
        SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//span[text()='Checkout']")).click();
        SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("//a[text()='Print']"));
    }

    public String getPlayedCouponGameName() {
        return playedCouponGameName.getText();
    }

    public String getCouponsCost() {
        SeleniumWaits.visibilityOf(webDriver, couponCost);
        return couponCost.getText();
    }

    public String getTotalCostOfFirstGameAtShoppingCart() {
        return webDriver.findElement(By.xpath("//aside[@class='cart']/div/div[2]/div[1]/div/div/ul/li/div[2]/div[2]/span")).getText();
    }

    public String getGameDescriptionOfFirstGameAtShoppingCart() {
        return webDriver.findElement(By.xpath("//aside[@class='cart']/div/div[2]/div[1]/div/div/ul/li/div[2]/div[1]/div/span[1]")).getText();
    }

    public String getRemainingCostAtShoppingCart() {
        return webDriver.findElement(By.xpath("//aside[@class='cart']/div/div[3]/div[2]/span[2]")).getText();
    }

    public String getOverallProcessedCost() {
        return processedCost.getText();
    }

    public String getStatusOfFirstTicketAtShoppingCart() {
        By statusOfFirstTicketLocator = By.xpath("//div[@class='gamedesc']/span[2]");
        return SeleniumWaits.visibilityOf(webDriver, webDriver.findElement(statusOfFirstTicketLocator)).getText();
    }

    public String getProcessedStatusOfFirstTicketAtShoppingCart() {
        By processedStatusOfFirstTicketLocator = By.xpath("//div[@class='visual']/span");
        return SeleniumWaits.visibilityOf(webDriver, webDriver.findElement(processedStatusOfFirstTicketLocator)).getText();
    }
}
