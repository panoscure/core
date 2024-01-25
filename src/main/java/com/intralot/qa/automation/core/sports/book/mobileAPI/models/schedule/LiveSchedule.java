package com.intralot.qa.automation.core.sports.book.mobileAPI.models.schedule;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LiveSchedule {

    @SerializedName("sportID")
    @Expose
    private String sportID;
    @SerializedName("sportImg")
    @Expose
    private String sportImg;
    @SerializedName("sportName")
    @Expose
    private String sportName;
    @SerializedName("events")
    @Expose
    private List<ScheduleEvent> events = null;

    public String getSportID() {
        return sportID;
    }

    public void setSportID(String sportID) {
        this.sportID = sportID;
    }

    public String getSportImg() {
        return sportImg;
    }

    public void setSportImg(String sportImg) {
        this.sportImg = sportImg;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public List<ScheduleEvent> getEvents() {
        return events;
    }

    public void setEvents(List<ScheduleEvent> events) {
        this.events = events;
    }

}

