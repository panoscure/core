package com.intralot.qa.automation.core.sports.book.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class WagersV2 {

    public static Object validateWager(Map<String, String> headers, String body, String serialNumber) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v2.0/wagers/{serialNumber}/validation", serialNumber);
    }
}
