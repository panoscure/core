package selenium.page.objects.terminal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.page.objects.PageObject;

public class ReturnCompletePackPage extends PageObject {

    @FindBy(xpath = "//a[text()='Toevoegen aan retour']")
    private WebElement addReturnButton;

    @FindBy(xpath = "//a[text()='Retourneren']")
    private WebElement returnButton;


    public ReturnCompletePackPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ReturnCompletePackPage fillGameAndPackIds(String gameAndPackIds) {
        char[] gameAndPackIdsArray = gameAndPackIds.toCharArray();
        for (char gameAndPackIdsDigit : gameAndPackIdsArray) {
            webDriver.findElement(By.xpath("//div[@class='numpad p_rel']//span[text()='"
                    + gameAndPackIdsDigit + "']")).click();
        }
        return this;
    }

    public ReturnCompletePackPage clickAddReturnButton() {
        addReturnButton.click();
        return this;
    }

    public ReturnCompletePackPage clickReturnButton() {
        returnButton.click();
        return this;
    }

}
