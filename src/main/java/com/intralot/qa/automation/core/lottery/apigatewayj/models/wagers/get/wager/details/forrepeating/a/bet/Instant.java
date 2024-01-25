
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Instant {

    @SerializedName("creationTime")
    @Expose
    private String creationTime;
    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("wager")
    @Expose
    private List<Wager_> wager = null;

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Wager_> getWager() {
        return wager;
    }

    public void setWager(List<Wager_> wager) {
        this.wager = wager;
    }

}
