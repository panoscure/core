
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class EventResult {

    @SerializedName("startTime")
    @Expose
    private String startTime;
    @SerializedName("finishTime")
    @Expose
    private String finishTime;
    @SerializedName("event")
    @Expose
    private String event;
    @SerializedName("competition")
    @Expose
    private String competition;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("sport")
    @Expose
    private String sport;
    @SerializedName("score")
    @Expose
    private String score;
    @SerializedName("halfTimeScore")
    @Expose
    private String halfTimeScore;
    @SerializedName("outright")
    @Expose
    private Boolean outright;
    @SerializedName("abandoned")
    @Expose
    private Boolean abandoned;
    @SerializedName("reason")
    @Expose
    private String reason;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public EventResult withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public EventResult withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public EventResult withEvent(String event) {
        this.event = event;
        return this;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public EventResult withCompetition(String competition) {
        this.competition = competition;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public EventResult withCategory(String category) {
        this.category = category;
        return this;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public EventResult withSport(String sport) {
        this.sport = sport;
        return this;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public EventResult withScore(String score) {
        this.score = score;
        return this;
    }

    public String getHalfTimeScore() {
        return halfTimeScore;
    }

    public void setHalfTimeScore(String halfTimeScore) {
        this.halfTimeScore = halfTimeScore;
    }

    public EventResult withHalfTimeScore(String halfTimeScore) {
        this.halfTimeScore = halfTimeScore;
        return this;
    }

    public Boolean getOutright() {
        return outright;
    }

    public void setOutright(Boolean outright) {
        this.outright = outright;
    }

    public EventResult withOutright(Boolean outright) {
        this.outright = outright;
        return this;
    }

    public Boolean getAbandoned() {
        return abandoned;
    }

    public void setAbandoned(Boolean abandoned) {
        this.abandoned = abandoned;
    }

    public EventResult withAbandoned(Boolean abandoned) {
        this.abandoned = abandoned;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public EventResult withReason(String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("startTime", startTime).append("finishTime", finishTime).append("event", event).append("competition", competition).append("category", category).append("sport", sport).append("score", score).append("halfTimeScore", halfTimeScore).append("outright", outright).append("abandoned", abandoned).append("reason", reason).toString();
    }

}
