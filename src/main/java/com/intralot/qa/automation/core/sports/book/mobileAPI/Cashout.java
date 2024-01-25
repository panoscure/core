package com.intralot.qa.automation.core.sports.book.mobileAPI;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class Cashout {

    public static Object cashoutOpenBet(String body, Map<String, String> headers) {
        return given()
                .headers(headers)
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/user/bet/cashout");
    }

    public static Object autoCashoutAnOpenBetForAnAmount(Map<String, String> headers, String betId, double cashOutAmount) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .header("MOBILECANVAS", headers.get("MOBILECANVAS"))
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .body("{\"betId\":\"" + betId + "\",\"cashoutAmount\":" + cashOutAmount + "}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/user/bet/cashout/auto");
    }

    public static Object partialCashoutAPlayersOpenBet(Map<String, String> headers, String body) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .header("MOBILECANVAS", headers.get("MOBILECANVAS"))
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .body(body)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/user/bet/cashout/partial");
    }
}
