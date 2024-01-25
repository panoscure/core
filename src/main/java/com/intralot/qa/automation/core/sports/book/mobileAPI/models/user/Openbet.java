package com.intralot.qa.automation.core.sports.book.mobileAPI.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

public class Openbet {
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
    private BigDecimal cost;
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
    private BigDecimal badBeatRefundAmount;
    @SerializedName("columnLengthBonusAmount")
    @Expose
    private BigDecimal columnLengthBonusAmount;
    @SerializedName("winnings")
    @Expose
    private Object winnings;
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
    private List<System> systems = null;
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
    private BigDecimal cashoutValue;
    @SerializedName("minCashoutValue")
    @Expose
    private BigDecimal minCashoutValue;
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
    private Object childBetSummaries;
    @SerializedName("betParts")
    @Expose
    private Object betParts;
    @SerializedName("originalCashoutBetId")
    @Expose
    private Object originalCashoutBetId;
    @SerializedName("taxAmount")
    @Expose
    private Object taxAmount;
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

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
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

    public BigDecimal getBadBeatRefundAmount() {
        return badBeatRefundAmount;
    }

    public void setBadBeatRefundAmount(BigDecimal badBeatRefundAmount) {
        this.badBeatRefundAmount = badBeatRefundAmount;
    }

    public BigDecimal getColumnLengthBonusAmount() {
        return columnLengthBonusAmount;
    }

    public void setColumnLengthBonusAmount(BigDecimal columnLengthBonusAmount) {
        this.columnLengthBonusAmount = columnLengthBonusAmount;
    }

    public Object getWinnings() {
        return winnings;
    }

    public void setWinnings(Object winnings) {
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

    public List<System> getSystems() {
        return systems;
    }

    public void setSystems(List<System> systems) {
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

    public BigDecimal getCashoutValue() {
        return cashoutValue;
    }

    public void setCashoutValue(BigDecimal cashoutValue) {
        this.cashoutValue = cashoutValue;
    }

    public BigDecimal getMinCashoutValue() {
        return minCashoutValue;
    }

    public void setMinCashoutValue(BigDecimal minCashoutValue) {
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

    public Object getChildBetSummaries() {
        return childBetSummaries;
    }

    public void setChildBetSummaries(Object childBetSummaries) {
        this.childBetSummaries = childBetSummaries;
    }

    public Object getBetParts() {
        return betParts;
    }

    public void setBetParts(Object betParts) {
        this.betParts = betParts;
    }

    public Object getOriginalCashoutBetId() {
        return originalCashoutBetId;
    }

    public void setOriginalCashoutBetId(Object originalCashoutBetId) {
        this.originalCashoutBetId = originalCashoutBetId;
    }

    public Object getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Object taxAmount) {
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

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }
}
