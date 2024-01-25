package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.parlay.available.cards;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AvailableParlayCardsModel {
    @SerializedName("availableCards")
    @Expose
    private List<AvailableCard> availableCards = null;
    @SerializedName("minLegs")
    @Expose
    private Integer minLegs;
    @SerializedName("maxLegs")
    @Expose
    private Integer maxLegs;

    public List<AvailableCard> getAvailableCards() {
        return availableCards;
    }

    public void setAvailableCards(List<AvailableCard> availableCards) {
        this.availableCards = availableCards;
    }

    public Integer getMinLegs() {
        return minLegs;
    }

    public void setMinLegs(Integer minLegs) {
        this.minLegs = minLegs;
    }

    public Integer getMaxLegs() {
        return maxLegs;
    }

    public void setMaxLegs(Integer maxLegs) {
        this.maxLegs = maxLegs;
    }
}
