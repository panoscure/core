package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.validate.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Bet {
    @SerializedName("betId")
    @Expose
    private long betId;
    @SerializedName("betPaymentResult")
    @Expose
    private String betPaymentResult;
    @SerializedName("bonusAmount")
    @Expose
    private BigDecimal bonusAmount;
    @SerializedName("grossAmount")
    @Expose
    private BigDecimal grossAmount;
    @SerializedName("netAmount")
    @Expose
    private BigDecimal netAmount;
    @SerializedName("refundAmount")
    @Expose
    private BigDecimal refundAmount;
    @SerializedName("stakeAmount")
    @Expose
    private BigDecimal stakeAmount;
    @SerializedName("wagerPlacedTime")
    @Expose
    private long wagerPlacedTime;
    @SerializedName("wagerSettledTime")
    @Expose
    private long wagerSettledTime;
    @SerializedName("taxOnReturnsAmount")
    @Expose
    private BigDecimal taxOnReturnsAmount;

    public long getBetId() {
        return betId;
    }

    public void setBetId(long betId) {
        this.betId = betId;
    }

    public String getBetPaymentResult() {
        return betPaymentResult;
    }

    public void setBetPaymentResult(String betPaymentResult) {
        this.betPaymentResult = betPaymentResult;
    }

    public BigDecimal getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(BigDecimal bonusAmount) {
        this.bonusAmount = bonusAmount;
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

    public BigDecimal getStakeAmount() {
        return stakeAmount;
    }

    public void setStakeAmount(BigDecimal stakeAmount) {
        this.stakeAmount = stakeAmount;
    }

    public long getWagerPlacedTime() {
        return wagerPlacedTime;
    }

    public void setWagerPlacedTime(Integer wagerPlacedTime) {
        this.wagerPlacedTime = wagerPlacedTime;
    }

    public long getWagerSettledTime() {
        return wagerSettledTime;
    }

    public void setWagerSettledTime(long wagerSettledTime) {
        this.wagerSettledTime = wagerSettledTime;
    }

    public BigDecimal getTaxOnReturnsAmount() {
        return taxOnReturnsAmount;
    }

    public void setTaxOnReturnsAmount(BigDecimal taxOnReturnsAmount) {
        this.taxOnReturnsAmount = taxOnReturnsAmount;
    }
}
