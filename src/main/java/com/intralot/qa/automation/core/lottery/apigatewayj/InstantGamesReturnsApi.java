package com.intralot.qa.automation.core.lottery.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class InstantGamesReturnsApi {

    public static Object returnTickets(Map<String, String> headers, Object body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/igms/return");
    }

}
