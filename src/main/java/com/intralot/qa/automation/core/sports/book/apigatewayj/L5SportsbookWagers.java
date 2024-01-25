package com.intralot.qa.automation.core.sports.book.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class L5SportsbookWagers {

    public static Object cancelsABetSlip(Map<String, String> headers, String serialNumber) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .body("{\n" + " \"barcodeReadMethod\": \"READ\"\n" + "}")
                .headers(headers)
                .accept("application/json")
                .contentType("application/json")
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{serialNumber}/spb", serialNumber);
    }

    public static Object returnsTheBetsOfASpecificBetSlipId(Map<String, String> headers, String serialNumber) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{serialNumber}/details/spb", serialNumber);
    }

    public static Object usedByTerminalsToCalculateTheCashOutOfBetSlip(Map<String, String> headers, String retailerId, String serialNumber) {
        headers.put("RetailerId", retailerId);
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .accept(ContentType.JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/betslips/{serialNumber}/calculate/cashout", serialNumber);
    }

    public static Object usedByTerminalsToCashOutABetslipWithSerialNumber(Map<String, String> headers, String retailerId, String terminalId, String serialNumber, int retailerLevel, BigDecimal cashoutAmount, String body) {
        headers.put("RetailerId", retailerId);
        headers.put("TerminalId", terminalId);
        headers.put("Guid", UUID.randomUUID().toString());
        headers.put("RetailerLevel", String.valueOf(retailerLevel));
        return given()
                .headers(headers)
                .queryParam("cashoutAmount", cashoutAmount)
                .contentType(ContentType.JSON)
                .body(body)
                .accept(ContentType.JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1.0/wagers/betslips/{serialNumber}/cashout", serialNumber);
    }

    public static Object retrieveTradersBetSlipProposal(Map<String, String> headers, String overAskId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .accept(ContentType.JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/retailers/overask/{overAskId}", overAskId);
    }

    public static Object acceptsToPlayTheNegotiatedBetSlip(Map<String, String> headers, String overAskId, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(body)
                .accept(ContentType.JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wagers/retailers/overask/{overAskId}", overAskId);
    }
}
