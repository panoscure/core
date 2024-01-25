package com.intralot.qa.automation.core.lottery.apigatewayj;

import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class DrawOperationsV3_0 {

    public static Object getActiveDraws(Map<String, String> headers, Map<String, String> queryParams) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/active");
    }

    public static Object getDrawForAGameByVisualDrawNumber(Map<String, String> headers, Map<String, String> queryParams,
                                                           String gameId, String visualDraw) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/visual-draw/{visualDraw}", gameId, visualDraw);
    }

    public static Object getDrawsForAGameByDrawIdRange(Map<String, String> headers, Map<String, String> queryParams,
                                                       String gameId, String fromDrawId, String toDrawId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/draw-id/{fromDrawId}/{toDrawId}", gameId, fromDrawId, toDrawId);
    }

    public static Object getDraw(Map<String, String> headers, Map<String, String> queryParams,
                                 String gameId, String drawId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/{drawId}/", gameId, drawId);
    }

    public static Object getTheActiveDrawForAGame(Map<String, String> headers, Map<String, String> queryParams,
                                                  String gameId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/active", gameId);
    }

    public static Object getTheLastDrawWithResultsOrPendingResultsAndTheActiveDrawForAGame(Map<String, String> headers, Map<String, String> queryParams,
                                                                                           String gameId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/last-result-and-active", gameId);
    }

    public static Object getLastDrawsForAGame(Map<String, String> headers, Map<String, String> queryParams,
                                              String gameId, String limit) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/last/{limit}", gameId, limit);
    }

    public static Object getUpcomingDrawsForAGame(Map<String, String> headers, Map<String, String> queryParams,
                                                  String gameId, String limit) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/upcoming/{limit}", gameId, limit);
    }

    public static Object getDrawIdsForAGameByDateRange(Map<String, String> headers, Map<String, String> queryParams,
                                                       String gameId, String fromDate, String toDate) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/draw-date/{fromDate}/{toDate}/draw-id", gameId, fromDate, toDate);
    }


    public static Object getDrawsForAGameByDateRange(Map<String, String> headers, Map<String, String> queryParams,
                                                     String gameId, String fromDate, String toDate) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/" + gameId + "/draw-date/" + fromDate + "/" + toDate);
    }

    /**********MULTIMAP PARAMETERS*************/

    public static Object getActiveDrawsMultimap(Map<String, String> headers, Multimap<String, String> queryParamsMulti, Map<String, String> queryParams) {
        Collection<String> paramsMulti = queryParamsMulti.get("property");

        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams("property", ((List<String>) paramsMulti).get(0))
                .queryParams("property", ((List<String>) paramsMulti).get(1))
                .queryParams("property", ((List<String>) paramsMulti).get(2))
                .queryParams("property", ((List<String>) paramsMulti).get(3))
                .queryParams("property", ((List<String>) paramsMulti).get(4))
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/active");
    }


    public static Object getDrawsForAGameByDateRangeMultimapMap(Map<String, String> headers, Multimap<String, String> queryParamsMulti, Map<String, String> queryParams,
                                                                int gameId, String fromDate, String toDate) {
        Collection<String> paramsMulti = queryParamsMulti.get("property");

        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams("property", ((List<String>) paramsMulti).get(0))
                .queryParams("property", ((List<String>) paramsMulti).get(1))
                .queryParams("property", ((List<String>) paramsMulti).get(2))
                .queryParams("property", ((List<String>) paramsMulti).get(3))
                .queryParams("property", ((List<String>) paramsMulti).get(4))
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/draw-date/{fromDate}/{toDate}", gameId, fromDate, toDate);
    }


    public static Object getDrawsForAGameByDrawIdRangeMultimapMap(Map<String, String> headers, Multimap<String, String> queryParamsMulti, Map<String, String> queryParams,
                                                                  int gameId, int fromId, int toId) {
        Collection<String> paramsMulti = queryParamsMulti.get("property");

        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams("property", ((List<String>) paramsMulti).get(0))
                .queryParams("property", ((List<String>) paramsMulti).get(1))
                .queryParams("property", ((List<String>) paramsMulti).get(2))
                .queryParams("property", ((List<String>) paramsMulti).get(3))
                .queryParams("property", ((List<String>) paramsMulti).get(4))
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/draw-id/{fromDrawId}/{toDrawId}", gameId, fromId, toId);
    }

    public static Object getTheActiveDrawForAGameMultimap(Map<String, String> headers, Multimap<String, String> queryParamsMulti, Map<String, String> queryParams,
                                                          String gameId) {
        Collection<String> paramsMulti = queryParamsMulti.get("property");
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams("property", ((List<String>) paramsMulti).get(0))
                .queryParams("property", ((List<String>) paramsMulti).get(1))
                .queryParams("property", ((List<String>) paramsMulti).get(2))
                .queryParams("property", ((List<String>) paramsMulti).get(3))
                .queryParams("property", ((List<String>) paramsMulti).get(4))
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/active", gameId);
    }

    public static Object getDrawForAGameByVisualDrawNumberMultimap(Map<String, String> headers, Multimap<String, String> queryParamsMulti, Map<String, String> queryParams,
                                                                   String gameId, String visualDraw) {
        Collection<String> paramsMulti = queryParamsMulti.get("property");
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .queryParams("property", ((List<String>) paramsMulti).get(0))
                .queryParams("property", ((List<String>) paramsMulti).get(1))
                .queryParams("property", ((List<String>) paramsMulti).get(2))
                .queryParams("property", ((List<String>) paramsMulti).get(3))
                .queryParams("property", ((List<String>) paramsMulti).get(4))
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/visual-draw/{visualDraw}", gameId, visualDraw);
    }

    public static Object getDrawMultimap(Map<String, String> headers, Multimap<String, String> queryParamsMulti, Map<String, String> queryParams,
                                         String gameId, String drawId) {
        Collection<String> paramsMulti = queryParamsMulti.get("property");
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams("property", ((List<String>) paramsMulti).get(0))
                .queryParams("property", ((List<String>) paramsMulti).get(1))
                .queryParams("property", ((List<String>) paramsMulti).get(2))
                .queryParams("property", ((List<String>) paramsMulti).get(3))
                .queryParams("property", ((List<String>) paramsMulti).get(4))
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/{drawId}", gameId, drawId);
    }

    public static Object getTheLastDrawWithResultsOrPendingResultsAndTheActiveDrawForAGameMultimap(Map<String, String> headers, Multimap<String, String> queryParamsMulti, Map<String, String> queryParams,
                                                                                                   String gameId) {
        Collection<String> paramsMulti = queryParamsMulti.get("property");
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams("property", ((List<String>) paramsMulti).get(0))
                .queryParams("property", ((List<String>) paramsMulti).get(1))
                .queryParams("property", ((List<String>) paramsMulti).get(2))
                .queryParams("property", ((List<String>) paramsMulti).get(3))
                .queryParams("property", ((List<String>) paramsMulti).get(4))
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/" + gameId + "/last-result-and-active");
    }

    public static Object getLastDrawsForAGameMultimap(Map<String, String> headers, Multimap<String, String> queryParamsMulti, Map<String, String> queryParams,
                                                      String gameId, String limit) {
        Collection<String> paramsMulti = queryParamsMulti.get("property");
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams("property", ((List<String>) paramsMulti).get(0))
                .queryParams("property", ((List<String>) paramsMulti).get(1))
                .queryParams("property", ((List<String>) paramsMulti).get(2))
                .queryParams("property", ((List<String>) paramsMulti).get(3))
                .queryParams("property", ((List<String>) paramsMulti).get(4))
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/last/{limit}", gameId, limit);
    }

    public static Object getUpcomingDrawsForAGameMultimap(Map<String, String> headers, Multimap<String, String> queryParamsMulti, Map<String, String> queryParams,
                                                          String gameId, String limit) {
        Collection<String> paramsMulti = queryParamsMulti.get("property");
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams("property", ((List<String>) paramsMulti).get(0))
                .queryParams("property", ((List<String>) paramsMulti).get(1))
                .queryParams("property", ((List<String>) paramsMulti).get(2))
                .queryParams("property", ((List<String>) paramsMulti).get(3))
                .queryParams("property", ((List<String>) paramsMulti).get(4))
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/upcoming/{limit}", gameId, limit);
    }
    /**********MULTIMAP PARAMETERS*************/

    /*********NoGUIDCalls**********************/

    public static Object getActiveDrawsNoGuid(Map<String, String> headers, Map<String, String> queryParams) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/active");
    }

    public static Object getDrawsForAGameByDateRangeNoGuid(Map<String, String> headers, Map<String, String> queryParams,
                                                           int gameId, String fromDate, String toDate) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/draw-date/{fromDate}/{toDate}", gameId, fromDate, toDate);
    }

    public static Object getFromToDateDrawIdsNoGuid(Map<String, String> headers, Map<String, String> queryParams,
                                                    int gameId, String fromDate, String toDate) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/" + gameId + "/draw-date/" + fromDate + "/" + toDate + "/draw-id");
    }


    public static Object getDrawsForAGameByDrawIdRangeNoGuid(Map<String, String> headers, Map<String, String> queryParams,
                                                             int gameId, int fromId, int toId) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/draw-id/{fromDrawId}/{toDrawId}", gameId, fromId, toId);
    }

    public static Object getTheActiveDrawForAGameNoGuid(Map<String, String> headers, Map<String, String> queryParams,
                                                        String gameId) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/active", gameId);
    }

    public static Object getDrawForAGameByVisualDrawNumberNoGuid(Map<String, String> headers, Map<String, String> queryParams,
                                                                 String gameId, String visualDraw) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/visual-draw/{visualDraw}", gameId, visualDraw);
    }

    public static Object getDrawNoGuid(Map<String, String> headers, Map<String, String> queryParams,
                                       String gameId, String drawId) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/{drawId}", gameId, drawId);
    }

    public static Object getTheLastDrawWithResultsOrPendingResultsAndTheActiveDrawForAGameMultimapNoGuid(Map<String, String> headers, Map<String, String> queryParams,
                                                                                                         String gameId) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/last-result-and-active", gameId);
    }

    public static Object getLastDrawsForAGameNoGuid(Map<String, String> headers, Map<String, String> queryParams,
                                                    String gameId, String limit) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/last/{limit}", gameId, limit);
    }

    public static Object getUpcomingDrawsForAGameNoGuid(Map<String, String> headers, Map<String, String> queryParams,
                                                        String gameId, String limit) {
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .when()
                .get(System.getProperty("apigatewayj") + "/api/v3.0/draws/{gameId}/upcoming/{limit}", gameId, limit);
    }

    /*********NoGUIDCalls**********************/
}
