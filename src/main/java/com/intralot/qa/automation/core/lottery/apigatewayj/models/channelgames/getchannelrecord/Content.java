
package com.intralot.qa.automation.core.lottery.apigatewayj.models.channelgames.getchannelrecord;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("activationTime")
    @Expose
    private Long activationTime;
    @SerializedName("betLimits")
    @Expose
    private BetLimits betLimits;
    @SerializedName("cancelationDeadlines")
    @Expose
    private List<CancelationDeadline> cancelationDeadlines = null;
    @SerializedName("drawLimits")
    @Expose
    private DrawLimits drawLimits;
    @SerializedName("minPayable")
    @Expose
    private Double minPayable;
    @SerializedName("minPayableWithReceipt")
    @Expose
    private Double minPayableWithReceipt;
    @SerializedName("qrCodePlayslip")
    @Expose
    private Boolean qrCodePlayslip;
    @SerializedName("blacklistedPlaySlips")
    @Expose
    private Object blacklistedPlaySlips;
    @SerializedName("checkPaymentLimits")
    @Expose
    private String checkPaymentLimits;
    @SerializedName("checkPaymentLimitsId")
    @Expose
    private Long checkPaymentLimitsId;
    @SerializedName("payBonus")
    @Expose
    private PayBonus payBonus;
    @SerializedName("salesEnd")
    @Expose
    private Long salesEnd;
    @SerializedName("salesStart")
    @Expose
    private Long salesStart;
    @SerializedName("status")
    @Expose
    private Long status;
    @SerializedName("syndicate")
    @Expose
    private Boolean syndicate;
    @SerializedName("validationAmountsLimits")
    @Expose
    private List<ValidationAmountsLimit> validationAmountsLimits = null;
    @SerializedName("playMethod")
    @Expose
    private PlayMethod playMethod;
    @SerializedName("teamPlayParams")
    @Expose
    private TeamPlayParams teamPlayParams;

    public Long getActivationTime() {
        return activationTime;
    }

    public void setActivationTime(Long activationTime) {
        this.activationTime = activationTime;
    }

    public BetLimits getBetLimits() {
        return betLimits;
    }

    public void setBetLimits(BetLimits betLimits) {
        this.betLimits = betLimits;
    }

    public List<CancelationDeadline> getCancelationDeadlines() {
        return cancelationDeadlines;
    }

    public void setCancelationDeadlines(List<CancelationDeadline> cancelationDeadlines) {
        this.cancelationDeadlines = cancelationDeadlines;
    }

    public DrawLimits getDrawLimits() {
        return drawLimits;
    }

    public void setDrawLimits(DrawLimits drawLimits) {
        this.drawLimits = drawLimits;
    }

    public Double getMinPayable() {
        return minPayable;
    }

    public void setMinPayable(Double minPayable) {
        this.minPayable = minPayable;
    }

    public Double getMinPayableWithReceipt() {
        return minPayableWithReceipt;
    }

    public void setMinPayableWithReceipt(Double minPayableWithReceipt) {
        this.minPayableWithReceipt = minPayableWithReceipt;
    }

    public Boolean getQrCodePlayslip() {
        return qrCodePlayslip;
    }

    public void setQrCodePlayslip(Boolean qrCodePlayslip) {
        this.qrCodePlayslip = qrCodePlayslip;
    }

    public Object getBlacklistedPlaySlips() {
        return blacklistedPlaySlips;
    }

    public void setBlacklistedPlaySlips(Object blacklistedPlaySlips) {
        this.blacklistedPlaySlips = blacklistedPlaySlips;
    }

    public String getCheckPaymentLimits() {
        return checkPaymentLimits;
    }

    public void setCheckPaymentLimits(String checkPaymentLimits) {
        this.checkPaymentLimits = checkPaymentLimits;
    }

    public Long getCheckPaymentLimitsId() {
        return checkPaymentLimitsId;
    }

    public void setCheckPaymentLimitsId(Long checkPaymentLimitsId) {
        this.checkPaymentLimitsId = checkPaymentLimitsId;
    }

    public PayBonus getPayBonus() {
        return payBonus;
    }

    public void setPayBonus(PayBonus payBonus) {
        this.payBonus = payBonus;
    }

    public Long getSalesEnd() {
        return salesEnd;
    }

    public void setSalesEnd(Long salesEnd) {
        this.salesEnd = salesEnd;
    }

    public Long getSalesStart() {
        return salesStart;
    }

    public void setSalesStart(Long salesStart) {
        this.salesStart = salesStart;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Boolean getSyndicate() {
        return syndicate;
    }

    public void setSyndicate(Boolean syndicate) {
        this.syndicate = syndicate;
    }

    public List<ValidationAmountsLimit> getValidationAmountsLimits() {
        return validationAmountsLimits;
    }

    public void setValidationAmountsLimits(List<ValidationAmountsLimit> validationAmountsLimits) {
        this.validationAmountsLimits = validationAmountsLimits;
    }

    public PlayMethod getPlayMethod() {
        return playMethod;
    }

    public void setPlayMethod(PlayMethod playMethod) {
        this.playMethod = playMethod;
    }

    public TeamPlayParams getTeamPlayParams() {
        return teamPlayParams;
    }

    public void setTeamPlayParams(TeamPlayParams teamPlayParams) {
        this.teamPlayParams = teamPlayParams;
    }

}
