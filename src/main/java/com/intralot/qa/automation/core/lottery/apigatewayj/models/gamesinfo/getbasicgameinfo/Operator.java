
package com.intralot.qa.automation.core.lottery.apigatewayj.models.gamesinfo.getbasicgameinfo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Operator {

    @SerializedName("operatorId")
    @Expose
    private Long operatorId;
    @SerializedName("operatorChannels")
    @Expose
    private List<Long> operatorChannels = null;
    @SerializedName("sideBets")
    @Expose
    private List<SideBet> sideBets = null;

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public List<Long> getOperatorChannels() {
        return operatorChannels;
    }

    public void setOperatorChannels(List<Long> operatorChannels) {
        this.operatorChannels = operatorChannels;
    }

    public List<SideBet> getSideBets() {
        return sideBets;
    }

    public void setSideBets(List<SideBet> sideBets) {
        this.sideBets = sideBets;
    }

}
