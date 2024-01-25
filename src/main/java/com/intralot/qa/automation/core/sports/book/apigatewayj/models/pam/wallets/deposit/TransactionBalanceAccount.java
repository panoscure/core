package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.wallets.deposit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TransactionBalanceAccount {
    @SerializedName("accountReference")
    @Expose
    private String accountReference;
    @SerializedName("attributes")
    @Expose
    private List<Attribute> attributes = null;
    @SerializedName("balanceAccountId")
    @Expose
    private Integer balanceAccountId;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("paymentGateway")
    @Expose
    private String paymentGateway;
    @SerializedName("paymentMethod")
    @Expose
    private String paymentMethod;
    @SerializedName("paymentMethodSub")
    @Expose
    private String paymentMethodSub;
    @SerializedName("token")
    @Expose
    private String token;

    public String getAccountReference() {
        return accountReference;
    }

    public void setAccountReference(String accountReference) {
        this.accountReference = accountReference;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Integer getBalanceAccountId() {
        return balanceAccountId;
    }

    public void setBalanceAccountId(Integer balanceAccountId) {
        this.balanceAccountId = balanceAccountId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethodSub() {
        return paymentMethodSub;
    }

    public void setPaymentMethodSub(String paymentMethodSub) {
        this.paymentMethodSub = paymentMethodSub;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
