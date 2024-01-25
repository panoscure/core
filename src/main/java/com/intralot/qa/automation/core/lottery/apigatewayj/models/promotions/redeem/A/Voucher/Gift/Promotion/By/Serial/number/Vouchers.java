package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.redeem.A.Voucher.Gift.Promotion.By.Serial.number;

import java.math.BigInteger;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Vouchers {


    @SerializedName("voucherCode")
    @Expose
    private String voucherCode;
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
    @SerializedName("useVoucherCode")
    @Expose
    private Boolean useVoucherCode;

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }

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

    public Boolean getUseVoucherCode() {
        return useVoucherCode;
    }

    public void setUseVoucherCode(Boolean useVoucherCode) {
        this.useVoucherCode = useVoucherCode;
    }
}
