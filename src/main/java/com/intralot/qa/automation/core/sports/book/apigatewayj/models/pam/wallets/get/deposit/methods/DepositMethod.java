package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.wallets.get.deposit.methods;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DepositMethod {
    @SerializedName("accountHolderName")
    @Expose
    private Object accountHolderName;
    @SerializedName("accountName")
    @Expose
    private Object accountName;
    @SerializedName("currencyISO")
    @Expose
    private String currencyISO;
    @SerializedName("entered")
    @Expose
    private Boolean entered;
    @SerializedName("validated")
    @Expose
    private Boolean validated;
    @SerializedName("paymentAttributes")
    @Expose
    private Object paymentAttributes;
    @SerializedName("paymentMethod")
    @Expose
    private String paymentMethod;
    @SerializedName("paymentMethodID")
    @Expose
    private Integer paymentMethodID;
    @SerializedName("playerLowerLimit")
    @Expose
    private Integer playerLowerLimit;
    @SerializedName("playerPaymentAccounts")
    @Expose
    private List<Object> playerPaymentAccounts = null;
    @SerializedName("playerUpperLimit")
    @Expose
    private Integer playerUpperLimit;
    @SerializedName("requireClientInfo")
    @Expose
    private Boolean requireClientInfo;

    public Object getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(Object accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Object getAccountName() {
        return accountName;
    }

    public void setAccountName(Object accountName) {
        this.accountName = accountName;
    }

    public String getCurrencyISO() {
        return currencyISO;
    }

    public void setCurrencyISO(String currencyISO) {
        this.currencyISO = currencyISO;
    }

    public Boolean getEntered() {
        return entered;
    }

    public void setEntered(Boolean entered) {
        this.entered = entered;
    }

    public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }

    public Object getPaymentAttributes() {
        return paymentAttributes;
    }

    public void setPaymentAttributes(Object paymentAttributes) {
        this.paymentAttributes = paymentAttributes;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getPaymentMethodID() {
        return paymentMethodID;
    }

    public void setPaymentMethodID(Integer paymentMethodID) {
        this.paymentMethodID = paymentMethodID;
    }

    public Integer getPlayerLowerLimit() {
        return playerLowerLimit;
    }

    public void setPlayerLowerLimit(Integer playerLowerLimit) {
        this.playerLowerLimit = playerLowerLimit;
    }

    public List<Object> getPlayerPaymentAccounts() {
        return playerPaymentAccounts;
    }

    public void setPlayerPaymentAccounts(List<Object> playerPaymentAccounts) {
        this.playerPaymentAccounts = playerPaymentAccounts;
    }

    public Integer getPlayerUpperLimit() {
        return playerUpperLimit;
    }

    public void setPlayerUpperLimit(Integer playerUpperLimit) {
        this.playerUpperLimit = playerUpperLimit;
    }

    public Boolean getRequireClientInfo() {
        return requireClientInfo;
    }

    public void setRequireClientInfo(Boolean requireClientInfo) {
        this.requireClientInfo = requireClientInfo;
    }
}
