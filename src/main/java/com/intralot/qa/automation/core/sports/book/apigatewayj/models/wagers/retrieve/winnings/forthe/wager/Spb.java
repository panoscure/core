package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.retrieve.winnings.forthe.wager;

import java.math.BigDecimal;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Spb {

    @SerializedName("acceptPriceChange")
    @Expose
    private Boolean acceptPriceChange;
    @SerializedName("bets")
    @Expose
    private List<Bet> bets = null;
    @SerializedName("result")
    @Expose
    private Result result;
    @SerializedName("sumOfBonusWinnings")
    @Expose
    private BigDecimal sumOfBonusWinnings;
    @SerializedName("sumOfPayout")
    @Expose
    private BigDecimal sumOfPayout;
    @SerializedName("sumOfStake")
    @Expose
    private BigDecimal sumOfStake;
    @SerializedName("sumOfTotalCost")
    @Expose
    private BigDecimal sumOfTotalCost;
    @SerializedName("sumOfGrossAmount")
    @Expose
    private BigDecimal sumOfGrossAmount;
    @SerializedName("sumOfNetAmount")
    @Expose
    private BigDecimal sumOfNetAmount;
    @SerializedName("sumOfRefundAmount")
    @Expose
    private BigDecimal sumOfRefundAmount;
    @SerializedName("refundFee")
    @Expose
    private BigDecimal refundFee;

    public Boolean getAcceptPriceChange() {
        return acceptPriceChange;
    }

    public void setAcceptPriceChange(Boolean acceptPriceChange) {
        this.acceptPriceChange = acceptPriceChange;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public BigDecimal getSumOfBonusWinnings() {
        return sumOfBonusWinnings;
    }

    public void setSumOfBonusWinnings(BigDecimal sumOfBonusWinnings) {
        this.sumOfBonusWinnings = sumOfBonusWinnings;
    }

    public BigDecimal getSumOfPayout() {
        return sumOfPayout;
    }

    public void setSumOfPayout(BigDecimal sumOfPayout) {
        this.sumOfPayout = sumOfPayout;
    }

    public BigDecimal getSumOfStake() {
        return sumOfStake;
    }

    public void setSumOfStake(BigDecimal sumOfStake) {
        this.sumOfStake = sumOfStake;
    }

    public BigDecimal getSumOfTotalCost() {
        return sumOfTotalCost;
    }

    public void setSumOfTotalCost(BigDecimal sumOfTotalCost) {
        this.sumOfTotalCost = sumOfTotalCost;
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

    public BigDecimal getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(BigDecimal refundFee) {
        this.refundFee = refundFee;
    }

}
