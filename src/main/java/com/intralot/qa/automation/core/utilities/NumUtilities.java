package com.intralot.qa.automation.core.utilities;

import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumUtilities {

    static final Random randomizer = new Random(System.currentTimeMillis());


    public static String getUniqueId(){
        return (randomizer.nextInt(9999))+getUniqueTimeStamp();
    }

    public static String getUniqueTimeStamp(){

        DateTime dt = new DateTime();
        Long time_stamp = dt.getMillis();
        return time_stamp.toString();
    }

    /**
     * round performs a rounding of provided value to 2 decimal places using round down method
     * @param value
     * @param places
     * @return double
     */
    public static double rounddown(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(String.valueOf(value));
        bd = bd.setScale(places, BigDecimal.ROUND_DOWN);

        return bd.doubleValue();
    }

    /**
     * round performs a rounding of provided value to 2 decimal places using round half up method
     * @param value
     * @param places
     * @return double
     */
    public static double roundHalfUp(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(String.valueOf(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);

        return bd.doubleValue();
    }


    /**
     * round performs a rounding of provided value to 2 decimal places using round up method
     * @param value
     * @param places
     * @return double
     */
    public static double roundUp(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(String.valueOf(value));
        bd = bd.setScale(places, BigDecimal.ROUND_UP);

        return bd.doubleValue();
    }

    /**
     * roundDownAndCutThirdDecimal performs a rounding of provided value to 2 decimal places using round down method
     * round performs a rounding of provided value to 2 decimal places using round down method
     * @param value
     * @return double
     */
    public static double roundDownAndCutThirdDecimal(double value) {
        BigDecimal bd = new BigDecimal(String.valueOf(value));
        bd = bd.setScale(3, BigDecimal.ROUND_DOWN);

        return ((long)(bd.doubleValue() * 1e2)) / 1e2;
    }

    /**
     * roundUpAndCutThirdDecimal performs a rounding of provided value to 2 decimal places using round up method
     * @param value
     * @return
     */
    public static double roundUpAndCutThirdDecimal(double value) {
        BigDecimal bd = new BigDecimal(String.valueOf(value));
        bd = bd.setScale(3, BigDecimal.ROUND_UP);

        return ((long)(bd.doubleValue() * 1e2)) / 1e2;
    }

    /**
     * round down
     * @param value
     * @param places
     * @return double
     */
    public static double roundDown(BigDecimal value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        value = value.setScale(places, BigDecimal.ROUND_DOWN);
        return value.doubleValue();
    }

    /**
     * round up
     * @param value
     * @param places
     * @return double
     */
    public static double roundUpHalf(BigDecimal value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        value = value.setScale(places, BigDecimal.ROUND_HALF_UP);
        return value.doubleValue();
    }

    /**
     * round floor
     * @param value
     * @param places
     * @return double
     */
    public static double roundFloor(BigDecimal value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        value = value.setScale(places, BigDecimal.ROUND_FLOOR);
        return value.doubleValue();
    }

    /**
     * removes euro sign from a number, removes dot from thousands, replaces comma with dot in decimals
     * @param amount
     * @return
     */
    public static double parseAmount(String amount) {
        amount = amount.replace("\u20AC", "").trim();

        if (/*amount.lastIndexOf(",") == amount.length()-3 || */(amount.substring(amount.lastIndexOf(",")+1).length() == 2) || (amount.substring(amount.lastIndexOf(",")+1).length() == 1))
            amount = amount.replace(".", "").replace(",", ".");
            /*else amount = amount.replace(",", "");*/
        else if (amount.substring(amount.lastIndexOf(".")+1).length() == 2)
            amount = amount.replace(",", "");
        else if ((amount.substring(amount.lastIndexOf(",")+1).length() == 3) && (amount.lastIndexOf(".") == -1))
            amount = amount.replace(",", "");
        else if ((amount.substring(amount.lastIndexOf(".")+1).length() == 3))
            amount = amount.replace(".", "");
        return Double.parseDouble(amount);
    }

    /**
     * returns random int numbers based on provided length and range
     * @param numsLength
     * @param min
     * @param max
     * @return List<Integer>
     */
    public static List<Integer> getRandomNumbersInRange(int numsLength, int min, int max) {
        List<Integer> range = IntStream.range(min, max+1).boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        Collections.shuffle(range);

        return range.subList(0, numsLength);
    }

    /**
     * returns random int number based on provided range
     * @param min
     * @param max
     * @return int number
     */
    public static int getRandomNumberInRange(int min, int max) {
        return getRandomNumbersInRange(1, min, max).get(0);
    }

    /**
     * returns a random decimal number of provided range and precision
     * @param min
     * @param max
     * @param decimalPrecision
     * @return double
     */
    public static double getRandomDecimalInRange(int min, int max, int decimalPrecision) {
        int number = ThreadLocalRandom.current().nextInt(min, max);
        return NumUtilities.roundDown(new BigDecimal(String.valueOf(number)).add(BigDecimal.valueOf(getRandomNumberInRange(1, 99)/Math.pow(10, decimalPrecision))),2);
    }

    /**
     * returns a random bet in provided range with provided betStep
     * @param min
     * @param max
     * @param minBet
     * @return double
     */
    private static double getRandomBetInRange(int min, int max, double minBet) {
        int number = ThreadLocalRandom.current().nextInt(min, max);
        int betClusters = 0;
        int minClucter = 1;
        if (minBet == 0.25) {
            betClusters = 3;
        }
        else if (minBet == 0.10) {
            betClusters = 9;
        }
        if (number > 0) {
            minClucter = 0;
        }

        return (NumUtilities.roundDown(new BigDecimal(String.valueOf(number)).add(BigDecimal.valueOf(getRandomNumberInRange(minClucter, betClusters)*minBet)),2));
    }

    /**
     * returns a random bet in provided range with min bet provided on property file
     * @param min
     * @param max
     * @return double
     */
    public static double getRandomBetInRange(int min, int max) {
        return getRandomBetInRange(min, max, Double.parseDouble("0.25"));
    }

    /**
     * Calculates combinations of k from n numbers
     * @param n
     * @param k
     * @return int
     */
    public static int calculateCombinations(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
