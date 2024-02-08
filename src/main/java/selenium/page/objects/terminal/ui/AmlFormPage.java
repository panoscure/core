package selenium.page.objects.terminal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;

public class AmlFormPage extends PageObject {

    @FindBy(xpath = "//div[./label[text()='Name and Surname']]/input")
    private WebElement inputNameAndSurname;

    @FindBy(xpath = "//div[./label[text()='Residence']]/input")
    private WebElement inputResidence;

    @FindBy(xpath = "//div[./label[text()='City and Postal Code']]/input")
    private WebElement inputCityAndPostalCode;

    @FindBy(xpath = "//div[./label[text()='Date of Birth']]/input")
    private WebElement inputDateOfBirth;

    @FindBy(xpath = "//div[./label[text()='OIB/ID Number']]/input")
    private WebElement inputOIBIDNumber;

    @FindBy(xpath = "//div[./label[text()='Citizenship']]/input")
    private WebElement inputCitizenship;

    @FindBy(xpath = "//div[./label[text()='Name and Number of Identification Document']]/input")
    private WebElement inputNameAndNumberOfIdentificationDocument;

    @FindBy(xpath = "//div[./label[text()='Name and Country of Issuing Authority']]/input")
    private WebElement inputNameAndCountryOfIssuingAuthority;

    @FindBy(xpath = "//div[text()='Submit']")
    private WebElement submitButton;


    public AmlFormPage(WebDriver webDriver) {
        super(webDriver);
    }

    public AmlFormPage fillNameAndSurname(String nameAndSurname) throws InterruptedException {
        SeleniumWaits.visibilityOf(webDriver, inputNameAndSurname).click();
        for (char digit : String.valueOf(nameAndSurname).toCharArray()) {
            Thread.sleep(300);
            clickElement(webDriver.findElement(
                    By.xpath("//span[@class='ui-keyboard-text' and text()='" + digit + "']")));
        }
        return this;
    }

    public AmlFormPage fillResidence(String residence) throws InterruptedException {
        SeleniumWaits.visibilityOf(webDriver, inputResidence).click();
        for (char digit : String.valueOf(residence).toCharArray()) {
            Thread.sleep(300);
            clickElement(webDriver.findElement(
                    By.xpath("//span[@class='ui-keyboard-text' and text()='" + digit + "']")));
        }
        return this;
    }

    public AmlFormPage fillCityAndPostalCode(String cityAndPostalCode) throws InterruptedException {
        SeleniumWaits.visibilityOf(webDriver, inputCityAndPostalCode).click();
        for (char digit : String.valueOf(cityAndPostalCode).toCharArray()) {
            Thread.sleep(300);
            clickElement(webDriver.findElement(
                    By.xpath("//span[@class='ui-keyboard-text' and text()='" + digit + "']")));
        }
        return this;
    }

    public AmlFormPage fillDateOfBirth(String dateOfBirth) throws InterruptedException {
        SeleniumWaits.visibilityOf(webDriver, inputDateOfBirth).click();
        for (char digit : String.valueOf(dateOfBirth).toCharArray()) {
            Thread.sleep(300);
            clickElement(webDriver.findElement(
                    By.xpath("//span[@class='ui-keyboard-text' and text()='" + digit + "']")));
        }
        return this;
    }

    public AmlFormPage fillOIBIDNumber(String OibIdNumber) throws InterruptedException {
        SeleniumWaits.visibilityOf(webDriver, inputOIBIDNumber).click();
        for (char digit : String.valueOf(OibIdNumber).toCharArray()) {
            Thread.sleep(300);
            clickElement(webDriver.findElement(
                    By.xpath("//span[@class='ui-keyboard-text' and text()='" + digit + "']")));
        }
        return this;
    }

    public AmlFormPage fillCitizenship(String citizenship) throws InterruptedException {
        SeleniumWaits.visibilityOf(webDriver, inputCitizenship).click();
        for (char digit : String.valueOf(citizenship).toCharArray()) {
            Thread.sleep(300);
            clickElement(webDriver.findElement(
                    By.xpath("//span[@class='ui-keyboard-text' and text()='" + digit + "']")));
        }
        return this;
    }

    public AmlFormPage fillNameAndNumberOfIdentificationDocument(String nameAndNumberOfIdentificationDocument) throws InterruptedException {
        SeleniumWaits.visibilityOf(webDriver, inputNameAndNumberOfIdentificationDocument).click();
        for (char digit : String.valueOf(nameAndNumberOfIdentificationDocument).toCharArray()) {
            Thread.sleep(300);
            clickElement(webDriver.findElement(
                    By.xpath("//span[@class='ui-keyboard-text' and text()='" + digit + "']")));
        }
        return this;
    }

    public AmlFormPage fillNameAndCountryOfIssuingAuthority(String nameAndCountryOfIssuingAuthority) throws InterruptedException {
        SeleniumWaits.visibilityOf(webDriver, inputNameAndCountryOfIssuingAuthority).click();
        for (char digit : String.valueOf(nameAndCountryOfIssuingAuthority).toCharArray()) {
            Thread.sleep(300);
            clickElement(webDriver.findElement(
                    By.xpath("//span[@class='ui-keyboard-text' and text()='" + digit + "']")));
        }
        return this;
    }

    public AmlFormPage closeKeyboard() {
        webDriver.findElement(By.xpath("(//div[@class='closeButton'])[2]")).click();
        return this;
    }

    public AmlFormPage clickSubmitButton() {
        SeleniumWaits.elementToBeClickable(webDriver, submitButton).click();
        return this;
    }

    public AmlFormPage clickOkOnPopUpToScanDocuments() {
        SeleniumWaits.visibilityOf(webDriver, webDriver.findElement(
                By.xpath("//div[text()=\"Please scan the customer's ID or Passport\"]")));
        webDriver.findElement(By.xpath("//a[text()='OK']")).click();
        return this;
    }

    public AmlFormPage clickNewScanButton() {
        SeleniumWaits.visibilityOf(webDriver, webDriver.findElement(
                By.xpath("//span[text()='New Scan']"))).click();
        return this;
    }

    public AmlFormPage clickAcceptScanButton() {
        SeleniumWaits.visibilityOf(webDriver, webDriver.findElement(
                By.xpath("//span[text()='Accept']"))).click();
        return this;
    }

    public AmlFormPage selectScanTypeForDocumentInRow(String scanType, int row) {
        SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(By.xpath("(//select)[" + row + "]")));
        Select select = new Select(webDriver.findElement(By.xpath("(//select)[" + row + "]")));
        new FluentWait<>(webDriver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(100))
                .until((webDriver -> (select.getOptions().size() > 1)));
        select.selectByVisibleText(scanType);
        return this;
    }

    public AmlFormPage clickUploadButton() {
        SeleniumWaits.visibilityOf(webDriver, webDriver.findElement(By.xpath("//span[text()='Upload']"))).click();
        await().pollInterval(2, TimeUnit.SECONDS).atMost(2, TimeUnit.MINUTES).until(() ->
                webDriver.findElements(By.xpath("//div[text()='All done']")).size()>0);
        SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(By.xpath("//a[text()='OK']"))).click();
        return this;
    }

}
