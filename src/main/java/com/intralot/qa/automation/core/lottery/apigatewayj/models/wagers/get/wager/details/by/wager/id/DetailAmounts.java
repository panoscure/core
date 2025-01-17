
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailAmounts {

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
    private BigDecimal tax;
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

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public Double getFreeBet() {
        return freeBet;
    }

    public void setFreeBet(Double freeBet) {
        this.freeBet = freeBet;
    }

}
