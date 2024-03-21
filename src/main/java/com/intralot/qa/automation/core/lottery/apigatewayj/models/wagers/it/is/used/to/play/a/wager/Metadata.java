
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.it.is.used.to.play.a.wager;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata {

    @SerializedName("playerInfo")
    @Expose
    private PlayerInfo playerInfo;
    @SerializedName("posInfo")
    @Expose
    private PosInfo posInfo;
    @SerializedName("channel")
    @Expose
    private Integer channel;
    @SerializedName("wagerId")
    @Expose
    private BigInteger wagerId;
    @SerializedName("operator")
    @Expose
    private Integer operator;
    @SerializedName("preprinted")
    @Expose
    private Boolean preprinted = null;
    @SerializedName("wagerCodes")
    @Expose
    private List<String> wagerCodes = null;
    @SerializedName("trnsTime")
    @Expose
    private String trnsTime;

    public PlayerInfo getPlayerInfo() {
        return playerInfo;
    }

    public void setPlayerInfo(PlayerInfo playerInfo) {
        this.playerInfo = playerInfo;
    }

    public PosInfo getPosInfo() {
        return posInfo;
    }

    public void setPosInfo(PosInfo posInfo) {
        this.posInfo = posInfo;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public BigInteger getWagerId() {
        return wagerId;
    }

    public void setWagerId(BigInteger wagerId) {
        this.wagerId = wagerId;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public Boolean getPreprinted() {
        return preprinted;
    }

    public void setPreprinted(Boolean preprinted) {
        this.preprinted = preprinted;
    }

    public List<String> getWagerCodes() {
        return wagerCodes;
    }

    public void setWagerCodes(List<String> wagerCodes) {
        this.wagerCodes = wagerCodes;
    }

    public String getTrnsTime() {
        return trnsTime;
    }

    public void setTrnsTime(String trnsTime) {
        this.trnsTime = trnsTime;
    }
}
