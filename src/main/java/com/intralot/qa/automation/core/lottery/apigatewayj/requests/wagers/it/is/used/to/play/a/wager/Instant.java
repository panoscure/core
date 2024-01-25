
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet.Wager_;
import org.apache.commons.lang3.builder.ToStringBuilder;

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

    public Instant withCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Instant withGameId(Integer gameId) {
        this.gameId = gameId;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Instant withType(String type) {
        this.type = type;
        return this;
    }

    public List<Wager_> getWager() {
        return wager;
    }

    public void setWager(List<Wager_> wager) {
        this.wager = wager;
    }

    public Instant withWager(List<Wager_> wager) {
        this.wager = wager;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("creationTime", creationTime).append("gameId", gameId).append("type", type).append("wager", wager).toString();
    }

}
