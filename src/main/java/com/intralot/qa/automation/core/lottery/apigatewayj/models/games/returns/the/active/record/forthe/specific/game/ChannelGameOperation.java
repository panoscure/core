package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.returns.the.active.record.forthe.specific.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChannelGameOperation {

    @SerializedName("operatorId")
    @Expose
    private Integer operatorId;
    @SerializedName("channelId")
    @Expose
    private Integer channelId;
    @SerializedName("payCompleteDraws")
    @Expose
    private Boolean payCompleteDraws;
    @SerializedName("exchange")
    @Expose
    private Boolean exchange;
    @SerializedName("repeat")
    @Expose
    private String repeat;
    @SerializedName("checkType")
    @Expose
    private Integer checkType;
    @SerializedName("allowCancelOnlyInPlayDraw")
    @Expose
    private Boolean allowCancelOnlyInPlayDraw;

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Boolean getPayCompleteDraws() {
        return payCompleteDraws;
    }

    public void setPayCompleteDraws(Boolean payCompleteDraws) {
        this.payCompleteDraws = payCompleteDraws;
    }

    public Boolean getExchange() {
        return exchange;
    }

    public void setExchange(Boolean exchange) {
        this.exchange = exchange;
    }

    public String getRepeat() {
        return repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    public Integer getCheckType() {
        return checkType;
    }

    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }

    public Boolean getAllowCancelOnlyInPlayDraw() {
        return allowCancelOnlyInPlayDraw;
    }

    public void setAllowCancelOnlyInPlayDraw(Boolean allowCancelOnlyInPlayDraw) {
        this.allowCancelOnlyInPlayDraw = allowCancelOnlyInPlayDraw;
    }

}
