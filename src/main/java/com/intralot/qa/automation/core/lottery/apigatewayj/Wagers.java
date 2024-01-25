package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager.ItIsUsedToPlayAWagerRequest;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.intralot.qa.automation.core.lottery.constants.Constants.VALIDATE_BODY;
import static io.restassured.RestAssured.given;

public class Wagers {

    public static Object getWagerDetailsBySerialNumber(Map<String, String> headers, String serialNumber) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{serialNumber}", serialNumber);
    }

    public static Object getWagerDetailsBySerialNumberWithLevel(Map<String, String> headers, String serialNumber, String level) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParam("level", level)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{serialNumber}", serialNumber);
    }

    public static Object getWagerDetailsByWagerId(Map<String, String> headers, String wagerId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/wagerId/{wagerId}", wagerId);
    }

    public static Object retrieveTheWinningsForTheWager(Map<String, String> headers, String serialNumber) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{serialNumber}/winnings", serialNumber);
    }

    public static Object retrieveTheWinningsForTheWagerWithLevel(Map<String, String> headers, String serialNumber, String level) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParam("level", level)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{serialNumber}/winnings", serialNumber);
    }

    public static Object validateAWagerV1(Map<String, String> headers, String serialNumber) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .relaxedHTTPSValidation()
                .body(VALIDATE_BODY)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{serialNumber}/validation", serialNumber);
    }

    public static Object validateAWagerV1(Map<String, String> headers, String serialNumber, Object body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .relaxedHTTPSValidation()
                .body(body)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{serialNumber}/validation", serialNumber);
    }

    public static Object verifiesAWager(Map<String, String> headers, String verifyBody) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(verifyBody)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wagers/verification");
    }

    public static Object itIsUsedToPlayAWager(Map<String, String> headers, Object playBody) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(playBody)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wagers");
    }

    public static Object itIsUsedToPlayAWager(Map<String, String> headers,
                                              ItIsUsedToPlayAWagerRequest itIsUsedToPlayAWagerRequest) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(itIsUsedToPlayAWagerRequest)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wagers");
    }

    public static Object rollbackTransaction(Map<String, String> headers, String guid) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{guid}", guid);
    }

    public static Object updatesTheStatusOfAWager(Map<String, String> headers, String serialNumber, String status) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body("{\n" +
                        "\"metadata\": {\n" +
                        "   \"trnsTime\": \"17:10:00\"\n" +
                        " },\n" +
                        " \"status\": \"" + status + "\"\n" +
                        " }")
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{serialNumber}/status", serialNumber);
    }

    public static Object getMultipleWagersDetails(Map<String, String> headers, ArrayList<String> serialNumbers) {
        headers.put("Guid", UUID.randomUUID().toString());
        Map<String, ArrayList<String>> queryParamsSerialNumbers = new HashMap<>();
        queryParamsSerialNumbers.put("sn", serialNumbers);
        return given()
                .headers(headers)
                .queryParams(queryParamsSerialNumbers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers");
    }

    public static Object getMultipleWagersDetailsWithLevel(Map<String, String> headers, ArrayList<String> serialNumbers, String level) {
        headers.put("Guid", UUID.randomUUID().toString());
        Map<String, ArrayList<String>> queryParamsSerialNumbers = new HashMap<>();
        queryParamsSerialNumbers.put("sn", serialNumbers);
        return given()
                .headers(headers)
                .queryParams(queryParamsSerialNumbers)
                .queryParam("level", level)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers");
    }

    public static Object getWagerDetailsForRepeatingABet(Map<String, String> headers, String serialNumber) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                        .headers(headers)
                        .when()
                        .filter(new RequestLoggingFilter())
                        .filter(new ResponseLoggingFilter())
                        .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{serialNumber}/repeat",serialNumber);
    }

    public static Object winningsForTheWagerProvidedInPayload(Map<String, String> headers, String checkNumbersBody) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                        .headers(headers)
                        .body(checkNumbersBody)
                        .when()
                        .filter(new RequestLoggingFilter())
                        .filter(new ResponseLoggingFilter())
                        .post(System.getProperty("apigatewayj") +"/api/v1.0/wagers/check-numbers");
    }

    public static Object winningsForTheWagerProvidedInPayloadWithLevel(Map<String, String> headers, String checkNumbersBody, String level) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParam("level", level)
                .body(checkNumbersBody)
                .when()
                .filter(new RequestLoggingFilter())
                .filter(new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") +"/api/v1.0/wagers/check-numbers");
    }

    public static Object checkStatusOfAPlayRequestByGuid(Map<String, String> headers, String guid) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/guid/{guid}", guid);
    }

}
