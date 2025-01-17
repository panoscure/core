
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.serial.number;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetWagerDetailsBySerialNumberModel {

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
    @SerializedName("pilot")
    @Expose
    private Boolean pilot;
    @SerializedName("promotionOutcomes")
    @Expose
    private List<PromotionOutcome> promotionOutcomes = null;

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

}
