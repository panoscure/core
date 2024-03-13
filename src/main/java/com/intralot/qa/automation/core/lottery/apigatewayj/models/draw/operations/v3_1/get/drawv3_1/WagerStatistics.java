
package com.intralot.qa.automation.core.lottery.apigatewayj.models.draw.operations.v3_1.get.drawv3_1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WagerStatistics {

    @SerializedName("columns")
    @Expose
    private Integer columns;
    @SerializedName("wagers")
    @Expose
    private Integer wagers;
    @SerializedName("totalSales")
    @Expose
    private Double totalSales;
    @SerializedName("addOn")
    @Expose
    private List<Object> addOn = null;

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

    public Double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }

    public List<Object> getAddOn() {
        return addOn;
    }

    public void setAddOn(List<Object> addOn) {
        this.addOn = addOn;
    }

}
