package com.intralot.qa.automation.core.sports.book.mobileAPI;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class Sportsbook {

    public static Object eventById(int id) {
        return given()
                .header("MOBILECANVAS", System.getProperty("mobileCanvasHeader"))
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("mobile") + "/mobile/api/v3.1/sportsbook/event/{id}", id);
    }

    public static Object prematchEventList(String body) {
        return given()
                .header("MOBILECANVAS", System.getProperty("mobileCanvasHeader"))
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/sportsbook/events");
    }

    public static Object liveSportsCarousel() {
        return given()
                .header("MOBILECANVAS", System.getProperty("mobileCanvasHeader"))
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("mobile") + "/mobile/api/v3.1/sportsbook/live/sports");
    }

    public static Object liveEventsPerSport(String body) {
        return given()
                .header("MOBILECANVAS", System.getProperty("mobileCanvasHeader"))
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/sportsbook/live/sport/events");
    }

    public static Object retrieveAllSportsAndBanners(String body) {
        return given()
                .header("MOBILECANVAS", System.getProperty("mobileCanvasHeader"))
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/sportsbook/sport/carousel");
    }

    public static Object returnsDataThatComposeTheTabsForHomeAndSportScreen(String body) {
        return given()
                .header("MOBILECANVAS", System.getProperty("mobileCanvasHeader"))
                .body(body)
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/sportsbook/tabs");
    }

    public static Object getLiveSchedule() {
        return given()
                .header("MOBILECANVAS", System.getProperty("mobileCanvasHeader"))
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/sportsbook/liveschedule");
    }
}
