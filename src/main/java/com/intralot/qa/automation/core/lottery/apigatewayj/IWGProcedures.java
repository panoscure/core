package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.lottery.apigatewayj.requests.iwg.procedures.iwg.rgs.IwgRgsRequest;
import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class IWGProcedures {

    public static Object iwgRgs(Map<String, String> headers, IwgRgsRequest iwgRgsRequest) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(iwgRgsRequest)
                .contentType("application/json")
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/iwg");
    }

}
