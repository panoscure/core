package com.intralot.qa.automation.core.sports.book.mobileAPI;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class Authentication {

    public static Object loginByUsername(String username, String password) {
        String body = "{\"username\": \"" + username + "\",\"password\": \"" + password + "\"}";
        return given()
                .header("MOBILECANVAS", System.getProperty("mobileCanvasHeader"))
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/auth/login");
    }

    public static Object logoutByAccessToken() {
        return given()
                .header("MOBILECANVAS", System.getProperty("mobileCanvasHeader"))
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/auth/logout");
    }
}
