package com.intralot.qa.automation.core.lottery.game.management;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class MatchXPrograms {

    public static Object getProgramForAGameByDrawId(int gameId, int drawId) {
        return given()
                .accept(JSON)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("gamemanagement") + "/api/v1.0/program/{gameId}/{drawId}", gameId, drawId);

    }
}

