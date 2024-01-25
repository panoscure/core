package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.redeem.A.Voucher.Gift.Promotion.By.Serial.number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
    @SerializedName("Multiplier")
    @Expose
    private Integer multiplier;
    @SerializedName("BoardsMultiplier")
    @Expose
    private Integer boardsMultiplier;

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

    public Integer getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
    }

    public Integer getBoardsMultiplier() {
        return boardsMultiplier;
    }

    public void setBoardsMultiplier(Integer boardsMultiplier) {
        this.boardsMultiplier = boardsMultiplier;
    }

}