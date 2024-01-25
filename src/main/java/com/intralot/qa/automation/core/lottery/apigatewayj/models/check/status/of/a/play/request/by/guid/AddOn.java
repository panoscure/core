
package com.intralot.qa.automation.core.lottery.apigatewayj.models.check.status.of.a.play.request.by.guid;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddOn {

    @SerializedName("columns")
    @Expose
    private Integer columns;
    @SerializedName("cost")
    @Expose
    private Double cost;
    @SerializedName("gameTypeId")
    @Expose
    private Integer gameTypeId;

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getGameTypeId() {
        return gameTypeId;
    }

    public void setGameTypeId(Integer gameTypeId) {
        this.gameTypeId = gameTypeId;
    }

}
