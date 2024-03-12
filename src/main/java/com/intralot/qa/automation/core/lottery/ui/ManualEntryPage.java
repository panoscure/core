package com.intralot.qa.automation.core.lottery.ui;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import com.intralot.qa.automation.core.driver.engine.JavaScriptExecutors;
import com.intralot.qa.automation.core.driver.engine.SeleniumWaits;
import selenium.page.objects.PageObject;
import java.math.BigInteger;
import java.util.stream.IntStream;

public class ManualEntryPage extends PageObject {

    private static final By alertTopRightSuccessMessage =
            By.xpath("//*[@class = 'top-right']//*[contains(text(),'successful')]");

    @FindBy(xpath = "//input[@name='wagerIdSearch']")
    private WebElement wagerIdSearchInput;

    @FindBy(name = "serialSearch")
    private WebElement serialNumberInput;

    @FindBy(xpath = "//button[contains(text(), 'Search')]")
    private WebElement searchButton;

    @FindBy(name = "block")
    private WebElement blockButton;

    @FindBy(name = "cancel")
    private WebElement cancelButton;

    @FindBy(name = "undoCancel")
    private WebElement undoCancelButton;

    @FindBy(xpath = "//div[./label[@for='serialNumber']]//span")
    private WebElement serialNumberElement;

    @FindBy(xpath = "//div[./label[@for='wagerId']]")
    private WebElement wagerId;

    @FindBy(xpath = "//div[./label[@for='parent_wagerId']]")
    private WebElement exchangeWagerId;

    @FindBy(xpath = "//a[contains(text(),'Wager Details for game:')]")
    private WebElement wagerDetailsButton;

    @FindBy(xpath = "//label[text()='Cost']//following-sibling::div//div")
    private WebElement wagerCost;

    @FindBy(xpath = "//label[text()='Columns']//following-sibling::div//div")
    private WebElement wagerColumns;

    @FindBy(xpath = "//div[./label[@for='channel']]")
    private WebElement channel;

    @FindBy(xpath = "//div[./label[@for='wager_multipliers']]")
    private WebElement wagerMultipliers;

    @FindBy(xpath = "//div[./label[@for='wager_discount']]")
    private WebElement wagerDiscount;

    @FindBy(xpath = "//div[./label[@for='wager_draws']]")
    private WebElement numberOfDraws;

    @FindBy(xpath = "//label[text()='First Draw']//following-sibling::div//div")
    private WebElement firstDraw;

    @FindBy(xpath = "//label[text()='Last Draw']//following-sibling::div//div")
    private WebElement lastDraw;

    @FindBy(xpath = "//div[./label[@for='wager_game']]")
    private WebElement wagerGameId;

    @FindBy(xpath = "//div[./label[@for='wager_multipleDraws']]")
    private WebElement multipleDraws;

    @FindBy(xpath = "//div[./label[@for='wager_playedDraw']]")
    private WebElement playedDraw;

    @FindBy(xpath = "//div[./label[@for='wager_status']]")
    private WebElement status;

    @FindBy(xpath = "//div[./label[@for='wager_blockStatus']]")
    private WebElement blockStatus;

    @FindBy(xpath = "//a[text()='Board Details']")
    private WebElement boardDetailsButton;

    @FindBy(xpath = "//a[text()='Panels Details']")
    private WebElement panelsDetailsButton;

    @FindBy(xpath = "//*[@id='panel_information']/div/div[2]/div/table/tbody/tr[1]/td[2]")
    private WebElement firstPanelSelectionNumbers;

    @FindBy(xpath = "//*[@id='panel_information']/div/div[2]/div/table/tbody/tr[2]/td[2]")
    private WebElement secondPanelSelectionNumbers;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div/div[2]/form/div/div/textarea")
    private WebElement commentBox;

    @FindBy(xpath = "//button[contains(text(), 'Perform Action')]")
    private WebElement permormButton;

    @FindBy(xpath = "//div[./label[text()='Action Request']]/div")
    private WebElement actionRequest;

    @FindBy(xpath = "//*[text()='Action Request']/parent::*/following-sibling::*//*[text()='Status']/following-sibling::*//p")
    private WebElement actionStatus;

    @FindBy(xpath = "//div[./label[@for='winningsForGame_status']]")
    private WebElement winningStatus;

    @FindBy(xpath = "//button[text()='Perform Action!']")
    private WebElement performActionBtnBlockWager;

    @FindBy(name = "unblock")
    private WebElement unblockBtn;

    @FindBy(xpath = "//a[contains(text(),'Winning Details for game:')]")
    private WebElement expandWinningDetailsLinkText;

    @FindBy(xpath = "//*[@id='winnings_information']/div/div[2]/div/div[1]/form/div[5]")
    private WebElement totalGrossAmount;


    public ManualEntryPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ManualEntryPage fillWagerId(BigInteger wagerId) {
        wagerIdSearchInput.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        wagerIdSearchInput.sendKeys(wagerId.toString());
        return this;
    }

    public ManualEntryPage fillSerialNumber(String serialNumber) {
        SeleniumWaits.elementToBeClickable(webDriver, serialNumberInput);
        while (!serialNumberInput.getAttribute("value").equals(serialNumber)) {
            serialNumberInput.clear();
            serialNumberInput.sendKeys(serialNumber);
        }
        return this;
    }

    public ManualEntryPage clearSerialNumber() {
        serialNumberInput.sendKeys(Keys.chord(Keys.chord(Keys.CONTROL, "a")));
        searchButton.sendKeys(Keys.BACK_SPACE);
        return this;
    }

    public ManualEntryPage clickSearchButton() {
        SeleniumWaits.elementToBeClickable(webDriver, searchButton);
        searchButton.click();
        SeleniumWaits.invisibilityOfElementLocated(webDriver, By.className("block-ui-container"));
        return this;
    }

    public String getSerialNumber() {
        return serialNumberElement.getText();
    }

    public String getWagerId() {
        return wagerId.getText().substring("Wager ID:".length()).trim();
    }

    public String getExchangedWagerIds() {
        return exchangeWagerId.getText().substring("Exchanged Wager Ids:".length()).trim();
    }

    public String getParentWagerId() {
        return exchangeWagerId.getText().substring("Parent Wager Id:".length()).trim();
    }

    public ManualEntryPage clickPayButton() {
        // Because Pay button does not appear immediately, try 20 times by clicking the search button for this wager each time
        IntStream.rangeClosed(1, 20).forEach((int repetition) -> {
            if (webDriver.findElements(By.xpath("//button[contains(@name,'pay')]")).size() == 0) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                JavaScriptExecutors.clickElement(webDriver, searchButton);
            }
        });
        JavaScriptExecutors.clickElementBy(webDriver, By.xpath("//button[contains(@name,'pay')]"));
        return this;
    }

    public ManualEntryPage clickBlockButton() {
        SeleniumWaits.elementToBeClickable(webDriver, blockButton);
        JavaScriptExecutors.clickElement(webDriver, blockButton);
        return this;
    }

    public ManualEntryPage clickUnblockButton() {
        SeleniumWaits.elementToBeClickable(webDriver, unblockBtn);
        JavaScriptExecutors.clickElement(webDriver, unblockBtn);
        return this;
    }

    public ManualEntryPage insertActionComment() {
        SeleniumWaits.elementToBeClickable(webDriver, commentBox);
        commentBox.sendKeys("comment");
        return this;
    }

    public void performActionDialoguePopUp() {
        SeleniumWaits.elementToBeClickable(webDriver, permormButton);
        permormButton.click();
        SeleniumWaits.invisibilityOfElementLocated(webDriver, By.className("loading-indicator"));
    }

    public void expandWinningSection() {
        By winningsLink = By.xpath("//*[@id='winnings_information']/div/div[1]/h4/a");
        JavaScriptExecutors.clickElement(webDriver, SeleniumWaits.elementToBeClickable(webDriver, winningsLink));
        SeleniumWaits.visibilityOf(webDriver, status);
    }

    public String getGameName() {
        return wagerDetailsButton.getText();
    }

    public String getChannel() {
        return channel.getText().substring("Channel:".length()).trim();
    }

    public String getCost() {
        SeleniumWaits.visibilityOf(webDriver, wagerCost);
        return wagerCost.getText().substring("Cost".length()).trim();
    }

    public int getColumns() {
        String columns = wagerColumns.getText().substring("Columns".length()).trim();
        return Integer.parseInt(columns);
    }

    public String getMultipliers() {
        return wagerMultipliers.getText().substring("Multipliers".length()).trim();
    }

    public String getGameId() {
        return wagerGameId.getText();
    }

    public String getDiscount() {
        return wagerDiscount.getText().substring("Discount".length()).trim();
    }

    public int getNumberOfDraws() {
        return Integer.parseInt(numberOfDraws.getText().substring("Number of Draws".length()).trim());
    }

    public int getFirstDraw() {
        return Integer.parseInt(firstDraw.getText().substring("First Draw".length()).trim());
    }

    public String getFirstDrawAndVisualDraw() {
        return this.firstDraw.getText().substring("First Draw".length()).trim();
    }

    public int getLastDraw() {
        return Integer.parseInt(lastDraw.getText().substring("Last Draw".length()).trim());
    }

    public String getLastDrawAndVisualDraw() {
        return this.lastDraw.getText().substring("Last Draw".length()).trim();
    }

    public int getMultipleDraws() {
        String multiDraws = multipleDraws.getText().substring("Multiple Draws".length()).trim();
        return Integer.parseInt(multiDraws);
    }

    public int getPlayedDraw() {
        return Integer.parseInt(playedDraw.getText().substring("Played Draw".length()).trim());
    }

    public String getPlayedDrawAndVisualDraw() {
        return this.playedDraw.getText().substring("Played Draw".length()).trim();
    }

    public String getStatus() {
        return status.getText().substring("Status".length()).trim();
    }

    public String getBlockStatus() {
        return blockStatus.getText().substring("Block Status".length()).trim();
    }

    public int getBoardId(int boardId) {
        By requestedField = By.xpath("//*[@id='boards_details']//*[contains(@class,'panel ') and .//*[contains(text(),'Board: " + boardId + "')]]//div[@class='form-group' and .//*[text()='BoardId:']]");
        SeleniumWaits.visibilityOfElementLocated(webDriver, requestedField);
        String fieldText = webDriver.findElement(requestedField).getText();
        return Integer.parseInt(fieldText.substring("BoardId:".length()).trim());
    }

    public String getMultipliersOfBoard(int board) {
        SeleniumWaits.visibilityOfElementLocated(webDriver, By.xpath("//*[@id='boards_details']//*[contains(@class,'panel ') and .//*[contains(text(),'Board: "
                + board + "')]]//div[@class='form-group' and .//*[text()='Multipliers:']]"));
        By requestedField = By.xpath("//*[@id='boards_details']//*[contains(@class,'panel ') and .//*[contains(text(),'Board: " + board
                + "')]]//div[@class='form-group' and .//*[text()='Multipliers:']]");
        String fieldText = webDriver.findElement(requestedField).getText();
        return fieldText.substring("Multipliers:".length()).trim();
    }

    public void expandPanelsOfBoard(int board) {
        By panelsButton = By.xpath("//*[@id='boards_details']//*[contains(@class,'panel ') and .//*[contains(text(),'Board: " + board + "')]]//a[text()='Panels Details']");
        JavaScriptExecutors.clickElementBy(webDriver, panelsButton);
    }

    public String getPanelQuickpickOfBoard(int board, int panel) {
        By requestedField = By.xpath("//*[@id='boards_details']//*[contains(@class,'panel ') and .//*[contains(text(),'Board: " + board + "')]]//*[@id='panel_information']//tr[" + panel + "]/td[3]");
        return webDriver.findElement(requestedField).getAttribute("innerHTML");
    }

    public int getPanelRequestedSelectionsOfBoard(int board, int panel) {
        By requestedField = By.xpath("//*[@id='boards_details']//*[contains(@class,'panel ') and .//*[contains(text(),'Board: " + board
                + "')]]//*[@id='panel_information']//tr[" + panel + "]/td[4]");
        return Integer.parseInt(webDriver.findElement(requestedField).getAttribute("innerHTML"));
    }

    public int getPanelIdOfBoard(int board, int panel) {
        By requestedField = By.xpath("//*[@id='boards_details']//*[contains(@class,'panel ') and .//*[contains(text(),'Board: " + board
                + "')]]//*[@id='panel_information']//tr[" + panel + "]/td[1]");
        return Integer.parseInt(webDriver.findElement(requestedField).getAttribute("innerHTML"));
    }

    public void expandBoard(int board) {
        By boardButton = By.xpath("//*[@id='boards_details']//*[contains(@class,'panel ') and .//*[contains(text(),'Board: " + board + "')]]//a");
        JavaScriptExecutors.scrollToElementBy(webDriver, boardButton);
        JavaScriptExecutors.clickElementBy(webDriver, boardButton);
        SeleniumWaits.visibilityOfAllElementsLocatedBy(webDriver,
                By.xpath("(//*[@id='boards_details']//*[contains(@class,'panel ') and .//*[contains(text(),'Board: " + board + "')]]//a)[2]"));
    }

    public void clickBoardDetails() {
        JavaScriptExecutors.clickElement(webDriver, boardDetailsButton);
    }

    public void clickPanelDetails() {
        JavaScriptExecutors.clickElement(webDriver, panelsDetailsButton);
    }

    public String getPanelSelectionsOfBoard(int board, int panel) {
        By requestedField = By.xpath("//*[@id='boards_details']//*[contains(@class,'panel ') and .//*[contains(text(),'Board: " + board
                + "')]]//*[@id='panel_information']//tr[" + panel + "]/td[2]");
        SeleniumWaits.elementToBeClickable(webDriver, webDriver.findElement(requestedField));
        return webDriver.findElement(requestedField).getText();
    }

    public String getFirstPanelSelectionNumbers() {
        return firstPanelSelectionNumbers.getText();
    }

    public String getSecondPanelSelectionNumbers() {
        return secondPanelSelectionNumbers.getText();
    }

    public String getWinningStatus() {
        SeleniumWaits.visibilityOf(webDriver, winningStatus);
        String text = winningStatus.getText();
        return text.substring("Status".length()).trim();
    }

    public String getActionRequest() {
        return actionRequest.getText();
    }

    public String getActionStatus() {
        return actionStatus.getText();
    }

    public boolean checkPresenceOfElement(By element) {
        try {
            return SeleniumWaits.visibilityOfElementLocated(webDriver, element)
                    .isDisplayed();
        } catch (TimeoutException notFound) {
            return false;
        }
    }

    public ManualEntryPage clickCancelButton() {
        SeleniumWaits.elementToBeClickable(webDriver, cancelButton);
        cancelButton.click();
        return this;
    }

    public ManualEntryPage expandWinningDetails() {
        SeleniumWaits.elementToBeClickable(webDriver, searchButton);
        JavaScriptExecutors.clickElement(webDriver, expandWinningDetailsLinkText);
        return this;
    }

    public String getWinningsDrawId(int drawSequence) {
        return webDriver.findElement(By.xpath("//*[@id='draw_winningDetails']/div[" + drawSequence + "]/div[1]/a")).getAttribute("innerText");
    }

    public String getWinningsGrossAmount(int drawSequence) {
        return webDriver.findElement(By.xpath("//*[@id='draw_winningDetails']/div[" + drawSequence + "]//td[5]")).getAttribute("innerText");
    }

    public String getWinningsNetAmount(int drawSequence) {
        return webDriver.findElement(By.xpath("//*[@id='draw_winningDetails']/div[" + drawSequence + "]//td[6]")).getAttribute("innerText");
    }

    public String getWinningsFirstCategoryId() {
        return webDriver.findElement(By.xpath("//*[@id='winning_categories']/div/div[2]/div/div/div/table/tbody/tr/td[1]")).getAttribute("innerText");
    }

    public String getRaffleWinningsCategoryId() {
        return webDriver.findElement(By.xpath("//*[@id='winning_categories']/div/div[2]/div/div[2]/div/table/tbody/tr/td[1]")).getAttribute("innerText");
    }

    public String getWinningsTaxAmount(int drawSequence) {
        return webDriver.findElement(By.xpath("//*[@id='draw_winningDetails']/div[" + drawSequence + "]//td[7]")).getAttribute("innerText");
    }

    public String getTotalGrossAmount() {
        return totalGrossAmount.getText();
    }

    public ManualEntryPage clickUndoCancelButton() {
        SeleniumWaits.elementToBeClickable(webDriver, undoCancelButton);
        undoCancelButton.click();
        return this;
    }
}
