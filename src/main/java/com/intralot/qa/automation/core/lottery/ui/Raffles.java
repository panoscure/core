package com.intralot.qa.automation.core.lottery.ui;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class Raffles {

    public static Object getRaffleDraws(Map<String, String> headers) {
        return given()
                .headers(headers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("lotteryui") + "/api/monitoringOperations/raffle/getRaffleDraws");
    }

}
