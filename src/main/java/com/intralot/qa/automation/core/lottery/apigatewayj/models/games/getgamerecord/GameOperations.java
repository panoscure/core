
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GameOperations {

    @SerializedName("noAutoPay")
    @Expose
    private Boolean noAutoPay;
    @SerializedName("pilot")
    @Expose
    private Boolean pilot;
    @SerializedName("riskMgt")
    @Expose
    private Boolean riskMgt;

    public Boolean getNoAutoPay() {
        return noAutoPay;
    }

    public void setNoAutoPay(Boolean noAutoPay) {
        this.noAutoPay = noAutoPay;
    }

    public Boolean getPilot() {
        return pilot;
    }

    public void setPilot(Boolean pilot) {
        this.pilot = pilot;
    }

    public Boolean getRiskMgt() {
        return riskMgt;
    }

    public void setRiskMgt(Boolean riskMgt) {
        this.riskMgt = riskMgt;
    }

}
