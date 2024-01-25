package com.intralot.qa.automation.core.sports.book.mpng;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

import java.util.Map;

public class Events {

    public static Object getPreGameCompetitions(Map<String, String> authCookie) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/view/pre-game");
    }

    public static Object getPreMatchCompetitionsBySportId(Map<String, String> authCookie, String sport) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/prematch/{sport}", sport);
    }

    public static Object getPreMatchAvailableEvents(Map<String, String> authCookie, String sport, String tournament) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mpng") + "/prematch/{sport}/{tournament}", sport, tournament);
    }

    public static Object getPreGameCompetitionsLogIfValidationFails(Map<String, String> authCookie) {
        String authCookieKey = System.getProperty("authCookieKey");
        return RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .header(authCookieKey, authCookie.get(authCookieKey))
                .cookie(authCookieKey, authCookie.get(authCookieKey))
                .when()
                .filters(new RequestLoggingFilter())
                .post(System.getProperty("mpng") + "/view/pre-game")
                .then().log().ifValidationFails().extract().response();
    }

    public static Object getPreMatchCompetitionsBySportIdLogIfValidationFails(Map<String, String> authCookie, String sport) {
        return RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .cookies(authCookie)
                .when()
                .filters(new RequestLoggingFilter())
                .post(System.getProperty("mpng") + "/prematch/{sport}", sport)
                .then().log().ifValidationFails().extract().response();
    }

    public static Object getPreMatchAvailableEventsLogIfValidationFails(Map<String, String> authCookie, String sport, String tournament) {
        return RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .queryParam("t", System.getProperty("mpng.terminalId"))
                .cookies(authCookie)
                .when()
                .filters(new RequestLoggingFilter())
                .post(System.getProperty("mpng") + "/prematch/{sport}/{tournament}", sport, tournament)
                .then().log().ifValidationFails().extract().response();
    }
}
