package com.intralot.qa.automation.core.utilities;

public class OSValidator {

    private static String OS = System.getProperty("os.name").toLowerCase();
    public static boolean IS_WINDOWS = (OS.indexOf("win") >= 0);
    public static boolean IS_MAC = (OS.indexOf("mac") >= 0);
    public static boolean IS_LINUX = (OS.indexOf("nux") >= 0);

    public static String getOperatingSystem() {
        String os = System.getProperty("os.name").toLowerCase();
        return os;
    }

    public static boolean isWindows() {
        return IS_WINDOWS;
    }

    public static boolean isMac() {
        return IS_MAC;
    }

    public static boolean isLinux() {
        return IS_LINUX;

    }

}
