package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.wallets.deposit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DepositModel {
    @Expose
    private List<TransactionBalanceAccount> transactionBalanceAccounts = null;
    @SerializedName("invalidBonusCode")
    @Expose
    private Boolean invalidBonusCode;
    @SerializedName("successed")
    @Expose
    private Boolean successed;
    @SerializedName("paymentGateway")
    @Expose
    private String paymentGateway;
    @SerializedName("paymentTransactionKey")
    @Expose
    private String paymentTransactionKey;
    @SerializedName("returnURL")
    @Expose
    private String returnURL;
    @SerializedName("tokenKey")
    @Expose
    private String tokenKey;

    public List<TransactionBalanceAccount> getTransactionBalanceAccounts() {
        return transactionBalanceAccounts;
    }

    public void setTransactionBalanceAccounts(List<TransactionBalanceAccount> transactionBalanceAccounts) {
        this.transactionBalanceAccounts = transactionBalanceAccounts;
    }

    public Boolean getInvalidBonusCode() {
        return invalidBonusCode;
    }

    public void setInvalidBonusCode(Boolean invalidBonusCode) {
        this.invalidBonusCode = invalidBonusCode;
    }

    public Boolean getSuccessed() {
        return successed;
    }

    public void setSuccessed(Boolean successed) {
        this.successed = successed;
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String getPaymentTransactionKey() {
        return paymentTransactionKey;
    }

    public void setPaymentTransactionKey(String paymentTransactionKey) {
        this.paymentTransactionKey = paymentTransactionKey;
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
}
