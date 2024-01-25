package com.intralot.qa.automation.core.sports.book.canvas;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class Transactions {

    public static Object depositInitiate(String ods_qa_ds, String sso_qa, String body) {
        return given()
                .cookie("ods_qa_ds", ods_qa_ds)
                .cookie("sso_qa", sso_qa)
                .contentType(JSON)
                .body(body)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "/transaction/deposit/initiate");
    }

    public static Object depositProceed(String ods_qa_ds, String sso_qa, String body) {
        return given()
                .cookie("ods_qa_ds", ods_qa_ds)
                .cookie("sso_qa", sso_qa)
                .contentType(JSON)
                .body(body)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "/transaction/deposit/proceed");
    }

    public static Object withdrawInitiate(String ods_qa_ds, String sso_qa, String body) {
        return given()
                .cookie("ods_qa_ds", ods_qa_ds)
                .cookie("sso_qa", sso_qa)
                .contentType(JSON)
                .body(body)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "/transaction/withdraw/initiate");
    }

    public static Object withdrawProceed(String ods_qa_ds, String sso_qa, String body) {
        return given()
                .cookie("ods_qa_ds", ods_qa_ds)
                .cookie("sso_qa", sso_qa)
                .contentType(JSON)
                .body(body)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "/transaction/withdraw/proceed");
    }
}
