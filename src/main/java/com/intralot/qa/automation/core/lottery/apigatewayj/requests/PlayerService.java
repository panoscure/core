package com.intralot.qa.automation.core.lottery.apigatewayj.requests;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class PlayerService {

    public static Object resetPassword(Map<String, String> headers, String password) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("apigatewayj") + "/api/v1.0/players/{username}/password",password);
    }

    public static Object resendOtp(Map<String, String> headers, Integer id, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("apigatewayj") + "/api/v1.0/players/{id}/otp/resend",id);
    }

    public static Object changePassword(Map<String, String> headers, Integer id, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1.0/players/{id}/password",id);
    }

}
