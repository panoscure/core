package com.intralot.qa.automation.core.sports.book.sb.services;

import com.intralot.qa.automation.core.sports.book.sb.services.models.EventsModel;
import io.restassured.response.Response;
import org.bouncycastle.util.Properties;

import java.util.ArrayList;
import java.util.List;

import static com.intralot.qa.automation.core.sports.book.sb.services.EventsServices.getListOfEventsByTcKeyAndEnvironment;

public class SBServicesHelper {

    public static List<Integer> getEventsForTestCase(String tcKey) {
        List<Integer> events = new ArrayList<>();
        String env = Properties.getPropertyValue("sb.services.env");
        EventsModel[] listOfEvents = ((Response) getListOfEventsByTcKeyAndEnvironment(tcKey, env)).then().statusCode(200).extract().as(EventsModel[].class);

        for (EventsModel event : listOfEvents) {
            events.add(Integer.valueOf(event.getEventId()));
        }
        return events;
    }

}
