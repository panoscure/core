
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.winningsfor.the.wager.provided.in.payload;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryAmounts {

    @SerializedName("gross")
    @Expose
    private Double gross;
    @SerializedName("net")
    @Expose
    private Double net;
    @SerializedName("other")
    @Expose
    private Integer other;
    @SerializedName("refund")
    @Expose
    private Integer refund;
    @SerializedName("tax")
    @Expose
    private Double tax;
    @SerializedName("freeBet")
    @Expose
    private Double freeBet;

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

    public Integer getOther() {
        return other;
    }

    public void setOther(Integer other) {
        this.other = other;
    }

    public Integer getRefund() {
        return refund;
    }

    public void setRefund(Integer refund) {
        this.refund = refund;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getFreeBet() {
        return freeBet;
    }

    public void setFreeBet(Double freeBet) {
        this.freeBet = freeBet;
    }
}
