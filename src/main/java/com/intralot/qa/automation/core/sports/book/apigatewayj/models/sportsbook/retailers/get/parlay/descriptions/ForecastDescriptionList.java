package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.retailers.get.parlay.descriptions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class ForecastDescriptionList {
    @SerializedName("eventCode")
    @Expose
    private String eventCode;
    @SerializedName("selectionId")
    @Expose
    private String selectionId;
    @SerializedName("line")
    @Expose
    private BigDecimal line;
    @SerializedName("parlayCode")
    @Expose
    private String parlayCode;
    @SerializedName("parlayCardId")
    @Expose
    private Integer parlayCardId;
    @SerializedName("eventId")
    @Expose
    private String eventId;
    @SerializedName("eventDate")
    @Expose
    private String eventDate;
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

    public String getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(String selectionId) {
        this.selectionId = selectionId;
    }

    public BigDecimal getLine() {
        return line;
    }

    public void setLine(BigDecimal line) {
        this.line = line;
    }

    public String getParlayCode() {
        return parlayCode;
    }

    public void setParlayCode(String parlayCode) {
        this.parlayCode = parlayCode;
    }

    public Integer getParlayCardId() {
        return parlayCardId;
    }

    public void setParlayCardId(Integer parlayCardId) {
        this.parlayCardId = parlayCardId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
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