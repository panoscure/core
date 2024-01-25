
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Selection__ {

    @SerializedName("banker")
    @Expose
    private Boolean banker;
    @SerializedName("eventId")
    @Expose
    private Integer eventId;
    @SerializedName("getiMarket")
    @Expose
    private Integer getiMarket;
    @SerializedName("groupValue")
    @Expose
    private List<Integer> groupValue = null;
    @SerializedName("imarket")
    @Expose
    private Integer imarket;
    @SerializedName("lines")
    @Expose
    private List<Integer> lines = null;
    @SerializedName("odds")
    @Expose
    private Odds_ odds;
    @SerializedName("partNo")
    @Expose
    private Integer partNo;
    @SerializedName("scores")
    @Expose
    private List<Integer> scores = null;
    @SerializedName("selectionId")
    @Expose
    private String selectionId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("selectionNames")
    @Expose
    private SelectionNames selectionNames;
    @SerializedName("selectionName")
    @Expose
    private String selectionName;
    @SerializedName("marketName")
    @Expose
    private String marketName;
    @SerializedName("eventName")
    @Expose
    private String eventName;
    @SerializedName("eventTime")
    @Expose
    private String eventTime;
    @SerializedName("resultType")
    @Expose
    private String resultType;
    @SerializedName("priceChangedAfterLockDate")
    @Expose
    private Boolean priceChangedAfterLockDate;
    @SerializedName("inplay")
    @Expose
    private Boolean inplay;
    @SerializedName("pitcherAName")
    @Expose
    private String pitcherAName;
    @SerializedName("pitcherBName")
    @Expose
    private String pitcherBName;

    public Boolean getBanker() {
        return banker;
    }

    public void setBanker(Boolean banker) {
        this.banker = banker;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getGetiMarket() {
        return getiMarket;
    }

    public void setGetiMarket(Integer getiMarket) {
        this.getiMarket = getiMarket;
    }

    public List<Integer> getGroupValue() {
        return groupValue;
    }

    public void setGroupValue(List<Integer> groupValue) {
        this.groupValue = groupValue;
    }

    public Integer getImarket() {
        return imarket;
    }

    public void setImarket(Integer imarket) {
        this.imarket = imarket;
    }

    public List<Integer> getLines() {
        return lines;
    }

    public void setLines(List<Integer> lines) {
        this.lines = lines;
    }

    public Odds_ getOdds() {
        return odds;
    }

    public void setOdds(Odds_ odds) {
        this.odds = odds;
    }

    public Integer getPartNo() {
        return partNo;
    }

    public void setPartNo(Integer partNo) {
        this.partNo = partNo;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }

    public String getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(String selectionId) {
        this.selectionId = selectionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SelectionNames getSelectionNames() {
        return selectionNames;
    }

    public void setSelectionNames(SelectionNames selectionNames) {
        this.selectionNames = selectionNames;
    }

    public String getSelectionName() {
        return selectionName;
    }

    public void setSelectionName(String selectionName) {
        this.selectionName = selectionName;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public Boolean getPriceChangedAfterLockDate() {
        return priceChangedAfterLockDate;
    }

    public void setPriceChangedAfterLockDate(Boolean priceChangedAfterLockDate) {
        this.priceChangedAfterLockDate = priceChangedAfterLockDate;
    }

    public Boolean getInplay() {
        return inplay;
    }

    public void setInplay(Boolean inplay) {
        this.inplay = inplay;
    }

    public String getPitcherAName() {
        return pitcherAName;
    }

    public void setPitcherAName(String pitcherAName) {
        this.pitcherAName = pitcherAName;
    }

    public String getPitcherBName() {
        return pitcherBName;
    }

    public void setPitcherBName(String pitcherBName) {
        this.pitcherBName = pitcherBName;
    }

}
