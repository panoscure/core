package com.intralot.qa.automation.core.sports.book.canvas;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class Results {

    public static Object getResultsForSport(Map<String, String> authCookie, Map<String, String> resultsQueryParams) {
        return given()
                .accept(JSON)
                .contentType(JSON)
                .cookies(authCookie)
                .queryParams(resultsQueryParams)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("canvas") + "results");
    }
}
