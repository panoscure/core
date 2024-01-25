package com.intralot.qa.automation.core.lottery.apigatewayj.models.accounting.terminal.reports.summary.report.by.date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Amounts {

    @SerializedName("gross")
    @Expose
    private BigDecimal gross;
    @SerializedName("cms")
    @Expose
    private BigDecimal cms;
    @SerializedName("fee")
    @Expose
    private BigDecimal fee;

    public BigDecimal getGross() {
        return gross;
    }

    public void setGross(BigDecimal gross) {
        this.gross = gross;
    }

    public BigDecimal getCms() {
        return cms;
    }

    public void setCms(BigDecimal cms) {
        this.cms = cms;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.gross = fee;
    }

}