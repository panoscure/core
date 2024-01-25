package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.wallets.withdraw;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WithdrawModel {
    @SerializedName("attributeValues")
    @Expose
    private List<AttributeValue> attributeValues = null;
    @SerializedName("awaitingKYC")
    @Expose
    private Boolean awaitingKYC;
    @SerializedName("balanceWithdrawalRequestId")
    @Expose
    private Integer balanceWithdrawalRequestId;
    @SerializedName("successed")
    @Expose
    private Boolean successed;
    @SerializedName("paymentKey")
    @Expose
    private String paymentKey;
    @SerializedName("returnURL")
    @Expose
    private String returnURL;
    @SerializedName("tokenKey")
    @Expose
    private String tokenKey;
    @SerializedName("verificationCode")
    @Expose
    private String verificationCode;
    @SerializedName("verificationToken")
    @Expose
    private String verificationToken;
    @SerializedName("verificationType")
    @Expose
    private String verificationType;

    public List<AttributeValue> getAttributeValues() {
        return attributeValues;
    }

    public void setAttributeValues(List<AttributeValue> attributeValues) {
        this.attributeValues = attributeValues;
    }

    public Boolean getAwaitingKYC() {
        return awaitingKYC;
    }

    public void setAwaitingKYC(Boolean awaitingKYC) {
        this.awaitingKYC = awaitingKYC;
    }

    public Integer getBalanceWithdrawalRequestId() {
        return balanceWithdrawalRequestId;
    }

    public void setBalanceWithdrawalRequestId(Integer balanceWithdrawalRequestId) {
        this.balanceWithdrawalRequestId = balanceWithdrawalRequestId;
    }

    public Boolean getSuccessed() {
        return successed;
    }

    public void setSuccessed(Boolean successed) {
        this.successed = successed;
    }

    public String getPaymentKey() {
        return paymentKey;
    }

    public void setPaymentKey(String paymentKey) {
        this.paymentKey = paymentKey;
    }

    public String getReturnURL() {
        return returnURL;
    }

    public void setReturnURL(String returnURL) {
        this.returnURL = returnURL;
    }

    public String getTokenKey() {
        return tokenKey;
    }

    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getVerificationToken() {
        return verificationToken;
    }

    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }

    public String getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(String verificationType) {
        this.verificationType = verificationType;
    }
}
