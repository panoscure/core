
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.full.details.fora.specific.bet.slip.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Parts {

    @SerializedName("betPart")
    @Expose
    private List<BetPart> betPart = null;
    @SerializedName("rate")
    @Expose
    private Float rate;
    @SerializedName("internalWinning")
    @Expose
    private Float internalWinning;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Parts() {
    }

    /**
     * 
     * @param internalWinning
     * @param rate
     * @param betPart
     */
    public Parts(List<BetPart> betPart, Float rate, Float internalWinning) {
        super();
        this.betPart = betPart;
        this.rate = rate;
        this.internalWinning = internalWinning;
    }

    public List<BetPart> getBetPart() {
        return betPart;
    }

    public void setBetPart(List<BetPart> betPart) {
        this.betPart = betPart;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Float getInternalWinning() {
        return internalWinning;
    }

    public void setInternalWinning(Float internalWinning) {
        this.internalWinning = internalWinning;
    }

}