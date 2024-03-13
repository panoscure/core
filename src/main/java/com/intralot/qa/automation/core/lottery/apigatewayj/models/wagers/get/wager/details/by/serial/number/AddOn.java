
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.serial.number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddOn {

    @SerializedName("columns")
    @Expose
    private Integer columns;
    @SerializedName("cost")
    @Expose
    private double cost;
    @SerializedName("gameTypeId")
    @Expose
    private Integer gameTypeId;
    @SerializedName("discount")
    @Expose
    private Integer discount;

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Integer getGameTypeId() {
        return gameTypeId;
    }

    public void setGameTypeId(Integer gameTypeId) {
        this.gameTypeId = gameTypeId;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
}
