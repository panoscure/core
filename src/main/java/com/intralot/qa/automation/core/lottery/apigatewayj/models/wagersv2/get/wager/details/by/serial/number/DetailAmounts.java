package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagersv2.get.wager.details.by.serial.number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class DetailAmounts {

    @SerializedName("gross")
    @Expose
    private BigDecimal gross;
    @SerializedName("net")
    @Expose
    private BigDecimal net;
    @SerializedName("other")
    @Expose
    private BigDecimal other;
    @SerializedName("refund")
    @Expose
    private BigDecimal refund;
    @SerializedName("tax")
    @Expose
    private BigDecimal tax;
    @SerializedName("freeBet")
    @Expose
    private BigDecimal freeBet;

    public BigDecimal getGross() {
        return gross;
    }

    public void setGross(BigDecimal gross) {
        this.gross = gross;
    }

    public BigDecimal getNet() {
        return net;
    }

    public void setNet(BigDecimal net) {
        this.net = net;
    }

    public BigDecimal getOther() {
        return other;
    }

    public void setOther(BigDecimal other) {
        this.other = other;
    }

    public BigDecimal getRefund() {
        return refund;
    }

    public void setRefund(BigDecimal refund) {
        this.refund = refund;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getFreeBet() {
        return freeBet;
    }

    public void setFreeBet(BigDecimal freeBet) {
        this.freeBet = freeBet;
    }

}