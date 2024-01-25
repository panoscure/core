
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.operations.sell.instant.by.range;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Amounts {

    @SerializedName("grossAmount")
    @Expose
    private Double grossAmount;
    @SerializedName("netAmount")
    @Expose
    private Double netAmount;
    @SerializedName("taxAmount")
    @Expose
    private Double taxAmount;

    public Double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(Double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

}
