package com.intralot.qa.automation.core.sports.book.mpng;

import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

import java.util.Map;

public class Reports {

    public static Object salesReports(Map<String, String> authCookie, String terminalId) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\"terminalId\":\"" + terminalId + "\",\"type\":\"Day\",\"scope\":\"Retailer\",\"widthpx\":\"600px\",\"offset\":0}")
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new Filter[]{new ResponseLoggingFilter()})
                .post(System.getProperty("mpng") + System.getProperty("mpng.sales.reports"));
    }

    public static Object salesReportsDate(Map<String, String> authCookie,String reqBody, String terminalId) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(reqBody)
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new Filter[]{new ResponseLoggingFilter()})
                .post(System.getProperty("mpng") + System.getProperty("mpng.sales.reports"));
    }

    public static Object weeklyReports(Map<String, String> authCookie, String terminalId) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\"terminalId\":\"" + terminalId + "\",\"widthpx\":\"600px\",\"offset\":0}")
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new Filter[]{new ResponseLoggingFilter()})
                .post(System.getProperty("mpng") + "/ssbt/weekly/reports");
    }

    public static Object shiftReports(Map<String, String> authCookie, String terminalId) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\"terminalId\":\"" + terminalId + "\",\"widthpx\":\"600px\"}")
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new Filter[]{new ResponseLoggingFilter()})
                .post(System.getProperty("mpng") + "/ssbt/shift/report");
    }
}
