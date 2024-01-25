package com.intralot.qa.automation.core.sports.book.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class L5Sessions {

    public static Object createNewSession(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType(JSON)
                .queryParam("locale", "en-us")
                .body(body)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1/sessions");
    }

    public static Object retrievesSessionRelatedInformation(Map<String, String> headers, String sessionId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParam("locale", "en-us")
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1/sessions/{sessionId}", sessionId);
    }

    public static Object depositTheRequestedAmountToTheActiveSession(Map<String, String> headers, String body, String sessionId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType(JSON)
                .queryParam("locale", "en-us")
                .body(body)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1/sessions/{sessionId}/deposits", sessionId);
    }

    public static Object sealsPreviousDeposit(Map<String, String> headers, String body, String sessionId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType(JSON)
                .queryParam("locale", "en-us")
                .body(body)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1/sessions/{sessionId}/money-stacked", sessionId);
    }

    public static Object closeTheActiveSessionAndCreateTheVoucherSerialNumber(Map<String, String> headers, String body, String sessionId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType(JSON)
                .queryParam("locale", "en-us")
                .body(body)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("apigatewayj") + "/api/v1/sessions/{sessionId}", sessionId);
    }
}
