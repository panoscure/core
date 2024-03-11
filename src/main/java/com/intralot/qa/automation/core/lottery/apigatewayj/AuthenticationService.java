package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;

public class AuthenticationService {

    public static Object playerSignOn(Map<String, String> headers,String username,String password) {
        return given()
                .headers(headers)
                .body("{\n" +
                        "  \"username\": \""+username+"\",\n" +
                        "  \"password\": \""+password+"\"\n" +
                        "}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/authentication");
    }

    public static String playerSignOnExtractSessionToken(Map<String, String> headers,String username,String password) {
        return given()
                .headers(headers)
                .body("{\n" +
                        "  \"username\": \""+username+"\",\n" +
                        "  \"password\": \""+password+"\"\n" +
                        "}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/authentication")
                .then()
                .statusCode(HTTP_OK)
                .extract().path("sessionToken");
    }

    public static Object playerSignOff(Map<String, String> headers,String sessionToken) {
        headers.put("sessionToken",sessionToken);
        return given()
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/authentication");
    }


    public static String playerSignonExtractSessionToken(Map<String, String> headers, Object body) {
        return given()
                .headers(headers)
                .when()
                .body(body)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/token")
                .then()
                .statusCode(HTTP_OK)
                .extract().path("sessionToken");
    }

}
