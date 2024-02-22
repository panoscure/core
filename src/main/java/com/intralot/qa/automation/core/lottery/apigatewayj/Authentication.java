package com.intralot.qa.automation.core.lottery.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;

public class Authentication {

    public static String grantAuthorizationTokenExtractToken(String agj_project_url, Map<String, String> headers, Map<String, String> formData) {
        return given()
                .headers(headers)
                .formParams(formData)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(agj_project_url + "/authentication/token")
                .then()
                .statusCode(HTTP_OK)
                .extract().path("access_token");
    }

    public static String grantAuthorizationTokenTerminalSignOnExtractToken(Map<String, String> headers, String authBody) {
        return given()
                .headers(headers)
                .body(authBody)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/terminal-actions/signon")
                .then()
                .statusCode(HTTP_OK)
                .extract().path("access_token");
    }


    public static Object grantAuthorizationToken(Map<String, String> headers, Map<String, String> formData) {
        return given()
                .headers(headers)
                .formParams(formData)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/authentication/token");
    }

    public static Object validateTheGivenToken(Map<String, String> headers, Map<String, String> queryParams) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/authentication/check_token");
    }

}
