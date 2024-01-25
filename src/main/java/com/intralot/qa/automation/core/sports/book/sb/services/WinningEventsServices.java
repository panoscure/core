package com.intralot.qa.automation.core.sports.book.sb.services;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class WinningEventsServices {

    public static Object createANewWinningEvent(String body) {
        return given()
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("sb.services") + "/api/create/winning-event");
    }

    public static Object updateAWinningEventById(String body, Integer id) {
        return given()
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("sb.services") + "/api/update/winning-event/{id}", id);
    }

    public static Object getAllWinningEvents() {
        return given()
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("sb.services") + "/api/winning-events");
    }


    public static Object getListOfWinningEventsByTcKeyAndEnvironment(String tcKey, String env) {
        return given()
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("sb.services") + "/api/winning-events/{tcKey}/{env}", tcKey, env);
    }

    public static Object getListOfWinningEventsByEnvironment(String env) {
        return given()
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("sb.services") + "/api/winning-events/env/{env}", env);
    }

    public static Object getAWinningEventById(Integer id) {
        return given()
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("sb.services") + "/api/winning-event/{id}", id);
    }

    public static String deleteWinningEventsByEnv(String env) {
        return given()
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("sb.services") + "/api/winning-event/delete/{env}",env).body().toString();
    }

    public static String truncateTableWinningEvents() {
        return given()
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("sb.services") + "/api/winning-event/delete").body().toString();
    }
}
