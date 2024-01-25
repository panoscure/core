package com.intralot.qa.automation.core.sports.book.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class PAMWallets {

    public static Object cancelAWithdrawalBasedOnPaymentKeyWithSessionKey(Map<String, String> headers, String paymentKey, String reason) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParam("reason", reason)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("apigatewayj") + "/api/v1.0/wallets/account/withdrawals/{paymentKey}", paymentKey);
    }

    public static Object getDepositMethods(Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wallets/deposit/methods");
    }

    public static Object getPlayersWallet(Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wallets/balance");
    }

    public static Object withdraw(Map<String, String> headers, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wallets/withdrawal");
    }

    public static Object returnVouchersApplicableToThePlayer(Map<String, String> headers, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wallets/vouchers");
    }

    public static Object listAllPlayerBonusesDetails(Map<String, String> headers, String bonusAwardedId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wallets/bonus/forfeit/{bonusAwardedId}", bonusAwardedId);
    }

    public static Object changeTheStatusOfAPendingWithdrawalBasedOnWithdrawalRequestIdWithoutSessionKey(Map<String, String> headers, int withdrawalRequestId, String paymentKey) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParam("paymentKey", paymentKey)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1.0/wallets/withdrawals/{withdrawalRequestId}", withdrawalRequestId);
    }

    public static Object getVoucher(Map<String, String> headers, String voucherCode) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wallets/vouchers/{voucherCode}", voucherCode);
    }

    public static Object redeemVoucherBasedOnTheVoucherCode(Map<String, String> headers, Map<String, String> queryParams, String voucherCode) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1.0/wallets/vouchers/{voucherCode}", voucherCode);
    }

    public static Object setPlayerBalanceAccountAsDefaultWithdrawal(Map<String, String> headers, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wallets/setDefaultWithdrawalAccount");
    }

    public static Object getAccountTransactions(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .body(body)
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wallets/transactions");
    }

    public static Object deposit(Map<String, String> headers, Map<String, String> queryParams, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .body(body)
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wallets/deposit");
    }

    public static Object getPaymentTransactionDetailsWithoutSessionKey(Map<String, String> headers, String paymentKey) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wallets/transactions/payments/{paymentKey}", paymentKey);
    }

    public static Object listAllAvailableBonusesComingFromAVoucher(Map<String, String> headers, String voucherCode) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wallets/vouchers/{voucherCode}/bonuses", voucherCode);
    }

    public static Object getWithdrawOptions(Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wallets/withdraw/options");
    }

    public static Object getPaymentTransactionDetails(Map<String, String> headers, String paymentKey) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wallets/account/transactions/payment/{paymentKey}", paymentKey);
    }

    public static Object listActiveBonusesOfPlayer(Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wallets/bonus/list/active");
    }

    public static Object cancelsAWithdrawalBasedOnPaymentKeyWithoutSessionKey(Map<String, String> headers, Map<String, String> queryParams, String paymentKey) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("apigatewayj") + "/api/v1.0/wallets/withdrawals/{paymentKey}", paymentKey);
    }

    public static Object listAllPlayerBonusesDetails(Map<String, String> headers, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wallets/bonus/list/all");
    }

    public static Object returnsThePlayerRedeemedPrizeFromOwnLoyaltyPoints(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .body(body)
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wallets/loyalty/redeem");
    }

    public static Object deleteThePaymentAccountForGivenId(Map<String, String> headers, String body, String id) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .body(body)
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("apigatewayj") + "/api/v1.0/wallets/payment/accounts/{id}", id);
    }

    public static Object getThePlayersPaymentAccounts(Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wallets/payment/accounts");
    }

    public static Object updatePaymentAccountOfPlayer(Map<String, String> headers, String body) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .body(body)
                .headers(headers)
                .contentType("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wallets/payment/accounts");
    }
}
