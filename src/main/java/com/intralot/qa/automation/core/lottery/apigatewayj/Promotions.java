package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class Promotions {

    public static Object redeemAVoucherGiftPromotionBySerialnumber(Map<String, String> headers, String promotionId) {
        return given()
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/promotions/serialNumber/{promotionId}/redeem", promotionId);
    }

    public static Object redeemAVoucherGiftPromotionBySerialNumberV1_1(Map<String, String> headers, String promotionId) {
        return given()
                .headers(headers)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.1/promotions/serialNumber/{promotionId}/redeem", promotionId);
    }

    public static Object claimAHighWinningRealMoneyPromotionBySerialNumber(Map<String, String> headers, String playBody) {
        return given()
                .headers(headers)
                .body(playBody)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.0/promotions/claim");
    }

    public static Object retrieveAVoucherGiftPromotionBySerialNumber(Map<String, String> headers, Map<String, String> queryParams, String promotionId) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.1/promotions/serialNumber/{promotionId}", promotionId);
    }

    public static Object retrieveOutcomesByWagerSerialNumber(Map<String, String> headers, Map<String, String> queryParams, String wagerSerialNumber) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(CustomProperties.getPropertyValue("apigatewayj") + "/api/v1.1/promotions/wager/{wagerSerialNumber}/outcomes", wagerSerialNumber);
    }
}
