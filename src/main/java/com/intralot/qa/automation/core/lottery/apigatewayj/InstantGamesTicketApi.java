package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InstantGamesTicketApi {

    public static Object preSellTicketsInRange(Map<String, String> headers, String firstTicketBarcode , String lastTicketBarcode ) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj")  + "/api/v1.0/igms/ticket/pre-sell/range/{firstTicketBarcode}/{lastTicketBarcode}", firstTicketBarcode, lastTicketBarcode);
    }

}
