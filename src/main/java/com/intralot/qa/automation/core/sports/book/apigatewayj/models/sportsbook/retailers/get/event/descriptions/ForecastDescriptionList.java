package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.retailers.get.event.descriptions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ForecastDescriptionList {
    @SerializedName("eventCode")
    @Expose
    private String eventCode;
    @SerializedName("selectionId")
    @Expose
    private Integer selectionId;
    @SerializedName("selectionCode")
    @Expose
    private String selectionCode;
    @SerializedName("line")
    @Expose
    private Integer line;
    @SerializedName("eventId")
    @Expose
    private Integer eventId;
    @SerializedName("eventDescription")
    @Expose
    private String eventDescription;
    @SerializedName("marketShortDescription")
    @Expose
    private String marketShortDescription;
    @SerializedName("selectionShortDescription")
    @Expose
    private String selectionShortDescription;

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public Integer getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(Integer selectionId) {
        this.selectionId = selectionId;
    }

    public String getSelectionCode() {
        return selectionCode;
    }

    public void setSelectionCode(String selectionCode) {
        this.selectionCode = selectionCode;
    }

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getMarketShortDescription() {
        return marketShortDescription;
    }

    public void setMarketShortDescription(String marketShortDescription) {
        this.marketShortDescription = marketShortDescription;
    }

    public String getSelectionShortDescription() {
        return selectionShortDescription;
    }

    public void setSelectionShortDescription(String selectionShortDescription) {
        this.selectionShortDescription = selectionShortDescription;
    }
}