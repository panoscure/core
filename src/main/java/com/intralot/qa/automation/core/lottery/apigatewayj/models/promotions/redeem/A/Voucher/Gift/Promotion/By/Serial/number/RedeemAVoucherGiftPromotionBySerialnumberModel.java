package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.redeem.A.Voucher.Gift.Promotion.By.Serial.number;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;
import java.util.List;

public class RedeemAVoucherGiftPromotionBySerialnumberModel {

    @SerializedName("promotionId")
    @Expose
    private BigInteger promotionId;
    @SerializedName("outcomeId")
    @Expose
    private BigInteger outcomeId;
    @SerializedName("promotionSerialNumber")
    @Expose
    private String promotionSerialNumber;
    @SerializedName("outcomeType")
    @Expose
    private String outcomeType;
    @SerializedName("outcomeMetaData")
    @Expose
    private OutcomeMetaData outcomeMetaData;
    @Expose
    private List<Object> messages = null;
    @SerializedName("promotionType")
    @Expose
    private String promotionType;
    @SerializedName("maxRedemptionDate")
    @Expose
    private Integer maxRedemptionDate;
    @SerializedName("isRaffle")
    @Expose
    private Boolean isRaffle;


    public BigInteger getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(BigInteger promotionId) {
        this.promotionId = promotionId;
    }

    public BigInteger getOutcomeId() {
        return outcomeId;
    }

    public void setOutcomeId(BigInteger outcomeId) {
        this.outcomeId = outcomeId;
    }

    public String getPromotionSerialNumber() {
        return promotionSerialNumber;
    }

    public void setPromotionSerialNumber(String promotionSerialNumber) {
        this.promotionSerialNumber = promotionSerialNumber;
    }

    public String getOutcomeType() {
        return outcomeType;
    }

    public void setOutcomeType(String outcomeType) {
        this.outcomeType = outcomeType;
    }

    public OutcomeMetaData getOutcomeMetaData() {
        return outcomeMetaData;
    }

    public void setOutcomeMetaData(OutcomeMetaData outcomeMetaData) {
        this.outcomeMetaData = outcomeMetaData;
    }

    public List<Object> getMessages() {
        return messages;
    }

    public void setMessages(List<Object> messages) {
        this.messages = messages;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public Integer getMaxRedemptionDate() {
        return maxRedemptionDate;
    }

    public void setMaxRedemptionDate(Integer maxRedemptionDate) {
        this.maxRedemptionDate = maxRedemptionDate;
    }

    public Boolean getisRaffle() {
        return isRaffle;
    }

    public void setisRaffle(Boolean maxRedemptionDate) {
        this.isRaffle = isRaffle;
    }

}