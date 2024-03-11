package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class PAMPlayers {

    public static Object startAGameSessionForThePlayerPlayForRealMoney(Map<String, String> headers, String gameId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParam("gameId", gameId)
                .body("{}")
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/players/external/games/session");
    }

    public static Object setsPlayersLimits(Map<String, String> headers, String limitType, String interval, double limitParam, String licenseType, int channelId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParam("limitType", limitType)
                .queryParam("interval", interval)
                .queryParam("limitParam", limitParam)
                .queryParam("licenseType", licenseType)
                .queryParam("channelId", channelId)
                .body("{}")
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/players/limits");
    }

}
