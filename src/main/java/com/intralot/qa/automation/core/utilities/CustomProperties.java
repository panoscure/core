package com.intralot.qa.automation.core.utilities;

import com.intralot.qa.automation.core.device.information.DeviceInfoImplementation;
import com.intralot.qa.automation.core.device.information.DeviceInfo;
import com.intralot.qa.automation.core.device.information.finder.DeviceType;
import com.intralot.qa.automation.core.device.information.model.Device;

import java.io.InputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;

import static com.intralot.qa.automation.core.utilities.HelperUtilities.isNullOrEmpty;

public class CustomProperties {

    private CustomProperties() {}

    //private enum Property {
    public enum Property {
        TIME_OUT,
        ENVIRONMENT_PROFILE,
        PLATFORM,
        PLATFORM_TYPE,
        APPIUM_SERVER_URL,
        EMULATED_DEVICE_NAME,
        ANDROID_DEVICE_NAME,
        ANDROID_UDID,
        APP_PACKAGE,
        APP_ACTIVITY,
        IOS_DEVICE_NAME,
        IOS_UDID,
        IOS_DEVICE_TYPE,
        IOS_PLATFORM_VERSION,
        BUNDLE_ID,
        XCODE_ORG_ID,
        USERNAME,
        PASSWORD
    }

    private static final Properties properties = new Properties();

    // Obtain device information
    // private static DeviceInfo getDeviceInfo() throws Exception {
    private static DeviceInfo getDeviceInfo() {

        DeviceInfo deviceInfo = null;

        if (getPlatform().toLowerCase().equals("android"))
            deviceInfo = new DeviceInfoImplementation(DeviceType.ANDROID);
        else if (getPlatform().toLowerCase().equals("ios"))
            deviceInfo = new DeviceInfoImplementation(DeviceType.ALLANDIOSSIMULATOR);
        //else
            //throw new Exception(getPlatform() + "is an unknown Platform!");

        return deviceInfo;
    }

    public static void loadPropertiesFromClasspath(String filename) throws IOException {
        InputStream inputStream = CustomProperties.class.getClassLoader().getResourceAsStream(filename);
        properties.load(inputStream);
    }

    public static void loadPropertiesFile(String propertiesFileNameWithPath) throws IOException {
        properties.load(Files.newInputStream(Paths.get(propertiesFileNameWithPath)));
    }

    public static boolean propertyNameExists(String propertyName) {

        boolean propertyNameExists = false;

        Enumeration<?> propertyNames = properties.propertyNames();

        while (propertyNames.hasMoreElements()) {
            if (propertyNames.nextElement().equals(propertyName)) {
                propertyNameExists = true;
                break;
            }
        }

        return propertyNameExists;
    }

    public static String getPropertyValue(String key) {
        return properties.getProperty(key);
    }

    /*
    public static void setPropertyValue(String key, String value) {
        properties.setProperty(key, value);
    }
    */

    /*
    public static Integer getTimeOutValue(final Integer timeOut) {

        return Objects.nonNull(timeOut)
                ? timeOut
                : Integer.parseInt(getPropertyValue(Property.TIME_OUT.toString()));
    }
    */

    public static Long getTimeOutValue(final Long timeOut) {
        return timeOut != null ? timeOut : Long.parseLong(getPropertyValue(Property.TIME_OUT.toString()));
    }

    public static String getEnvironmentProfile() {
        return getPropertyValue(Property.ENVIRONMENT_PROFILE.toString());
    }

    public static String getPlatform() {
        return getPropertyValue(Property.PLATFORM.toString());
    }


    public static String getPlatformType() {
        return getPropertyValue(Property.PLATFORM_TYPE.toString());
    }

    public static String getChromeDriverWinExecutable() {
        return getPropertyValue("chromeDriverWinExecutable");
    }

    public static String getChromeDriverLinuxExecutable() {
        return getPropertyValue("chromeDriverLinuxExecutable");
    }

    public static String getChromeDriverMacosExecutable() {
        return getPropertyValue("chromeDriverMacosExecutable");
    }

    // Appium server URL
    public static String getAppiumServerURL() {

        return getPropertyValue(Property.APPIUM_SERVER_URL.toString());
    }

    /*
    // Desktop Web
    public static String getDesktopWebURL() {
        return getPropertyValue("desktopWebUrl");
    }

    // Mobile Web
    public static String getMobileWebURL() {
        return getPropertyValue("mobileWebUrl");
    }
    */

    public static String getEmulatedDeviceName() {
        return getPropertyValue(Property.EMULATED_DEVICE_NAME.toString());
    }


    // Android device data
    public static String getAndroidDeviceName() throws Exception {

        String androidDeviceName = null;

        if (!propertyNameExists(Property.ANDROID_DEVICE_NAME.toString()) || (propertyNameExists(Property.ANDROID_DEVICE_NAME.toString()) && isNullOrEmpty(getPropertyValue(Property.ANDROID_DEVICE_NAME.toString())))) {

            DeviceInfo deviceInfo = getDeviceInfo();

            if (deviceInfo.anyDeviceConnected()) {
                Device device = deviceInfo.getFirstDevice();
                androidDeviceName = device.getDeviceProductName();
            }
        } else
            androidDeviceName = getPropertyValue(Property.ANDROID_DEVICE_NAME.toString());

        return androidDeviceName;
    }


    public static String getAndroidUdid() throws Exception {

        String androidUdid = null;

        if (!propertyNameExists(Property.ANDROID_UDID.toString()) || (propertyNameExists(Property.ANDROID_UDID.toString()) && isNullOrEmpty(getPropertyValue(Property.ANDROID_UDID.toString())))) {

            DeviceInfo deviceInfo = getDeviceInfo();

            if (deviceInfo.anyDeviceConnected()) {
                Device device = deviceInfo.getFirstDevice();
                androidUdid = device.getUniqueDeviceID();
            }

        } else
            androidUdid = getPropertyValue(Property.ANDROID_UDID.toString());

        return androidUdid;
    }


    /*
    public static String getAndroidDeviceType() {
        return getPropertyValue("androidDeviceType");
    }
    */

    // iOS device data
    public static String getWdaUrl() {
        return getPropertyValue("wdaUrl");
    }

    public static String getiOSdeviceName() throws Exception {

        String iOSDeviceName = null;

        if (!propertyNameExists(Property.IOS_DEVICE_NAME.toString()) || (propertyNameExists(Property.IOS_DEVICE_NAME.toString()) && isNullOrEmpty(getPropertyValue(Property.IOS_DEVICE_NAME.toString())))) {

            DeviceInfo deviceInfo = getDeviceInfo();

            if (deviceInfo.anyDeviceConnected()) {
                Device device = deviceInfo.getFirstDevice();
                iOSDeviceName = device.getDeviceProductName();
            }

        } else
            iOSDeviceName = getPropertyValue(Property.IOS_DEVICE_NAME.toString());

        return iOSDeviceName;
    }

    public static String getiOSudid() throws Exception {

        String iOSudid = null;

        if (!propertyNameExists("IOS_UDID") || (propertyNameExists("IOS_UDID") && isNullOrEmpty(getPropertyValue("IOS_UDID")))) {

            DeviceInfo deviceInfo = getDeviceInfo();

            if (deviceInfo.anyDeviceConnected()) {
                Device device = deviceInfo.getFirstDevice();
                iOSudid = device.getUniqueDeviceID();
            }

        } else
            iOSudid = getPropertyValue("IOS_UDID");

        return iOSudid;
    }


    public static String getiOSPlatformVersion() throws Exception {

        String iOSPlatformVersion = null;

        if (!propertyNameExists("IOS_PLATFORM_VERSION") || (propertyNameExists("IOS_PLATFORM_VERSION") && isNullOrEmpty(getPropertyValue("IOS_PLATFORM_VERSION")))) {

            DeviceInfo deviceInfo = getDeviceInfo();

            if (deviceInfo.anyDeviceConnected()) {
                Device device = deviceInfo.getFirstDevice();
                iOSPlatformVersion = device.getProductVersion();
            }

        } else
            iOSPlatformVersion = getPropertyValue("IOS_PLATFORM_VERSION");

        return iOSPlatformVersion;
    }

    public static String getiOSdeviceType() throws Exception {

        String iOSdeviceType = null;
        DeviceInfo deviceInfo = getDeviceInfo();

        if (deviceInfo.anyDeviceConnected()) {
            Device device = deviceInfo.getFirstDevice();
            if (device.getDeviceProductName().contains("Ios Simulator"))
                iOSdeviceType = "Simulator";
            else
                iOSdeviceType = "Physical";
        }
        return iOSdeviceType;
    }

  /*
  public static String getiOSplatformVersion() {
    return getPropertyValue("iOSplatformVersion");
  }
  */

    // Android application data
    public static String getAppPackage() {
        return getPropertyValue(Property.APP_PACKAGE.toString());
    }

    public static String getAppActivity() {
        return getPropertyValue(Property.APP_ACTIVITY.toString());
    }

    // iOS application data
    public static String getBundleId() {
        return getPropertyValue(Property.BUNDLE_ID.toString());
    }

    public static String getXcodeOrgId() {
        return getPropertyValue(Property.XCODE_ORG_ID.toString());
    }

    // User Data
    public static String getUsername() {
        return getPropertyValue(Property.USERNAME.toString());
    }

    public static String getPassword() {
        return getPropertyValue(Property.PASSWORD.toString());
    }
}
