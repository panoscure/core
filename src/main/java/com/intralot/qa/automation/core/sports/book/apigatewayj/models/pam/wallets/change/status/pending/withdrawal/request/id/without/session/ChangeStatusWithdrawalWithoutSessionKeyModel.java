package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.wallets.change.status.pending.withdrawal.request.id.without.session;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChangeStatusWithdrawalWithoutSessionKeyModel {
    @SerializedName("alreadyProcessed")
    @Expose
    private Boolean alreadyProcessed;
    @SerializedName("paymentTransaction")
    @Expose
    private PaymentTransaction paymentTransaction;

    public Boolean getAlreadyProcessed() {
        return alreadyProcessed;
    }

    public void setAlreadyProcessed(Boolean alreadyProcessed) {
        this.alreadyProcessed = alreadyProcessed;
    }

    public PaymentTransaction getPaymentTransaction() {
        return paymentTransaction;
    }

    public void setPaymentTransaction(PaymentTransaction paymentTransaction) {
        this.paymentTransaction = paymentTransaction;
    }
}
