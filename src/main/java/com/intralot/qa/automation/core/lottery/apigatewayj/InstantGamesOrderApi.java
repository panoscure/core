package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class InstantGamesOrderApi {

    public static Object getsOrdersBasedOnSearchCriteria(Map<String, String> headers, String sort) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParam("page", "1")
                .queryParam("limit", "10")
                .queryParam("column", "orderId")
                .queryParam("sort", sort)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/igms/order/search");
    }

}
