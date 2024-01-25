package com.intralot.qa.automation.core.sports.book.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class SportsbookWagers {

    public static Object setsBetNotifications(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wagers/betnotification");
    }

    public static Object cashoutsABet(Map<String, String> headers, String body, String betId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{betId}/cashout", betId);
    }

    public static Object calculatesBuildBetPrice(Map<String, String> headers, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/calculate/betbuilder");
    }

    public static Object calculatesTheCashoutAmountPerOpenBet(Map<String, String> headers, Map<String, String> queryParams, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wagers/calculate/cashout");
    }

    public static Object returnsTheBetsOfASpecificBetslipId(Map<String, String> headers, Map<String, String> queryParams, String betslipId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/betslips/{id}/bets", betslipId);
    }

    public static Object rejectAnOverAskTradersResponse(Map<String, String> headers, String overAskId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("apigatewayj") + "/api/v1.0/wagers/overask/{overAskId}", overAskId);
    }

    public static Object returnsATopWinnersBetDetails(Map<String, String> headers, Map<String, String> queryParams, String betId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{betId}/details/public", betId);
    }

    public static Object returnsTheFullDetailsForASpecificBetSlipId(Map<String, String> headers, Map<String, String> queryParams, String uid) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{uid}/b2b/details", uid);
    }

    public static Object returnsTheFullDetailsForASpecificBetSlipIdIfValidationFails(Map<String, String> headers, String uid) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{uid}/b2b/details", uid)
                .then().log().ifValidationFails().extract().response();
    }

    public static Object retrieveThePlayersBets(Map<String, String> headers, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers");
    }

    public static Object returnsTheDetailsForASpecificBetId(Map<String, String> headers, Map<String, String> queryParams, String betId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/betId/{betId}", betId);
    }

    public static Object editAnAutoCashoutRequest(Map<String, String> headers, String body, String betId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{betId}/autocashout", betId);
    }

    public static Object cancelsAnAutocashout(Map<String, String> headers, String betId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{betId}/autocashout", betId);
    }

    public static Object usedByOrionToCashoutABetAndPlaysANewBet(Map<String, String> headers, String body, String uid) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{uid}/change-bet", uid);
    }

    public static Object retrievesAllOpenBets(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wagers/open");
    }

    public static Object autocashoutsABetBbasedOnDefinedCriteria(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wagers/autocashout");
    }

    public static Object returnsTheSuccessStatusForASpecificBetId(Map<String, String> headers, Map<String, String> queryParams, String betId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{betId}/success", betId);
    }

    public static Object cashoutsABetIdAndPlaysANewBet(Map<String, String> headers, String body, String betId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{betId}/change", betId);
    }

    public static Object returnsTheDetailsForASpecificBetslipId(Map<String, String> headers, Map<String, String> queryParams, String betslipId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/betslips/{betslipId}/details", betslipId);
    }

    public static Object calculatesTheCashoutAmountPerOpenBet(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wagers/betids/calculate/cashout");
    }

    public static Object returnsTheFullDetailsForASpecificBetId(Map<String, String> headers, Map<String, String> queryParams, String body, String betId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{betId}/details", betId);
    }

    public static Object getAListOfLadderOdds(Map<String, String> headers, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/ladders/root");
    }
}