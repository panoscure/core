
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.terminal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Metadata implements Serializable {

    @SerializedName("trnsTime")
    @Expose
    private String trnsTime;
    private final static long serialVersionUID = 57056681470666885L;
    @SerializedName("posInfo")
    @Expose
    private PosInfo posInfo;
    @SerializedName("playerInfo")
    @Expose
    private PlayerInfo playerInfo;

    public Metadata() {
    }

    public Metadata(String trnsTime) {
        super();
        this.trnsTime = trnsTime;
    }

    public String getTrnsTime() {
        return trnsTime;
    }

    public void setTrnsTime(String trnsTime) {
        this.trnsTime = trnsTime;
    }


    public PosInfo getPosInfo() {
        return posInfo;
    }

    public void setPosInfo(PosInfo posInfo) {
        this.posInfo = posInfo;
    }


    public PlayerInfo getPlayerInfo() {
        return playerInfo;
    }

    public void setPlayerInfo(PlayerInfo playerInfo) {
        this.playerInfo = playerInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("trnsTime", trnsTime).append("posInfo", posInfo)
                .append("playerInfo", playerInfo).toString();
    }

}
