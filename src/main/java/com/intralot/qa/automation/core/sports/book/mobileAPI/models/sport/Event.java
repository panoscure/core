package com.intralot.qa.automation.core.sports.book.mobileAPI.models.sport;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Event {

    @SerializedName("eventId")
    @Expose
    private String eventId;
    @SerializedName("eventName")
    @Expose
    private String eventName;
    @SerializedName("antepost")
    @Expose
    private Boolean antepost;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("displayed")
    @Expose
    private Boolean displayed;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("markets")
    @Expose
    private List<Market> markets = null;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Boolean getAntepost() {
        return antepost;
    }

    public void setAntepost(Boolean antepost) {
        this.antepost = antepost;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getDisplayed() {
        return displayed;
    }

    public void setDisplayed(Boolean displayed) {
        this.displayed = displayed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }
}
