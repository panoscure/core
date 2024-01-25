
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class AddOnDbg {
    @SerializedName("columns")
    @Expose
    private Integer columns;
    @SerializedName("cost")
    @Expose
    private Integer cost;
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

    public AddOnDbg withColumns(Integer columns) {
        this.columns = columns;
        return this;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public AddOnDbg withCost(Integer cost) {
        this.cost = cost;
        return this;
    }

    public Integer getGameTypeId() {
        return gameTypeId;
    }

    public void setGameTypeId(Integer gameTypeId) {
        this.gameTypeId = gameTypeId;
    }

    public AddOnDbg withGameTypeId(Integer gameTypeId) {
        this.gameTypeId = gameTypeId;
        return this;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public AddOnDbg withDiscount(Integer discount) {
        this.discount = discount;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("columns", columns).append("cost", cost).append("gameTypeId", gameTypeId).append("discount", discount).toString();
    }
}
