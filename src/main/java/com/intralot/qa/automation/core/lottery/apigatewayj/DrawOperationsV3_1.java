package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class DrawOperationsV3_1 {

    public static Object getTheActiveDrawForAGame(Map<String, String> headers, String gameId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v3.1/draws/{gameId}/active", gameId);
    }

    public static Object getDrawV3_1(Map<String, String> headers, String gameId, int drawId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v3.1/draws/{gameId}/{drawId}", gameId, drawId);
    }

    public static Object getDrawV3_1_WithSpecificStatus(Map<String, String> headers, String gameId, int drawId, String status) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParam(status)
                .headers(headers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v3.1/draws/{gameId}/{drawId}/", gameId, drawId);
    }

}
