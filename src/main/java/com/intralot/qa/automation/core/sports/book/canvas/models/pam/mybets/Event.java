package com.intralot.qa.automation.core.sports.book.canvas.models.pam.mybets;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
    private Long eventTime;
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
    private Object time;
    @SerializedName("eventUrl")
    @Expose
    private String eventUrl;
    @SerializedName("score")
    @Expose
    private Object score;
    @SerializedName("live")
    @Expose
    private Boolean live;
    @SerializedName("periods")
    @Expose
    private Object periods;
    @SerializedName("possession")
    @Expose
    private Object possession;
    @SerializedName("runningTime")
    @Expose
    private Object runningTime;
    @SerializedName("americanGround")
    @Expose
    private Boolean americanGround;
    @SerializedName("competitors")
    @Expose
    private List<Competitor> competitors = null;
    @SerializedName("tournament")
    @Expose
    private String tournament;
    @SerializedName("sport")
    @Expose
    private String sport;

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

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
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

    public Object getTime() {
        return time;
    }

    public void setTime(Object time) {
        this.time = time;
    }

    public String getEventUrl() {
        return eventUrl;
    }

    public void setEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
    }

    public Object getScore() {
        return score;
    }

    public void setScore(Object score) {
        this.score = score;
    }

    public Boolean getLive() {
        return live;
    }

    public void setLive(Boolean live) {
        this.live = live;
    }

    public Object getPeriods() {
        return periods;
    }

    public void setPeriods(Object periods) {
        this.periods = periods;
    }

    public Object getPossession() {
        return possession;
    }

    public void setPossession(Object possession) {
        this.possession = possession;
    }

    public Object getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(Object runningTime) {
        this.runningTime = runningTime;
    }

    public Boolean getAmericanGround() {
        return americanGround;
    }

    public void setAmericanGround(Boolean americanGround) {
        this.americanGround = americanGround;
    }

    public List<Competitor> getCompetitors() {
        return competitors;
    }

    public void setCompetitors(List<Competitor> competitors) {
        this.competitors = competitors;
    }

    public String getTournament() {
        return tournament;
    }

    public void setTournament(String tournament) {
        this.tournament = tournament;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

}
