package com.intralot.qa.automation.core.lottery.apigatewayj.models.accounting.terminal.reports.summary.report.by.date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class TotalAmounts {

    @SerializedName("balance")
    @Expose
    private BigDecimal balance;
    @SerializedName("coupons")
    @Expose
    private Integer coupons;
    @SerializedName("adjustments")
    @Expose
    private BigDecimal adjustments;
    @SerializedName("commissions")
    @Expose
    private BigDecimal commissions;
    @SerializedName("validations")
    @Expose
    private BigDecimal validations;
    @SerializedName("salesCancels")
    @Expose
    private BigDecimal salesCancels;
    @SerializedName("salesValidations")
    @Expose
    private BigDecimal salesValidations;
    @SerializedName("salesCancelsValidations")
    @Expose
    private BigDecimal salesCancelsValidations;
    @SerializedName("salesCancelsValidationsCmsAdj")
    @Expose
    private BigDecimal salesCancelsValidationsCmsAdj;
    @SerializedName("cms")
    @Expose
    private BigDecimal cms;
    @SerializedName("gross")
    @Expose
    private BigDecimal gross;
    @SerializedName("fee")
    @Expose
    private BigDecimal fee;
    @SerializedName("total")
    @Expose
    private BigDecimal total;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getCoupons() {
        return coupons;
    }

    public void setCoupons(Integer coupons) {
        this.coupons = coupons;
    }

    public BigDecimal getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(BigDecimal adjustments) {
        this.adjustments = adjustments;
    }

    public BigDecimal getCommissions() {
        return commissions;
    }

    public void setCommissions(BigDecimal commissions) {
        this.commissions = commissions;
    }

    public BigDecimal getValidations() {
        return validations;
    }

    public void setValidations(BigDecimal validations) {
        this.validations = validations;
    }

    public BigDecimal getSalesCancels() {
        return salesCancels;
    }

    public void setSalesCancels(BigDecimal salesCancels) {
        this.salesCancels = salesCancels;
    }

    public BigDecimal getSalesValidations() {
        return salesValidations;
    }

    public void setSalesValidations(BigDecimal salesValidations) {
        this.salesValidations = salesValidations;
    }

    public BigDecimal getSalesCancelsValidations() {
        return salesCancelsValidations;
    }

    public void setSalesCancelsValidations(BigDecimal salesCancelsValidations) {
        this.salesCancelsValidations = salesCancelsValidations;
    }

    public BigDecimal getSalesCancelsValidationsCmsAdj() {
        return salesCancelsValidationsCmsAdj;
    }

    public void setSalesCancelsValidationsCmsAdj(BigDecimal salesCancelsValidationsCmsAdj) {
        this.salesCancelsValidationsCmsAdj = salesCancelsValidationsCmsAdj;
    }

    public BigDecimal getCms() {
        return cms;
    }

    public void setCms(BigDecimal cms) {
        this.cms = cms;
    }

    public BigDecimal getGross() {
        return gross;
    }

    public void setGross(BigDecimal gross) {
        this.gross = gross;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.gross = fee;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.gross = total;
    }

}
