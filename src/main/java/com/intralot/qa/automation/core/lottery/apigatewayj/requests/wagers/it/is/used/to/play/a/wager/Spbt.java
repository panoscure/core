
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Spbt {

    @SerializedName("gameId")
    @Expose
    private Integer gameId;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Spbt withGameId(Integer gameId) {
        this.gameId = gameId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("gameId", gameId).toString();
    }

}
