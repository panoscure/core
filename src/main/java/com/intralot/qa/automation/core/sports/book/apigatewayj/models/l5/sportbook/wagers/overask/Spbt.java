package com.intralot.qa.automation.core.sports.book.apigatewayj.models.l5.sportbook.wagers.overask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

public class Spbt {
    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("betslipStake")
    @Expose
    private BigDecimal betslipStake;
    @SerializedName("betslipDiscountStake")
    @Expose
    private BigDecimal betslipDiscountStake;
    @SerializedName("betslipTotalCost")
    @Expose
    private BigDecimal betslipTotalCost;
    @SerializedName("betslipPotentialPayout")
    @Expose
    private BigDecimal betslipPotentialPayout;
    @SerializedName("placedTime")
    @Expose
    private long placedTime;
    @SerializedName("selections")
    @Expose
    private List<Selection> selections = null;
    @SerializedName("bets")
    @Expose
    private List<Bet> bets = null;
    @SerializedName("betslipOverAskId")
    @Expose
    private long betslipOverAskId;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public BigDecimal getBetslipStake() {
        return betslipStake;
    }

    public void setBetslipStake(BigDecimal betslipStake) {
        this.betslipStake = betslipStake;
    }

    public BigDecimal getBetslipTotalCost() {
        return betslipTotalCost;
    }

    public void setBetslipTotalCost(BigDecimal betslipTotalCost) {
        this.betslipTotalCost = betslipTotalCost;
    }

    public BigDecimal getBetslipPotentialPayout() {
        return betslipPotentialPayout;
    }

    public void setBetslipPotentialPayout(BigDecimal betslipPotentialPayout) {
        this.betslipPotentialPayout = betslipPotentialPayout;
    }

    public long getPlacedTime() {
        return placedTime;
    }

    public void setPlacedTime(long placedTime) {
        this.placedTime = placedTime;
    }

    public List<Selection> getSelections() {
        return selections;
    }

    public void setSelections(List<Selection> selections) {
        this.selections = selections;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    public long getBetslipOverAskId() {
        return betslipOverAskId;
    }

    public void setBetslipOverAskId(long betslipOverAskId) {
        this.betslipOverAskId = betslipOverAskId;
    }

    public BigDecimal getBetslipDiscountStake() {
        return betslipDiscountStake;
    }

    public void setBetslipDiscountStake(BigDecimal betslipDiscountStake) {
        this.betslipDiscountStake = betslipDiscountStake;
    }
}