
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.verifies.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VerifiesAWagerModel {

    @SerializedName("promotionOutcomes")
    @Expose
    private List<Object> promotionOutcomes = null;
    @SerializedName("pilot")
    @Expose
    private boolean pilot;
    @SerializedName("wager")
    @Expose
    private Wager wager;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;

    public List<Object> getPromotionOutcomes() {
        return promotionOutcomes;
    }

    public void setPromotionOutcomes(List<Object> promotionOutcomes) {
        this.promotionOutcomes = promotionOutcomes;
    }

    public boolean getPilot() {
        return pilot;
    }

    public void setPilot(boolean pilot) {
        this.pilot = pilot;
    }

    public Wager getWager() {
        return wager;
    }

    public void setWager(Wager wager) {
        this.wager = wager;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}
