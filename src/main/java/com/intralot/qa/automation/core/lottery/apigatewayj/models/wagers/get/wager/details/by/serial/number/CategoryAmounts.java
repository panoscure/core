
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.serial.number;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryAmounts {

    @SerializedName("gross")
    @Expose
    private double gross;
    @SerializedName("net")
    @Expose
    private double net;
    @SerializedName("other")
    @Expose
    private Integer other;
    @SerializedName("refund")
    @Expose
    private Integer refund;
    @SerializedName("tax")
    @Expose
    private BigDecimal tax;

    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    public double getNet() {
        return net;
    }

    public void setNet(double net) {
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

}
