package com.intralot.qa.automation.core.lottery.apigatewayj.models.accounting.terminal.reports.summary.report.by.retailer.limits;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Limits {
    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("debit")
    @Expose
    private Integer debit;
    @SerializedName("credit")
    @Expose
    private Integer credit;

    public Double getAmount() {
        return amount;
    }

    public Integer getDebit() {
        return debit;
    }

    public Integer getCredit() {
        return credit;
    }
}
