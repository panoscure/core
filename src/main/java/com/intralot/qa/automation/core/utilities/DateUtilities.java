package com.intralot.qa.automation.core.utilities;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.format.DateTimeFormat;

public class DateUtilities {

    public static final String[] MonthStringFullEN = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static final String[] MonthStringFullGR = {"Ιανουάριος", "Φεβρουάριος", "Μάρτιος", "Απρίλιος", "Μάιος", "Ιούνιος", "Ιούλιος", "Αύγουστος", "Σεπτέμβριος", "Οκτώβριος", "Νοέμβριος", "Δεκέμβριος"};

    public static boolean isThisDateValid(String dateToValidate, String dateFormat) {

        if (dateToValidate == null) {
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);

        try {

            //if not valid, it will throw ParseException
            Date date = sdf.parse(dateToValidate);
            System.out.println(date);

        } catch (ParseException e) {

            e.printStackTrace();
            return false;
        }

        return true;
    }

    public static DateTime parseStringToDate(String dateAsString, String format) {

        DateFormat dateFormat = new SimpleDateFormat(format, Locale.US);
        DateTime parsedDate = null;

        try {
            parsedDate = new DateTime(dateFormat.parse(dateAsString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return parsedDate;
    }

    public static String parseDateToString(DateTime date, String format) {

        DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date.toDate());
    }

    public static long differenceInMills(DateTime a, DateTime b) {
        return Math.abs(a.getMillis() - b.getMillis());
    }


    public static int getDifferenceInMinutes(DateTime a, DateTime b) {

        Minutes diffInMinutes = Minutes.minutesBetween(a, b);
        return Math.abs(diffInMinutes.getMinutes());
    }

    public static int getDifferenceInMinutes(String a, String b) {

        Minutes diffInMinutes = Minutes.minutesBetween(parseStringToDate(a, "dd/MM/yy HH:mm"), parseStringToDate(b, "dd/MM/yy HH:mm"));
        return Math.abs(diffInMinutes.getMinutes());
    }

    public static int getDifferenceInMonths(DateTime a, DateTime b) {

        Months diffInMonths = Months.monthsBetween(a, b);
        return Math.abs(diffInMonths.getMonths());
    }

    public static int getDifferenceInMonths(String a, String b) {

        Months diffInMonths = Months.monthsBetween(parseStringToDate(a, "dd/MM/yy HH:mm"), parseStringToDate(b, "dd/MM/yy HH:mm"));
        return Math.abs(diffInMonths.getMonths());
    }

    public static String parseDateTime(String dateWithStringMonth) {

        List<String> enMonthsList = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        List<String> grMonthsList = Arrays.asList("Ιαν", "Φεβ", "Μαρ", "Απρ", "Μαι", "Ιουν", "Ιουλ", "Αυγ", "Σεπ", "Οκτ", "Νοε", "Δεκ");

        String pattern = "";

        if (enMonthsList.stream().anyMatch(dateWithStringMonth::contains))
            pattern = "MMM dd, yyyy HH:mm";

        else if (grMonthsList.stream().anyMatch(dateWithStringMonth::contains))
            pattern = "dd MMM yyyy, HH:mm";

        DateTime dateTime = DateTime.parse(dateWithStringMonth, DateTimeFormat.forPattern(pattern));

        return dateTime.toString("dd/MM/yy HH:mm");
    }

//    public static DateTime parseDateWithStringMonthToDate(String dateWithStringMonth) {
//
//        List<String> enMonthsList = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
//        List<String> grMonthsList = Arrays.asList("Ιαν", "Φεβ", "Μαρ", "Απρ", "Μαι", "Ιουν", "Ιουλ", "Αυγ", "Σεπτ", "Οκτ", "Νοε", "Δεκ");
//
//        for (int i = 0; i < 12; i++) {
//
//            if (dateWithStringMonth.contains(grMonthsList.get(i))) {
//
//                dateWithStringMonth = dateWithStringMonth.replace(grMonthsList.get(i), enMonthsList.get(i));
//                System.out.println(dateWithStringMonth);
//                break;
//
//            }
//        }
//
//        DateTimeFormatter format = DateTimeFormat.forPattern("dd MMM yyyy HH:mm:ss");
//
//        return format.parseDateTime(dateWithStringMonth);
//    }

    public static String removeLeadingZeros(String number) {
        return number.startsWith("0") ? number.substring(1) : number;
    }

    public static String getMonthFullString(String monthNumber, com.intralot.qa.automation.core.utilities.Locale locale) {

        int monthNo = Integer.parseInt(removeLeadingZeros(monthNumber));
        String monthName;

        if (monthNo >= 1 && monthNo <= 12) {
            monthName = (locale.equals(Locale.ENGLISH) ? MonthStringFullEN[monthNo - 1] : MonthStringFullGR[monthNo - 1]);
        } else {
            System.out.println("You have entered an invalid month number");
            monthName = null;
        }

        return monthName;
    }

    public static boolean isAfterTimeTransitionDay(DateTime date) {

        DateTimeZone zone = DateTimeZone.forID("Europe/Athens");

        long current = System.currentTimeMillis();
        long next = zone.nextTransition(current);

        if (date.isAfter(next))
            return true;

        return false;
    }

    public static Boolean isNextTransitionToSummerTime() {

        DateTimeZone zone = DateTimeZone.forID("Europe/Athens");

        long current = System.currentTimeMillis();
        long next = zone.nextTransition(current);

        if (zone.isStandardOffset(next))
            return false;

        else
            return true;
    }

    /**
     * Parse to date the sportbook date format
     */
    public static DateTime parseSportsbookDateFormat(String dateString) {
        DateTime date = DateTime.now();
        String today = date.getDayOfMonth() + "/" + date.getMonthOfYear() + "/" + date.getYear();
        String tomorrow = date.plusDays(1).getDayOfMonth() + "/" + date.getMonthOfYear() + "/" + date.getYear();
        dateString = dateString.replace("Απόψε", today)
                .replace("Σήμερα", today)
                .replace("Αύριο", tomorrow)
                .replace("Today", today)
                .replace("Tonight", today)
                .replace("Tomorrow", tomorrow);
        return parseStringToDate(dateString, "dd/MM/yyyy HH:mm");
    }

    public static LocalDateTime epocToLocalDateTime(Long epocDate){

        LocalDateTime ldt = Instant.ofEpochMilli(epocDate)
                .atZone(ZoneId.systemDefault()).toLocalDateTime();

        Log.info("epocToLocalDateTime(): LocalDateTime:" + ldt);

        return ldt;
    }

    public static LocalDateTime epocToDateTime(Long epocDate, String timeZone){

        LocalDateTime ldt = Instant.ofEpochMilli(epocDate)
                .atZone(ZoneId.of(timeZone)).toLocalDateTime();

        Log.info("epocToDateTime(): LocalDateTime in zone: " + timeZone + " is:" + ldt);

        return ldt;
    }

    public static String dateToUSformat (LocalDateTime ldt){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
        String formattedDateTime = ldt.format(formatter);

        Log.info("US Formatted DateTime:" + formattedDateTime);

        return formattedDateTime;
    }


}
