
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.nlo.it.is.used.to.play.a.wager;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Spbt {

    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("betslipStake")
    @Expose
    private Float betslipStake;
    @SerializedName("betslipTotalCost")
    @Expose
    private Float betslipTotalCost;
    @SerializedName("betslipPotentialPayout")
    @Expose
    private Float betslipPotentialPayout;
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

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Float getBetslipStake() {
        return betslipStake;
    }

    public void setBetslipStake(Float betslipStake) {
        this.betslipStake = betslipStake;
    }

    public Float getBetslipTotalCost() {
        return betslipTotalCost;
    }

    public void setBetslipTotalCost(Float betslipTotalCost) {
        this.betslipTotalCost = betslipTotalCost;
    }

    public Float getBetslipPotentialPayout() {
        return betslipPotentialPayout;
    }

    public void setBetslipPotentialPayout(Float betslipPotentialPayout) {
        this.betslipPotentialPayout = betslipPotentialPayout;
    }

    public Long getPlacedTime() {
        return placedTime;
    }

    public void setPlacedTime(Long placedTime) {
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

    public String getExtBetslipId() {
        return extBetslipId;
    }

    public void setExtBetslipId(String extBetslipId) {
        this.extBetslipId = extBetslipId;
    }

}
