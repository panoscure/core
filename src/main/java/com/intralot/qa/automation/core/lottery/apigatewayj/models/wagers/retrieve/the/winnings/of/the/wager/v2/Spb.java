package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.retrieve.the.winnings.of.the.wager.v2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Spb {


    @SerializedName("acceptPriceChange")
    @Expose
    private Boolean acceptPriceChange;
    @SerializedName("bets")
    @Expose
    private List<Bet> bets = null;
    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("sumOfPayout")
    @Expose
    private Double sumOfPayout;
    @SerializedName("sumOfTotalCost")
    @Expose
    private Double sumOfTotalCost;
    @SerializedName("sumOfGrossAmount")
    @Expose
    private Double sumOfGrossAmount;
    @SerializedName("sumOfNetAmount")
    @Expose
    private Double sumOfNetAmount;
    @SerializedName("sumOfStakeAmount")
    @Expose
    private Double sumOfStakeAmount;
    @SerializedName("sumOfTaxOnReturnsAmount")
    @Expose
    private Double sumOfTaxOnReturnsAmount;

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

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Double getSumOfPayout() {
        return sumOfPayout;
    }

    public void setSumOfPayout(Double sumOfPayout) {
        this.sumOfPayout = sumOfPayout;
    }

    public Double getSumOfTotalCost() {
        return sumOfTotalCost;
    }

    public void setSumOfTotalCost(Double sumOfTotalCost) {
        this.sumOfTotalCost = sumOfTotalCost;
    }

    public Double getSumOfGrossAmount() {
        return sumOfGrossAmount;
    }

    public void setSumOfGrossAmount(Double sumOfGrossAmount) {
        this.sumOfGrossAmount = sumOfGrossAmount;
    }

    public Double getSumOfNetAmount() {
        return sumOfNetAmount;
    }

    public void setSumOfNetAmount(Double sumOfNetAmount) {
        this.sumOfNetAmount = sumOfNetAmount;
    }

    public Double getSumOfStakeAmount() {
        return sumOfStakeAmount;
    }

    public void setSumOfStakeAmount(Double sumOfStakeAmount) {
        this.sumOfStakeAmount = sumOfStakeAmount;
    }

    public Double getSumOfTaxOnReturnsAmount() {
        return sumOfTaxOnReturnsAmount;
    }

    public void setSumOfTaxOnReturnsAmount(Double sumOfTaxOnReturnsAmount) {
        this.sumOfTaxOnReturnsAmount = sumOfTaxOnReturnsAmount;
    }
}
