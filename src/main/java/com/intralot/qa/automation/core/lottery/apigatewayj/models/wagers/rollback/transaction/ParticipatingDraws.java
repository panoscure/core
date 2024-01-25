
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.rollback.transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ParticipatingDraws {

    @SerializedName("draws")
    @Expose
    private List<Integer> draws = null;
    @SerializedName("firstDraw")
    @Expose
    private Integer firstDraw;
    @SerializedName("lastDraw")
    @Expose
    private Integer lastDraw;
    @SerializedName("multipleDraws")
    @Expose
    private Integer multipleDraws;
    @SerializedName("playedDraw")
    @Expose
    private Integer playedDraw;

    public List<Integer> getDraws() {
        return draws;
    }

    public void setDraws(List<Integer> draws) {
        this.draws = draws;
    }

    public Integer getFirstDraw() {
        return firstDraw;
    }

    public void setFirstDraw(Integer firstDraw) {
        this.firstDraw = firstDraw;
    }

    public Integer getLastDraw() {
        return lastDraw;
    }

    public void setLastDraw(Integer lastDraw) {
        this.lastDraw = lastDraw;
    }

    public Integer getMultipleDraws() {
        return multipleDraws;
    }

    public void setMultipleDraws(Integer multipleDraws) {
        this.multipleDraws = multipleDraws;
    }

    public Integer getPlayedDraw() {
        return playedDraw;
    }

    public void setPlayedDraw(Integer playedDraw) {
        this.playedDraw = playedDraw;
    }

}
