package selenium.page.objects.terminal.ui.lnlo;

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


    public EurojackpotQuickPickPage(WebDriver webDriver) {
        super(webDriver);
    }

    public EurojackpotQuickPickPage selectColumns(int columns) {
        By columnsXPath = By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[2]/div["+columns+"]");
        clickElement(webDriver.findElement(columnsXPath));
        return this;
    }

    public EurojackpotQuickPickPage selectDraws(int draws) {
        By drawsXPath = By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div/div[2]/div["+draws+"]");
        clickElement(webDriver.findElement(drawsXPath));
        return this;
    }

    public String getQuickPickNumberOfColumns() {
        return quickPickNumberOfColumns.getAttribute("value");
    }

    public String getQuickPickNumberOfDraws() {
        return quickPickNumberOfDraws.getAttribute("value");
    }

    public void clickPlayEurojackpotQuickPick() {
        clickElement(playQuickPickButton);
    }

}
