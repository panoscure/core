package com.intralot.qa.automation.core.sports.book.mobileAPI;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class User {

    public static Object getPlayerOpenBets(String body, Map<String, String> headers) {
        return given()
                .headers(headers)
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/user/bets/open");
    }

    public static Object retrievePlayerDetailsWithAllPreferences(Map<String, String> headers) {
        return given()
                .headers(headers)
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("mobile") + "/mobile/api/v3.1/user/full");
    }

    public static Object getPlayersSportsbookBets(String body, Map<String, String> headers) {
        return given()
                .header("MOBILECANVAS", headers.get("MOBILECANVAS"))
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .body(body)
                .accept(JSON)
                .contentType(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/user/sportsbook/trail");
    }

    public static Object getPlayerSportsBookPreferences(Map<String, String> headers) {
        return given()
                .header("MOBILECANVAS", headers.get("MOBILECANVAS"))
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("mobile") + "/mobile/api/v3.1/user/sportsbook/preferences");
    }

    public static Object getFavouriteCompetitions(Map<String, String> headers, String competitionName) {
        return given()
                .header("MOBILECANVAS", headers.get("MOBILECANVAS"))
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .accept(JSON)
                .contentType(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("mobile") + "/user/competitions/" + competitionName);
    }

    public static Object updatePlayerSportsBookPreferences(Map<String, String> headers, String body) {
        return given()
                .header("MOBILECANVAS", headers.get("MOBILECANVAS"))
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/user/preferences");
    }

    public static Object getFavouriteTeams(Map<String, String> headers, String teamName) {
        return given()
                .header("MOBILECANVAS", headers.get("MOBILECANVAS"))
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .accept(JSON)
                .contentType(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("mobile") + "/user/competitors/team/" + teamName);
    }
}
