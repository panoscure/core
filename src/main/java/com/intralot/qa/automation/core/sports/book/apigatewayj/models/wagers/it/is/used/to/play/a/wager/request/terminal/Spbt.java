
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.terminal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;


public class Spbt implements Serializable {

    @SerializedName("acceptPriceChange")
    @Expose
    private Boolean acceptPriceChange = true;
    @SerializedName("acceptOdds")
    @Expose
    private Integer acceptOdds = 2;
    @SerializedName("bets")
    @Expose
    private Bets bets;
    @SerializedName("gameId")
    @Expose
    private Integer gameId = Integer.valueOf(java.lang.System.getProperty("gameId"));

    public Spbt() {
        bets = new Bets();
    }

    public Spbt(Boolean acceptPriceChange, Bets bets, Integer gameId) {
        super();
        this.acceptPriceChange = acceptPriceChange;
        this.bets = bets;
        this.gameId = gameId;
    }

    public Boolean getAcceptPriceChange() {
        return acceptPriceChange;
    }

    public void setAcceptPriceChange(Boolean acceptPriceChange) {
        this.acceptPriceChange = acceptPriceChange;
    }

    public Bets getBet() {
        return bets;
    }

    public void setBets(Bets bets) {
        this.bets = bets;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getAcceptOdds() {
        return acceptOdds;
    }

    public void setAcceptOdds(Integer acceptOdds) {
        this.acceptOdds = acceptOdds;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("acceptPriceChange", acceptPriceChange).append("bets", bets).append("gameId", gameId).toString();
    }

}
