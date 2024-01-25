
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.desktop;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;


public class Metadata implements Serializable {

    @SerializedName("trnsTime")
    @Expose
    private String trnsTime;
    @SerializedName("playerInfo")
    @Expose
    private PlayerInfo playerInfo;

    public Metadata() {
        playerInfo = new PlayerInfo();
        trnsTime = LocalDateTime.now().toString();
    }

    public Metadata(String trnsTime, PlayerInfo playerInfo) {
        super();
        this.trnsTime = trnsTime;
        this.playerInfo = playerInfo;
    }

    public String getTrnsTime() {
        return trnsTime;
    }

    public void setTrnsTime(String trnsTime) {
        this.trnsTime = trnsTime;
    }

    public PlayerInfo getPlayerInfo() {
        return playerInfo;
    }

    public void setPlayerInfo(PlayerInfo playerInfo) {
        this.playerInfo = playerInfo;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("trnsTime", trnsTime).append("playerInfo", playerInfo).toString();
    }

}
