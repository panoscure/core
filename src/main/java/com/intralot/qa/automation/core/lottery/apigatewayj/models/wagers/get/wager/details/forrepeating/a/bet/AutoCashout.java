
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AutoCashout {

    @SerializedName("ascOdds")
    @Expose
    private Integer ascOdds;
    @SerializedName("descOdds")
    @Expose
    private Integer descOdds;
    @SerializedName("stopLoss")
    @Expose
    private Integer stopLoss;
    @SerializedName("stopWin")
    @Expose
    private Integer stopWin;

    public Integer getAscOdds() {
        return ascOdds;
    }

    public void setAscOdds(Integer ascOdds) {
        this.ascOdds = ascOdds;
    }

    public Integer getDescOdds() {
        return descOdds;
    }

    public void setDescOdds(Integer descOdds) {
        this.descOdds = descOdds;
    }

    public Integer getStopLoss() {
        return stopLoss;
    }

    public void setStopLoss(Integer stopLoss) {
        this.stopLoss = stopLoss;
    }

    public Integer getStopWin() {
        return stopWin;
    }

    public void setStopWin(Integer stopWin) {
        this.stopWin = stopWin;
    }

}
