package com.intralot.qa.automation.core.sports.book.apigatewayj.models.l5.sportbook.wagers.cancels.a.betslip;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CancelsABetSlipModel {
    @SerializedName("betSlipID")
    @Expose
    private Long betSlipID;
    @SerializedName("bets")
    @Expose
    private List<Bet> bets = null;
    @SerializedName("cancellationOutcome")
    @Expose
    private String cancellationOutcome;
    @SerializedName("totalCancelAmount")
    @Expose
    private Integer totalCancelAmount;
    @SerializedName("totalDiscountAmount")
    @Expose
    private Integer totalDiscountAmount;
    @SerializedName("placedTime")
    @Expose
    private Long placedTime;
    @SerializedName("transactionTime")
    @Expose
    private Long transactionTime;

    public Long getBetSlipID() {
        return betSlipID;
    }

    public void setBetSlipID(Long betSlipID) {
        this.betSlipID = betSlipID;
    }

    public CancelsABetSlipModel withBetSlipID(Long betSlipID) {
        this.betSlipID = betSlipID;
        return this;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    public CancelsABetSlipModel withBets(List<Bet> bets) {
        this.bets = bets;
        return this;
    }

    public String getCancellationOutcome() {
        return cancellationOutcome;
    }

    public void setCancellationOutcome(String cancellationOutcome) {
        this.cancellationOutcome = cancellationOutcome;
    }

    public CancelsABetSlipModel withCancellationOutcome(String cancellationOutcome) {
        this.cancellationOutcome = cancellationOutcome;
        return this;
    }

    public Integer getTotalCancelAmount() {
        return totalCancelAmount;
    }

    public void setTotalCancelAmount(Integer totalCancelAmount) {
        this.totalCancelAmount = totalCancelAmount;
    }

    public CancelsABetSlipModel withTotalCancelAmount(Integer totalCancelAmount) {
        this.totalCancelAmount = totalCancelAmount;
        return this;
    }

    public Integer getTotalDiscountAmount() {
        return totalDiscountAmount;
    }

    public void setTotalDiscountAmount(Integer totalDiscountAmount) {
        this.totalDiscountAmount = totalDiscountAmount;
    }

    public CancelsABetSlipModel withTotalDiscountAmount(Integer totalDiscountAmount) {
        this.totalDiscountAmount = totalDiscountAmount;
        return this;
    }

    public Long getPlacedTime() {
        return placedTime;
    }

    public void setPlacedTime(Long placedTime) {
        this.placedTime = placedTime;
    }

    public CancelsABetSlipModel withPlacedTime(Long placedTime) {
        this.placedTime = placedTime;
        return this;
    }

    public Long getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Long transactionTime) {
        this.transactionTime = transactionTime;
    }

    public CancelsABetSlipModel withTransactionTime(Long transactionTime) {
        this.transactionTime = transactionTime;
        return this;
    }
}