
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.multiple.wagers.details;

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
    @SerializedName("firstDrawTime")
    @Expose
    private String firstDrawTime;
    @SerializedName("firstVisualDraw")
    @Expose
    private Integer firstVisualDraw;
    @SerializedName("lastDraw")
    @Expose
    private Integer lastDraw;
    @SerializedName("lastDrawTime")
    @Expose
    private String lastDrawTime;
    @SerializedName("lastVisualDraw")
    @Expose
    private Integer lastVisualDraw;
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

    public String getFirstDrawTime() {
        return firstDrawTime;
    }

    public void setFirstDrawTime(String firstDrawTime) {
        this.firstDrawTime = firstDrawTime;
    }

    public Integer getFirstVisualDraw() {
        return firstVisualDraw;
    }

    public void setFirstVisualDraw(Integer firstVisualDraw) {
        this.firstVisualDraw = firstVisualDraw;
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

    public Integer getLastVisualDraw() {
        return lastVisualDraw;
    }

    public void setLastVisualDraw(Integer lastVisualDraw) {
        this.lastVisualDraw = lastVisualDraw;
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
