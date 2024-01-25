package com.intralot.qa.automation.core.sports.book.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class SportsbookRetailers {

    public static Object savesRetailerInformation(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/retailers/accounts");
    }

    public static Object getEventDescriptions(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/retailers/wagers/descriptions");
    }

    public static Object getRollingEvents(Map<String, String> headers, Map<String, String> queryParams, String sportTypeId, String fromDate, String toDate) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/retailers/events/rolling/{sportTypeId}/{fromDate}/{toDate}", sportTypeId, fromDate, toDate);
    }

    public static Object getRetailerInformation(Map<String, String> headers, String externalRetailerId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/retailers/accounts/{externalRetailerId}", externalRetailerId);
    }

    public static Object deletesRetailerInformation(Map<String, String> headers, String externalRetailerId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("apigatewayj") + "/api/v1.0/retailers/accounts/{externalRetailerId}", externalRetailerId);
    }

    public static Object getAntepostEvents(Map<String, String> headers, Map<String, String> queryParams, String fromDate, String toDate) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/retailers/events/antepost/{fromDate}/{toDate}", fromDate, toDate);
    }

    public static Object getReailerReports(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .accept("application/json")
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/retailers/reports");
    }

    public static Object markAHighWinnerCouponAsPaidByTheBank(Map<String, String> headers, Map<String, String> queryParams, String uid) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1.0/retailers/betslips/{uid}/claim/paid", uid);
    }

    public static Object getParlayDescriptions(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType("application/json")
                .body(body)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/retailers/wagers/parlay/descriptions");
    }
}
