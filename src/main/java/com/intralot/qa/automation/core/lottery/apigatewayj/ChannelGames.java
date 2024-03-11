package com.intralot.qa.automation.core.lottery.apigatewayj;


import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;

/*****************************
 * Methods:
 *   returnsTheActiveChannelRecord() implements GET /api/v1.0/games/{gameId}/channels/versions/active
 *   returnsChannelRecord() implements GET /api/v1.0/games/{gameId}/channels/versions/{channelRecordId}
 *
 *   One POJO (Response) Model, applicable for these REST methods can be found at package:
 *
 *   lottery.apigatewayj.models.channelgames.getchannelrecord
 *******************************/

public class ChannelGames {

    public static Object returnsTheActiveChannelRecord(Map<String, String> headers, String gameId, Map<String, String> queryParams) {
        return given()
                .pathParam("gameId", gameId)
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/games/{gameId}/channels/versions/active");
    }

    public static Object returnsChannelRecord(Map<String, String> headers, String gameId, String channelRecordId, Map<String, String> queryParams) {
        return given()
                .pathParam("gameId", gameId)
                .pathParam("channelRecordId", channelRecordId)
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/games/{gameId}/channels/versions/{channelRecordId}");
    }

}
