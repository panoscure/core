package com.intralot.qa.automation.core.utilities;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.joda.time.DateTime;
import org.testng.Reporter;

public class Log {

    // Initialize Log4j instance
    private static final Logger log = LogManager.getLogger(Log.class.getName());

    // Use it when starting tests
    public static void startLog(String testClassName) {
        log.info("Test run is starting...");
    }

    // Use it when ending tests
    public static void endLog(String testClassName) {
        log.info("Test run has ended...");
    }

    // Info Level Logs
    public static void info(String message) {
        String time = DateUtilities.parseDateToString(DateTime.now(), "dd/MM/yyyy HH:mm:ss : ");
        log.info(time + " " + message);
        Reporter.log("<b><p class=\"testOutput\" style=\"color:#0033FF; font-size:1em;\">" + time + " " + message + "</p></b>");
    }

    // Warn Level Logs
    public static void warn(String message) {
        String time = DateUtilities.parseDateToString(DateTime.now(), "dd/MM/yyyy HH:mm:ss : ");
        log.warn(time + " " + message);
        Reporter.log("<b><p class=\"testOutput\" style=\"color:orange; font-size:1em;\">" + time + " " + message + "</p></b>");
    }

    // Error Level Logs
    public static void error(String message) {
        String time = DateUtilities.parseDateToString(DateTime.now(), "dd/MM/yyyy HH:mm:ss : ");
        log.error(time + " " + message);
        Reporter.log("<b><p class=\"testOutput\" style=\"color:red; font-size:1em;\">" + time + " " + message + "</p></b>");
    }

    // Fatal Level Logs
    public static void fatal(String message) {
        String time = DateUtilities.parseDateToString(DateTime.now(), "dd/MM/yyyy HH:mm:ss : ");
        log.fatal(time + " " + message);
        Reporter.log("<p class=\"testOutput\" style=\"color:#6633FF; font-size:1em;\">" + time + " " + message + "</p>");
    }

    // Debug Level Logs
    public static void debug(String message) {
        String time = DateUtilities.parseDateToString(DateTime.now(), "dd/MM/yyyy HH:mm:ss : ");
        log.debug(time + " " + message);
        Reporter.log("<p class=\"testOutput\" style=\"color:#6633FF; font-size:1em;\">" + time + " " + message + "</p>");
    }

}
