package com.intralot.qa.automation.core.sports.book.mobileAPI;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class Wallet {

    public static Object getUserWallet(Map<String, String> headers, String mode) {
        return given()
                .headers(headers)
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("mobile") + "/mobile/api/v3.1/wallet/balance/{mode}", mode);
    }

    public static Object getUsersTransactionHistoryWithProperFilteringAndOrdering(Map<String, String> headers, String body) {
        return given()
                .header("MOBILECANVAS", headers.get("MOBILECANVAS"))
                .accept(JSON)
                .contentType(JSON)
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .body(body)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/wallet/transactions");
    }
}
