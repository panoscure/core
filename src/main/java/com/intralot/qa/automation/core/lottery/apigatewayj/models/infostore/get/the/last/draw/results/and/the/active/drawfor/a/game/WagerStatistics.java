package com.intralot.qa.automation.core.lottery.apigatewayj.models.infostore.get.the.last.draw.results.and.the.active.drawfor.a.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WagerStatistics {

    @SerializedName("columns")
    @Expose
    private Integer columns;
    @SerializedName("wagers")
    @Expose
    private Integer wagers;
    @SerializedName("addOn")
    @Expose
    private List<AddOn_> addOn = null;

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

    public List<AddOn_> getAddOn() {
        return addOn;
    }

    public void setAddOn(List<AddOn_> addOn) {
        this.addOn = addOn;
    }

}