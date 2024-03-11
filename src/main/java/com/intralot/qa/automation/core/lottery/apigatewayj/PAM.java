package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class PAM {

    public static Object getPlayerLimits(Map<String, String> headers, Integer playerId) {
        return given()
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/players/{id}/limits",playerId);
    }

    public static Object updatePlayerLimits(Map<String, String> headers, Integer playerId, String body) {
        return given()
                .headers(headers)
                .body(body)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/players/{id}/limits",playerId);
    }

    public static Object getStates(Map<String, String> headers) {
        return given()
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/config/states");
    }

    public static Object getCities(Map<String, String> headers) {
        return given()
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/config/cities");
    }

    public static Object PAMCreateFavoritePlayslip(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/my-favorite-playslips");
    }

}
