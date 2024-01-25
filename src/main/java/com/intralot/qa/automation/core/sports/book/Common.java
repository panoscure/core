package com.intralot.qa.automation.core.sports.book;

import java.security.SecureRandom;
import java.time.LocalDateTime;

public class Common {
    private static final SecureRandom secureRandom = new SecureRandom();

    public static int getRandom(int min, int max) {
        if (max == 0) return 0;
        return secureRandom.nextInt(max - min) + min;
    }

    public static String getTimeNow() {
        return LocalDateTime.now().toString();
    }
}