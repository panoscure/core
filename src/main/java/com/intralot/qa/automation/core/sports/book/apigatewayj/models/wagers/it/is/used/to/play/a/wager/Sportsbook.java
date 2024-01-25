
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Sportsbook {

    @SerializedName("acceptPriceChange")
    @Expose
    private Boolean acceptPriceChange;
    @SerializedName("betSlipId")
    @Expose
    private Long betSlipId;
    @SerializedName("bets")
    @Expose
    private List<Bet> bets = null;
    @SerializedName("freeBets")
    @Expose
    private List<Object> freeBets = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sportsbook() {
    }

    /**
     * 
     * @param freeBets
     * @param betSlipId
     * @param bets
     * @param acceptPriceChange
     */
    public Sportsbook(Boolean acceptPriceChange, Long betSlipId, List<Bet> bets, List<Object> freeBets) {
        super();
        this.acceptPriceChange = acceptPriceChange;
        this.betSlipId = betSlipId;
        this.bets = bets;
        this.freeBets = freeBets;
    }

    public Boolean getAcceptPriceChange() {
        return acceptPriceChange;
    }

    public void setAcceptPriceChange(Boolean acceptPriceChange) {
        this.acceptPriceChange = acceptPriceChange;
    }

    public Long getBetSlipId() {
        return betSlipId;
    }

    public void setBetSlipId(Long betSlipId) {
        this.betSlipId = betSlipId;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    public List<Object> getFreeBets() {
        return freeBets;
    }

    public void setFreeBets(List<Object> freeBets) {
        this.freeBets = freeBets;
    }

}
