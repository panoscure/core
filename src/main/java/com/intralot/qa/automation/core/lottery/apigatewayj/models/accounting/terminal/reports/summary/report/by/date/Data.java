package com.intralot.qa.automation.core.lottery.apigatewayj.models.accounting.terminal.reports.summary.report.by.date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("var")
    @Expose
    private Integer var;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("amounts")
    @Expose
    private Amounts amounts;

    public String getDescription() {
        return description;
    }

    public Integer getVar() {
        return var;
    }

    public Integer getCount() {
        return count;
    }

    public Amounts getAmounts() {
        return amounts;
    }
}
