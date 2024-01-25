package com.intralot.qa.automation.core.sports.book.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class SportsbookPAM {

    public static Object activePaymentOptions(Map<String, String> headers, boolean isDeposit, boolean isWithdraw) {
        headers.put("Guid", UUID.randomUUID().toString());
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("activeOnly", String.valueOf(true));
        queryParams.put("isDeposit", String.valueOf(isDeposit));
        queryParams.put("isWithdraw", String.valueOf(isWithdraw));
        queryParams.put("locale", "en-us");
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wallets/payment/options");
    }

    public static Object depositInitiate(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType(JSON)
                .body(body)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wallets/deposit/initiation");
    }

    public static Object processDeposit(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType(JSON)
                .body(body)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wallets/deposit/process");
    }

    public static Object getAllTransactionTypes(Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/systems/transaction/types");
    }
}
