package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.pam.payments.options;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PaymentOptionsModel {
    @SerializedName("accountId")
    @Expose
    private Integer accountId;
    @SerializedName("paymentOptions")
    @Expose
    private List<PaymentOption> paymentOptions = null;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public List<PaymentOption> getPaymentOptions() {
        return paymentOptions;
    }

    public void setPaymentOptions(List<PaymentOption> paymentOptions) {
        this.paymentOptions = paymentOptions;
    }

}