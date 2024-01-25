package com.intralot.qa.automation.core.sports.book.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class Wagers {

    public static Object itIsUsedToPlayAWager(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wagers");
    }

    public static Object itIsUsedToPlayAWagerNoLogs(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wagers");
    }

    public static Object settleWager(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/categories/resulted");
    }

    public static Object callsThePAMToUnsettleAWager(Map<String, String> headers, String guid) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("apigatewayj") + "/api/v1.0/wagers/settlements/{guid}", guid);
    }

    public static Object validateAWager(Map<String, String> headers, Map<String, String> queryParams, String serialNumber, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .body(body)
                .headers(headers)
                .queryParams(queryParams)
                .accept("application/json")
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{serialNumber}/validation/spb", serialNumber);
    }

    public static Object validateAWagerNLO(Map<String, String> headers, Map<String, String> queryParams, String serialNumber, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .body(body)
                .headers(headers)
                .queryParams(queryParams)
                .accept("application/json")
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v3.0/wagers/{serialNumber}/validation", serialNumber);
    }

    public static Object returnsTheBetsOfASpecificBetslipId(Map<String, String> headers, String serialNumber) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{serialNumber}/betslip", serialNumber);
    }
}
