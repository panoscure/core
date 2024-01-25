package com.intralot.qa.automation.core.sports.book.canvas;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.math.BigDecimal;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class UserOverview {

    public static Object accountOverview(Map<String, String> authCookie) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .when()
                .filters(new RequestLoggingFilter())
                .post(System.getProperty("canvas") + "view/account-overview");
    }

    public static Object gameHistory(Map<String, String> authCookie) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .when()
                .filters(new RequestLoggingFilter())
                .post(System.getProperty("canvas") + "view/game-history");
    }

    public static Object updateWidgetData(Map<String, String> authCookie, String body, String widgetId) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .body(body)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "updateWidgetData/" + widgetId);
    }

    public static Object myBets(Map<String, String> authCookie) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("canvas") + "openBets");
    }

    public static Object transactionHistory(Map<String, String> authCookie) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .when()
                .filters(new RequestLoggingFilter())
                .post(System.getProperty("canvas") + "view/transaction-history");
    }


    public static Object cashOutBet(Map<String, String> authCookie, String barcode, double cashOutAmount) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .body("{\"betId\":\"" + barcode + "\",\"cashoutAmount\":" + cashOutAmount + "}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "cashout");
    }

    public static Object cashOutPartial(Map<String, String> authCookie, String barcode, BigDecimal partialCashOutAmount, BigDecimal fullCashOutAmount, BigDecimal stake) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .body("{\"betId\":\"" + barcode + "\",\"cashoutAmount\":" + partialCashOutAmount + ",\"fullCashoutAmount\":" + fullCashOutAmount + ",\"originalStake\":" + stake + "}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "cashout/partial");
    }

    public static Object cashOutAuto(Map<String, String> authCookie, String barcode, double cashOutAmount) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .body("{\"betId\":\"" + barcode + "\",\"cashoutAmount\":\"" + cashOutAmount + "\"}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "cashout/auto");
    }

    public static Object getFinancialHistory(Map<String, String> authCookie) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .body("{}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "view/financial-history");
    }

    public static Object fetchCustomCouponEventsData(String ods_qa_ds, String sso_qa, String selectedTournaments) {
        return given()
                .cookie("ods_qa_ds", ods_qa_ds)
                .cookie("sso_qa", sso_qa)
                .cookie("selectedMarketsAndTournaments", selectedTournaments)
                .contentType(JSON)
                .body("{ }")
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "/view/custom-coupon");
    }
}
