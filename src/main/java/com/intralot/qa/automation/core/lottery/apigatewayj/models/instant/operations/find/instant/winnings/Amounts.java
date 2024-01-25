
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.operations.find.instant.winnings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Amounts {

    @SerializedName("grossAmount")
    @Expose
    private Double grossAmount;
    @SerializedName("netAmount")
    @Expose
    private Double netAmount;
    @SerializedName("refAmount")
    @Expose
    private Integer refAmount;
    @SerializedName("taxAmount")
    @Expose
    private Double taxAmount;
    @SerializedName("bonusAmount")
    @Expose
    private Integer bonusAmount;

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

    public Integer getRefAmount() {
        return refAmount;
    }

    public void setRefAmount(Integer refAmount) {
        this.refAmount = refAmount;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Integer getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(Integer bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

}
