package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.claim.A.High.Winning.Real.Money.Promotion.By.Serial.Number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class claimAHighWinningRealMoneyPromotionBySerialNumberModel {

    @SerializedName("requestId")
    @Expose
    private String requestId;
    @SerializedName("paymentId")
    @Expose
    private long paymentId;
    @SerializedName("bankCode")
    @Expose
    private String bankCode;
    @SerializedName("paymentCrc")
    @Expose
    private String paymentCrc;
    @SerializedName("resCode")
    @Expose
    private Integer resCode;
    @SerializedName("errorDetails")
    @Expose
    private String errorDetails;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getPaymentCrc() {
        return paymentCrc;
    }

    public void setPaymentCrc(String paymentCrc) {
        this.paymentCrc = paymentCrc;
    }

    public Integer getResCode() {
        return resCode;
    }

    public void setResCode(Integer resCode) {
        this.resCode = resCode;
    }

    public String getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

}
