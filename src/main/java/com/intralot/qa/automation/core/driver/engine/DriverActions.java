package com.intralot.qa.automation.core.driver.engine;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.intralot.qa.automation.core.utilities.CustomProperties;
import com.intralot.qa.automation.core.utilities.HelperUtilities;
import com.intralot.qa.automation.core.utilities.Log;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.SupportsContextSwitching;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.Reporter;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static org.testng.AssertJUnit.assertEquals;

public class DriverActions {

    public enum ScrollDirection {
        UP, DOWN, LEFT, RIGHT
    }

    public enum ScrollType {
        VERTICAL, HORIZONTAL
    }

    public static Dimension windowSize;

    private static Duration SCROLL_DUR = ofMillis(1000);

    private static double SCROLL_RATIO = 0.8;

    private static int SCROLL_DIVISOR = 3;

    // Method(s) applicable only for Web Sessions
    public static void goToBaseUrl(WebDriver webDriver, String targetUrl) {
        webDriver.get(targetUrl);
    }

    public static void navigateToBaseUrl(WebDriver webDriver, String targetUrl) {
        webDriver.navigate().to(targetUrl);
    }

    public static void refreshPage(WebDriver webDriver) {
        webDriver.navigate().refresh();
    }

    public static void maximizeWindow(WebDriver webDriver) {
        webDriver.manage().window().maximize();
    }

    public static void goBack(WebDriver webDriver) {
        webDriver.navigate().back();
    }

    public static void closeBrowser(WebDriver webDriver) {
        webDriver.close();
    }

    public static void closeSession(WebDriver webDriver) {
        webDriver.quit();
    }

    // (Re-)Launch for Android
    public static void activateApplication(AppiumDriver appiumDriver, String appId) {
        appiumDriver.executeScript("mobile: activateApp", ImmutableMap.of("appId", appId));
    }

    // (Re-)Launch for iOS
    public static void launchApplication(AppiumDriver appiumDriver, String bundleId) {
        appiumDriver.executeScript("mobile: launchApp", ImmutableMap.of("bundleId", bundleId));
    }

    public static void removeApplication(AppiumDriver appiumDriver, String appId) {
        appiumDriver.executeScript("mobile: removeApp", ImmutableMap.of("appId", appId));
    }

    public static void closeApplication(AppiumDriver appiumDriver, String bundleId) {
        appiumDriver.executeScript("mobile: terminateApp", ImmutableMap.of("appId", bundleId));
    }

    public static void closeApplication(AppiumDriver appiumDriver, String appId, Integer timeoutVal) {
        appiumDriver.executeScript("mobile: terminateApp", ImmutableMap.of("appId", appId), ImmutableMap.of("timeout", timeoutVal));
    }

    public static void clearApplicationData(AppiumDriver appiumDriver, String appId) {
        appiumDriver.executeScript("mobile: clearApp", ImmutableMap.of("appId", appId));
    }

    public static void acceptNotification(AppiumDriver appiumDriver) {
        appiumDriver.switchTo().alert().accept();
    }

    public static void tapAndroidBackButtonViaAdb(AppiumDriver appiumDriver) {
        //appiumDriver.executeScript("mobile: shell", ImmutableMap.of("command", "input", "args", "keyevent --longpress 4"));
        executeAdbShellCmd(appiumDriver, "input keyevent --longpress 4");
    }

    public static void toggleAndroidScreenOnOrOff(AppiumDriver appiumDriver) {
        //appiumDriver.executeScript("mobile: shell", ImmutableMap.of("command", "input", "args", "keyevent 26"));
        executeAdbShellCmd(appiumDriver, "input keyevent 26");
    }

    public static void closeAndroidApp(AppiumDriver appiumDriver, String appPackage) {
        executeAdbShellCmd(appiumDriver, "am force-stop " + appPackage);
    }

    public static void closeAndClearDataOfAndroidApp(AppiumDriver appiumDriver, String appPackage) {
        executeAdbShellCmd(appiumDriver, "pm clear " + appPackage);
    }

    public static void uninstallAndroidApp(AppiumDriver appiumDriver, String appPackage) {
        executeAdbShellCmd(appiumDriver, "pm uninstall ––user 0 " + appPackage);
    }

    public static void switchToNativeContext(AppiumDriver appiumDriver) {

        String targetContextView = null;

        ArrayList<String> contextViewList = new ArrayList<>(((SupportsContextSwitching) appiumDriver).getContextHandles());

        for (String contextView : contextViewList) {
            if (contextView.equals("NATIVE_APP")) {
                Log.info("NATIVE_APP context was found, switching to that");
                targetContextView = contextView;
                break;
            }
        }

        ((SupportsContextSwitching) appiumDriver).context(targetContextView);
    }

    public static void switchToWebContext(AppiumDriver appiumDriver) {

        String targetContextView = null;

        ArrayList<String> contextViewList = new ArrayList<>(((SupportsContextSwitching) appiumDriver).getContextHandles());

        for (String contextView : contextViewList) {
            if (!contextView.equals("NATIVE_APP")) {
                Log.info("A Web context named \"" + contextView + "\" was found, switching to that");
                targetContextView = contextView;
                break;
            }
        }

        ((SupportsContextSwitching) appiumDriver).context(targetContextView);
    }


    public static void switchToWebContext(AppiumDriver appiumDriver, String webContextStr) {

        String targetContextView = null;

        ArrayList<String> contextViewList = new ArrayList<>(((SupportsContextSwitching) appiumDriver).getContextHandles());

        for (String contextView : contextViewList) {
            if (contextView.equals(webContextStr)) {
                Log.info(webContextStr + " context was found, switching to that");
                targetContextView = contextView;
                break;
            }
        }

        ((SupportsContextSwitching) appiumDriver).context(targetContextView);
    }

    public static void executeAdbShellCmd(AppiumDriver appiumDriver, String cmdLine) {
        appiumDriver.executeScript("mobile: shell", ImmutableMap.of("command", cmdLine.split("(?=\\s)", 2)[0], "args", cmdLine.split("(?=\\s)", 2)[1]));
    }

    public static Dimension getWindowSize(AppiumDriver appiumDriver) {
        if (windowSize == null) {
            windowSize = appiumDriver.manage().window().getSize();
        }
        return windowSize;
    }

    // W3C Cross-Platform Swipe helper
    public static void swipe(AppiumDriver appiumDriver, Point start, Point end, Duration duration) {

        boolean isAndroid = appiumDriver instanceof AndroidDriver;

        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence swipe = new Sequence(input, 0);
        swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), start.x, start.y));
        swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        if (isAndroid) {
            duration = duration.dividedBy(SCROLL_DIVISOR);
        } else {
            swipe.addAction(new Pause(input, duration));
            duration = Duration.ZERO;
        }
        swipe.addAction(input.createPointerMove(duration, PointerInput.Origin.viewport(), end.x, end.y));
        swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        appiumDriver.perform(ImmutableList.of(swipe));
    }

    // W3C Cross-Platform Scroll Helper
    public static void scroll(AppiumDriver appiumDriver, ScrollDirection dir, double distance) {
        if (distance < 0 || distance > 1) {
            throw new Error("Scroll distance must be between 0 and 1");
        }
        Dimension size = getWindowSize(appiumDriver);
        Point midPoint = new Point((int) (size.width * 0.5), (int) (size.height * 0.5));
        int top = midPoint.y - (int) ((size.height * distance) * 0.5);
        int bottom = midPoint.y + (int) ((size.height * distance) * 0.5);
        int left = midPoint.x - (int) ((size.width * distance) * 0.5);
        int right = midPoint.x + (int) ((size.width * distance) * 0.5);
        if (dir == ScrollDirection.UP) {
            swipe(appiumDriver, new Point(midPoint.x, top), new Point(midPoint.x, bottom), SCROLL_DUR);
        } else if (dir == ScrollDirection.DOWN) {
            swipe(appiumDriver, new Point(midPoint.x, bottom), new Point(midPoint.x, top), SCROLL_DUR);
        } else if (dir == ScrollDirection.LEFT) {
            swipe(appiumDriver, new Point(left, midPoint.y), new Point(right, midPoint.y), SCROLL_DUR);
        } else if (dir == ScrollDirection.RIGHT) {
            swipe(appiumDriver, new Point(right, midPoint.y), new Point(left, midPoint.y), SCROLL_DUR);
        }
    }

    // Tap-By-Location helper methods: tapAtPoint() and tapElementAt() - for working with Unresponsive elements
    public static void tapAtPoint(AppiumDriver appiumDriver, Point point) {

        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence tap = new Sequence(input, 0);
        tap.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), point.x, point.y));
        tap.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(input, ofMillis(200)));
        tap.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        appiumDriver.perform(ImmutableList.of(tap));
    }

    public static void tapElementAt(AppiumDriver appiumDriver, WebElement mobileElement, double xPct, double yPct) {
        Rectangle elRect = mobileElement.getRect();
        Point point = new Point(
                elRect.x + (int) (elRect.getWidth() * xPct),
                elRect.y + (int) (elRect.getHeight() * yPct)
        );

        tapAtPoint(appiumDriver, point);
    }

    // W3C Scroll To Element
    public static void scrollToElement(AppiumDriver appiumDriver, ScrollType scrollType, WebElement mobileElement) {
        int center = 0;
        double start = 0;
        double end = 0;

        if (scrollType == ScrollType.VERTICAL) {
            center = mobileElement.getRect().x + (mobileElement.getSize().width / 2);
            start = mobileElement.getRect().y + (mobileElement.getSize().height * 0.9);
            end = mobileElement.getRect().y + (mobileElement.getSize().height * 0.1);
        } else if (scrollType == ScrollType.HORIZONTAL) {
            center = mobileElement.getRect().y + (mobileElement.getSize().height / 2);
            start = mobileElement.getRect().x + (mobileElement.getSize().width * 0.9);
            end = mobileElement.getRect().x + (mobileElement.getSize().width * 0.1);
        }

        /*
        // For vertical scroll
        int centerX = mobileElement.getRect().x + (mobileElement.getSize().width/2);
        double startY = mobileElement.getRect().y + (mobileElement.getSize().height * 0.9);
        double endY = mobileElement.getRect().y + (mobileElement.getSize().height * 0.1);

        // For horizontal scroll
        int centerY = mobileElement.getRect().y + (mobileElement.getSize().height/2);
        double startX = mobileElement.getRect().x + (mobileElement.getSize().width * 0.9);
        double endX = mobileElement.getRect().x + (mobileElement.getSize().width * 0.1);
        */

        // Type of Pointer Input
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        // Creating Sequence object to add actions
        Sequence swipe = new Sequence(finger, 1);

        // Move finger into starting position
        /*
        if (scrollType == ScrollType.VERTICAL)
            swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerX, (int)startY));
        else if (scrollType == ScrollType.HORIZONTAL)
            swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), (int)startX, centerY));
         */

        if (scrollType == ScrollType.VERTICAL)
            swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), center, (int) start));
        else if (scrollType == ScrollType.HORIZONTAL)
            swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), (int) start, center));

        // Finger touches screen
        swipe.addAction(finger.createPointerDown(0));

        // Finger moves to end position
        /*
        if (scrollType == ScrollType.VERTICAL)
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), centerX, (int)endY));
        else if (scrollType == ScrollType.HORIZONTAL)
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), (int)endX, centerY));
         */

        if (scrollType == ScrollType.VERTICAL)
            swipe.addAction(finger.createPointerMove(ofMillis(700), PointerInput.Origin.viewport(), center, (int) end));
        else if (scrollType == ScrollType.HORIZONTAL)
            swipe.addAction(finger.createPointerMove(ofMillis(700), PointerInput.Origin.viewport(), (int) end, center));

        // Release finger from Screen
        swipe.addAction(finger.createPointerUp(0));

        // Perform the action
        appiumDriver.perform(Arrays.asList(swipe));

        /*
        try{
            Thread.sleep(3000);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        */
    }

    public static void swipeToElement(WebDriver webdriver, String locator, ScrollDirection direction){
        Log.info("swipeToElement():" + locator + " with direction: " + direction.toString());

        int count = 0;

        while((!DriverCheck.isElementByVisible(webdriver,locator,5L)) && count < 15) {
            DriverActions.scroll((AppiumDriver) webdriver, direction, 0.45);
            count++;
        }

        if (count==14){
            Log.error("swipeToElement(): element not visible after 15 swipes");
        }
    }

    public static void swipeToElement(WebDriver webdriver, String locator, ScrollDirection direction, double distance){
        Log.info("swipeToElement():" + locator + " with direction: " + direction.toString() + " and distance:" + distance);

        int count = 0;

        while((!DriverCheck.isElementByVisible(webdriver,locator,5L)) && count < 15) {
            DriverActions.scroll((AppiumDriver) webdriver, direction, distance);
            count++;
        }

        if (count==14){
            Log.error("swipeToElement(): element not visible after 15 swipes");
        }
    }

    public static void scrollToElementUsingResourceIdMatch(WebDriver driver, String resourceIdKeyword) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceIdMatches(\""
                        + resourceIdKeyword + "\").instance(0))"));
    }

    public static void scrollToElementUsingExactTextMatch(WebDriver driver, String keyword) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + keyword
                        + "\"))"));
    }

    public static void scrollToElementUsingContainsTextMatch(WebDriver driver, String keyword) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"" + keyword
                        + "\").instance(0))"));
    }

    //Swipe by elements (webelements)
    public static void swipeByElements (WebDriver driver, WebElement startElement, WebElement endElement) {
        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);
        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);
        new TouchAction((PerformsTouchActions) driver)
                .press(point(startX,startY))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endX, endY))
                .release().perform();
    }

    //Swipe by elements (locators)
    public static void swipeByElements (WebDriver driver, String startLocator, String endLocator) {

        WebElement startElement = DriverFind.getElementBy(driver, startLocator);
        WebElement endElement = DriverFind.getElementBy(driver, endLocator);

        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);
        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);
        new TouchAction((PerformsTouchActions) driver)
                .press(point(startX,startY))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endX, endY))
                .release().perform();
    }

    // Take a screenshot
    public static String takeScreenshot(WebDriver webDriver, String fileName) throws IOException {

        File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

        String fullPathFileName = HelperUtilities.projectDirPath() + System.getProperty("file.separator") + "screenshots" + System.getProperty("file.separator") + HelperUtilities.createTimeStamp().toString().replaceAll(":", "-") + "_" + fileName + ".png";

        FileUtils.copyFile(scrFile, new File(fullPathFileName));

        System.out.println(" :::Screenshot -> " + fullPathFileName);

        return fullPathFileName;
    }

    public static void copyScreenshotToReportNG() throws IOException {

        // Copy the (latest captured) screenshot file to the ReportNG 'html' folder
        File screenshotFile = HelperUtilities.findLastModifiedFile(HelperUtilities.projectDirPath() + System.getProperty("file.separator") + "screenshots" + System.getProperty("file.separator"));
        FileUtils.copyFile(screenshotFile, new File(HelperUtilities.projectDirPath() + System.getProperty("file.separator") + "build" + System.getProperty("file.separator") + "reportng-output" + System.getProperty("file.separator") + "html" + System.getProperty("file.separator") + screenshotFile.getName()));

        // Provide the captured screenshot to the ReportNG
        //Reporter.log("<a title= \"title\" href=\"" + screenshotFile.getName() + "\">" + "<img width=\"418\" height=\"240\" src=\"" + screenshotFile.getName() + "\"></a>");
        Reporter.log("<a title= \"title\" href=\"" + screenshotFile.getName() + "\">" + "<img src=\"" + screenshotFile.getName() + "\"></a>");

        System.out.println(" Copied :::Screenshot to reportng dir " + screenshotFile);
    }

    public static void clickElement(WebDriver driver, Object locator, Long customTimeOut) {
        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);
        DriverWait.forPresenceOfElementBy(driver, locator, timeOut).click();
        Log.info("Element with locator: " + locator + " was clicked.");
    }

    public static void clickElement(WebDriver driver, WebElement element, Long customTimeOut) {
        final Long timeOut = CustomProperties.getTimeOutValue(customTimeOut);
        DriverWait.forElementToBeClickable(driver, element, timeOut).click();
        Log.info("Element with locator: " + element.toString() + " was clicked.");
    }

    public static void doubleClickElement(WebDriver webDriver, WebElement webElement) {
        Actions action = new Actions(webDriver);
        action.doubleClick(webElement).build().perform();
        // OR
        // action.moveToElement(webElement).doubleClick().build().perform();
    }

    public static String[][] getTableElements2DArray(WebDriver driver, String locator) {

        WebElement element = DriverWait.forVisibilityOfElementBy(driver, locator, null);
        List<WebElement> tableRows = element.findElements(By.cssSelector("tbody tr"));
        int numberOfRows = tableRows.size();

        List<List<WebElement>> tableColumns = new ArrayList<>();

        int maxCol = 0;
        for (int i = 0; i < numberOfRows; i++) {
            List<WebElement> columnPerRow = tableRows.get(i).findElements(By.cssSelector("td"));
            tableColumns.add(columnPerRow);
            maxCol = (maxCol > columnPerRow.size()) ? maxCol : columnPerRow.size();
        }

        String[][] table = new String[numberOfRows][maxCol];

        for (int i = 0; i < numberOfRows; i++) {

            for (int j = 0; j < tableColumns.get(i).size(); j++) {
                table[i][j] = tableColumns.get(i).get(j).getText();
            }
        }

        return table;
    }

    /**
     * Locates a html table and returns its cells as a 2D web element array
     *
     * @param locator
     * @return 2DArray of web elements
     */
    public static WebElement[][] getTableWebElements2DArray(WebDriver driver, String locator) {

        WebElement element = DriverWait.forVisibilityOfElementBy(driver, locator, null);
        List<WebElement> tableRows = element.findElements(By.cssSelector("tbody tr"));
        int numberOrRows = tableRows.size();
        int numberOfColumns = element.findElements(By.cssSelector("tbody tr:nth-child(1) td")).size();
        WebElement[][] table = new WebElement[numberOrRows][numberOfColumns];

        for (int i = 0; i < numberOrRows; i++) {
            List<WebElement> tableColumnsPerRow = tableRows.get(i).findElements(By.cssSelector("td"));
            for (int j = 0; j < tableColumnsPerRow.size(); j++) {
                table[i][j] = tableColumnsPerRow.get(j);
            }
        }

        return table;
    }

    public static void selectMainWindow(WebDriver driver) {
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        Log.info("Switched to main window");
    }

    public static String getTableElementRowPosition(WebDriver driver, String locator, String elementName) {

        List<WebElement> tableRows = null;
        List<WebElement> tableColumnsPerRow = null;
        WebElement element = DriverWait.forVisibilityOfElementBy(driver, locator, null);
        tableRows = element.findElements(By.cssSelector("tbody tr"));

        int position = 1;
        for (WebElement row : tableRows) {
            tableColumnsPerRow = row.findElements(By.cssSelector("td"));
            for (WebElement column : tableColumnsPerRow) {
                if (column.getText().equals(elementName)) {
                    return String.valueOf(position);
                }
            }
            position++;
        }
        throw new WebDriverException("Element not Found");
    }

    public static void compareScreenshots(String phantomcssPath, String screen1, String screen2) {
        File webClient = new File("").getAbsoluteFile();
        System.out.println(webClient.getAbsolutePath());
        File cssPath = new File(phantomcssPath);
        String command = "cmd /c casperjs test --ssl-protocol=any --ignore-ssl-errors=true demo/logcolor.js " + screen1 + " " + screen2 + " " + "test " + webClient.getAbsolutePath();
        try {
            Process p = Runtime.getRuntime().exec(command, null, cssPath);
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                Log.info(line);
                if (line.contains("FAIL Visual change found")) {
                    assertEquals(line, "FAIL Visual change found");
                    break;
                }
            }

            Path[] paths = {Paths.get(screen1), Paths.get(screen2)};
            for (Path path : paths) {
                if (path.toString().contains("phantom_")) {
                    Files.delete(path);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getElementFocus(WebDriver driver, String locator) {
        WebElement element = DriverWait.forVisibilityOfElementBy(driver, locator, null);
        if ("input".equals(element.getTagName())) {
            element.sendKeys("");
        } else {
            new Actions(driver).moveToElement(element).perform();
        }
    }

    public static void clearTextboxAndroid(AndroidDriver driver, String locator) {
        WebElement element = DriverWait.forVisibilityOfElementBy(driver, locator, null);

        element.click();

        int stringLenght = element.getText().length();

        for (int i = 0; i < stringLenght; i++) {
            driver.pressKey(new KeyEvent(AndroidKey.BACK));
        }
    }

    public static void switchToLastWindow(WebDriver driver) {
        Iterator<String> itr = driver.getWindowHandles().iterator();
        String lastWindowHandle = null;
        while (itr.hasNext()) {
            lastWindowHandle = itr.next();
        }
        driver.switchTo().window(lastWindowHandle);
        Log.info("Switched to window with title: " + driver.getTitle());
    }

    public static void closeLastTab(WebDriver driver) {
        Iterator<String> itr = driver.getWindowHandles().iterator();
        String lastWindowHandle = null;
        while (itr.hasNext()) {
            lastWindowHandle = itr.next();
        }
        driver.switchTo().window(lastWindowHandle).close();
        Log.info("Closed last window");
        DriverActions.switchToLastWindow(driver);
    }

    public static void sendAlphanumericCharsOnAndroid(AppiumDriver appiumDriver, String chars, String locator) {

        KeyEvent testKey = null;

        Log.info("sendDigitKeys for amount: " + chars);

        //In case of Edit, delete existing entry first
        if (locator!=null) {

            String existingValue = DriverWait.forPresenceOfElementBy(appiumDriver, locator,null).getText();
            if (existingValue==null) {
                existingValue = DriverWait.forPresenceOfElementBy(appiumDriver, locator,null).getAttribute("text");
            }

            int length = existingValue.length();

            if (length > 0) {
                Log.info("sendDigitKeys: amount already exists with length:" + length + " Delete input first");
            }
            while (length > 0) {
                ((PressesKey) appiumDriver).pressKey(new KeyEvent(AndroidKey.DEL));
                length--;
            }
        }

        for (int i = 0; i < chars.length(); i++) {

            Log.info("digit no:"+ i +" is:" + chars.charAt(i));

            switch (chars.charAt(i)) {
                case '0':
                    testKey=new KeyEvent(AndroidKey.DIGIT_0);
                    break;
                case '1':
                    testKey=new KeyEvent(AndroidKey.DIGIT_1);
                    break;
                case '2':
                    testKey=new KeyEvent(AndroidKey.DIGIT_2);
                    break;
                case '3':
                    testKey=new KeyEvent(AndroidKey.DIGIT_3);
                    break;
                case '4':
                    testKey=new KeyEvent(AndroidKey.DIGIT_4);
                    break;
                case '5':
                    testKey=new KeyEvent(AndroidKey.DIGIT_5);
                    break;
                case '6':
                    testKey=new KeyEvent(AndroidKey.DIGIT_6);
                    break;
                case '7':
                    testKey=new KeyEvent(AndroidKey.DIGIT_7);
                    break;
                case '8':
                    testKey=new KeyEvent(AndroidKey.DIGIT_8);
                    break;
                case '9':
                    testKey=new KeyEvent(AndroidKey.DIGIT_9);
                    break;
                case 'A':
                case 'a':
                    testKey=new KeyEvent(AndroidKey.A);
                    break;
                case 'B':
                case 'b':
                    testKey=new KeyEvent(AndroidKey.B);
                    break;
                case 'C':
                case 'c':
                    testKey=new KeyEvent(AndroidKey.C);
                    break;
                case 'D':
                case 'd':
                    testKey=new KeyEvent(AndroidKey.D);
                    break;
                case 'E':
                case 'e':
                    testKey=new KeyEvent(AndroidKey.E);
                    break;
                case 'F':
                case 'f':
                    testKey=new KeyEvent(AndroidKey.F);
                    break;
                case 'G':
                case 'g':
                    testKey=new KeyEvent(AndroidKey.G);
                    break;
                case 'H':
                case 'h':
                    testKey=new KeyEvent(AndroidKey.H);
                    break;
                case 'I':
                case 'i':
                    testKey=new KeyEvent(AndroidKey.I);
                    break;
                case 'J':
                case 'j':
                    testKey=new KeyEvent(AndroidKey.J);
                    break;
                case 'K':
                case 'k':
                    testKey=new KeyEvent(AndroidKey.K);
                    break;
                case 'L':
                case 'l':
                    testKey=new KeyEvent(AndroidKey.L);
                    break;
                case 'M':
                case 'm':
                    testKey=new KeyEvent(AndroidKey.M);
                    break;
                case 'N':
                case 'n':
                    testKey=new KeyEvent(AndroidKey.N);
                    break;
                case 'O':
                case 'o':
                    testKey=new KeyEvent(AndroidKey.O);
                    break;
                case 'P':
                case 'p':
                    testKey=new KeyEvent(AndroidKey.P);
                    break;
                case 'Q':
                case 'q':
                    testKey=new KeyEvent(AndroidKey.Q);
                    break;
                case 'R':
                case 'r':
                    testKey=new KeyEvent(AndroidKey.R);
                    break;
                case 'S':
                case 's':
                    testKey=new KeyEvent(AndroidKey.S);
                    break;
                case 'T':
                case 't':
                    testKey=new KeyEvent(AndroidKey.T);
                    break;
                case 'U':
                case 'u':
                    testKey=new KeyEvent(AndroidKey.U);
                    break;
                case 'V':
                case 'v':
                    testKey=new KeyEvent(AndroidKey.V);
                    break;
                case 'W':
                case 'w':
                    testKey=new KeyEvent(AndroidKey.W);
                    break;
                case 'X':
                case 'x':
                    testKey=new KeyEvent(AndroidKey.X);
                    break;
                case 'Y':
                case 'y':
                    testKey=new KeyEvent(AndroidKey.Y);
                    break;
                case 'Z':
                case 'z':
                    testKey=new KeyEvent(AndroidKey.Z);
                    break;
                case ' ':
                    testKey=new KeyEvent(AndroidKey.SPACE);
                    break;
                case '+':
                    testKey=new KeyEvent(AndroidKey.PLUS);
                    break;
                case '-':
                    testKey=new KeyEvent(AndroidKey.MINUS);
                    break;
                case '\'':
                    testKey=new KeyEvent(AndroidKey.APOSTROPHE);
                    break;
                case ',':
                    testKey=new KeyEvent(AndroidKey.COMMA);
                    break;
                case '{':
                    testKey=new KeyEvent(AndroidKey.LEFT_BRACKET);
                    break;
                case '}':
                    testKey=new KeyEvent(AndroidKey.RIGHT_BRACKET);
                    break;
                case '\\':
                    testKey=new KeyEvent(AndroidKey.BACKSLASH);
                    break;
                case '/':
                    testKey=new KeyEvent(AndroidKey.SLASH);
                    break;
                case '.':
                    testKey=new KeyEvent(AndroidKey.PERIOD);
                    break;
                case ';':
                    testKey=new KeyEvent(AndroidKey.SEMICOLON);
                    break;
                case '*':
                    testKey=new KeyEvent(AndroidKey.STAR);
                    break;
                case '@':
                    testKey=new KeyEvent(AndroidKey.AT);
                    break;
                default:
                    break;
            }

            ((PressesKey) appiumDriver).pressKey(testKey);
        }
    }

    public static void androidSelectFromDropDownList(WebDriver driver, String keyword) {
        driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).getChildByText(new UiSelector().className(\"android.widget.TextView\"), \""
                                + keyword + "\")"))
                .click();
    }

}
