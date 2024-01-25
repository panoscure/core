package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.wallets.get.account.transactions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountTransaction {
    @SerializedName("accountReference")
    @Expose
    private Object accountReference;
    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("amountAbsolute")
    @Expose
    private Double amountAbsolute;
    @SerializedName("balanceBonusAfter")
    @Expose
    private Double balanceBonusAfter;
    @SerializedName("balanceFreeRoundsAfter")
    @Expose
    private Object balanceFreeRoundsAfter;
    @SerializedName("balanceOperationType")
    @Expose
    private String balanceOperationType;
    @SerializedName("balanceRealAfter")
    @Expose
    private Double balanceRealAfter;
    @SerializedName("balanceTransactionID")
    @Expose
    private Integer balanceTransactionID;
    @SerializedName("bonusName")
    @Expose
    private Object bonusName;
    @SerializedName("classification")
    @Expose
    private Object classification;
    @SerializedName("couponIdentifier")
    @Expose
    private Object couponIdentifier;
    @SerializedName("currencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("descriptionFreeText")
    @Expose
    private Object descriptionFreeText;
    @SerializedName("errorCode")
    @Expose
    private Object errorCode;
    @SerializedName("errorMessage")
    @Expose
    private Object errorMessage;
    @SerializedName("exchangeRate")
    @Expose
    private Double exchangeRate;
    @SerializedName("gwTransactionKey")
    @Expose
    private Object gwTransactionKey;
    @SerializedName("gameID")
    @Expose
    private Object gameID;
    @SerializedName("gatewayName")
    @Expose
    private Object gatewayName;
    @SerializedName("loyaltyPoints")
    @Expose
    private Object loyaltyPoints;
    @SerializedName("manufacturerGameIDF")
    @Expose
    private Object manufacturerGameIDF;
    @SerializedName("paymentMethodName")
    @Expose
    private Object paymentMethodName;
    @SerializedName("paymentTransactionID")
    @Expose
    private Object paymentTransactionID;
    @SerializedName("paymentUID")
    @Expose
    private Object paymentUID;
    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("withdrawalRequestId")
    @Expose
    private Object withdrawalRequestId;
    @SerializedName("transactionStatusName")
    @Expose
    private Object transactionStatusName;
    @SerializedName("transactionTypeID")
    @Expose
    private Integer transactionTypeID;
    @SerializedName("transactionTypeName")
    @Expose
    private String transactionTypeName;

    public Object getAccountReference() {
        return accountReference;
    }

    public void setAccountReference(Object accountReference) {
        this.accountReference = accountReference;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmountAbsolute() {
        return amountAbsolute;
    }

    public void setAmountAbsolute(Double amountAbsolute) {
        this.amountAbsolute = amountAbsolute;
    }

    public Double getBalanceBonusAfter() {
        return balanceBonusAfter;
    }

    public void setBalanceBonusAfter(Double balanceBonusAfter) {
        this.balanceBonusAfter = balanceBonusAfter;
    }

    public Object getBalanceFreeRoundsAfter() {
        return balanceFreeRoundsAfter;
    }

    public void setBalanceFreeRoundsAfter(Object balanceFreeRoundsAfter) {
        this.balanceFreeRoundsAfter = balanceFreeRoundsAfter;
    }

    public String getBalanceOperationType() {
        return balanceOperationType;
    }

    public void setBalanceOperationType(String balanceOperationType) {
        this.balanceOperationType = balanceOperationType;
    }

    public Double getBalanceRealAfter() {
        return balanceRealAfter;
    }

    public void setBalanceRealAfter(Double balanceRealAfter) {
        this.balanceRealAfter = balanceRealAfter;
    }

    public Integer getBalanceTransactionID() {
        return balanceTransactionID;
    }

    public void setBalanceTransactionID(Integer balanceTransactionID) {
        this.balanceTransactionID = balanceTransactionID;
    }

    public Object getBonusName() {
        return bonusName;
    }

    public void setBonusName(Object bonusName) {
        this.bonusName = bonusName;
    }

    public Object getClassification() {
        return classification;
    }

    public void setClassification(Object classification) {
        this.classification = classification;
    }

    public Object getCouponIdentifier() {
        return couponIdentifier;
    }

    public void setCouponIdentifier(Object couponIdentifier) {
        this.couponIdentifier = couponIdentifier;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Object getDescriptionFreeText() {
        return descriptionFreeText;
    }

    public void setDescriptionFreeText(Object descriptionFreeText) {
        this.descriptionFreeText = descriptionFreeText;
    }

    public Object getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Object getGwTransactionKey() {
        return gwTransactionKey;
    }

    public void setGwTransactionKey(Object gwTransactionKey) {
        this.gwTransactionKey = gwTransactionKey;
    }

    public Object getGameID() {
        return gameID;
    }

    public void setGameID(Object gameID) {
        this.gameID = gameID;
    }

    public Object getGatewayName() {
        return gatewayName;
    }

    public void setGatewayName(Object gatewayName) {
        this.gatewayName = gatewayName;
    }

    public Object getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(Object loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public Object getManufacturerGameIDF() {
        return manufacturerGameIDF;
    }

    public void setManufacturerGameIDF(Object manufacturerGameIDF) {
        this.manufacturerGameIDF = manufacturerGameIDF;
    }

    public Object getPaymentMethodName() {
        return paymentMethodName;
    }

    public void setPaymentMethodName(Object paymentMethodName) {
        this.paymentMethodName = paymentMethodName;
    }

    public Object getPaymentTransactionID() {
        return paymentTransactionID;
    }

    public void setPaymentTransactionID(Object paymentTransactionID) {
        this.paymentTransactionID = paymentTransactionID;
    }

    public Object getPaymentUID() {
        return paymentUID;
    }

    public void setPaymentUID(Object paymentUID) {
        this.paymentUID = paymentUID;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Object getWithdrawalRequestId() {
        return withdrawalRequestId;
    }

    public void setWithdrawalRequestId(Object withdrawalRequestId) {
        this.withdrawalRequestId = withdrawalRequestId;
    }

    public Object getTransactionStatusName() {
        return transactionStatusName;
    }

    public void setTransactionStatusName(Object transactionStatusName) {
        this.transactionStatusName = transactionStatusName;
    }

    public Integer getTransactionTypeID() {
        return transactionTypeID;
    }

    public void setTransactionTypeID(Integer transactionTypeID) {
        this.transactionTypeID = transactionTypeID;
    }

    public String getTransactionTypeName() {
        return transactionTypeName;
    }

    public void setTransactionTypeName(String transactionTypeName) {
        this.transactionTypeName = transactionTypeName;
    }
}
