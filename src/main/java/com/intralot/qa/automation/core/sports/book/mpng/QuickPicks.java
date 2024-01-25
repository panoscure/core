package com.intralot.qa.automation.core.sports.book.mpng;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

public class QuickPicks {

    public static Object getQuickPicks(Map<String, String> authCookie) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given().contentType("application/json")
                .accept("*/*")
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/view/quick-picks");
    }

}
