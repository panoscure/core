package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class MyProfileService {

    public static Object changeMyPassword(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/my-profile/password");
    }

    public static Object getMyWallet(Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/my-wallet");
    }

    public static Object getMyProfile(Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/my-profile");
    }

    public static Object getMyFavoritePlayslips(Map<String, String> headers, Map<String, String> query) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(query)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/my-favorite-playslips");
    }

    public static Object deleteMyFavorite(Map<String, String> headers, Integer id) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/my-favorite-playslips/{id}", id);
    }

    public static Object updateMyProfile(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/my-profile");
    }

    public static Object getMyLimits(Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/my-limits");
    }

    public static Object updateMyLimits(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .body(body)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/my-limits");
    }
}
