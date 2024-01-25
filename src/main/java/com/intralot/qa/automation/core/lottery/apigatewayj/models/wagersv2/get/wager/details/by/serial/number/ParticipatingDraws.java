package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagersv2.get.wager.details.by.serial.number;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParticipatingDraws {

    @SerializedName("draws")
    @Expose
    private List<Integer> draws;
    @SerializedName("firstDraw")
    @Expose
    private Integer firstDraw;
    @SerializedName("firstDrawTime")
    @Expose
    private String firstDrawTime;
    @SerializedName("lastDraw")
    @Expose
    private Integer lastDraw;
    @SerializedName("lastDrawTime")
    @Expose
    private String lastDrawTime;
    @SerializedName("multipleDraws")
    @Expose
    private Integer multipleDraws;

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

    public String getFirstDrawTime() {
        return firstDrawTime;
    }

    public void setFirstDrawTime(String firstDrawTime) {
        this.firstDrawTime = firstDrawTime;
    }

    public Integer getLastDraw() {
        return lastDraw;
    }

    public void setLastDraw(Integer lastDraw) {
        this.lastDraw = lastDraw;
    }

    public String getLastDrawTime() {
        return lastDrawTime;
    }

    public void setLastDrawTime(String lastDrawTime) {
        this.lastDrawTime = lastDrawTime;
    }

    public Integer getMultipleDraws() {
        return multipleDraws;
    }

    public void setMultipleDraws(Integer multipleDraws) {
        this.multipleDraws = multipleDraws;
    }

}
