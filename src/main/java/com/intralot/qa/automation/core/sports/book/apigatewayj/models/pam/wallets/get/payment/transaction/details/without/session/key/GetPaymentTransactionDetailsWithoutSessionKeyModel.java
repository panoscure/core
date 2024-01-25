package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.wallets.get.payment.transaction.details.without.session.key;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetPaymentTransactionDetailsWithoutSessionKeyModel {
    @SerializedName("accountReference")
    @Expose
    private String accountReference;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("balanceAfter")
    @Expose
    private Integer balanceAfter;
    @SerializedName("balanceBonusAfter")
    @Expose
    private Integer balanceBonusAfter;
    @SerializedName("balanceHistoryID")
    @Expose
    private Integer balanceHistoryID;
    @SerializedName("balanceRealAfter")
    @Expose
    private Integer balanceRealAfter;
    @SerializedName("cancelWithdrawal")
    @Expose
    private Boolean cancelWithdrawal;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("currencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("currencyName")
    @Expose
    private String currencyName;
    @SerializedName("errorCode")
    @Expose
    private Integer errorCode;
    @SerializedName("errorMessage")
    @Expose
    private String errorMessage;
    @SerializedName("gatewayErrorCode")
    @Expose
    private String gatewayErrorCode;
    @SerializedName("gatewayErrorMessage")
    @Expose
    private String gatewayErrorMessage;
    @SerializedName("expired")
    @Expose
    private Boolean expired;
    @SerializedName("paymentAccountID")
    @Expose
    private Integer paymentAccountID;
    @SerializedName("paymentGatewayName")
    @Expose
    private String paymentGatewayName;
    @SerializedName("paymentGatewayTransactionKey")
    @Expose
    private String paymentGatewayTransactionKey;
    @SerializedName("paymentMethodName")
    @Expose
    private String paymentMethodName;
    @SerializedName("paymentMethodSubName")
    @Expose
    private String paymentMethodSubName;
    @SerializedName("serviceCharge")
    @Expose
    private Integer serviceCharge;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("transactionStatusName")
    @Expose
    private String transactionStatusName;
    @SerializedName("transactionTypeName")
    @Expose
    private String transactionTypeName;
    @SerializedName("uniqueTransactionID")
    @Expose
    private String uniqueTransactionID;

    public String getAccountReference() {
        return accountReference;
    }

    public void setAccountReference(String accountReference) {
        this.accountReference = accountReference;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getBalanceAfter() {
        return balanceAfter;
    }

    public void setBalanceAfter(Integer balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    public Integer getBalanceBonusAfter() {
        return balanceBonusAfter;
    }

    public void setBalanceBonusAfter(Integer balanceBonusAfter) {
        this.balanceBonusAfter = balanceBonusAfter;
    }

    public Integer getBalanceHistoryID() {
        return balanceHistoryID;
    }

    public void setBalanceHistoryID(Integer balanceHistoryID) {
        this.balanceHistoryID = balanceHistoryID;
    }

    public Integer getBalanceRealAfter() {
        return balanceRealAfter;
    }

    public void setBalanceRealAfter(Integer balanceRealAfter) {
        this.balanceRealAfter = balanceRealAfter;
    }

    public Boolean getCancelWithdrawal() {
        return cancelWithdrawal;
    }

    public void setCancelWithdrawal(Boolean cancelWithdrawal) {
        this.cancelWithdrawal = cancelWithdrawal;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getGatewayErrorCode() {
        return gatewayErrorCode;
    }

    public void setGatewayErrorCode(String gatewayErrorCode) {
        this.gatewayErrorCode = gatewayErrorCode;
    }

    public String getGatewayErrorMessage() {
        return gatewayErrorMessage;
    }

    public void setGatewayErrorMessage(String gatewayErrorMessage) {
        this.gatewayErrorMessage = gatewayErrorMessage;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public Integer getPaymentAccountID() {
        return paymentAccountID;
    }

    public void setPaymentAccountID(Integer paymentAccountID) {
        this.paymentAccountID = paymentAccountID;
    }

    public String getPaymentGatewayName() {
        return paymentGatewayName;
    }

    public void setPaymentGatewayName(String paymentGatewayName) {
        this.paymentGatewayName = paymentGatewayName;
    }

    public String getPaymentGatewayTransactionKey() {
        return paymentGatewayTransactionKey;
    }

    public void setPaymentGatewayTransactionKey(String paymentGatewayTransactionKey) {
        this.paymentGatewayTransactionKey = paymentGatewayTransactionKey;
    }

    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    public void setPaymentMethodName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName;
    }

    public String getPaymentMethodSubName() {
        return paymentMethodSubName;
    }

    public void setPaymentMethodSubName(String paymentMethodSubName) {
        this.paymentMethodSubName = paymentMethodSubName;
    }

    public Integer getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Integer serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTransactionStatusName() {
        return transactionStatusName;
    }

    public void setTransactionStatusName(String transactionStatusName) {
        this.transactionStatusName = transactionStatusName;
    }

    public String getTransactionTypeName() {
        return transactionTypeName;
    }

    public void setTransactionTypeName(String transactionTypeName) {
        this.transactionTypeName = transactionTypeName;
    }

    public String getUniqueTransactionID() {
        return uniqueTransactionID;
    }

    public void setUniqueTransactionID(String uniqueTransactionID) {
        this.uniqueTransactionID = uniqueTransactionID;
    }
}
