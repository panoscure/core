package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;

public class AccountingTerminalReports {

    public static Object summaryReportByRetailerLimits(Map<String, String> headers) {
        return given()
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/terminal-reports/retailer-limits")
                .then()
                .statusCode(HTTP_OK)
                .extract().response();
    }

    public static Object summaryReportByDate(Map<String, String> headers, Map<String, String> queryParams) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/terminal-reports/date-range-summary")
                .then()
                .statusCode(HTTP_OK)
                .extract().response();
    }
}
