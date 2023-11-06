package com.intralot.qa.automation.core.driver.engine;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import com.intralot.qa.automation.core.utilities.HelperUtilities;
import com.intralot.qa.automation.core.utilities.OSValidator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v118.emulation.Emulation;
import org.openqa.selenium.devtools.v118.security.Security;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Optional;
import java.util.logging.Level;
// import java.util.Map;
// import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver = null;

    static File chromeDriverExecutable = null;

    private static ChromeOptions getChromeOptions() {
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("safebrowsing.enabled", "true");
        chromePrefs.put("download.directory_upgrade", "true");
        chromePrefs.put("download.prompt_for_download", "false");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.BROWSER, Level.ALL);
        options.setCapability(ChromeOptions.LOGGING_PREFS, logPrefs);
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.addArguments("lang=en");
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--ignore-certificate-errors"); //Suppressed Certificate errors
        options.addArguments("--incognito"); //Icognito mode
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-running-insecure-content");
        options.setCapability(ChromeOptions.CAPABILITY, options);
        return options;
    }

    public static WebDriver getDesktopWebDriver() {
        return new ChromeDriver(getChromeOptions());
    }

    // Web driver to simulate on a mobile Chrome browser ;-)
    public static WebDriver getEmulatedWebDriver() {

        // Load proper webDriver
        if ((CustomProperties.getChromeDriverWinExecutable() != null)
                || (CustomProperties.getChromeDriverLinuxExecutable() != null)
                || (CustomProperties.getChromeDriverMacosExecutable() != null)) {

            // If this is a Windows-based OS
            if (OSValidator.isWindows())
                chromeDriverExecutable = new File(CustomProperties.getChromeDriverWinExecutable());
            else if (OSValidator.isMac())
                chromeDriverExecutable = new File(CustomProperties.getChromeDriverMacosExecutable());
            else if (OSValidator.isLinux())
                chromeDriverExecutable = new File(CustomProperties.getChromeDriverLinuxExecutable());

            System.setProperty("webdriver.chrome.driver", String.valueOf(chromeDriverExecutable));

        }
        else
            WebDriverManager.chromedriver().setup();

        /*
        // Options
        ChromeOptions options = new ChromeOptions();

        // Preferences
        HashMap<String, Boolean> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--remote-allow-origins=*");

        // Mobile emulation
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", CustomProperties.getEmulatedDeviceName());
        options.setExperimentalOption("mobileEmulation", mobileEmulation);

        // Arguments
        options.addArguments("disable-popup-blocking");
        options.addArguments("disable-infobars");
        options.addArguments("--ignore-certificate-errors");
         */

        // Headless mode - enable/disable
        // options.addArguments("headless");

       //  ChromeDriverService service = ChromeDriverService.createDefaultService();

        // Initialize WebDriver
        // driver = new ChromeDriver(service, options);
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        // driver.manage().window().maximize();

        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        devTools.send(Security.enable());
        devTools.send(Security.setIgnoreCertificateErrors(true));

        /*
        Map<String,Object> deviceMetrics = new HashMap<>();

        deviceMetrics.put("width", 360);
        deviceMetrics.put("height", 740);
        deviceMetrics.put("deviceScaleFactor",100);
        deviceMetrics.put("mobile", true);

        ((ChromeDriver) driver).executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
        */

        devTools.send(Emulation.setDeviceMetricsOverride(

                360,

                740,

                100,

                true,

                Optional.empty(),

                Optional.empty(),

                Optional.empty(),

                Optional.empty(),

                Optional.empty(),

                Optional.empty(),

                Optional.empty(),

                Optional.empty(),

                Optional.empty()

        ));

        return driver;
    }

    public static AndroidDriver getAndroidApplicationDriver() throws Exception {

        /*
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName(CustomProperties.getAndroidDeviceName())
                .setUdid(CustomProperties.getAndroidUdid())
                .setPlatformName(CustomProperties.getPlatform())
                .setSkipDeviceInitialization(true)
                .setApp(UtilitiesHelper.getAppFileNameAndPath(".apk"))
                .setAppPackage(CustomProperties.getAppPackage())
                .setAppActivity(CustomProperties.getAppActivity())
                //.setUnlockType("pin")
                //.setUnlockKey("123456")
                .setNoReset(true)
                //.setAutoGrantPermissions(true)
                //.setAutoWebview(true)
                //.setChromeOptions(ImmutableMap.of("w3c", false));
                .eventTimings();

         */

        // OR

        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Android Capabilities
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:deviceName", CustomProperties.getAndroidDeviceName());
        capabilities.setCapability("appium:udid", CustomProperties.getAndroidUdid());
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:skipDeviceInitialization", true);
        //capabilities.setCapability("appium:app", HelperUtilities.getAppFileNameAndPath(".apk"));
        capabilities.setCapability("appium:appPackage", CustomProperties.getAppPackage());
        capabilities.setCapability("appium:appActivity", CustomProperties.getAppActivity());
        capabilities.setCapability("appium:autoGrantPermissions", true);
        capabilities.setCapability("appium:ensureWebviewsHavePages", true);
        capabilities.setCapability("appium:nativeWebScreenshot", true);
        capabilities.setCapability("appium:newCommandTimeout", 3600);
        capabilities.setCapability("appium:connectHardwareKeyboard", true);

        // Capability for hybrid application (uses 100% webViews)
        // capabilities.setCapability("appium:autoWebview", "true");
        // capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));

        // Initialize Appium/Android driver
        driver = new AndroidDriver(new URL(CustomProperties.getAppiumServerURL()), capabilities);
        // driver = new AppiumDriver(new URL(CustomProperties.getAppiumServerURL()), options);

        return (AndroidDriver) driver;
    }

    public static WebDriver getAndroidWebDriver() throws Exception {

        // Capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Options
        //ChromeOptions options = new ChromeOptions();

        // Arguments
        //options.addArguments("disable-popup-blocking");
        //options.addArguments("disable-infobars");
        //options.addArguments("--ignore-certificate-errors");
        //options.addArguments("disable-translate");

        // Capabilities
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:deviceName", CustomProperties.getAndroidDeviceName());
        capabilities.setCapability("appium:udid", CustomProperties.getAndroidUdid());
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:autoGrantPermissions", true);
        // capabilities.setCapability("appium:browserName", "Chrome");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("appium:newCommandTimeout", 3600);
        //capabilities.setCapability("appium:options", options);

        // Initializing Appium
        driver = new AndroidDriver(new URL(CustomProperties.getAppiumServerURL()), capabilities);
        driver.manage().deleteAllCookies();

        return driver;
    }

    /*
    public static IOSDriver getiOSApplicationDriver() throws IOException, DeviceNotFoundException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        // iOS Capabilities
        capabilities.setCapability("deviceName", CustomProperties.getiOSdeviceName());
        capabilities.setCapability("udid", CustomProperties.getiOSudid());
        capabilities.setCapability("platformName", "iOS");
        // capabilities.setCapability("platformVersion", CustomProperties.getiOSplatformVersion());
        capabilities.setCapability("automationName", "XCUITest");

        if (CustomProperties.getiOSdeviceType().equals("Simulator")) {
            capabilities.setCapability("app", UtilitiesHelper.getAppFileNameAndPath(".app"));
        } else if (CustomProperties.getiOSdeviceType().equals("Physical")) {
            capabilities.setCapability("app", UtilitiesHelper.getAppFileNameAndPath(".ipa"));
        }

        capabilities.setCapability("xcodeOrgId", CustomProperties.getXcodeOrgId());
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        capabilities.setCapability("webDriverAgentUrl", CustomProperties.getWdaUrl());
        capabilities.setCapability("updatedWDABundleId", "com.facebook.WebDriverAgentRunner");
        capabilities.setCapability("startIWDP", true);
        capabilities.setCapability("bundleId", CustomProperties.getBundleId());
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("autoAcceptAlerts", true);
        capabilities.setCapability("simpleIsVisibleCheck", true);

        // Set how long (in seconds) Appium will wait for new command
        capabilities.setCapability("newCommandTimeout", 20);
        capabilities.setCapability("clearSystemFiles", true);

        // Initialize Appium/iOS driver
        driver = new IOSDriver(new URL(CustomProperties.getAppiumServerURL()), capabilities);

        return (IOSDriver) driver;
    }
    */

    public static IOSDriver getiOSApplicationDriver() throws Exception {

        XCUITestOptions options = new XCUITestOptions()
                .setDeviceName(CustomProperties.getiOSdeviceName())
                .setUdid(CustomProperties.getiOSudid())
                .setPlatformVersion(CustomProperties.getiOSPlatformVersion())
                .setPlatformName(CustomProperties.getPlatform())
//                .setApp(HelperUtilities.getAppFileNameAndPath(".ipa"))
                .setWebDriverAgentUrl(CustomProperties.getWdaUrl())
                .setUpdatedWdaBundleId("com.facebook.WebDriverAgentRunner")
//                .setIncludeSafariInWebviews(true)
                .setBundleId(CustomProperties.getBundleId())
                .setNoReset(true)
                .setAutoAcceptAlerts(true)
                .setSimpleIsVisibleCheck(true)
                .setNewCommandTimeout(Duration.ofSeconds(120))
                .setClearSystemFiles(true);

        // Initialize Appium/iOS driver
        driver = new IOSDriver(new URL(CustomProperties.getAppiumServerURL()), options);

        return (IOSDriver) driver;

    }

    public static WebDriver getiOSWebDriver() throws Exception {

        // Capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("appium:deviceName", CustomProperties.getiOSdeviceName());
        capabilities.setCapability("appium:udid", CustomProperties.getiOSudid());
        capabilities.setCapability("appium:platformVersion", CustomProperties.getiOSPlatformVersion());
        capabilities.setCapability("appium:automationName", "XCUITest");
        // capabilities.setCapability("appium:browserName", "Safari");
        capabilities.setCapability("browserName", "Safari");
        // capabilities.setCapability("appium:xcodeOrgId", CustomProperties.getXcodeOrgId());
        // capabilities.setCapability("appium:xcodeSigningId", "iPhone Developer");
        // capabilities.setCapability("appium:webDriverAgentUrl", CustomProperties.getWdaUrl());
        capabilities.setCapability("appium:updatedWDABundleId", "com.facebook.WebDriverAgentRunner");
        // capabilities.setCapability("appium:safariOptions", ImmutableMap.of("w3c", false));
        // capabilities.setCapability("appium:autoGrantPermissions", true);
        //capabilities.setCapability("appium:autoAcceptAlerts", true);
        capabilities.setCapability("appium:fullReset", true);
        capabilities.setCapability("appium:newCommandTimeout", 3600);
        //capabilities.setCapability("appium:autoDismissAlerts", true);
        // capabilities.setCapability("appium:simpleIsVisibleCheck",true);

        // Initializing iOS driver
        driver = new IOSDriver(new URL(CustomProperties.getAppiumServerURL()), capabilities);
        driver.manage().deleteAllCookies();

        return driver;
    }

}
