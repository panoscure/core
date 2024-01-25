package com.intralot.qa.automation.core.sports.book.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class SportsbookPlayer {

    public static Object returnsThePlayerPreferences(Map<String, String> headers, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/players/preference/localized");
    }

    public static Object updateThePlayerPreferences(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .accept("application/json")
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/players/preference/localized");
    }

    public static Object returnsTheTeams(Map<String, String> headers, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/players/competitors/teams");
    }

    public static Object returnsTheCompetitions(Map<String, String> headers, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/players/competitions");
    }

    public static Object returnsThePlayers(Map<String, String> headers, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/players/competitors/players");
    }
}
