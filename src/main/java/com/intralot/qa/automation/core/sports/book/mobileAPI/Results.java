package com.intralot.qa.automation.core.sports.book.mobileAPI;

import io.restassured.filter.log.RequestLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class Results {

    public static Object getResults(Map<String, String> headers, String body) {

        return given()
                .header("MOBILECANVAS", headers.get("MOBILECANVAS"))
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .accept(JSON)
                .contentType(JSON)
                .body(body)
                .when()
                .filters(new RequestLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/results");
    }
}