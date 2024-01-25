package com.intralot.qa.automation.core.sports.book.sb.services.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventsModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("env")
    @Expose
    private String env;
    @SerializedName("tcKey")
    @Expose
    private String tcKey;
    @SerializedName("eventId")
    @Expose
    private String eventId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getTcKey() {
        return tcKey;
    }

    public void setTcKey(String tcKey) {
        this.tcKey = tcKey;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

}
