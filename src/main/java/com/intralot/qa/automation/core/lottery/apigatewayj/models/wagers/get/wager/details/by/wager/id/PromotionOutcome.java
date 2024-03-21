
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PromotionOutcome {

    @SerializedName("promotionId")
    @Expose
    private Integer promotionId;
    @SerializedName("outcomeId")
    @Expose
    private Integer outcomeId;
    @SerializedName("outcomeType")
    @Expose
    private String outcomeType;
    @SerializedName("promotionType")
    @Expose
    private String promotionType;
    @SerializedName("outcomeMetaData")
    @Expose
    private OutcomeMetaData outcomeMetaData;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("createDate")
    @Expose
    private BigInteger createDate;
    @SerializedName("purgeDate")
    @Expose
    private BigInteger purgeDate;

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public Integer getOutcomeId() {
        return outcomeId;
    }

    public void setOutcomeId(Integer outcomeId) {
        this.outcomeId = outcomeId;
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

    public OutcomeMetaData getOutcomeMetaData() {
        return outcomeMetaData;
    }

    public void setOutcomeMetaData(OutcomeMetaData outcomeMetaData) {
        this.outcomeMetaData = outcomeMetaData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
}
