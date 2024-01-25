
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChannelGameOperation {

    @SerializedName("operatorId")
    @Expose
    private Long operatorId;
    @SerializedName("channelId")
    @Expose
    private Long channelId;
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
    private Long checkType;
    @SerializedName("allowCancelOnlyInPlayDraw")
    @Expose
    private Boolean allowCancelOnlyInPlayDraw;

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
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

    public Long getCheckType() {
        return checkType;
    }

    public void setCheckType(Long checkType) {
        this.checkType = checkType;
    }

    public Boolean getAllowCancelOnlyInPlayDraw() {
        return allowCancelOnlyInPlayDraw;
    }

    public void setAllowCancelOnlyInPlayDraw(Boolean allowCancelOnlyInPlayDraw) {
        this.allowCancelOnlyInPlayDraw = allowCancelOnlyInPlayDraw;
    }

}
