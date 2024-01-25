package com.intralot.qa.automation.core.sports.book.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;

public class Authentication {

    public static Object validateTheGivenToken(Map<String, String> headers, Map<String, String> queryParams) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/authentication/check_token");
    }

    public static Object getTheVerificationKeyForJwtTokenSignatures() {
        return given()
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/authentication/token_key");
    }

    public static Object revokeTheGivenToken(Map<String, String> headers, Map<String, String> queryParams) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("apigatewayj") + "/authentication/token");
    }

    public static Object revokeTheGivenRefreshToken(Map<String, String> headers, Map<String, String> queryParams) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("apigatewayj") + "/authentication/refresh_token");
    }

    public static String grantAuthorizationTokenExtractToken(Map<String, String> headers, Map<String, String> formData) {
        return given()
                .headers(headers)
                .formParams(formData)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/authentication/token")
                .then()
                .statusCode(HTTP_OK)
                .extract().path("access_token");
    }

    public static String grantAuthorizationTokenTerminalExtractToken(Map<String, String> headers, String body) {
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/terminal-actions/signon")
                .then()
                .statusCode(HTTP_OK)
                .extract().path("access_token");
    }
}
