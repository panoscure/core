package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.returns.the.active.record.forthe.specific.game;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PayTaxation {

    @SerializedName("operatorId")
    @Expose
    private Integer operatorId;
    @SerializedName("channelId")
    @Expose
    private Integer channelId;
    @SerializedName("checkPayTaxation")
    @Expose
    private Integer checkPayTaxation;
    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("limits")
    @Expose
    private List<Limit> limits = null;

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

    public Integer getCheckPayTaxation() {
        return checkPayTaxation;
    }

    public void setCheckPayTaxation(Integer checkPayTaxation) {
        this.checkPayTaxation = checkPayTaxation;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Limit> getLimits() {
        return limits;
    }

    public void setLimits(List<Limit> limits) {
        this.limits = limits;
    }

}
