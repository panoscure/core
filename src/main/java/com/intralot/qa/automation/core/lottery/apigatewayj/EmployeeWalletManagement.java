package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;

public class EmployeeWalletManagement {

    public static Object getEmployeeInventory(Map<String, String> headers, String username) {
        return given()
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/terminal-employees/{retailerId}/{username}/inventory", headers.get("RetailerId"), username)
                .then()
                .statusCode(HTTP_OK)
                .extract().response();

    }
}
