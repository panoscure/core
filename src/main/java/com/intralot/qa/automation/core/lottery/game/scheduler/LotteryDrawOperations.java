package com.intralot.qa.automation.core.lottery.game.scheduler;

import com.intralot.qa.automation.core.utilities.CustomError;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.ResponseBodyExtractionOptions;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static java.net.HttpURLConnection.HTTP_OK;
import com.intralot.qa.automation.core.lottery.game.scheduler.models.lottery.draw.operations.retrieve.active.draw.requested.game.code.RetrieveSpecificDrawForRequestedGameCodeModel;
public class LotteryDrawOperations {

    public static Object retrieveDrawStatistics(int gameId, int drawId) {
        return given()
                .accept(JSON)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("gamescheduler") + "/game-scheduler/api/v1.0/lottery/draws/{gameId}/{drawId}/statistics", gameId, drawId);
    }

    public static Object retrieveSpecificDrawForRequestedGameCode(int gameID, int drawId) {
        return given()
                .accept(JSON)
                .relaxedHTTPSValidation()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("gamescheduler") + "/game-scheduler/api/v1.0/lottery/draws/{gameId}/{drawId}", gameID, drawId);
    }

    public static Object retrieveActiveDrawForRequestedGameCode(Integer gameId) {
        return given()
                .accept(JSON)
                .relaxedHTTPSValidation()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("gamescheduler") + "/game-scheduler/api/v1.0/lottery/draws/{gameId}/active", gameId)
                .then().statusCode(HTTP_OK)
                .extract().response();
    }

    public static Object retrieveAllActiveDrawsForAllGames() {
        return given()
                .accept(JSON)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("gamescheduler") + "/game-scheduler/api/v1.0/lottery/draws/active");
    }

    public static Object updateExistingDraw(Integer gameId, Integer drawId, Long drawTime) {
        int previousDrawIdStatus = ((ResponseBodyExtractionOptions) LotteryDrawOperations.retrieveSpecificDrawForRequestedGameCode(
                gameId, drawId - 1)).as(RetrieveSpecificDrawForRequestedGameCodeModel.class).getStatus();
        if (previousDrawIdStatus == 3 || previousDrawIdStatus == 5) {
            throw new CustomError("Previous Draw was found either in status 3 or status 5");
        }
        return given()
                .accept(JSON)
                .relaxedHTTPSValidation()
                .contentType(JSON)
                .body("{\"drawTime\": " + String.valueOf(System.currentTimeMillis() + drawTime) + "}")
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("gamescheduler") + "/game-scheduler/api/v1.0/lottery/draws/{gameId}/{drawId}", gameId, drawId)
                .then().statusCode(HTTP_OK)
                .extract().response();
    }

    public static Object registerWinningNumbers(Integer gameId, Integer drawId, String winningNumbers) {
        return given()
                .accept(JSON)
                .relaxedHTTPSValidation()
                .contentType(JSON)
                .body(winningNumbers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("gamescheduler") + "/game-scheduler/api/v1.0/lottery/draws/{gameId}/{drawId}/winningNumbers", gameId, drawId)
                .then().statusCode(HTTP_OK)
                .extract().response();
    }

    public static Object updateDrawResults(Integer gameId, Integer drawId, Integer currentStatus, String body) {
        return given()
                .accept(JSON)
                .contentType(JSON)
                .queryParam("currentStatus", currentStatus)
                .body(body)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("gamescheduler") + "/game-scheduler/api/v1.0/lottery/draws/{gameId}/{drawId}/results", gameId, drawId);
    }

}