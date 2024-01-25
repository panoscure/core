package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.retrieve.A.Voucher.Gift.Promotion.By.Serial.Number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class WinDetails {

    @SerializedName("grossAmount")
    @Expose
    private BigDecimal grossAmount;
    @SerializedName("netAmount")
    @Expose
    private BigDecimal netAmount;
    @SerializedName("taxAmount")
    @Expose
    private BigDecimal taxAmount;
    @SerializedName("paymentStatus")
    @Expose
    private String paymentStatus;

    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(BigDecimal grossAmount) {
        this.grossAmount = grossAmount;
    }

    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

}
