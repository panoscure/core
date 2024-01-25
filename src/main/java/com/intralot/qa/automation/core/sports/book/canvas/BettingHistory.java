package com.intralot.qa.automation.core.sports.book.canvas;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class BettingHistory {

    public static Object getTicketDetails(Map<String, String> authCookie, String betId) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .body("{\"id\":\"" + betId + "\"}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "ticketdetails");
    }
}
