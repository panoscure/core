
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.desktop;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;


public class Sportsbook implements Serializable {
    @SerializedName("gameId")
    @Expose
    private Integer gameId = Integer.valueOf(java.lang.System.getProperty("gameId"));
    @SerializedName("couponCost")
    @Expose
    private Integer couponCost = 0;
    @SerializedName("bets")
    @Expose
    private List<Bet> bets = new LinkedList<Bet>();
    @SerializedName("acceptPriceChange")
    @Expose
    private Boolean acceptPriceChange = true;
    @SerializedName("acceptOdds")
    @Expose
    private Integer acceptOdds = 2;
    @SerializedName("useBonusFunds")
    @Expose
    private Boolean useBonusFunds = false;

    public Sportsbook() {
        bets.add(new Bet());
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getCouponCost() {
        return couponCost;
    }

    public void setCouponCost(Integer couponCost) {
        this.couponCost = couponCost;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    public Boolean getAcceptPriceChange() {
        return acceptPriceChange;
    }

    public void setAcceptPriceChange(Boolean acceptPriceChange) {
        this.acceptPriceChange = acceptPriceChange;
    }

    public Integer getAcceptOdds() {
        return acceptOdds;
    }

    public void setAcceptOdds(Integer acceptOdds) {
        this.acceptOdds = acceptOdds;
    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

    public Boolean getUseBonusFunds() {
        return useBonusFunds;
    }

    public void setUseBonusFunds(Boolean useBonusFunds) {
        this.useBonusFunds = useBonusFunds;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("gameId", gameId).append("couponCost", couponCost).append("bets", bets).append("acceptPriceChange", acceptPriceChange).append("acceptOdds", acceptOdds).append("useBonusFunds", useBonusFunds).toString();
    }

}