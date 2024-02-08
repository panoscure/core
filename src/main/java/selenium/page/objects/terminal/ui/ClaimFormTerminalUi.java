package selenium.page.objects.terminal.ui;

import com.intralot.qa.automation.core.driver.engine.common.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;

public class ClaimFormTerminalUi extends PageObject {

    public ClaimFormTerminalUi(WebDriver webDriver) {
        super(webDriver);
    }

    public ClaimFormTerminalUi enterInitials(String initials) throws InterruptedException {
        By initialsLocator = By.id("initials0");
        SeleniumWaits.visibilityOfElementLocated(webDriver, initialsLocator).click();
        for (char c : initials.toCharArray()) {
            SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[@data-value='" + c + "']")).click();
            Thread.sleep(100);
        }
        return this;
    }

    public ClaimFormTerminalUi enterInitialsForSecondWinner(String initials) throws InterruptedException {

        WebElement initialsElement = SeleniumWaits.visibilityOfElementLocated(webDriver, By.name("initials1"));
        JavaScriptExecutors.scrollToElement(webDriver, initialsElement);
        initialsElement.click();

        for (char c : initials.toCharArray()) {
            SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[@data-value='" + c + "']")).click();
            Thread.sleep(100);
        }
        return this;
    }

    public ClaimFormTerminalUi enterFullName(String fullName) throws InterruptedException {
        By nameLocator = By.name("lastName0");
        SeleniumWaits.visibilityOfElementLocated(webDriver, nameLocator).click();
        for (char c : fullName.toCharArray()) {
            if (c == ' ')
                SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[@title='Space']"))
                        .click();
            else
                SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[@data-value='" + c + "']"))
                        .click();
            Thread.sleep(100);
        }
        return this;
    }

    public ClaimFormTerminalUi enterFullNameForSecondWinner(String fullName) throws InterruptedException {

        WebElement nameElement = SeleniumWaits.visibilityOfElementLocated(webDriver, By.name("lastName1"));
        JavaScriptExecutors.scrollToElement(webDriver, nameElement);
        nameElement.click();

        for (char c : fullName.toCharArray()) {
            if (c == ' ')
                SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[@title='Space']"))
                        .click();
            else
                SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[@data-value='" + c + "']"))
                        .click();
            Thread.sleep(100);
        }
        return this;
    }

    public ClaimFormTerminalUi enterPhone(String phone) throws InterruptedException {
        By phoneLocator = By.name("phone0");
        SeleniumWaits.visibilityOfElementLocated(webDriver, phoneLocator).click();
        for (char c : phone.toCharArray()) {
            SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[@data-value='" + c + "']"))
                    .click();
            Thread.sleep(100);
        }
        return this;
    }

    public ClaimFormTerminalUi enterPhoneForSecondWinner(String phone) throws InterruptedException {

        WebElement phoneElement = SeleniumWaits.visibilityOfElementLocated(webDriver, By.name("phone1"));
        JavaScriptExecutors.scrollToElement(webDriver, phoneElement);
        phoneElement.click();

        for (char c : phone.toCharArray()) {
            SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[@data-value='" + c + "']"))
                    .click();
            Thread.sleep(100);
        }
        return this;
    }

    public ClaimFormTerminalUi enterIban(String iban) throws InterruptedException {
        By ibanLocator = By.name("iban0");
        SeleniumWaits.visibilityOfElementLocated(webDriver, ibanLocator).click();
        for (char c : iban.toCharArray()) {
            if (Character.isUpperCase(c)) {
                SeleniumWaits.elementToBeClickable(webDriver, By.xpath("(//span[text()='Shift'])[1]")).click();
                Thread.sleep(200);
                SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[@data-value='" + c + "']")).click();
                Thread.sleep(200);
                SeleniumWaits.elementToBeClickable(webDriver, By.xpath("(//span[text()='Shift'])[2]")).click();
                Thread.sleep(200);
            } else {
                SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[@data-value='" + c + "']"))
                        .click();
                Thread.sleep(100);
            }
        }
        return this;
    }

    public ClaimFormTerminalUi enterIbanForSecondWinner(String iban) throws InterruptedException {

        WebElement ibanElement = SeleniumWaits.visibilityOfElementLocated(webDriver, By.name("iban1"));
        JavaScriptExecutors.scrollToElement(webDriver, ibanElement);
        ibanElement.click();

        for (char c : iban.toCharArray()) {
            if (Character.isUpperCase(c)) {
                SeleniumWaits.elementToBeClickable(webDriver, By.xpath("(//span[text()='Shift'])[1]")).click();
                Thread.sleep(200);
                SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[@data-value='" + c + "']")).click();
                Thread.sleep(200);
                SeleniumWaits.elementToBeClickable(webDriver, By.xpath("(//span[text()='Shift'])[2]")).click();
                Thread.sleep(200);
            } else {
                SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[@data-value='" + c + "']"))
                        .click();
                Thread.sleep(100);
            }
        }
        return this;
    }

    public ClaimFormTerminalUi enterAmount(String amount) throws InterruptedException {
        WebElement amountTextBox = SeleniumWaits.visibilityOfElementLocated(webDriver, By.name("amount0"));
        JavaScriptExecutors.scrollToElement(webDriver, amountTextBox);
        amountTextBox.click();

        for (char c : amount.toCharArray()) {
            Thread.sleep(300);
            SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[@data-value='" + c + "']"))
                    .click();
        }
        return this;
    }

    public ClaimFormTerminalUi enterAmountForSecondWinner(String amount) throws InterruptedException {
        WebElement amountTextBox = SeleniumWaits.visibilityOfElementLocated(webDriver, By.name("amount1"));
        JavaScriptExecutors.scrollToElement(webDriver, amountTextBox);
        amountTextBox.click();

        for (char c : amount.toCharArray()) {
            Thread.sleep(300);
            SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//button[@data-value='" + c + "']"))
                    .click();
        }
        return this;
    }

    public ClaimFormTerminalUi clickPrint() {
        By printLocator = By.xpath("//span[text()='" + Properties.getPropertyValue("Print") + "']");
        SeleniumWaits.elementToBeClickable(webDriver, printLocator).click();
        return this;
    }

    public ClaimFormTerminalUi clickClaim() {
        By claimLocator = By.xpath("//span[text()='Bank']");
        SeleniumWaits.elementToBeClickable(webDriver, claimLocator).click();
        return this;
    }

    public ClaimFormTerminalUi closeKeyBoard() {
        SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//div[@class='closeButton']")).click();
        return this;
    }

    public ClaimFormTerminalUi clickAddWinner() {
        SeleniumWaits.elementToBeClickable(webDriver, By.xpath("//div[@class='button activated' and ./span[text()='Winnaar toevoegen']]")).click();
        return this;
    }
}
