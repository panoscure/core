package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.retrieve.A.Voucher.Gift.Promotion.By.Serial.Number;

import java.math.BigInteger;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vouchers {

    @SerializedName("startDate")
    @Expose
    private BigInteger startDate;
    @SerializedName("endDate")
    @Expose
    private BigInteger endDate;
    @SerializedName("maxRedemptionDate")
    @Expose
    private BigInteger maxRedemptionDate;
    @SerializedName("promotionOutcomes")
    @Expose
    private List<PromotionOutcome> promotionOutcomes = null;

    public BigInteger getStartDate() {
        return startDate;
    }

    public void setStartDate(BigInteger startDate) {
        this.startDate = startDate;
    }

    public BigInteger getEndDate() {
        return endDate;
    }

    public void setEndDate(BigInteger endDate) {
        this.endDate = endDate;
    }

    public BigInteger getMaxRedemptionDate() {
        return maxRedemptionDate;
    }

    public void setMaxRedemptionDate(BigInteger maxRedemptionDate) {
        this.maxRedemptionDate = maxRedemptionDate;
    }

    public List<PromotionOutcome> getPromotionOutcomes() {
        return promotionOutcomes;
    }

    public void setPromotionOutcomes(List<PromotionOutcome> promotionOutcomes) {
        this.promotionOutcomes = promotionOutcomes;
    }

}
