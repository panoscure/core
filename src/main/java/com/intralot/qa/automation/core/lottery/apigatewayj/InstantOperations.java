package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class InstantOperations {

    public static Object findInstantWinnings(Map<String, String> headers, Object body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/instants/winnings");
    }

    public static Object payInstants(Map<String, String> headers, Object body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/instants/validation");
    }

    public static Object sellInstantByRange(Map<String, String> headers, String firstInstantBarcode , String lastInstantBarcode ) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(CustomProperties.getPropertyValue("apigatewayj")  + "/api/v1.0/instants/{firstInstantBarcode}/{lastInstantBarcode}", firstInstantBarcode, lastInstantBarcode);
    }

    public static Object sellInstant(Map<String, String> headers, String barcode, String username) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body("{\"username\": \""+username+"\"}")
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(CustomProperties.getPropertyValue("apigatewayj")  + "/api/v1.0/instants/{barcode}", barcode);
    }

    public static Object cancelInstantSale(Map<String, String> headers, String barcode, String username) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body("{\"username\": \""+username+"\"}")
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(CustomProperties.getPropertyValue("apigatewayj")  + "/api/v1.0/instants/{barcode}/status", barcode);
    }

}
