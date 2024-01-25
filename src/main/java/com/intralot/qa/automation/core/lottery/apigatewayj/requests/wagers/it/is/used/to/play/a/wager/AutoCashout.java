
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

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

    public AutoCashout withAscOdds(Integer ascOdds) {
        this.ascOdds = ascOdds;
        return this;
    }

    public Integer getDescOdds() {
        return descOdds;
    }

    public void setDescOdds(Integer descOdds) {
        this.descOdds = descOdds;
    }

    public AutoCashout withDescOdds(Integer descOdds) {
        this.descOdds = descOdds;
        return this;
    }

    public Integer getStopLoss() {
        return stopLoss;
    }

    public void setStopLoss(Integer stopLoss) {
        this.stopLoss = stopLoss;
    }

    public AutoCashout withStopLoss(Integer stopLoss) {
        this.stopLoss = stopLoss;
        return this;
    }

    public Integer getStopWin() {
        return stopWin;
    }

    public void setStopWin(Integer stopWin) {
        this.stopWin = stopWin;
    }

    public AutoCashout withStopWin(Integer stopWin) {
        this.stopWin = stopWin;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ascOdds", ascOdds).append("descOdds", descOdds).append("stopLoss", stopLoss).append("stopWin", stopWin).toString();
    }

}
