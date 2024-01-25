package com.intralot.qa.automation.core.sports.book.apigatewayj.models.l5.sportbook.wagers.cancels.a.betslip;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bet {
    @SerializedName("betID")
    @Expose
    private Long betID;
    @SerializedName("betStatus")
    @Expose
    private String betStatus;
    @SerializedName("cancellationOutcome")
    @Expose
    private String cancellationOutcome;
    @SerializedName("stakeAmount")
    @Expose
    private Integer stakeAmount;

    public Long getBetID() {
        return betID;
    }

    public void setBetID(Long betID) {
        this.betID = betID;
    }

    public Bet withBetID(Long betID) {
        this.betID = betID;
        return this;
    }

    public String getBetStatus() {
        return betStatus;
    }

    public void setBetStatus(String betStatus) {
        this.betStatus = betStatus;
    }

    public Bet withBetStatus(String betStatus) {
        this.betStatus = betStatus;
        return this;
    }

    public String getCancellationOutcome() {
        return cancellationOutcome;
    }

    public void setCancellationOutcome(String cancellationOutcome) {
        this.cancellationOutcome = cancellationOutcome;
    }

    public Bet withCancellationOutcome(String cancellationOutcome) {
        this.cancellationOutcome = cancellationOutcome;
        return this;
    }

    public Integer getStakeAmount() {
        return stakeAmount;
    }

    public void setStakeAmount(Integer stakeAmount) {
        this.stakeAmount = stakeAmount;
    }

    public Bet withStakeAmount(Integer stakeAmount) {
        this.stakeAmount = stakeAmount;
        return this;
    }
}