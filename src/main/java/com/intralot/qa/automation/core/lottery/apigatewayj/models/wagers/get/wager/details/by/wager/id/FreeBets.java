
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FreeBets {

    @SerializedName("GameId")
    @Expose
    private Integer gameId;
    @SerializedName("NumGroups")
    @Expose
    private Integer numGroups;
    @SerializedName("NumMultipleDraws")
    @Expose
    private Integer numMultipleDraws;
    @SerializedName("Spots")
    @Expose
    private Integer spots;
    @SerializedName("Multiplier")
    @Expose
    private Integer multiplier;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getNumGroups() {
        return numGroups;
    }

    public void setNumGroups(Integer numGroups) {
        this.numGroups = numGroups;
    }

    public Integer getNumMultipleDraws() {
        return numMultipleDraws;
    }

    public void setNumMultipleDraws(Integer numMultipleDraws) {
        this.numMultipleDraws = numMultipleDraws;
    }

    public Integer getSpots() {
        return spots;
    }

    public void setSpots(Integer spots) {
        this.spots = spots;
    }

    public Integer getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
    }

}
