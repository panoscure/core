package com.intralot.qa.automation.core.lottery.apigatewayj.models.accounting.terminal.reports.summary.report.by.date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;
import java.util.List;

public class SummaryReportByDateModel {

    @SerializedName("errorCode")
    @Expose
    private String errorCode;
    @SerializedName("accPeriod")
    @Expose
    private Integer accPeriod;
    @SerializedName("fromDate")
    @Expose
    private BigInteger fromDate;
    @SerializedName("toDate")
    @Expose
    private BigInteger toDate;
    @SerializedName("totals")
    @Expose
    private List<Total> totals = null;
    @SerializedName("keyValues")
    @Expose
    private List<KeyValue> keyValues = null;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Integer getAccPeriod() {
        return accPeriod;
    }

    public void setAccPeriod(Integer accPeriod) {
        this.accPeriod = accPeriod;
    }

    public BigInteger getFromDate() {
        return fromDate;
    }

    public void setFromDate(BigInteger fromDate) {
        this.fromDate = fromDate;
    }

    public BigInteger getToDate() {
        return toDate;
    }

    public void setToDate(BigInteger toDate) {
        this.toDate = toDate;
    }

    public List<Total> getTotals() {
        return totals;
    }

    public void setTotals(List<Total> totals) {
        this.totals = totals;
    }

    public List<KeyValue> getKeyValues() {
        return keyValues;
    }

    public void setKeyValues(List<KeyValue> keyValues) {
        this.keyValues = keyValues;
    }

}