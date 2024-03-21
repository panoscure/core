
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
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
    private BigDecimal tax;
    @SerializedName("freeBet")
    @Expose
    private double freeBet;

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

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public double getFreeBet() {
        return freeBet;
    }

    public void setFreeBet(double freeBet) {
        this.freeBet = freeBet;
    }

}
