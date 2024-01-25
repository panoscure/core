package com.intralot.qa.automation.core.sports.book.wagers.retrieves.all.open.bets;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Selection {
    @SerializedName("partNo")
    @Expose
    private Integer partNo;
    @SerializedName("selectionId")
    @Expose
    private String selectionId;
    @SerializedName("eventId")
    @Expose
    private Integer eventId;
    @SerializedName("odds")
    @Expose
    private Odds odds;
    @SerializedName("banker")
    @Expose
    private Boolean banker;
    @SerializedName("lines")
    @Expose
    private List<Integer> lines = null;
    @SerializedName("scores")
    @Expose
    private List<Integer> scores = null;
    @SerializedName("selectionName")
    @Expose
    private String selectionName;
    @SerializedName("marketName")
    @Expose
    private String marketName;
    @SerializedName("eventName")
    @Expose
    private String eventName;
    @SerializedName("eventTime")
    @Expose
    private Long eventTime;
    @SerializedName("resultType")
    @Expose
    private String resultType;

    public Integer getPartNo() {
        return partNo;
    }

    public void setPartNo(Integer partNo) {
        this.partNo = partNo;
    }

    public Selection withPartNo(Integer partNo) {
        this.partNo = partNo;
        return this;
    }

    public String getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(String selectionId) {
        this.selectionId = selectionId;
    }

    public Selection withSelectionId(String selectionId) {
        this.selectionId = selectionId;
        return this;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Selection withEventId(Integer eventId) {
        this.eventId = eventId;
        return this;
    }

    public Odds getOdds() {
        return odds;
    }

    public void setOdds(Odds odds) {
        this.odds = odds;
    }

    public Selection withOdds(Odds odds) {
        this.odds = odds;
        return this;
    }

    public Boolean getBanker() {
        return banker;
    }

    public void setBanker(Boolean banker) {
        this.banker = banker;
    }

    public Selection withBanker(Boolean banker) {
        this.banker = banker;
        return this;
    }

    public List<Integer> getLines() {
        return lines;
    }

    public void setLines(List<Integer> lines) {
        this.lines = lines;
    }

    public Selection withLines(List<Integer> lines) {
        this.lines = lines;
        return this;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }

    public Selection withScores(List<Integer> scores) {
        this.scores = scores;
        return this;
    }

    public String getSelectionName() {
        return selectionName;
    }

    public void setSelectionName(String selectionName) {
        this.selectionName = selectionName;
    }

    public Selection withSelectionName(String selectionName) {
        this.selectionName = selectionName;
        return this;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public Selection withMarketName(String marketName) {
        this.marketName = marketName;
        return this;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Selection withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public Selection withEventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public Selection withResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
}