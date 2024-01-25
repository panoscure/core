package com.intralot.qa.automation.core.sports.book.apigatewayj;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class SportsBook {

    public static Object getAParticipantForASportById(Map<String, String> queryParams, Map<String, String> headers, String sportId, String participantId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/participants/{sportId}/{participantId}", sportId, participantId);
    }

    public static Object getAListOfPopularEventSelections(Map<String, String> queryParams, Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/available/selections/popular");
    }

    public static Object getAllAvailableInplayEvents(Map<String, String> queryParams, Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/available/inplay");
    }

    public static Object getAListOfEventsThatMatchTheSearchTerm(Map<String, String> queryParams, Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/search");
    }

    public static Object getAnEventByCode(Map<String, String> queryParams, Map<String, String> headers, String code) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/code/{code}", code);
    }

    public static Object getAPageOfResultedEventsOfASport(Map<String, String> queryParams, Map<String, String> headers, String sportId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/resulted/{sportId}", sportId);
    }

    public static Object getAnEventById(Map<String, String> queryParams, Map<String, String> headers, String eventId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/{eventId}", eventId);
    }

    public static Object getAnEventByIdNoLogs(Map<String, String> queryParams, Map<String, String> headers, String eventId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/{eventId}", eventId)
                .then()
                .log().ifValidationFails()
                .extract().response();
    }

    public static Object getAListOfParticipantsForASport(Map<String, String> queryParams, Map<String, String> headers, String sportId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/participants/{sportId}", sportId);
    }

    public static Object getATreeOfAllCategories(Map<String, String> queryParams, Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/categories/all");
    }

    public static Object getHistoryOfEvents(Map<String, String> headers, int eventId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/{eventId}/resulted/history", eventId);
    }

    public static Object getAListOfFootballEvents(Map<String, String> queryParams, Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/football");
    }

    public static Object getSportsbookConfiguration(Map<String, String> queryParams, Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/configuration");
    }

    public static Object getATreeOfCategoriesThatHaveAvailableEvents(Map<String, String> queryParams, Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/categories/available");
    }

    public static Object getAListOfEventsBySport(Map<String, String> queryParams, Map<String, String> headers, String sportId, String from, String to) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/{sportId}/{from}/{to}", sportId, from, to);
    }

    public static Object getAListOfAllParticipants(Map<String, String> queryParams, Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/participants");
    }

    public static Object getAllAvailableEvents(Map<String, String> queryParams, Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/available");
    }

    public static Object getAllAvailableEventsLogIfValidationFail(Map<String, String> queryParams, Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/available")
                .then().log().ifValidationFails().extract().response();
    }

    public static Object getAListOfAvailableHighlightedPrematchEvents(Map<String, String> queryParams, Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/available/prematch/highlights");
    }

    public static Object getAListOfEventIdsByParticipantId(Map<String, String> queryParams, Map<String, String> headers, String participantId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/participants/{participantId}", participantId);
    }

    public static Object getAnEventByIdWithAllDefinedMarkets(Map<String, String> queryParams, Map<String, String> headers, String id) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/{id}/allDefinedMarkets", id);
    }

    public static Object getTheVersionOfEachAvailableEvents(Map<String, String> queryParams, Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/available/version");
    }

    public static Object getHistoryOfEvents(Map<String, String> queryParams, Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/resulted/history");
    }

    public static Object getAListOfResultedEventsByIds(Map<String, String> queryParams, Map<String, String> headers, String sportId) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .queryParams(queryParams)
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/events/resulted/{sportId}/ids", sportId);
    }

    public static Object getAListOfBettingChampions(Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/champions");
    }

    public static Object getATreeOfCategoriesThatHaveResultedEvents(Map<String, String> queryParams, Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .formParams(queryParams)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/categories/resulted");
    }

    public static Object getAvailableEventIdsByCardIds(Map<String, String> queryParams, Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParams(queryParams)
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/parlay/events/available");
    }

    public static Object getParlayCardConfiguration(Map<String, String> headers) {
        headers.put("Guid", UUID.randomUUID().toString());
        return given()
                .headers(headers)
                .queryParam("locale", System.getProperty("locale"))
                .accept("application/json")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("apigatewayj") + "/api/v1.0/sportsbook/wagers/parlay/configuration");
    }
}
