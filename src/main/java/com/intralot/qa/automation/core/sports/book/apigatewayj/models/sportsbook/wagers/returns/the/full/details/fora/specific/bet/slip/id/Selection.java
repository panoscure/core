
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.full.details.fora.specific.bet.slip.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Selection {

    @SerializedName("partNo")
    @Expose
    private Long partNo;
    @SerializedName("selectionId")
    @Expose
    private String selectionId;
    @SerializedName("eventId")
    @Expose
    private Long eventId;
    @SerializedName("odds")
    @Expose
    private Odds odds;
    @SerializedName("banker")
    @Expose
    private Boolean banker;
    @SerializedName("lines")
    @Expose
    private List<Float> lines = null;
    @SerializedName("scores")
    @Expose
    private List<Long> scores = null;
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

    /**
     * No args constructor for use in serialization
     * 
     */
    public Selection() {
    }

    /**
     * 
     * @param selectionName
     * @param marketName
     * @param scores
     * @param eventId
     * @param selectionId
     * @param partNo
     * @param resultType
     * @param eventName
     * @param lines
     * @param eventTime
     * @param odds
     * @param banker
     */
    public Selection(Long partNo, String selectionId, Long eventId, Odds odds, Boolean banker, List<Float> lines, List<Long> scores, String selectionName, String marketName, String eventName, Long eventTime, String resultType) {
        super();
        this.partNo = partNo;
        this.selectionId = selectionId;
        this.eventId = eventId;
        this.odds = odds;
        this.banker = banker;
        this.lines = lines;
        this.scores = scores;
        this.selectionName = selectionName;
        this.marketName = marketName;
        this.eventName = eventName;
        this.eventTime = eventTime;
        this.resultType = resultType;
    }

    public Long getPartNo() {
        return partNo;
    }

    public void setPartNo(Long partNo) {
        this.partNo = partNo;
    }

    public String getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(String selectionId) {
        this.selectionId = selectionId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Odds getOdds() {
        return odds;
    }

    public void setOdds(Odds odds) {
        this.odds = odds;
    }

    public Boolean getBanker() {
        return banker;
    }

    public void setBanker(Boolean banker) {
        this.banker = banker;
    }

    public List<Float> getLines() {
        return lines;
    }

    public void setLines(List<Float> lines) {
        this.lines = lines;
    }

    public List<Long> getScores() {
        return scores;
    }

    public void setScores(List<Long> scores) {
        this.scores = scores;
    }

    public String getSelectionName() {
        return selectionName;
    }

    public void setSelectionName(String selectionName) {
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

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

}