package com.intralot.qa.automation.core.sports.book.canvas;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.ANY;
import static io.restassured.http.ContentType.JSON;

public class LiveSchedule {

    public static Object getLiveSchedule(Map<String, String> authCookie) {
        return given()
                .accept(ANY)
                .cookies(authCookie)
                .contentType(JSON)
                .body("{}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "view/live-schedule");
    }

    public static Object getLiveScheduleWithDate(Map<String, String> authCookie, String date, String widgetId) {
        return given()
                .accept(ANY)
                .cookies(authCookie)
                .contentType(JSON)
                .body("{\"date\":\"" + date + "\"}")
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("canvas") + "updateWidgetData/" + widgetId);
    }
}
