
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetWagerDetailsByWagerIdModel {

    @SerializedName("wager")
    @Expose
    private Wager wager;
    @SerializedName("winnings")
    @Expose
    private List<Winning> winnings = null;
    @SerializedName("serialNumbers")
    @Expose
    private List<String> serialNumbers = null;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("promotionOutcomes")
    @Expose
    private List<PromotionOutcome> promotionOutcomes = null;
    @SerializedName("pilot")
    @Expose
    private Boolean pilot;
    @SerializedName("discount")
    @Expose
    private Metadata discount;
    @SerializedName("QPSelections")
    @Expose
    private Metadata QPSelections;
    @SerializedName("code")
    @Expose
    private Metadata code;
    @SerializedName("type")
    @Expose
    private Metadata type;
    @SerializedName("source")
    @Expose
    private Metadata source;

    public Wager getWager() {
        return wager;
    }

    public void setWager(Wager wager) {
        this.wager = wager;
    }

    public List<Winning> getWinnings() {
        return winnings;
    }

    public void setWinnings(List<Winning> winnings) {
        this.winnings = winnings;
    }

    public List<String> getSerialNumbers() {
        return serialNumbers;
    }

    public void setSerialNumbers(List<String> serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Boolean getPilot() {
        return pilot;
    }

    public void setPilot(Boolean pilot) {
        this.pilot = pilot;
    }

    public List<PromotionOutcome> getPromotionOutcomes() {
        return promotionOutcomes;
    }

    public void setPromotionOutcomes(List<PromotionOutcome> promotionOutcomes) {
        this.promotionOutcomes = promotionOutcomes;
    }

    public Metadata getDiscount() {
        return discount;
    }

    public void setDiscount(Metadata discount) {
        this.discount = discount;
    }


    public Metadata getQPSelections() {
        return QPSelections;
    }

    public void setQPSelections(Metadata QPSelections) {
        this.QPSelections = QPSelections;
    }

    public Metadata getCode() {
        return code;
    }

    public void setCode(Metadata code) {
        this.code = code;
    }

    public Metadata getType() {
        return type;
    }

    public void setType(Metadata type) {
        this.type = type;
    }

    public Metadata getSource() {
        return source;
    }

    public void setSource(Metadata source) {
        this.source = source;
    }
}

