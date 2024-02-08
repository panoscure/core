package selenium.page.objects.terminal.ui;

import com.intralot.qa.automation.core.driver.engine.common.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;

import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class ValidatePage extends PageObject {

    @FindBy(xpath = "//div/div[2]/div[2]/div[2]/div[1]/span/div//input")
    private WebElement switchOldBarcode;

    @FindBy(xpath = "//span[@class='modalWrapper")
    private WebElement validatePopUpMessage;

    @FindBy(linkText = "Print")
    private WebElement printBtn;

    @FindBy(xpath = "//div[@class='col-18 toolbox']//a[text()='Replay']")
    private  WebElement replayBtn;

    public ValidatePage(WebDriver webDriver) {
        super(webDriver);
        PageObject.webDriver = webDriver;
    }

    public ValidateInstantsPage goToInstantGamesPage() {
        SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//span[text()='" + Properties.getPropertyValue("Instants") + "']")).click();
        return new ValidateInstantsPage(webDriver);
    }

    public ValidatePage enterBarcodeForValidation(String barcode) {
        char[] barcodeDigits = barcode.toCharArray();
        for (char barcodeDigit : barcodeDigits) {
            webDriver.findElement(By.xpath("//div[@class='numpad p_rel']//span[text()='" + barcodeDigit + "']")).click();
        }
        return this;
    }

    public void checkIfPrintButtonIsClickable() {
        SeleniumWaits.elementToBeClickable(webDriver, printBtn);
    }

    public ValidatePage switchToL5() {
        SeleniumWaits.elementToBeClickable(webDriver, switchOldBarcode);
        JavaScriptExecutors.clickElement(webDriver, switchOldBarcode);
        return this;
    }

    public ValidatePage clickValidateButton() {
        By ticketImage = By.xpath("//div[@class='col-24 row-12 p_rel ticketScreen']/img");
        WebElement validate = webDriver.findElement(By.xpath("//a[text()='"
                + Properties.getPropertyValue("Validate") + "']"));
        SeleniumWaits.presenceOfElementLocated(webDriver, ticketImage);
        clickElement(validate);
        SeleniumWaits.attributeToBe(webDriver, validate, "class", "button col-24 validate_bt deactivated");
        return this;
    }

    public ValidatePage clickReplayButton() {
        SeleniumWaits.elementToBeClickable(webDriver, replayBtn);
        replayBtn.click();
        SeleniumWaits.attributeToBe(webDriver, replayBtn, "class", "button col-24 validate_bt activated");
        return this;
    }

    public ValidatePage clickValidateButtonAndWaitForAmlForm() {
        By ticketImage = By.xpath("//div[@class='col-24 row-12 p_rel ticketScreen']/img");
        WebElement validate = webDriver.findElement(By.xpath("//a[text()='Validate']"));
        SeleniumWaits.presenceOfElementLocated(webDriver, ticketImage);
        clickElement(validate);
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("//h1[text()='AML form']"));
        return this;
    }

    public ValidatePage clickValidateButtonAndWaitForLottoXlForm() {
        By ticketImage = By.xpath("//div[@class='col-24 row-12 p_rel ticketScreen']/img");
        WebElement validate = webDriver.findElement(By.xpath("//a[text()='"
                + Properties.getPropertyValue("Validate") + "']"));
        SeleniumWaits.presenceOfElementLocated(webDriver, ticketImage);
        clickElement(validate);
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("//p[text()='"+Properties.getPropertyValue("PlayWithXlMessage")+"']"));
        return this;
    }

    public String getValidationErrorMessage() {
        By popUpMessage = By.xpath("/html/body/div[1]/div/span/span/div[2]/p");
        SeleniumWaits.presenceOfElementLocated(webDriver, popUpMessage);
        return webDriver.findElement(popUpMessage).getText();
    }

    public String getValidateRaffleMessage() {
        By popUpMessage = By.xpath("//p[text()='U bent winnaar van een Super Zaterdag prijs! Wilt u deze deelname uitbetalen?']");
        SeleniumWaits.presenceOfElementLocated(webDriver, popUpMessage);
        return webDriver.findElement(popUpMessage).getText();
    }

    public String getPopupText() {
        By popUp = By.xpath("/html/body/div[1]/div/div/span/span/p");
        SeleniumWaits.presenceOfElementLocated(webDriver, popUp);
        return webDriver.findElement(popUp).getText();
    }

    public void clickYes() {
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("//a[.='"+Properties.getPropertyValue("Yes")+"']"));
        clickElement(webDriver.findElement(By.xpath("//a[.='"+Properties.getPropertyValue("Yes")+"']")));
    }

    public void clickNo() {
        SeleniumWaits.presenceOfElementLocated(webDriver, By.xpath("//a[.='"+Properties.getPropertyValue("No")+"']"));
        clickElement(webDriver.findElement(By.xpath("//a[.='"+Properties.getPropertyValue("No")+"']")));
    }

    public String getCssClassesForWebElement(WebElement webElement) {
        return webElement.getAttribute("class");
    }

    public ClaimFormTerminalUi clickClaimButton() {
        By ticketImage = By.xpath("//*[@id='react-tabs-7']/div/div[2]/div[1]/div[1]//*");
        By claim = By.xpath("/html/body/div/div[2]/div[2]/div[2]/div/main/div/div[1]/div/div[3]/div[2]/a[4]");
        SeleniumWaits.presenceOfElementLocated(webDriver, ticketImage);
        SeleniumWaits.presenceOfElementLocated(webDriver, claim);
        SeleniumWaits.elementToBeClickable(webDriver, claim).click();
        SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("//p[.='" + Properties.getPropertyValue("ClaimRequest") + "']"));
        return new ClaimFormTerminalUi(webDriver);
    }

    public String getValidationErrorMessageHeader() {
        By popUpMessage = By.xpath("/html/body/div[1]/div/span/span/h1/span");
        SeleniumWaits.presenceOfElementLocated(webDriver, popUpMessage);
        return webDriver.findElement(popUpMessage).getText();
    }
}
