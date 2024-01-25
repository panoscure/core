package com.intralot.qa.automation.core.sports.book.mobileAPI.models.coupon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Bet {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("barcode")
    @Expose
    private String barcode;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("displayStatus")
    @Expose
    private String displayStatus;
    @SerializedName("odd")
    @Expose
    private Object odd;
    @SerializedName("cost")
    @Expose
    private Double cost;
    @SerializedName("stake")
    @Expose
    private Double stake;
    @SerializedName("freebetUsedAmount")
    @Expose
    private Object freebetUsedAmount;
    @SerializedName("promotionWonType")
    @Expose
    private Object promotionWonType;
    @SerializedName("promotionWonAmount")
    @Expose
    private Object promotionWonAmount;
    @SerializedName("badBeatRefundAmount")
    @Expose
    private Double badBeatRefundAmount;
    @SerializedName("columnLengthBonusAmount")
    @Expose
    private Double columnLengthBonusAmount;
    @SerializedName("winnings")
    @Expose
    private Double winnings;
    @SerializedName("events")
    @Expose
    private List<Event> events = null;
    @SerializedName("partialCashoutBetIds")
    @Expose
    private List<Object> partialCashoutBetIds = null;
    @SerializedName("parentBetId")
    @Expose
    private Object parentBetId;
    @SerializedName("childBetId")
    @Expose
    private Object childBetId;
    @SerializedName("systems")
    @Expose
    private List<java.lang.System> systems = null;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("isLive")
    @Expose
    private Boolean isLive;
    @SerializedName("cashoutable")
    @Expose
    private Boolean cashoutable;
    @SerializedName("cashoutValue")
    @Expose
    private Object cashoutValue;
    @SerializedName("minCashoutValue")
    @Expose
    private Object minCashoutValue;
    @SerializedName("potentialReturn")
    @Expose
    private Double potentialReturn;
    @SerializedName("channel")
    @Expose
    private String channel;
    @SerializedName("gameId")
    @Expose
    private Object gameId;
    @SerializedName("childBetSummaries")
    @Expose
    private List<ChildBetSummary> childBetSummaries = null;
    @SerializedName("betParts")
    @Expose
    private BetParts betParts;
    @SerializedName("originalCashoutBetId")
    @Expose
    private Object originalCashoutBetId;
    @SerializedName("taxAmount")
    @Expose
    private Double taxAmount;
    @SerializedName("systemName")
    @Expose
    private String systemName;
    @SerializedName("autoCashoutValue")
    @Expose
    private Object autoCashoutValue;
    @SerializedName("partialCashoutBets")
    @Expose
    private Object partialCashoutBets;
    @SerializedName("buildABet")
    @Expose
    private Boolean buildABet;
    @SerializedName("totalPrice")
    @Expose
    private Double totalPrice;
    @SerializedName("cashoutResult")
    @Expose
    private Object cashoutResult;
    @SerializedName("name")
    @Expose
    private Object name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDisplayStatus() {
        return displayStatus;
    }

    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public Object getOdd() {
        return odd;
    }

    public void setOdd(Object odd) {
        this.odd = odd;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getStake() {
        return stake;
    }

    public void setStake(Double stake) {
        this.stake = stake;
    }

    public Object getFreebetUsedAmount() {
        return freebetUsedAmount;
    }

    public void setFreebetUsedAmount(Object freebetUsedAmount) {
        this.freebetUsedAmount = freebetUsedAmount;
    }

    public Object getPromotionWonType() {
        return promotionWonType;
    }

    public void setPromotionWonType(Object promotionWonType) {
        this.promotionWonType = promotionWonType;
    }

    public Object getPromotionWonAmount() {
        return promotionWonAmount;
    }

    public void setPromotionWonAmount(Object promotionWonAmount) {
        this.promotionWonAmount = promotionWonAmount;
    }

    public Double getBadBeatRefundAmount() {
        return badBeatRefundAmount;
    }

    public void setBadBeatRefundAmount(Double badBeatRefundAmount) {
        this.badBeatRefundAmount = badBeatRefundAmount;
    }

    public Double getColumnLengthBonusAmount() {
        return columnLengthBonusAmount;
    }

    public void setColumnLengthBonusAmount(Double columnLengthBonusAmount) {
        this.columnLengthBonusAmount = columnLengthBonusAmount;
    }

    public Double getWinnings() {
        return winnings;
    }

    public void setWinnings(Double winnings) {
        this.winnings = winnings;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Object> getPartialCashoutBetIds() {
        return partialCashoutBetIds;
    }

    public void setPartialCashoutBetIds(List<Object> partialCashoutBetIds) {
        this.partialCashoutBetIds = partialCashoutBetIds;
    }

    public Object getParentBetId() {
        return parentBetId;
    }

    public void setParentBetId(Object parentBetId) {
        this.parentBetId = parentBetId;
    }

    public Object getChildBetId() {
        return childBetId;
    }

    public void setChildBetId(Object childBetId) {
        this.childBetId = childBetId;
    }

    public List<java.lang.System> getSystems() {
        return systems;
    }

    public void setSystems(List<java.lang.System> systems) {
        this.systems = systems;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Boolean getIsLive() {
        return isLive;
    }

    public void setIsLive(Boolean isLive) {
        this.isLive = isLive;
    }

    public Boolean getCashoutable() {
        return cashoutable;
    }

    public void setCashoutable(Boolean cashoutable) {
        this.cashoutable = cashoutable;
    }

    public Object getCashoutValue() {
        return cashoutValue;
    }

    public void setCashoutValue(Object cashoutValue) {
        this.cashoutValue = cashoutValue;
    }

    public Object getMinCashoutValue() {
        return minCashoutValue;
    }

    public void setMinCashoutValue(Object minCashoutValue) {
        this.minCashoutValue = minCashoutValue;
    }

    public Double getPotentialReturn() {
        return potentialReturn;
    }

    public void setPotentialReturn(Double potentialReturn) {
        this.potentialReturn = potentialReturn;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Object getGameId() {
        return gameId;
    }

    public void setGameId(Object gameId) {
        this.gameId = gameId;
    }

    public List<ChildBetSummary> getChildBetSummaries() {
        return childBetSummaries;
    }

    public void setChildBetSummaries(List<ChildBetSummary> childBetSummaries) {
        this.childBetSummaries = childBetSummaries;
    }

    public BetParts getBetParts() {
        return betParts;
    }

    public void setBetParts(BetParts betParts) {
        this.betParts = betParts;
    }

    public Object getOriginalCashoutBetId() {
        return originalCashoutBetId;
    }

    public void setOriginalCashoutBetId(Object originalCashoutBetId) {
        this.originalCashoutBetId = originalCashoutBetId;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public Object getAutoCashoutValue() {
        return autoCashoutValue;
    }

    public void setAutoCashoutValue(Object autoCashoutValue) {
        this.autoCashoutValue = autoCashoutValue;
    }

    public Object getPartialCashoutBets() {
        return partialCashoutBets;
    }

    public void setPartialCashoutBets(Object partialCashoutBets) {
        this.partialCashoutBets = partialCashoutBets;
    }

    public Boolean getBuildABet() {
        return buildABet;
    }

    public void setBuildABet(Boolean buildABet) {
        this.buildABet = buildABet;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Object getCashoutResult() {
        return cashoutResult;
    }

    public void setCashoutResult(Object cashoutResult) {
        this.cashoutResult = cashoutResult;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }
}