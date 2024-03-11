package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

/*****************************
 * Methods:
 *   returnsTheActiveRecordForTheSpecifiedGame() implements GET /api/v1.0/games/{gameId}/versions/active
 *   returnsAListWithAllRecordsForASpecificGame() implements GET /api/v1.0/games/{gameId}/versions
 *   returnsAListWithAllActiveRecordsForAllGames() implements GET /api/v1.0/games/active
 *   returnsTheSpecifiedRecordForTheSpecifiedGame() implements GET /api/v1.0/games/{gameId}/versions/{recordId}
 *
 *   One POJO (Response) Model, applicable for these REST methods can be found at package:
 *
 *   lottery.apigatewayj.models.games.getgamerecord;
 *******************************/

public class Games {

    public static Object returnsTheActiveRecordForTheSpecifiedGame(Map<String, String> headers, String gameId, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/games/{gameId}/versions/active", gameId);
    }

    public static Object returnsAListWithAllRecordsForASpecificGame(Map<String, String> headers, String gameId, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/games/{gameId}/versions", gameId);
    }

    public static Object returnsAListWithAllActiveRecordsForAllGames(Map<String, String> headers, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/games/active");
    }

    public static Object returnsTheSpecifiedRecordForTheSpecifiedGame(Map<String, String> headers, String gameId, String recordId, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/games/{gameId}/versions/{recordId}", gameId, recordId);
    }
}