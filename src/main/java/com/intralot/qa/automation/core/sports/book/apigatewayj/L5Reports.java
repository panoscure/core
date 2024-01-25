package com.intralot.qa.automation.core.sports.book.apigatewayj;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.http.ContentType.HTML;

public class L5Reports {

    public static Object retrievesFinancialRelatedReports(Map<String, String> headers, Map<String, String> queries) {

        return RestAssured.given()
                .headers(headers)
                .queryParams(queries)
                .accept(HTML)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1/reports/financials");
    }
}
