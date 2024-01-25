package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.wallets.get.deposit.methods;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetDepositMethodsModel {
    @SerializedName("beforeKYCDepositLimit")
    @Expose
    private Integer beforeKYCDepositLimit;
    @SerializedName("beforeKYCMaxAmount")
    @Expose
    private Object beforeKYCMaxAmount;
    @SerializedName("depositMethods")
    @Expose
    private List<DepositMethod> depositMethods = null;

    public Integer getBeforeKYCDepositLimit() {
        return beforeKYCDepositLimit;
    }

    public void setBeforeKYCDepositLimit(Integer beforeKYCDepositLimit) {
        this.beforeKYCDepositLimit = beforeKYCDepositLimit;
    }

    public Object getBeforeKYCMaxAmount() {
        return beforeKYCMaxAmount;
    }

    public void setBeforeKYCMaxAmount(Object beforeKYCMaxAmount) {
        this.beforeKYCMaxAmount = beforeKYCMaxAmount;
    }

    public List<DepositMethod> getDepositMethods() {
        return depositMethods;
    }

    public void setDepositMethods(List<DepositMethod> depositMethods) {
        this.depositMethods = depositMethods;
    }
}
