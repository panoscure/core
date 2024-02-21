package com.intralot.qa.automation.core.utilities;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.Response;
import com.intralot.qa.automation.core.lottery.game.scheduler.LotteryDrawOperations;
import com.intralot.qa.automation.core.lottery.game.scheduler.models.lottery.draw.operations.retrieve.active.draw.requested.game.code.RetrieveActiveDrawForRequestedGameCodeModel;
import com.intralot.qa.automation.core.lottery.game.scheduler.models.lottery.draw.operations.retrieve.active.draw.requested.game.code.RetrieveSpecificDrawForRequestedGameCodeModel;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static com.intralot.qa.automation.core.lottery.apigatewayj.AccountingTerminalReports.summaryReportByDate;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static java.net.HttpURLConnection.HTTP_OK;
import static org.awaitility.Awaitility.await;
import static org.hamcrest.CoreMatchers.describedAs;
import static org.hamcrest.CoreMatchers.is;
import com.intralot.qa.automation.core.lottery.game.scheduler.models.lottery.draw.operations.retrieve.active.draw.requested.game.code.RetrieveActiveDrawForRequestedGameCodeModel;
public class CustomMethods {

    public static void setWinningNumbersForPendingDraws(Integer gameId, String winningNumbers) {
        List<Integer> openDraws = new ArrayList<>();
        Integer drawId = ((Response) LotteryDrawOperations.retrieveActiveDrawForRequestedGameCode(gameId))
                .as(RetrieveActiveDrawForRequestedGameCodeModel.class).getDrawId() - 1;
        while (drawId != 0 && ((Response) LotteryDrawOperations.retrieveSpecificDrawForRequestedGameCode(gameId, drawId)).as(RetrieveActiveDrawForRequestedGameCodeModel.class).getStatus() == 4) {
            openDraws.add(drawId);
            drawId = drawId - 1;
        }
        for (int i = openDraws.size() - 1; i >= 0; i--) {
            LotteryDrawOperations.registerWinningNumbers(gameId, openDraws.get(i), winningNumbers);
            shouldDrawReachWinnersDividendsCalculatedStatus(gameId, openDraws.get(i));
        }
    }

    public static void setWinningNumbersForPendingDrawsWithReleasePayments(Integer gameId, String winningNumbers) {
        List<Integer> openDraws = new ArrayList<>();
        Integer drawId = ((Response) LotteryDrawOperations.retrieveActiveDrawForRequestedGameCode(gameId))
                .as(RetrieveActiveDrawForRequestedGameCodeModel.class).getDrawId() - 1;
        while (drawId != 0 && ((Response) LotteryDrawOperations.retrieveSpecificDrawForRequestedGameCode(gameId, drawId)).as(RetrieveActiveDrawForRequestedGameCodeModel.class).getStatus() == 4) {
            openDraws.add(drawId);
            drawId = drawId - 1;
        }
        for (int i = openDraws.size() - 1; i >= 0; i--) {
            LotteryDrawOperations.registerWinningNumbers(gameId, openDraws.get(i), winningNumbers);
            shouldDrawReachPaymentsSuspendedStatus(gameId, openDraws.get(i));
            releasePayments(gameId, openDraws.get(i));
            shouldDrawReachWinnersDividendsCalculatedStatus(gameId, openDraws.get(i));
        }
    }

    public static void shouldActiveDrawReachDistributedCalculatedStatus(Integer gameId, Integer drawId) {
        try {
            System.out.println("Waiting to reach status 4 (DistributedCalculated)...");
            await().pollInterval(Duration.ofMillis(500)).atMost(2, TimeUnit.MINUTES).until(() ->
                    given()
                            .accept(JSON)
                            .relaxedHTTPSValidation()
                            .get(System.getProperty("gamescheduler") + "/game-scheduler/api/v1.0/lottery/draws/{gameId}/{drawId}", gameId, drawId)
                            .as(RetrieveSpecificDrawForRequestedGameCodeModel.class)
                            .getStatus() == 4);
        } catch (org.awaitility.core.ConditionTimeoutException exception) {
            throw new CustomError("Failed to reach status 4");
        }

    }

    public static void shouldDrawReachPaymentsSuspendedStatus(Integer gameId, Integer drawId) {
        try {
            System.out.println("Waiting to reach status 16 (Payments Suspended)...");
            await().pollInterval(Duration.ofMillis(500)).atMost(2, TimeUnit.MINUTES).until(() ->
                    given()
                            .accept(JSON)
                            .get(System.getProperty("gamescheduler") + "/game-scheduler/api/v1.0/lottery/draws/{gameId}/{drawId}", gameId, drawId)
                            .as(RetrieveSpecificDrawForRequestedGameCodeModel.class)
                            .getStatus() == 16);
        } catch (org.awaitility.core.ConditionTimeoutException exception) {
            throw new CustomError("Failed to reach status 16");
        }
    }

    public static void shouldDrawReachWinnersDividendsCalculatedStatus(Integer gameId, Integer drawId) {
        try {
            System.out.println("Waiting to reach status 6 (WinnersDividendsCalculated)...");
            await().pollInterval(Duration.ofMillis(500)).atMost(2, TimeUnit.MINUTES).until(() ->
                    given()
                            .accept(JSON)
                            .relaxedHTTPSValidation()
                            .get(System.getProperty("gamescheduler") + "/game-scheduler/api/v1.0/lottery/draws/{gameId}/{drawId}", gameId, drawId)
                            .as(RetrieveSpecificDrawForRequestedGameCodeModel.class)
                            .getStatus() == 6);
        } catch (org.awaitility.core.ConditionTimeoutException exception) {
            throw new CustomError("Failed to reach status 6");
        }
    }

    public static void drawShouldReachFromStatus2toStatus6(Integer gameId, Long drawTimeInMillis, String winningNumbers) {
        setWinningNumbersForPendingDraws(gameId, winningNumbers);
        Integer activeDrawId = ((Response) LotteryDrawOperations.retrieveActiveDrawForRequestedGameCode(gameId))
                .as(RetrieveActiveDrawForRequestedGameCodeModel.class).getDrawId();
        LotteryDrawOperations.updateExistingDraw(gameId, activeDrawId, drawTimeInMillis);
        shouldActiveDrawReachDistributedCalculatedStatus(gameId, activeDrawId);
        LotteryDrawOperations.registerWinningNumbers(gameId, activeDrawId, winningNumbers);
        shouldDrawReachWinnersDividendsCalculatedStatus(gameId, activeDrawId);
    }

    public static void drawShouldReachFromStatus2toStatus6throughReleasePayments(Integer gameId, Long drawTimeInMillis, String winningNumbers) {
        setWinningNumbersForPendingDrawsWithReleasePayments(gameId, winningNumbers);
        Integer activeDrawId = ((Response) LotteryDrawOperations.retrieveActiveDrawForRequestedGameCode(gameId))
                .as(RetrieveActiveDrawForRequestedGameCodeModel.class).getDrawId();
        LotteryDrawOperations.updateExistingDraw(gameId, activeDrawId, drawTimeInMillis);
        shouldActiveDrawReachDistributedCalculatedStatus(gameId, activeDrawId);
        LotteryDrawOperations.registerWinningNumbers(gameId, activeDrawId, winningNumbers);
        shouldDrawReachPaymentsSuspendedStatus(gameId, activeDrawId);
        releasePayments(gameId, activeDrawId);
        shouldDrawReachWinnersDividendsCalculatedStatus(gameId, activeDrawId);
    }

    public static void drawShouldReachFromStatus2toStatus16(Integer gameId, Long drawTimeInMillis, String winningNumbers) {
        setWinningNumbersForPendingDrawsWithReleasePayments(gameId, winningNumbers);
        Integer activeDrawId = ((Response) LotteryDrawOperations.retrieveActiveDrawForRequestedGameCode(gameId))
                .as(RetrieveActiveDrawForRequestedGameCodeModel.class).getDrawId();
        LotteryDrawOperations.updateExistingDraw(gameId, activeDrawId, drawTimeInMillis);
        shouldActiveDrawReachDistributedCalculatedStatus(gameId, activeDrawId);
        LotteryDrawOperations.registerWinningNumbers(gameId, activeDrawId, winningNumbers);
        shouldDrawReachPaymentsSuspendedStatus(gameId, activeDrawId);
    }

    public static String playWagerAndExtractSerialNumber(Map<String, String> headers, String playBody) {
        headers.put("Guid", UUID.randomUUID().toString());
        List<String> serialNumbers =
                given()
                        .headers(headers)
                        .body(playBody)
                        .when()
                        .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                        .post(System.getProperty("apigatewayj") + "/api/v1.0/wagers")
                        .then()
                        .statusCode(describedAs("---------- PLAY WAGER should return 200!", is(HTTP_OK)))
                        .extract()
                        .path("serialNumbers");
        return serialNumbers.get(0);
    }

    public static void cancelWager(Map<String, String> headers, String serialNumber) {
        headers.put("Guid", UUID.randomUUID().toString());
        given()
                .headers(headers)
                .body("{\n" +
                        "\"metadata\": {\n" +
                        "   \"trnsTime\": \"17:10:00\"\n" +
                        " },\n" +
                        " \"status\": \"Canceled\"\n" +
                        " }")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("apigatewayj") + "/api/v1.0/wagers/" + serialNumber + "/status").then().log().all().statusCode(200);
    }

    public static Object salesSummaryReportByDate(Map<String, String> headers, Map<String, String> queryParams) {
        queryParams.put("total", "sales");
        return summaryReportByDate(headers, queryParams);
    }

    public static Object validationsSummaryReportByDate(Map<String, String> headers, Map<String, String> queryParams) {
        queryParams.put("total", "validations");
        return summaryReportByDate(headers, queryParams);
    }

    public static Object cancellationsSummaryReportByDate(Map<String, String> headers, Map<String, String> queryParams) {
        queryParams.put("total", "cancellations");
        return summaryReportByDate(headers, queryParams);
    }

    public static Object releasePayments(Integer gameId, Integer drawId) {
        return given()
                .accept(JSON)
                .contentType(JSON)
                .body("{\"status\":6}")
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("gamescheduler") + "/game-scheduler/api/v1.0/lottery/draws/{gameId}/{drawId}", gameId, drawId);
    }

    public static Object retrieveTheWinningsForTheWagerWithLevel(Map<String, String> headers, String serialNumber, String level) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParam("level", level)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/wagers/{serialNumber}/winnings", serialNumber);
    }

    public static Object winningsForTheWagerProvidedInPayloadWithLevel(Map<String, String> headers, String checkNumbersBody, String level) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParam("level", level)
                .body(checkNumbersBody)
                .when()
                .filter(new RequestLoggingFilter())
                .filter(new ResponseLoggingFilter())
                .post(System.getProperty("apigatewayj") + "/api/v1.0/wagers/check-numbers");
    }

    public static Object summaryReportByDateMultiMap(Map<String, String> headers, Map<String, String> queryParams) {

        Multimap<String, String> queryParamsMulti = ArrayListMultimap.create();
        queryParamsMulti.put("total", "totals");
        queryParamsMulti.put("total", "commissions");
        queryParamsMulti.put("total", "adjustments");
        queryParamsMulti.put("total", "balance");
        queryParamsMulti.put("total", "sale-promotions");
        queryParamsMulti.put("total", "cancel-promotions");
        queryParamsMulti.put("total", "validation-promotions");
        queryParamsMulti.put("total", "card-coupons-trns");
        queryParamsMulti.put("total", "other-cms-sales");
        queryParamsMulti.put("total", "info-numerics");
        queryParamsMulti.put("total", "sales");
        queryParamsMulti.put("total", "sale-commissions");
        queryParamsMulti.put("total", "cancel-commissions");
        queryParamsMulti.put("total", "cancellations");
        queryParamsMulti.put("total", "validations");

        Collection<String> paramsMulti = queryParamsMulti.get("total");

        return given()
                .headers(headers)
                .queryParams("total", ((List<String>) paramsMulti).get(0))
                .queryParams("total", ((List<String>) paramsMulti).get(1))
                .queryParams("total", ((List<String>) paramsMulti).get(2))
                .queryParams("total", ((List<String>) paramsMulti).get(3))
                .queryParams("total", ((List<String>) paramsMulti).get(4))
                .queryParams("total", ((List<String>) paramsMulti).get(5))
                .queryParams("total", ((List<String>) paramsMulti).get(6))
                .queryParams("total", ((List<String>) paramsMulti).get(7))
                .queryParams("total", ((List<String>) paramsMulti).get(8))
                .queryParams("total", ((List<String>) paramsMulti).get(9))
                .queryParams("total", ((List<String>) paramsMulti).get(10))
                .queryParams("total", ((List<String>) paramsMulti).get(11))
                .queryParams("total", ((List<String>) paramsMulti).get(12))
                .queryParams("total", ((List<String>) paramsMulti).get(13))
                .queryParams("total", ((List<String>) paramsMulti).get(14))
                .queryParams(queryParams)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/terminal-reports/date-range-summary")
                .then()
                .statusCode(HTTP_OK)
                .extract().response();
    }

}
