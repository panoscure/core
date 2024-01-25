
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.full.details.fora.specific.bet.slip.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BetPart {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("sport")
    @Expose
    private Sport sport;
    @SerializedName("competitionParent")
    @Expose
    private CompetitionParent competitionParent;
    @SerializedName("competition")
    @Expose
    private Competition competition;
    @SerializedName("event")
    @Expose
    private Event event;
    @SerializedName("outright")
    @Expose
    private Boolean outright;
    @SerializedName("market")
    @Expose
    private Market market;
    @SerializedName("selection")
    @Expose
    private Selection_ selection;
    @SerializedName("winSelections")
    @Expose
    private List<Object> winSelections = null;
    @SerializedName("selectionType")
    @Expose
    private String selectionType;
    @SerializedName("settlementExchangeRate")
    @Expose
    private Float settlementExchangeRate;
    @SerializedName("competitorA")
    @Expose
    private CompetitorA competitorA;
    @SerializedName("competitorB")
    @Expose
    private CompetitorB competitorB;
    @SerializedName("stake")
    @Expose
    private Float stake;
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

    /**
     * No args constructor for use in serialization
     * 
     */
    public BetPart() {
    }

    /**
     * 
     * @param bogEnhanced
     * @param sport
     * @param outright
     * @param bog
     * @param selection
     * @param id
     * @param stake
     * @param competitionParent
     * @param eventIsInplay
     * @param market
     * @param settlementExchangeRate
     * @param winType
     * @param event
     * @param selectionType
     * @param winSelections
     * @param competitorA
     * @param competitorB
     * @param competition
     */
    public BetPart(Long id, Sport sport, CompetitionParent competitionParent, Competition competition, Event event, Boolean outright, Market market, Selection_ selection, List<Object> winSelections, String selectionType, Float settlementExchangeRate, CompetitorA competitorA, CompetitorB competitorB, Float stake, Boolean bog, Boolean bogEnhanced, String winType, Boolean eventIsInplay) {
        super();
        this.id = id;
        this.sport = sport;
        this.competitionParent = competitionParent;
        this.competition = competition;
        this.event = event;
        this.outright = outright;
        this.market = market;
        this.selection = selection;
        this.winSelections = winSelections;
        this.selectionType = selectionType;
        this.settlementExchangeRate = settlementExchangeRate;
        this.competitorA = competitorA;
        this.competitorB = competitorB;
        this.stake = stake;
        this.bog = bog;
        this.bogEnhanced = bogEnhanced;
        this.winType = winType;
        this.eventIsInplay = eventIsInplay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public CompetitionParent getCompetitionParent() {
        return competitionParent;
    }

    public void setCompetitionParent(CompetitionParent competitionParent) {
        this.competitionParent = competitionParent;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
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

    public Selection_ getSelection() {
        return selection;
    }

    public void setSelection(Selection_ selection) {
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

    public Float getSettlementExchangeRate() {
        return settlementExchangeRate;
    }

    public void setSettlementExchangeRate(Float settlementExchangeRate) {
        this.settlementExchangeRate = settlementExchangeRate;
    }

    public CompetitorA getCompetitorA() {
        return competitorA;
    }

    public void setCompetitorA(CompetitorA competitorA) {
        this.competitorA = competitorA;
    }

    public CompetitorB getCompetitorB() {
        return competitorB;
    }

    public void setCompetitorB(CompetitorB competitorB) {
        this.competitorB = competitorB;
    }

    public Float getStake() {
        return stake;
    }

    public void setStake(Float stake) {
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