package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.validate.a.wager.v3;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
    @SerializedName("firstDrawTime")
    @Expose
    private String firstDrawTime;
    @SerializedName("lastDrawTime")
    @Expose
    private String lastDrawTime;

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

    public String getFirstDrawTime() {
        return firstDrawTime;
    }

    public void setFirstDrawTime(String firstDrawTime) {
        this.firstDrawTime = firstDrawTime;
    }

    public String getLastDrawTime() {
        return lastDrawTime;
    }

    public void setLastDrawTime(String lastDrawTime) {
        this.lastDrawTime = lastDrawTime;
    }

}