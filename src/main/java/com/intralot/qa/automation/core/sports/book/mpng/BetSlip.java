package com.intralot.qa.automation.core.sports.book.mpng;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

import java.util.Map;

public class BetSlip {

    public static Object addSelectionToBetSlip(Map<String, String> authCookie, String oddID) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .body("{\"oddID\": \"" + oddID + "\"" + "}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/betslip/add");
    }

    public static Object changeTab(Map<String, String> authCookie, String tabNum) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .body("{\"tabSelected\":" + tabNum + "}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/betslip/changeTab");
    }

    public static Object setSystemAmount(Map<String, String> authCookie, String system, double stake) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .body("{\"" + system + "\":\"" + stake + "\"" + "}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/betslip/setSystemAmounts");
    }

    public static Object placeBet(Map<String, String> authCookie, String body) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .body(body)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/betslip/play");
    }

    public static Object getBetSlipWinnings(Map<String, String> authCookie, int terminalId, String barcode) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given().contentType("application/json")
                .accept("application/json")
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .queryParams("terminalId", terminalId, "barcode", barcode)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("mpng") + "/ssbt/winnings");
    }

    public static Object useBankers(Map<String, String> authCookie) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .body("{\"useBankers\": \"true\"" + "}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/betslip/useBankers");
    }

    public static Object addBanker(Map<String, String> authCookie, String eventID) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType("application/json")
                .accept("application/json")
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .body("{\"eventID\": \"" + eventID + "\"" + "}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/betslip/addBanker");
    }

    public static Object clearBetSlip(Map<String, String> authCookie) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType("application/json")
                .accept("application/json")
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/betslip/clear");
    }

    public static Object removeSelectionFromBetSlip(Map<String, String> authCookie, String oddID) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType("application/json")
                .accept("application/json")
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .body("{\"oddID\": \"" + oddID + "\"" + "}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/betslip/delete");
    }

    public static Object getBetSlipWinnings(Map<String, String> authCookie, String serialNumber) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType("application/json")
                .accept("application/json")
                .queryParam("terminalId", System.getProperty("mpng.terminalId"))
                .queryParam("barcode", serialNumber)
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("mpng") + "/ssbt/winnings");
    }
}
