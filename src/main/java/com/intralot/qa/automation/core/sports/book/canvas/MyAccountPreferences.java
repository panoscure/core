package com.intralot.qa.automation.core.sports.book.canvas;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class MyAccountPreferences {

    public static Object getFavouriteCompetitions(Map<String, String> authCookie, String competitionName) {
        return given()
                .accept(JSON)
                .contentType(JSON)
                .cookies(authCookie)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("canvas") + "user/competitions/{competitionName}", competitionName);
    }

    public static Object getFavouriteTeams(Map<String, String> authCookie, String teamName) {
        return given()
                .accept(JSON)
                .contentType(JSON)
                .cookies(authCookie)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("canvas") + "user/competitors/team/{teamName}", teamName);
    }

    public static Object updateUserPreferences(Map<String, String> authCookie, String body) {
        return given()
                .accept(JSON)
                .contentType(JSON)
                .cookies(authCookie)
                .body(body)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "user/preferences");
    }
}
