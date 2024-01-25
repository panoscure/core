package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.retrieve.winnings.forthe.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Bet {

    @SerializedName("betId")
    @Expose
    private Long betId;
    @SerializedName("cashOut")
    @Expose
    private Boolean cashOut;
    @SerializedName("displayStatus")
    @Expose
    private String displayStatus;
    @SerializedName("payout")
    @Expose
    private BigDecimal payout;
    @SerializedName("stake")
    @Expose
    private Stake stake;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("totalCost")
    @Expose
    private BigDecimal totalCost;
    @SerializedName("grossAmount")
    @Expose
    private BigDecimal grossAmount;
    @SerializedName("netAmount")
    @Expose
    private BigDecimal netAmount;
    @SerializedName("refundAmount")
    @Expose
    private BigDecimal refundAmount;

    public Long getBetId() {
        return betId;
    }

    public void setBetId(Long betId) {
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

    public BigDecimal getPayout() {
        return payout;
    }

    public void setPayout(BigDecimal payout) {
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

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(BigDecimal grossAmount) {
        this.grossAmount = grossAmount;
    }

    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

}
