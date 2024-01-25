package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.terminal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Sportsbook {

    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("couponCost")
    @Expose
    private BigDecimal couponCost;
    @SerializedName("bets")
    @Expose
    private Bets bets;
    @SerializedName("acceptPriceChange")
    @Expose
    private Boolean acceptPriceChange;
    @SerializedName("useBonusFunds")
    @Expose
    private Boolean useBonusFunds;
    @SerializedName("quickBetId")
    @Expose
    private Integer quickBetId;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Sportsbook withGameId(Integer gameId) {
        this.gameId = gameId;
        return this;
    }

    public BigDecimal getCouponCost() {
        return couponCost;
    }

    public void setCouponCost(BigDecimal couponCost) {
        this.couponCost = couponCost;
    }

    public Sportsbook withCouponCost(BigDecimal couponCost) {
        this.gameId = gameId;
        return this;
    }

    public Bets getBets() {
        return bets;
    }

    public void setBets(Bets bets) {
        this.bets = bets;
    }

    public Sportsbook withBets(Bets bets) {
        this.bets = bets;
        return this;
    }

    public Boolean getAcceptPriceChange() {
        return acceptPriceChange;
    }

    public void setAcceptPriceChange(Boolean acceptPriceChange) {
        this.acceptPriceChange = acceptPriceChange;
    }

    public Sportsbook withAcceptPriceChange(Boolean acceptPriceChange) {
        this.bets = bets;
        return this;
    }

    public Boolean getUseBonusFunds() {
        return useBonusFunds;
    }

    public void setUseBonusFunds(Boolean useBonusFunds) {
        this.useBonusFunds = useBonusFunds;
    }

    public Sportsbook withUseBonusFunds(Boolean useBonusFunds) {
        this.useBonusFunds = useBonusFunds;
        return this;
    }

    public Integer getQuickBetId() {
        return quickBetId;
    }

    public void setQuickBetId(Integer quickBetId) {
        this.quickBetId = quickBetId;
    }

    public Sportsbook withQuickBetId(Integer quickBetId) {
        this.quickBetId = quickBetId;
        return this;
    }
}
