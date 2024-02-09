package com.intralot.qa.automation.core.sports.book.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class Retailers {

    public static Object getParlayDescriptions(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(body)
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/retailers/wagers/parlay/descriptions");
    }
}