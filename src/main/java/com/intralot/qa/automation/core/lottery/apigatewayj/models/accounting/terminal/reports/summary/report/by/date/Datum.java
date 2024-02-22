package com.intralot.qa.automation.core.lottery.apigatewayj.models.accounting.terminal.reports.summary.report.by.date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("amounts")
    @Expose
    private Amounts amounts;
    @SerializedName("var")
    @Expose
    private Integer var;
    @SerializedName("count")
    @Expose
    private Integer count;

    @SerializedName("code")
    @Expose
    private Integer code;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Amounts getAmounts() {
        return amounts;
    }

    public void setAmounts(Amounts amounts) {
        this.amounts = amounts;
    }

    public Integer getVar() {
        return var;
    }

    public void setVar(Integer var) {
        this.var = var;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
