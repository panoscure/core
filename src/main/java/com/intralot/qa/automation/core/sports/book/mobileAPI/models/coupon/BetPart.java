package com.intralot.qa.automation.core.sports.book.mobileAPI.models.coupon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BetPart {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("sport")
    @Expose
    private Sport sport;
    @SerializedName("competition")
    @Expose
    private Competition competition;
    @SerializedName("outright")
    @Expose
    private Boolean outright;
    @SerializedName("market")
    @Expose
    private Market market;
    @SerializedName("selection")
    @Expose
    private Selection selection;
    @SerializedName("winSelections")
    @Expose
    private List<Object> winSelections = null;
    @SerializedName("selectionType")
    @Expose
    private String selectionType;
    @SerializedName("settlementExchangeRate")
    @Expose
    private Integer settlementExchangeRate;
    @SerializedName("stake")
    @Expose
    private Double stake;
    @SerializedName("bog")
    @Expose
    private Boolean bog;
    @SerializedName("bogEnhanced")
    @Expose
    private Boolean bogEnhanced;
    @SerializedName("winType")
    @Expose
    private String winType;
    @SerializedName("eventIsInplay")
    @Expose
    private Boolean eventIsInplay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Boolean getOutright() {
        return outright;
    }

    public void setOutright(Boolean outright) {
        this.outright = outright;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public Selection getSelection() {
        return selection;
    }

    public void setSelection(Selection selection) {
        this.selection = selection;
    }

    public List<Object> getWinSelections() {
        return winSelections;
    }

    public void setWinSelections(List<Object> winSelections) {
        this.winSelections = winSelections;
    }

    public String getSelectionType() {
        return selectionType;
    }

    public void setSelectionType(String selectionType) {
        this.selectionType = selectionType;
    }

    public Integer getSettlementExchangeRate() {
        return settlementExchangeRate;
    }

    public void setSettlementExchangeRate(Integer settlementExchangeRate) {
        this.settlementExchangeRate = settlementExchangeRate;
    }

    public Double getStake() {
        return stake;
    }

    public void setStake(Double stake) {
        this.stake = stake;
    }

    public Boolean getBog() {
        return bog;
    }

    public void setBog(Boolean bog) {
        this.bog = bog;
    }

    public Boolean getBogEnhanced() {
        return bogEnhanced;
    }

    public void setBogEnhanced(Boolean bogEnhanced) {
        this.bogEnhanced = bogEnhanced;
    }

    public String getWinType() {
        return winType;
    }

    public void setWinType(String winType) {
        this.winType = winType;
    }

    public Boolean getEventIsInplay() {
        return eventIsInplay;
    }

    public void setEventIsInplay(Boolean eventIsInplay) {
        this.eventIsInplay = eventIsInplay;
    }
}