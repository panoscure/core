package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager;

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
    @SerializedName("betslipTotalCost")
    @Expose
    private BigDecimal betslipTotalCost;
    @SerializedName("betslipPotentialBonusWinnings")
    @Expose
    private BigDecimal betslipPotentialBonusWinnings = null;
    @SerializedName("betslipPotentialPayout")
    @Expose
    private BigDecimal betslipPotentialPayout;
    @SerializedName("placedTime")
    @Expose
    private Long placedTime;
    @SerializedName("selections")
    @Expose
    private List<Selection> selections = null;
    @SerializedName("bets")
    @Expose
    private List<Bet> bets = null;
    @SerializedName("extBetslipId")
    @Expose
    private String extBetslipId;
    @SerializedName("betslipOverAskId")
    @Expose
    private String betslipOverAskId;
    @SerializedName("betslipDiscountStake")
    @Expose
    private BigDecimal betslipDiscountStake;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Spbt withGameId(Integer gameId) {
        this.gameId = gameId;
        return this;
    }

    public BigDecimal getBetslipStake() {
        return betslipStake;
    }

    public void setBetslipStake(BigDecimal betslipStake) {
        this.betslipStake = betslipStake;
    }

    public Spbt withBetslipStake(BigDecimal betslipStake) {
        this.betslipStake = betslipStake;
        return this;
    }

    public BigDecimal getBetslipTotalCost() {
        return betslipTotalCost;
    }

    public void setBetslipTotalCost(BigDecimal betslipTotalCost) {
        this.betslipTotalCost = betslipTotalCost;
    }

    public Spbt withBetslipTotalCost(BigDecimal betslipTotalCost) {
        this.betslipTotalCost = betslipTotalCost;
        return this;
    }

    public BigDecimal getBetslipPotentialPayout() {
        return betslipPotentialPayout;
    }

    public void setBetslipPotentialPayout(BigDecimal betslipPotentialPayout) {
        this.betslipPotentialPayout = betslipPotentialPayout;
    }

    public Spbt withBetslipPotentialPayout(BigDecimal betslipPotentialPayout) {
        this.betslipPotentialPayout = betslipPotentialPayout;
        return this;
    }

    public Long getPlacedTime() {
        return placedTime;
    }

    public void setPlacedTime(Long placedTime) {
        this.placedTime = placedTime;
    }

    public Spbt withPlacedTime(Long placedTime) {
        this.placedTime = placedTime;
        return this;
    }

    public List<Selection> getSelections() {
        return selections;
    }

    public void setSelections(List<Selection> selections) {
        this.selections = selections;
    }

    public Spbt withSelections(List<Selection> selections) {
        this.selections = selections;
        return this;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    public Spbt withBets(List<Bet> bets) {
        this.bets = bets;
        return this;
    }

    public String getExtBetslipId() {
        return extBetslipId;
    }

    public void setExtBetslipId(String extBetslipId) {
        this.extBetslipId = extBetslipId;
    }

    public Spbt withExtBetslipId(String extBetslipId) {
        this.extBetslipId = extBetslipId;
        return this;
    }

    public String getBetslipOverAskId() {
        return betslipOverAskId;
    }

    public void setBetslipOverAskId(String betslipOverAskId) {
        this.betslipOverAskId = betslipOverAskId;
    }

    public BigDecimal getBetslipDiscountStake() {
        return betslipDiscountStake;
    }

    public void setBetslipDiscountStake(BigDecimal betslipDiscountStake) {
        this.betslipDiscountStake = betslipDiscountStake;
    }

    public BigDecimal getBetslipPotentialBonusWinnings() {
        return betslipPotentialBonusWinnings;
    }

    public void setBetslipPotentialBonusWinnings(BigDecimal betslipPotentialBonusWinnings) {
        this.betslipPotentialBonusWinnings = betslipPotentialBonusWinnings;
    }
}