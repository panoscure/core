package com.intralot.qa.automation.core.sports.book.canvas;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class Authentication {

    public static Object canvasLogin(String body) {
        return given()
                .contentType(JSON)
                .body(body)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "user/login");
    }

    public static Object canvasLogout(String ods_qa_ds, String sso_qa) {
        return given()
                .cookie("ods_qa_ds", ods_qa_ds)
                .cookie("sso_qa", sso_qa)
                .contentType(JSON)
                .body("{}")
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "user/logout");
    }

    public static Object canvasLogoutUS(Map<String, String> authCookie) {
        return given()
                .cookies(authCookie)
                .contentType(JSON)
                .body("{}")
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "user/logout");
    }
}
