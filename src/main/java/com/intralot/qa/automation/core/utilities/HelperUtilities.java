package com.intralot.qa.automation.core.utilities;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.FileFilterUtils;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileFilter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Arrays;
import java.util.Calendar;

public class HelperUtilities {

    // Get current project directory path
    public static String projectDirPath() {
        return System.getProperty("user.dir");
    }

    // Get the full directory path and filename
    public static String getAppFileNameAndPath(String fileExtension) {

        File folderDir = new File(projectDirPath());
        File[] listOfFiles = folderDir.listFiles();

        String applicationName = null;

        assert listOfFiles != null;

        for (File appFile : listOfFiles) {

            // Fix for .app iOS application (it is a directory)
            if ((appFile.isFile() || appFile.isDirectory())
                    && appFile.getName().contains(fileExtension)) {

                applicationName = appFile.getName();
                break;
            }
        }

        return projectDirPath() + System.getProperty("file.separator") + applicationName;
    }

    // Create a timestamp
    public static Instant createTimeStamp() {
        return new Timestamp(System.currentTimeMillis()).toInstant();
    }

    public static String getCurrentDate() {

        Calendar now = Calendar.getInstance();

        SimpleDateFormat newDate = new SimpleDateFormat("yyyyMMdd'-'HH:mm:ss");
        return newDate.format(now.getTime());
    }

    // Generate unique resourceIds based on (Android app) package name
    public static String genResourceId(String keyword) {
        return CustomProperties.getAppPackage() + ":id/" + keyword;
    }

    public static boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
        // Or return s == null || s.isBlank(); in Java 11+
    }

    public static File findLastModifiedFile(String targetDirectory) {
        File dir = new File(targetDirectory);
        if (dir.isDirectory()) {
            File[] directoryFiles = dir.listFiles((FileFilter) FileFilterUtils.fileFileFilter());
            if (directoryFiles != null && directoryFiles.length > 0) {
                Arrays.sort(directoryFiles, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
                return directoryFiles[0];
            }
        }

        return null;
    }

    public static void enterBrowserCredentialsUsingRobot(String givenUsername, String givenPassword) {

        // Wait - increase this wait period if required
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Create robot for keyboard operations
        Robot robot;

        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        // Enter username by ctrl-v
        StringSelection username = new StringSelection(givenUsername);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        //tab to password entry field
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Enter password by ctrl-v
        StringSelection pwd = new StringSelection(givenPassword);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Press enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Wait
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
