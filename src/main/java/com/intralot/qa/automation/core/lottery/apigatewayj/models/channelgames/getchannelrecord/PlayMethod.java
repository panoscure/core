
package com.intralot.qa.automation.core.lottery.apigatewayj.models.channelgames.getchannelrecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayMethod {

    @SerializedName("betslip")
    @Expose
    private Long betslip;
    @SerializedName("verbal")
    @Expose
    private Long verbal;
    @SerializedName("QRC")
    @Expose
    private Long qRC;

    public Long getBetslip() {
        return betslip;
    }

    public void setBetslip(Long betslip) {
        this.betslip = betslip;
    }

    public Long getVerbal() {
        return verbal;
    }

    public void setVerbal(Long verbal) {
        this.verbal = verbal;
    }

    public Long getQRC() {
        return qRC;
    }

    public void setQRC(Long qRC) {
        this.qRC = qRC;
    }

}
