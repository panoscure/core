package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.returns.the.bets.of.a.specific.betslip.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

public class ReturnsTheBetsOfASpecificBetSlipIdModel {
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
    private Integer sumOfTotalCost;

    public Boolean getAcceptPriceChange() {
        return acceptPriceChange;
    }

    public void setAcceptPriceChange(Boolean acceptPriceChange) {
        this.acceptPriceChange = acceptPriceChange;
    }

    public ReturnsTheBetsOfASpecificBetSlipIdModel withAcceptPriceChange(Boolean acceptPriceChange) {
        this.acceptPriceChange = acceptPriceChange;
        return this;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    public ReturnsTheBetsOfASpecificBetSlipIdModel withBets(List<Bet> bets) {
        this.bets = bets;
        return this;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ReturnsTheBetsOfASpecificBetSlipIdModel withResult(Result result) {
        this.result = result;
        return this;
    }

    public BigDecimal getSumOfBonusWinnings() {
        return sumOfBonusWinnings;
    }

    public void setSumOfBonusWinnings(BigDecimal sumOfBonusWinnings) {
        this.sumOfBonusWinnings = sumOfBonusWinnings;
    }

    public ReturnsTheBetsOfASpecificBetSlipIdModel withSumOfBonusWinnings(BigDecimal sumOfBonusWinnings) {
        this.sumOfBonusWinnings = sumOfBonusWinnings;
        return this;
    }

    public BigDecimal getSumOfPayout() {
        return sumOfPayout;
    }

    public void setSumOfPayout(BigDecimal sumOfPayout) {
        this.sumOfPayout = sumOfPayout;
    }

    public ReturnsTheBetsOfASpecificBetSlipIdModel withSumOfPayout(BigDecimal sumOfPayout) {
        this.sumOfPayout = sumOfPayout;
        return this;
    }

    public BigDecimal getSumOfStake() {
        return sumOfStake;
    }

    public void setSumOfStake(BigDecimal sumOfStake) {
        this.sumOfStake = sumOfStake;
    }

    public ReturnsTheBetsOfASpecificBetSlipIdModel withSumOfStake(BigDecimal sumOfStake) {
        this.sumOfStake = sumOfStake;
        return this;
    }

    public Integer getSumOfTotalCost() {
        return sumOfTotalCost;
    }

    public void setSumOfTotalCost(Integer sumOfTotalCost) {
        this.sumOfTotalCost = sumOfTotalCost;
    }

    public ReturnsTheBetsOfASpecificBetSlipIdModel withSumOfTotalCost(Integer sumOfTotalCost) {
        this.sumOfTotalCost = sumOfTotalCost;
        return this;
    }
}