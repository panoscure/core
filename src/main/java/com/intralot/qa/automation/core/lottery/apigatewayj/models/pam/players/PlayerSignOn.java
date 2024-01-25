package com.intralot.qa.automation.core.lottery.apigatewayj.models.pam.players;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerSignOn {

    @SerializedName("playerId")
    @Expose
    private Integer playerId;
    @SerializedName("sessionToken")
    @Expose
    private String sessionToken;
    @SerializedName("channelId")
    @Expose
    private Integer channelId;

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }
}