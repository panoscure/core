package com.intralot.qa.automation.core.sports.book.apigatewayj.models.l5.sportbook.wagers.overask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Selection {
    @SerializedName("banker")
    @Expose
    private Boolean banker;
    @SerializedName("eventId")
    @Expose
    private Integer eventId;
    @SerializedName("odds")
    @Expose
    private List<Odd> odds = null;
    @SerializedName("selectionId")
    @Expose
    private List<String> selectionId = null;
    @SerializedName("status")
    @Expose
    private List<String> status = null;
    @SerializedName("selectionName")
    @Expose
    private List<String> selectionName = null;
    @SerializedName("marketName")
    @Expose
    private String marketName;
    @SerializedName("eventName")
    @Expose
    private String eventName;
    @SerializedName("eventTime")
    @Expose
    private long eventTime;
    @SerializedName("priceChangedAfterLockDate")
    @Expose
    private List<Boolean> priceChangedAfterLockDate = null;
    @SerializedName("inplay")
    @Expose
    private Boolean inplay;
    @SerializedName("position")
    @Expose
    private Integer position;

    public Boolean getBanker() {
        return banker;
    }

    public void setBanker(Boolean banker) {
        this.banker = banker;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public List<Odd> getOdds() {
        return odds;
    }

    public void setOdds(List<Odd> odds) {
        this.odds = odds;
    }

    public List<String> getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(List<String> selectionId) {
        this.selectionId = selectionId;
    }

    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public List<String> getSelectionName() {
        return selectionName;
    }

    public void setSelectionName(List<String> selectionName) {
        this.selectionName = selectionName;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public long getEventTime() {
        return eventTime;
    }

    public void setEventTime(long eventTime) {
        this.eventTime = eventTime;
    }

    public List<Boolean> getPriceChangedAfterLockDate() {
        return priceChangedAfterLockDate;
    }

    public void setPriceChangedAfterLockDate(List<Boolean> priceChangedAfterLockDate) {
        this.priceChangedAfterLockDate = priceChangedAfterLockDate;
    }

    public Boolean getInplay() {
        return inplay;
    }

    public void setInplay(Boolean inplay) {
        this.inplay = inplay;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}