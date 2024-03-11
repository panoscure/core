package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.lottery.apigatewayj.requests.pam.sessions.login.player.by.username.LoginPlayerByUsernameRequest;
import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class PAMSessions {

    public static Object loginPlayerToPAM(Map<String, String> headers, LoginPlayerByUsernameRequest loginPlayerByUsernameRequest) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(loginPlayerByUsernameRequest)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/sessions");
    }

    public static Object logout(Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/sessions");
    }


}
