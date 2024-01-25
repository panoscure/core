
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class PromotionInfo {

    @SerializedName("optIn")
    @Expose
    private List<Integer> optIn = null;
    @SerializedName("outcomeId")
    @Expose
    private Integer outcomeId;
    @SerializedName("promotionId")
    @Expose
    private Integer promotionId;
    @SerializedName("voucherCode")
    @Expose
    private String voucherCode;
    @SerializedName("promotionSerialNumber")
    @Expose
    private String promotionSerialNumber;

    public List<Integer> getOptIn() {
        return optIn;
    }

    public void setOptIn(List<Integer> optIn) {
        this.optIn = optIn;
    }

    public PromotionInfo withOptIn(List<Integer> optIn) {
        this.optIn = optIn;
        return this;
    }

    public Integer getOutcomeId() {
        return outcomeId;
    }

    public void setOutcomeId(Integer outcomeId) {
        this.outcomeId = outcomeId;
    }

    public PromotionInfo withOutcomeId(Integer outcomeId) {
        this.outcomeId = outcomeId;
        return this;
    }

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public PromotionInfo withPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
        return this;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }

    public PromotionInfo withVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
        return this;
    }

    public String getPromotionSerialNumber() {
        return promotionSerialNumber;
    }

    public void setPromotionSerialNumber(String promotionSerialNumber) {
        this.promotionSerialNumber = promotionSerialNumber;
    }

    public PromotionInfo withPromotionSerialNumber(String promotionSerialNumber) {
        this.promotionSerialNumber = promotionSerialNumber;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("optIn", optIn).append("outcomeId", outcomeId).append("promotionId", promotionId).append("voucherCode", voucherCode).append("promotionSerialNumber", promotionSerialNumber).toString();
    }

}
