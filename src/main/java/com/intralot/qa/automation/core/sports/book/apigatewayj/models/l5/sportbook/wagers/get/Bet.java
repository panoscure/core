package com.intralot.qa.automation.core.sports.book.apigatewayj.models.l5.sportbook.wagers.get;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Bet {
    @SerializedName("betId")
    @Expose
    private long betId;
    @SerializedName("cashOut")
    @Expose
    private Boolean cashOut;
    @SerializedName("displayStatus")
    @Expose
    private String displayStatus;
    @SerializedName("stake")
    @Expose
    private Stake stake;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("totalCost")
    @Expose
    private BigDecimal totalCost;

    public long getBetId() {
        return betId;
    }

    public void setBetId(long betId) {
        this.betId = betId;
    }

    public Boolean getCashOut() {
        return cashOut;
    }

    public void setCashOut(Boolean cashOut) {
        this.cashOut = cashOut;
    }

    public String getDisplayStatus() {
        return displayStatus;
    }

    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public Stake getStake() {
        return stake;
    }

    public void setStake(Stake stake) {
        this.stake = stake;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }
}