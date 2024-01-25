
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.desktop;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import java.io.Serializable;
import java.math.BigDecimal;


public class Selection implements Serializable
{

    @SerializedName("partNo")
    @Expose
    private Integer partNo;
    @SerializedName("eventId")
    @Expose
    private Integer eventId;
    @SerializedName("selectionId")
    @Expose
    private String selectionId;
    @SerializedName("odds")
    @Expose
    private Odds odds;
    @SerializedName("banker")
    @Expose
    private Boolean banker;

    public Selection() {
        this.odds = new Odds();
    }

    public Selection(Integer partNo, Integer eventId, String selectionId, Odds odds, Boolean banker) {
        this(eventId, selectionId, odds, banker);
        this.partNo = partNo;
    }
    public Selection(Integer eventId, String selectionId, Odds odds, Boolean banker) {
        this(eventId, selectionId, odds);
        this.banker = banker;
    }
    public Selection(Integer eventId, String selectionId, Odds odds) {
        this(eventId,selectionId);
        this.odds = odds;
        this.banker = false;
    }
    public Selection(Integer eventId, String selectionId) {
        super();
        this.eventId = eventId;
        this.selectionId = selectionId;
        this.banker = false;
    }

    public Integer getPartNo() {
        return partNo;
    }

    public Selection setPartNo(Integer partNo) {
        this.partNo = partNo;
        return this;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(String selectionId) {
        this.selectionId = selectionId;
    }

    public Odds getOdds() {
        return odds;
    }

    public void setOdds(Odds odds) {
        this.odds = odds;
    }

    public void setDecimalOdd(BigDecimal decimalOdd) {
        this.odds.setDecimal(decimalOdd);
    }

    public Boolean getBanker() {
        return banker;
    }

    public void setBanker(Boolean banker) {
        this.banker = banker;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("partNo", partNo).append("eventId", eventId).append("selectionId", selectionId).append("odds", odds).append("banker", banker).toString();
    }
}
