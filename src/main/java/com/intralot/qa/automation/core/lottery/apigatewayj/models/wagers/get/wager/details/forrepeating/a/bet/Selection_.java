
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Selection_ {

    @SerializedName("banker")
    @Expose
    private Boolean banker;
    @SerializedName("eventId")
    @Expose
    private Integer eventId;
    @SerializedName("group")
    @Expose
    private Integer group;
    @SerializedName("lines")
    @Expose
    private List<Integer> lines = null;
    @SerializedName("odds")
    @Expose
    private Odds odds;
    @SerializedName("selectionId")
    @Expose
    private Integer selectionId;
    @SerializedName("singleStake")
    @Expose
    private SingleStake singleStake;

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

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public List<Integer> getLines() {
        return lines;
    }

    public void setLines(List<Integer> lines) {
        this.lines = lines;
    }

    public Odds getOdds() {
        return odds;
    }

    public void setOdds(Odds odds) {
        this.odds = odds;
    }

    public Integer getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(Integer selectionId) {
        this.selectionId = selectionId;
    }

    public SingleStake getSingleStake() {
        return singleStake;
    }

    public void setSingleStake(SingleStake singleStake) {
        this.singleStake = singleStake;
    }

}
