
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.games.ticket.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TotalAmounts {

    @SerializedName("grossAmount")
    @Expose
    private Integer grossAmount;
    @SerializedName("netAmount")
    @Expose
    private Integer netAmount;
    @SerializedName("taxAmount")
    @Expose
    private Integer taxAmount;

    public Integer getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(Integer grossAmount) {
        this.grossAmount = grossAmount;
    }

    public Integer getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Integer netAmount) {
        this.netAmount = netAmount;
    }

    public Integer getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Integer taxAmount) {
        this.taxAmount = taxAmount;
    }

}
