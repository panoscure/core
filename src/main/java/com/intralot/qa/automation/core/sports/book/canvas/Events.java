package com.intralot.qa.automation.core.sports.book.canvas;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class Events {

    public static Object getPreMatchCategoriesForSport(Map<String, String> authCookie, String sport) {
        return given()
                .accept(JSON)
                .contentType(JSON)
                .cookies(authCookie)
                .when()
                .filters(new RequestLoggingFilter())
                .post(System.getProperty("canvas") + "prematch/{sport}", sport);
    }

    public static Object getPreMatchAvailableEventsForTournament(Map<String, String> authCookie, String sport, String country, String tournament) {
        return given()
                .accept(JSON)
                .contentType(JSON)
                .cookies(authCookie)
                .when()
                .filters(new RequestLoggingFilter())
                .post(System.getProperty("canvas") + "prematch/{sport}/{country}/{tournament}/", sport, country, tournament);
    }

    public static Object getPreMatchAvailableEventsForTournamentWithoutCountry(Map<String, String> authCookie, String sport, String tournament) {
        return given()
                .accept(JSON)
                .contentType(JSON)
                .cookies(authCookie)
                .when()
                .filters(new RequestLoggingFilter())
                .post(System.getProperty("canvas") + "prematch/{sport}/{tournament}/", sport, tournament);
    }

    public static Object getInPlayEvents(Map<String, String> authCookie) {
        return given()
                .accept(JSON)
                .contentType(JSON)
                .cookies(authCookie)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "view/in-game");
    }

    public static Object getEventDetailsFromCanvas(Map<String, String> authCookie, String eventUrl) {
        return given()
                .accept(JSON)
                .contentType(JSON)
                .cookies(authCookie)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas.no.lang") + eventUrl);
    }
}
