package selenium.page.objects.terminal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

import java.util.List;

public class LockPage extends PageObject {

    @FindBy(name = "username")
    private WebElement inputUsername;

    @FindBy(name = "password")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@data-action='clear']")
    private WebElement clear;

    @FindBy(xpath = "//button[@data-action='0']")
    private WebElement button_0;

    @FindBy(xpath = "//button[@data-action='1']")
    private WebElement button_1;

    @FindBy(xpath = "//button[@data-action='P']")
    private WebElement button_P;

    @FindBy(xpath = "//button[@data-action='@']")
    private WebElement button_AT;

    @FindBy(xpath = "//button[@data-action='s']")
    private WebElement button_s;

    @FindBy(xpath = "//button[@data-action='w']")
    private WebElement button_w;

    @FindBy(xpath = "//button[@data-action='r']")
    private WebElement button_r;

    @FindBy(xpath = "//button[@data-action='d']")
    private WebElement button_d;

    @FindBy(xpath = "//button[@data-action='-']")
    private WebElement dash;

    @FindBy(xpath = "//button[@data-action='shift']")
    private List<WebElement> shifts;

    @FindBy(xpath = "//a[@class='button activated']")
    private WebElement button_Login;

    String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";

    public LockPage(WebDriver webDriver, String url) {
        super(webDriver);
        webDriver.navigate().to(url);
    }

    public LockPage enterUsername(String username) throws InterruptedException {
        SeleniumWaits.presenceOfElementLocated(webDriver, By.name("username"));
        inputUsername.click();
        Thread.sleep(300);
        clickElement(webDriver.findElement(By.xpath("//span[@class='ui-keyboard-text' and text()='Clear']")));
        for (char digit : String.valueOf(username).toCharArray()) {
            Thread.sleep(300);
            SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(
                    By.xpath("//span[@class='ui-keyboard-text' and text()='" + digit + "']"))).click();
        }
        return this;
    }

    public LockPage enterPassword(String password) throws InterruptedException {
        SeleniumWaits.presenceOfElementLocated(webDriver, By.name("password"));
        inputPassword.click();
        Thread.sleep(300);
        clickElement(webDriver.findElement(By.xpath("//span[@class='ui-keyboard-text' and text()='Clear']")));
        for (char digit : String.valueOf(password).toCharArray()) {
            Thread.sleep(300);
            if (Character.isUpperCase(digit) || specialChars.contains(String.valueOf(digit))) {
                SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(
                        By.xpath("(//span[@class='ui-keyboard-text' and text()='Shift'])[1]"))).click();
                Thread.sleep(300);
                SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(
                        By.xpath("//span[@class='ui-keyboard-text' and text()='" + digit + "']"))).click();
                Thread.sleep(300);
                SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(
                        By.xpath("(//span[@class='ui-keyboard-text' and text()='Shift'])[2]"))).click();
            } else {
                SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(
                        By.xpath("//span[@class='ui-keyboard-text' and text()='" + digit + "']"))).click();
            }
        }
        return this;
    }

    public HomePage clickLogin() {
        SeleniumWaits.elementToBeClickable(webDriver, button_Login).click();
        return new HomePage(webDriver);
    }

    public String expectedPageHeading() {
        return "Canvas Terminal Product";
    }

    public String getPageHeading(WebDriver webDriver) {
        return webDriver.getTitle();
    }

}
