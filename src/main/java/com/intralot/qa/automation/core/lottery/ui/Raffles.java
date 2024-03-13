package com.intralot.qa.automation.core.lottery.ui;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class Raffles {

    public static Object getRaffleDraws(Map<String, String> headers) {
        return given()
                .headers(headers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("lotteryui") + "/api/monitoringOperations/raffle/getRaffleDraws");
    }

}
