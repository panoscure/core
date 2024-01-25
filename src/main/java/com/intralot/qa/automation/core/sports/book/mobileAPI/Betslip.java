package com.intralot.qa.automation.core.sports.book.mobileAPI;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class Betslip {

    public static Object loadCurrentBetslip(Map<String, String> headers) {

        return given()
                .headers(headers)
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("mobile") + "/mobile/api/v3.1/betslip");
    }

    public static Object addBetslip(String body, Map<String, String> headers) {

        return given()
                .headers(headers)
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/betslip/add");
    }

    public static Object setSingleAmountForOdd(String body, Map<String, String> headers) {

        return given()
                .headers(headers)
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/betslip/setSingleAmounts");
    }

    public static Object setSystemAmount(String body, Map<String, String> headers) {

        return given()
                .headers(headers)
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/betslip/setSystemAmounts");
    }

    public static Object setFullBetslip(String body, Map<String, String> headers) {

        return given()
                .headers(headers)
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/betslip/set");
    }

    public static Object useBankers(String body, Map<String, String> headers) {

        return given()
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .headers(headers)
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/betslip/useBankers");
    }

    public static Object addBankerForEvent(String body, Map<String, String> headers) {

        return given()
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .headers(headers)
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/betslip/addBanker");
    }

    public static Object playBetslip(String body, Map<String, String> headers) {

        return given()
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .headers(headers)
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/betslip/play");
    }

    public static Object editOpenBet(String body, Map<String, String> headers) {
        return given()
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .header("MOBILECANVAS", headers.get("MOBILECANVAS"))
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/betslip/edit");
    }

    public static Object calculateAFullBetslip(String body, Map<String, String> headers) {
        return given()
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .header("MOBILECANVAS", headers.get("MOBILECANVAS"))
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/betslip/calculate");
    }

    public static Object clearBetslip(Map<String, String> headers) {

        return given()
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .header("MOBILECANVAS", headers.get("MOBILECANVAS"))
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/betslip/clear");
    }

    public static Object selectAPromotionForYourBetSlip(String promotionId, Map<String, String> headers) {

        return given()
                .header("MOBILECANVAS", headers.get("MOBILECANVAS"))
                .cookie("edge_mob_qa", headers.get("edge_mob_qa"))
                .cookie("sso_qa", headers.get("sso_qa"))
                .body("{\"id\":\"" + promotionId + "\"}")
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/betslip/selectPromotion");
    }
}