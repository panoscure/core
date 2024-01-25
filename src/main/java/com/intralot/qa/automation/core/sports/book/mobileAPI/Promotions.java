package com.intralot.qa.automation.core.sports.book.mobileAPI;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class Promotions {

    public static Object validateVoucherCode(String voucherCode, Map<String, String> headers) {
        return given()
                .header("MOBILECANVAS", headers.get("MOBILECANVAS"))
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("mobile") + "/mobile/api/v3.1/promotions/voucher/info/{voucherCode}", voucherCode);
    }
}