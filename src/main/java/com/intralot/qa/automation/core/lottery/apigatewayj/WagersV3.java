package com.intralot.qa.automation.core.lottery.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static com.intralot.qa.automation.core.lottery.constants.Constants.VALIDATE_BODY;
import static io.restassured.RestAssured.given;

public class WagersV3 {

    public static Object validateWagerV3(Map<String, String> headers, String serialNumber) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(VALIDATE_BODY)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v3.0/wagers/{serialNumber}/validation", serialNumber);
    }

    public static Object validateWagerV3(Map<String, String> headers, String serialNumber, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v3.0/wagers/{serialNumber}/validation", serialNumber);
    }
}
