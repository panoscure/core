package com.intralot.qa.automation.core.sports.book.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class PAMDraws {

    public static Object notifyForDrawChangeByDrawNumberAndGameStateId(Map<String, String> headers, String drawNumber, String gameStateId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/draws/{drawNumber}/notify/games/{gameStateId}", drawNumber, gameStateId);
    }

    public static Object notifyForDrawChange(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/draws/notify");
    }
}