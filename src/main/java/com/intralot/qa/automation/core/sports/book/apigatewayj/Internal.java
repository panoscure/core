package com.intralot.qa.automation.core.sports.book.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class Internal {

    public static Object specialCancel(Map<String, String> headers, String playGuid) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(),new ResponseLoggingFilter())
                .delete(System.getProperty("apigatewayj") + "/api/v1.0/internal/transactions/{playGuid}",playGuid);
    }
}
