package com.intralot.qa.automation.core.sports.book.sb.services;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class EventsServices {

    public static Object createANewEvent(String body) {
        return given()
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("sb.services") + "/api/create/event");
    }

    public static Object updateAnEventById(String body, Integer id) {
        return given()
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(System.getProperty("sb.services") + "/api/update/event/{id}", id);
    }

    public static Object getAllEvents() {
        return given()
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("sb.services") + "/api/events");
    }


    public static Object getListOfEventsByTcKeyAndEnvironment(String tcKey, String env) {
        return given()
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("sb.services") + "/api/events/{tcKey}/{env}", tcKey, env);
    }

    public static Object getListOfEventsByEnvironment(String env) {
        return given()
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("sb.services") + "/api/events/env/{env}", env);
    }

    public static Object getAnEventById(Integer id) {
        return given()
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("sb.services") + "/api/event/{id}", id);
    }

    public static String deleteEventsByEnv(String env) {
        return given()
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("sb.services") + "/api/event/delete/{env}",env).body().toString();
    }

    public static String truncateTableEvents() {
        return given()
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .delete(System.getProperty("sb.services") + "/api/event/delete").body().toString();
    }
}
