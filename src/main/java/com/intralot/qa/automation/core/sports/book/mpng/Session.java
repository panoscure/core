package com.intralot.qa.automation.core.sports.book.mpng;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

import java.util.Map;

public class Session {

    public static Object createSession(Integer terminalId) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .body("{\"terminalId\": \"" + terminalId + "\"" + "}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/ssbt/session/initialize");
    }

    public static Object initiateDeposit(Map<String, String> authCookie, Integer terminalId, int amount) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .body("{\"terminalId\": \"" + terminalId + "\"" + ",\n" + "\"amount\": \"" + amount + "\"" + "}")
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/ssbt/session/deposit");
    }

    public static Object finalizeDeposit(Map<String, String> authCookie, Integer terminalId, int amount) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .body("{\"terminalId\": \"" + terminalId + "\"" + ",\n" + "\"amount\": \"" + amount + "\"" + "}")
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/ssbt/session/deposit/finalize");
    }

    public static Object getWalletAmount(Map<String, String> authCookie, int terminalId) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .header(authCookieKey, authCookie.get(authCookieKey))
                .queryParam("terminalId", terminalId)
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("mpng") + "/ssbt/session");
    }

    public static Object topUp(Map<String, String> authCookie, String body) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .body(body)
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/ssbt/topup");
    }

    public static Object withDraw(Map<String, String> authCookie, String body) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .body(body)
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/ssbt/pay");
    }

    public static Object logout(String sessionId, Map<String, String> authCookie, Integer terminalId) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("t", terminalId)
                .queryParam("sessionId", sessionId)
                .queryParam("terminalId", terminalId)
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("mpng") + "/ssbt/logout");
    }
}