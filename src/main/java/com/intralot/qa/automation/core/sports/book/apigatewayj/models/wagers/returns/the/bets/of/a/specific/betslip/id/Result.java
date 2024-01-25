package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.returns.the.bets.of.a.specific.betslip.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("paymentStatus")
    @Expose
    private String paymentStatus;
    @SerializedName("paidTime")
    @Expose
    private long paidTime;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Result withType(String type) {
        this.type = type;
        return this;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public long getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(long paidTime) {
        this.paidTime = paidTime;
    }
}