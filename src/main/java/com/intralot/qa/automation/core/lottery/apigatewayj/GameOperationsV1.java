package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class GameOperationsV1 {

    public static Object getGames(Map<String, String> headers) {
        return given()
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/games/summary");
    }
}
