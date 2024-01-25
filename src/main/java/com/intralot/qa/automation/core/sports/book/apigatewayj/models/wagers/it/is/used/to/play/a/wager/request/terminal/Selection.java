
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.terminal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.math.BigDecimal;


public class Selection implements Serializable {

    private final static long serialVersionUID = 3452700029787344408L;

    @SerializedName("eventId")
    @Expose
    private Integer eventId;
    @SerializedName("selectionId")
    @Expose
    private Integer selectionId;
    @SerializedName("retailRowPosition")
    @Expose
    private Integer retailRowPosition;
    @SerializedName("odds")
    @Expose
    private Odds odds;
    @SerializedName("banker")
    @Expose
    private boolean banker;

    public Selection() {
    }

    public Selection(Integer eventId, Integer selectionId, boolean banker) {
        this.eventId = eventId;
        this.selectionId = selectionId;
        this.banker = banker;
    }

    public Selection(Integer eventId, Integer selectionId, boolean banker, BigDecimal odd) {
        this(eventId, selectionId, banker);
        this.odds = new Odds(odd);
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Selection withEventId(Integer eventId) {
        this.eventId = eventId;
        return this;
    }

    public Integer getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(Integer selectionId) {
        this.selectionId = selectionId;
    }

    public Selection withSelectionId(Integer selectionId) {
        this.selectionId = selectionId;
        return this;
    }

    public Integer getRetailRowPosition() {
        return retailRowPosition;
    }

    public void setRetailRowPosition(Integer retailRowPosition) {
        this.retailRowPosition = retailRowPosition;
    }

    public Selection withRetailRowPosition(Integer retailRowPosition) {
        this.retailRowPosition = retailRowPosition;
        return this;
    }

    public Odds getOdds() {
        return odds;
    }

    public void setOdds(Odds odds) {
        this.odds = odds;
    }

    public Selection withOdds(Odds odds) {
        this.odds = odds;
        return this;
    }

    public boolean isBanker() {
        return banker;
    }

    public void setBanker(boolean banker) {
        this.banker = banker;
    }
}


