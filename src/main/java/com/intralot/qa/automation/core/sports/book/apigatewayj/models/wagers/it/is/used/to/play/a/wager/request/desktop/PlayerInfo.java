
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.desktop;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;


public class PlayerInfo implements Serializable
{

    @SerializedName("playerId")
    @Expose
    private String playerId;
    @SerializedName("sessionToken")
    @Expose
    private String sessionToken;

    public PlayerInfo() {
    }

    public PlayerInfo(String playerId, String sessionToken) {
        super();
        this.playerId = playerId;
        this.sessionToken = sessionToken;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("playerId", playerId).append("sessionToken", sessionToken).toString();
    }

}
