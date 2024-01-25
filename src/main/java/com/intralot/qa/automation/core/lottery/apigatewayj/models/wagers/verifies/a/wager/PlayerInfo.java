package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.verifies.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerInfo {

    @SerializedName("playerId")
    @Expose
    private Integer playerId;


    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

}
