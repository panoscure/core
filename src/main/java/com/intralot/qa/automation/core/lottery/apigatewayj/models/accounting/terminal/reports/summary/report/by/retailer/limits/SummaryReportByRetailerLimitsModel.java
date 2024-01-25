package com.intralot.qa.automation.core.lottery.apigatewayj.models.accounting.terminal.reports.summary.report.by.retailer.limits;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SummaryReportByRetailerLimitsModel {

    @SerializedName("errorCode")
    @Expose
    private String errorCode;
    @SerializedName("limits")
    @Expose
    private Limits limits;

    public String getErrorCode() {
        return errorCode;
    }

    public Limits getLimits() {
        return limits;
    }
}
