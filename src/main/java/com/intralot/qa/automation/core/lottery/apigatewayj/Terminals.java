package com.intralot.qa.automation.core.lottery.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class Terminals {

    public static Object getInformationAboutATerminal(Map<String, String> headers, Integer terminalCode) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/terminals/{terminalCode}", terminalCode);
    }
}
