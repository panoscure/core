
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PromotionOutcome {

    @SerializedName("promotionId")
    @Expose
    private int promotionId;
    @SerializedName("outcomeId")
    @Expose
    private int outcomeId;
    @SerializedName("outcomeType")
    @Expose
    private String outcomeType;
    @SerializedName("outcomeMetaData")
    @Expose
    private OutcomeMetaData outcomeMetaData;
    @SerializedName("messages")
    @Expose
    private List<Object> messages = null;

    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    public int getOutcomeId() {
        return outcomeId;
    }

    public void setOutcomeId(int outcomeId) {
        this.outcomeId = outcomeId;
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

}
