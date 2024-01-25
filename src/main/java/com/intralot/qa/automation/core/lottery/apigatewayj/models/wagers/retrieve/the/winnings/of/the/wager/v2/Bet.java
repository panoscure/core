package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.retrieve.the.winnings.of.the.wager.v2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;

public class Bet {

    @SerializedName("cashOut")
    @Expose
    private Boolean cashOut;
    @SerializedName("displayStatus")
    @Expose
    private String displayStatus;
    @SerializedName("payout")
    @Expose
    private Double payout;
    @SerializedName("stake")
    @Expose
    private Stake stake;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("totalCost")
    @Expose
    private Double totalCost;
    @SerializedName("grossAmount")
    @Expose
    private Double grossAmount;
    @SerializedName("netAmount")
    @Expose
    private Double netAmount;
    @SerializedName("wagerPlacedTime")
    @Expose
    private BigInteger wagerPlacedTime;
    @SerializedName("taxOnReturnsAmount")
    @Expose
    private Double taxOnReturnsAmount;

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

    public Double getPayout() {
        return payout;
    }

    public void setPayout(Double payout) {
        this.payout = payout;
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

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(Double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public BigInteger getWagerPlacedTime() {
        return wagerPlacedTime;
    }

    public void setWagerPlacedTime(BigInteger wagerPlacedTime) {
        this.wagerPlacedTime = wagerPlacedTime;
    }

    public Double getTaxOnReturnsAmount() {
        return taxOnReturnsAmount;
    }

    public void setTaxOnReturnsAmount(Double taxOnReturnsAmount) {
        this.taxOnReturnsAmount = taxOnReturnsAmount;
    }
}
