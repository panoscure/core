package com.intralot.qa.automation.core.sports.book.mobileAPI;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class Antepost {

    public static Object antepostList() {
        return given()
                .header("MOBILECANVAS", System.getProperty("mobileCanvasHeader"))
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(System.getProperty("mobile") + "/mobile/api/v3.1/sportsbook/antepostEvents");
    }

    public static Object antepostListPerSport(String selectedSport) {
        return given()
                .header("MOBILECANVAS", System.getProperty("mobileCanvasHeader"))
                .body("{\"selectedSport\": \"" + selectedSport + "\"}")
                .contentType(JSON)
                .accept(JSON)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(System.getProperty("mobile") + "/mobile/api/v3.1/sportsbook/antepost/events");
    }
}
