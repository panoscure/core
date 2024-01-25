package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.pam.payments.options;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Instrument {
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("paymentId")
    @Expose
    private String paymentId;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}