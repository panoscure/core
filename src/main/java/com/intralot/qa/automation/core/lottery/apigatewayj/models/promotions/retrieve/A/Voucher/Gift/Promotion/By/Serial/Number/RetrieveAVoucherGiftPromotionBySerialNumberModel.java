package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.retrieve.A.Voucher.Gift.Promotion.By.Serial.Number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;

public class RetrieveAVoucherGiftPromotionBySerialNumberModel {

    @SerializedName("promotionId")
    @Expose
    private Integer promotionId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("outcomeType")
    @Expose
    private String outcomeType;
    @SerializedName("promotionType")
    @Expose
    private String promotionType;
    @SerializedName("outcomeId")
    @Expose
    private Integer outcomeId;
    @SerializedName("playerId")
    @Expose
    private Integer playerId;
    @SerializedName("outcomeMetaData")
    @Expose
    private OutcomeMetaData outcomeMetaData;
    @SerializedName("createDate")
    @Expose
    private BigInteger createDate;
    @SerializedName("purgeDate")
    @Expose
    private BigInteger purgeDate;
    @SerializedName("isRaffle")
    @Expose
    private Boolean isRaffle;
    @SerializedName("promotionSerialNumber")
    @Expose
    private String promotionSerialNumber;

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOutcomeType() {
        return outcomeType;
    }

    public void setOutcomeType(String outcomeType) {
        this.outcomeType = outcomeType;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public Integer getOutcomeId() {
        return outcomeId;
    }

    public void setOutcomeId(Integer outcomeId) {
        this.outcomeId = outcomeId;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public OutcomeMetaData getOutcomeMetaData() {
        return outcomeMetaData;
    }

    public void setOutcomeMetaData(OutcomeMetaData outcomeMetaData) {
        this.outcomeMetaData = outcomeMetaData;
    }

    public BigInteger getCreateDate() {
        return createDate;
    }

    public void setCreateDate(BigInteger createDate) {
        this.createDate = createDate;
    }

    public BigInteger getPurgeDate() {
        return purgeDate;
    }

    public void setPurgeDate(BigInteger purgeDate) {
        this.purgeDate = purgeDate;
    }

    public Boolean getIsRaffle() {
        return isRaffle;
    }

    public void setIsRaffle(Boolean isRaffle) {
        this.isRaffle = isRaffle;
    }

    public String getPromotionSerialNumber() {
        return promotionSerialNumber;
    }

    public void setPromotionSerialNumber(String promotionSerialNumber) {
        this.promotionSerialNumber = promotionSerialNumber;
    }


}
