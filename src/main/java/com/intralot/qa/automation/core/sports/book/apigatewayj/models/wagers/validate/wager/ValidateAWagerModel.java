package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.validate.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

public class ValidateAWagerModel {
    @SerializedName("betslipId")
    @Expose
    private long betslipId;
    @SerializedName("bets")
    @Expose
    private List<Bet> bets = null;
    @SerializedName("paymentOutcome")
    @Expose
    private String paymentOutcome;
    @SerializedName("sumOfBonusAmount")
    @Expose
    private BigDecimal sumOfBonusAmount;
    @SerializedName("sumOfGrossAmount")
    @Expose
    private BigDecimal sumOfGrossAmount;
    @SerializedName("sumOfNetAmount")
    @Expose
    private BigDecimal sumOfNetAmount;
    @SerializedName("sumOfRefundAmount")
    @Expose
    private BigDecimal sumOfRefundAmount;
    @SerializedName("sumOfStakeAmount")
    @Expose
    private BigDecimal sumOfStakeAmount;
    @SerializedName("sumOfTaxOnReturnsAmount")
    @Expose
    private BigDecimal sumOfTaxOnReturnsAmount;
    @SerializedName("placedTime")
    @Expose
    private long placedTime;
    @SerializedName("transactionTime")
    @Expose
    private long transactionTime;

    public long getBetslipId() {
        return betslipId;
    }

    public void setBetslipId(long betslipId) {
        this.betslipId = betslipId;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    public String getPaymentOutcome() {
        return paymentOutcome;
    }

    public void setPaymentOutcome(String paymentOutcome) {
        this.paymentOutcome = paymentOutcome;
    }

    public BigDecimal getSumOfBonusAmount() {
        return sumOfBonusAmount;
    }

    public void setSumOfBonusAmount(BigDecimal sumOfBonusAmount) {
        this.sumOfBonusAmount = sumOfBonusAmount;
    }

    public BigDecimal getSumOfGrossAmount() {
        return sumOfGrossAmount;
    }

    public void setSumOfGrossAmount(BigDecimal sumOfGrossAmount) {
        this.sumOfGrossAmount = sumOfGrossAmount;
    }

    public BigDecimal getSumOfNetAmount() {
        return sumOfNetAmount;
    }

    public void setSumOfNetAmount(BigDecimal sumOfNetAmount) {
        this.sumOfNetAmount = sumOfNetAmount;
    }

    public BigDecimal getSumOfRefundAmount() {
        return sumOfRefundAmount;
    }

    public void setSumOfRefundAmount(BigDecimal sumOfRefundAmount) {
        this.sumOfRefundAmount = sumOfRefundAmount;
    }

    public BigDecimal getSumOfStakeAmount() {
        return sumOfStakeAmount;
    }

    public void setSumOfStakeAmount(BigDecimal sumOfStakeAmount) {
        this.sumOfStakeAmount = sumOfStakeAmount;
    }

    public BigDecimal getSumOfTaxOnReturnsAmount() {
        return sumOfTaxOnReturnsAmount;
    }

    public void setSumOfTaxOnReturnsAmount(BigDecimal sumOfTaxOnReturnsAmount) {
        this.sumOfTaxOnReturnsAmount = sumOfTaxOnReturnsAmount;
    }

    public long getPlacedTime() {
        return placedTime;
    }

    public void setPlacedTime(long placedTime) {
        this.placedTime = placedTime;
    }

    public long getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Integer transactionTime) {
        this.transactionTime = transactionTime;
    }
}

