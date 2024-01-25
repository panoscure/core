package com.intralot.qa.automation.core.lottery.apigatewayj.models.accounting.terminal.reports.summary.report.by.date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KeyValue {

    @SerializedName("key")
    @Expose
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
