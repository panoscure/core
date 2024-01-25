
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PayTaxation {

    @SerializedName("operatorId")
    @Expose
    private Long operatorId;
    @SerializedName("channelId")
    @Expose
    private Long channelId;
    @SerializedName("checkPayTaxation")
    @Expose
    private Long checkPayTaxation;
    @SerializedName("level")
    @Expose
    private Long level;
    @SerializedName("type")
    @Expose
    private Long type;
    @SerializedName("limits")
    @Expose
    private List<Limit> limits = null;

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

    public Long getCheckPayTaxation() {
        return checkPayTaxation;
    }

    public void setCheckPayTaxation(Long checkPayTaxation) {
        this.checkPayTaxation = checkPayTaxation;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public List<Limit> getLimits() {
        return limits;
    }

    public void setLimits(List<Limit> limits) {
        this.limits = limits;
    }

}
