package com.intralot.qa.automation.core.sports.book.apigatewayj.models.l5.sportbook.wagers.get;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("paymentStatus")
    @Expose
    private String paymentStatus;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}