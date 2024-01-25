package com.intralot.qa.automation.core.sports.book.mobileAPI.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

public class Event {
    @SerializedName("selectionId")
    @Expose
    private String selectionId;
    @SerializedName("editable")
    @Expose
    private Boolean editable;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("eventId")
    @Expose
    private Integer eventId;
    @SerializedName("eventName")
    @Expose
    private String eventName;
    @SerializedName("banker")
    @Expose
    private Boolean banker;
    @SerializedName("eventTime")
    @Expose
    private long eventTime;
    @SerializedName("marketName")
    @Expose
    private String marketName;
    @SerializedName("selectionName")
    @Expose
    private String selectionName;
    @SerializedName("odd")
    @Expose
    private Double odd;
    @SerializedName("time")
    @Expose
    private BigDecimal time;
    @SerializedName("eventUrl")
    @Expose
    private String eventUrl;
    @SerializedName("score")
    @Expose
    private List<Object> score = null;
    @SerializedName("live")
    @Expose
    private Boolean live;
    @SerializedName("runningTime")
    @Expose
    private Object runningTime;
    @SerializedName("periodTime")
    @Expose
    private Object periodTime;

    public String getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(String selectionId) {
        this.selectionId = selectionId;
    }

    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Boolean getBanker() {
        return banker;
    }

    public void setBanker(Boolean banker) {
        this.banker = banker;
    }

    public long getEventTime() {
        return eventTime;
    }

    public void setEventTime(long eventTime) {
        this.eventTime = eventTime;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getSelectionName() {
        return selectionName;
    }

    public void setSelectionName(String selectionName) {
        this.selectionName = selectionName;
    }

    public Double getOdd() {
        return odd;
    }

    public void setOdd(Double odd) {
        this.odd = odd;
    }

    public BigDecimal getTime() {
        return time;
    }

    public void setTime(BigDecimal time) {
        this.time = time;
    }

    public String getEventUrl() {
        return eventUrl;
    }

    public void setEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
    }

    public List<Object> getScore() {
        return score;
    }

    public void setScore(List<Object> score) {
        this.score = score;
    }

    public Boolean getLive() {
        return live;
    }

    public void setLive(Boolean live) {
        this.live = live;
    }

    public Object getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(Object runningTime) {
        this.runningTime = runningTime;
    }

    public Object getPeriodTime() {
        return periodTime;
    }

    public void setPeriodTime(Object periodTime) {
        this.periodTime = periodTime;
    }
}
