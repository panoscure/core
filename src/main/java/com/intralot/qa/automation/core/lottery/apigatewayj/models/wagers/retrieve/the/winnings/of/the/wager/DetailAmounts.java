
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.retrieve.the.winnings.of.the.wager;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailAmounts {

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
    private double tax;
    @SerializedName("freeBet")
    @Expose
    private double freeBet;

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

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getFreeBet() {
        return freeBet;
    }

    public void setFreeBet(double freeBet) {
        this.freeBet = freeBet;
    }

}
