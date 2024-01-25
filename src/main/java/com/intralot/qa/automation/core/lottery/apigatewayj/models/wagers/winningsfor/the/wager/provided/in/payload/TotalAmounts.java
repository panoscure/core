
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.winningsfor.the.wager.provided.in.payload;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TotalAmounts {

    @SerializedName("gross")
    @Expose
    private Double gross;
    @SerializedName("net")
    @Expose
    private Double net;
    @SerializedName("other")
    @Expose
    private Double other;
    @SerializedName("refund")
    @Expose
    private Double refund;
    @SerializedName("tax")
    @Expose
    private Double tax;

    public Double getGross() {
        return gross;
    }

    public void setGross(Double gross) {
        this.gross = gross;
    }

    public Double getNet() {
        return net;
    }

    public void setNet(Double net) {
        this.net = net;
    }

    public Double getOther() {
        return other;
    }

    public void setOther(Double other) {
        this.other = other;
    }

    public Double getRefund() {
        return refund;
    }

    public void setRefund(Double refund) {
        this.refund = refund;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

}
