
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Metadata {

    @SerializedName("playerInfo")
    @Expose
    private PlayerInfo playerInfo;
    @SerializedName("promotionInfo")
    @Expose
    private PromotionInfo promotionInfo;
    @SerializedName("trnsTime")
    @Expose
    private String trnsTime;
    @SerializedName("posInfo")
    @Expose
    private PosInfo posInfo;
    @SerializedName("channel")
    @Expose
    private Integer channel;
    @SerializedName("wagerId")
    @Expose
    private Integer wagerId;
    @SerializedName("operator")
    @Expose
    private Integer operator;
    @SerializedName("participationMethod")
    @Expose
    private String participationMethod;
    @SerializedName("crId")
    @Expose
    private Integer crId;
    @SerializedName("preprinted")
    @Expose
    private Boolean preprinted;
    @SerializedName("options")
    @Expose
    private Options options;

    public PlayerInfo getPlayerInfo() {
        return playerInfo;
    }

    public void setPlayerInfo(PlayerInfo playerInfo) {
        this.playerInfo = playerInfo;
    }

    public Metadata withPlayerInfo(PlayerInfo playerInfo) {
        this.playerInfo = playerInfo;
        return this;
    }

    public PromotionInfo getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(PromotionInfo promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public Metadata withPromotionInfo(PromotionInfo promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }

    public String getTrnsTime() {
        return trnsTime;
    }

    public void setTrnsTime(String trnsTime) {
        this.trnsTime = trnsTime;
    }

    public Metadata withTrnsTime(String trnsTime) {
        this.trnsTime = trnsTime;
        return this;
    }

    public PosInfo getPosInfo() {
        return posInfo;
    }

    public void setPosInfo(PosInfo posInfo) {
        this.posInfo = posInfo;
    }

    public Metadata withPosInfo(PosInfo posInfo) {
        this.posInfo = posInfo;
        return this;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Metadata withChannel(Integer channel) {
        this.channel = channel;
        return this;
    }

    public Integer getWagerId() {
        return wagerId;
    }

    public void setWagerId(Integer wagerId) {
        this.wagerId = wagerId;
    }

    public Metadata withWagerId(Integer wagerId) {
        this.wagerId = wagerId;
        return this;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public Metadata withOperator(Integer operator) {
        this.operator = operator;
        return this;
    }

    public String getParticipationMethod() {
        return participationMethod;
    }

    public void setParticipationMethod(String participationMethod) {
        this.participationMethod = participationMethod;
    }

    public Metadata withParticipationMethod(String participationMethod) {
        this.participationMethod = participationMethod;
        return this;
    }

    public Integer getCrId() {
        return crId;
    }

    public void setCrId(Integer crId) {
        this.crId = crId;
    }

    public Metadata withCrId(Integer crId) {
        this.crId = crId;
        return this;
    }

    public Boolean getPreprinted() {
        return preprinted;
    }

    public void setPreprinted(Boolean preprinted) {
        this.preprinted = preprinted;
    }

    public Metadata withPreprinted(Boolean preprinted) {
        this.preprinted = preprinted;
        return this;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public Metadata withOptions(Options options) {
        this.options = options;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("playerInfo", playerInfo).append("promotionInfo", promotionInfo).append("trnsTime", trnsTime).append("posInfo", posInfo).append("channel", channel).append("wagerId", wagerId).append("operator", operator).append("participationMethod", participationMethod).append("crId", crId).append("preprinted", preprinted).append("options", options).toString();
    }

}
