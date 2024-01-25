package com.intralot.qa.automation.core.lottery.apigatewayj.models.infostore.get.draw;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddOn_ {

    @SerializedName("columns")
    @Expose
    private Integer columns;
    @SerializedName("wagers")
    @Expose
    private Integer wagers;
    @SerializedName("gameType")
    @Expose
    private String gameType;

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public Integer getWagers() {
        return wagers;
    }

    public void setWagers(Integer wagers) {
        this.wagers = wagers;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

}