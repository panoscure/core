package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;

/*****************************
 * Methods:
 *   returnsBasicInformationForASpecificGame() implements GET /api/v1.0/gamesInfo/{id}
 *   returnsBasicInformationForAllDefinedGames() implements GET /api/v1.0/gamesinfo
 *
 *   One POJO (Response) Model, applicable for these REST methods can be found at package:
 *
 *   lottery.apigatewayj.models.gamesinfo.getbasicgameinfo
 *******************************/

public class GamesInfo {

    public static Object returnsBasicInformationForASpecificGame(Map<String, String> headers, String gameId) {
        return given()
                .pathParam("id", gameId)
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/gamesInfo/{id}");
    }

    public static Object returnsBasicInformationForAllDefinedGames(Map<String, String> headers, Map<String, String> queryParams) {
        return given()

                .headers(headers)
                .queryParams(queryParams)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/gamesinfo");
    }

}
