package com.intralot.qa.automation.core.sports.book.canvas;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.math.BigDecimal;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class BetSlip {

    public static Object selectPromotion(Map<String, String> authCookie, String promotionId) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .body("{\"code\":\"" + promotionId + "\"}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "betslip/selectPromotion");
    }

    public static Object addBanker(Map<String, String> authCookie, String eventId) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .body("{\"eventID\":\"" + eventId + "\"}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "betslip/addBanker");
    }

    public static Object useBankers(Map<String, String> authCookie) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .body("{\"useBankers\":true}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "betslip/useBankers");
    }

    public static Object editBet(Map<String, String> authCookie, String editBetBody) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .body(editBetBody)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "betslip/editBet");
    }

    public static Object calculate(Map<String, String> authCookie, String calculateBody) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .body(calculateBody)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "betslip/calculate");
    }

    public static Object validateVoucherCode(Map<String, String> authCookie, String voucherCode) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("canvas") + "voucher/info/" + voucherCode);
    }

    public static Object clearCanvasBetSlip(Map<String, String> authCookie) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "betslip/clear");
    }

    public static Object placeBet(Map<String, String> authCookie, String body) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .body(body)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "betslip/play");
    }

    public static Object setSystemAmount(Map<String, String> authCookie, String system, BigDecimal stake) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .body("{\"" + system + "\":\"" + stake + "\"}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "betslip/setSystemAmounts");
    }

    public static Object setSingleAmount(Map<String, String> authCookie, String oddID, BigDecimal stake) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .body("{\"" + oddID + "\":\"" + stake + "\"}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "betslip/setSingleAmounts");
    }

    public static Object addSelectionToBetSlipCanvas(Map<String, String> authCookie, String oddID) {
        return given()
                .contentType(JSON)
                .accept(JSON)
                .cookies(authCookie)
                .body("{\"oddID\": \"" + oddID + "\"}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "betslip/add");
    }
}
