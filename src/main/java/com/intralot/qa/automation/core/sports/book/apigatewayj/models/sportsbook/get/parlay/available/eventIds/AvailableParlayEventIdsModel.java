package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.parlay.available.eventIds;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AvailableParlayEventIdsModel {
    @SerializedName("eventIds")
    @Expose
    private List<Integer> eventIds = null;
    @SerializedName("cardId")
    @Expose
    private Integer cardId;

    public List<Integer> getEventIds() {
        return eventIds;
    }

    public void setEventIds(List<Integer> eventIds) {
        this.eventIds = eventIds;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }
}
