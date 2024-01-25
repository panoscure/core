package com.intralot.qa.automation.core.sports.book.mobileAPI.models.antepost.antepost.list.per.sport;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Market {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("antepost")
    @Expose
    private Boolean antepost;
    @SerializedName("marketGroupId")
    @Expose
    private Integer marketGroupId;
    @SerializedName("marketGroupIds")
    @Expose
    private List<Object> marketGroupIds = null;
    @SerializedName("subGroupId")
    @Expose
    private String subGroupId;
    @SerializedName("fixedId")
    @Expose
    private String fixedId;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("odds")
    @Expose
    private List<Odd> odds = null;
    @SerializedName("minimumRestriction")
    @Expose
    private Integer minimumRestriction;
    @SerializedName("maximumRestriction")
    @Expose
    private Integer maximumRestriction;
    @SerializedName("isChanged")
    @Expose
    private Boolean isChanged;
    @SerializedName("balanced")
    @Expose
    private Boolean balanced;
    @SerializedName("displayed")
    @Expose
    private Boolean displayed;
    @SerializedName("legacyMarketId")
    @Expose
    private String legacyMarketId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("scores")
    @Expose
    private List<Object> scores = null;
    @SerializedName("lines")
    @Expose
    private List<Object> lines = null;
    @SerializedName("event")
    @Expose
    private Object event;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("veryShortName")
    @Expose
    private Object veryShortName;
    @SerializedName("marketTypeName")
    @Expose
    private String marketTypeName;
    @SerializedName("priority")
    @Expose
    private Object priority;
    @SerializedName("rows")
    @Expose
    private Integer rows;
    @SerializedName("cols")
    @Expose
    private Integer cols;
    @SerializedName("winningLegsBonus")
    @Expose
    private Boolean winningLegsBonus;
    @SerializedName("betBuilder")
    @Expose
    private Boolean betBuilder;
    @SerializedName("grouped")
    @Expose
    private Boolean grouped;
    @SerializedName("isHandicap")
    @Expose
    private Boolean isHandicap;
    @SerializedName("bonusType")
    @Expose
    private String bonusType;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getAntepost() {
        return antepost;
    }

    public void setAntepost(Boolean antepost) {
        this.antepost = antepost;
    }

    public Integer getMarketGroupId() {
        return marketGroupId;
    }

    public void setMarketGroupId(Integer marketGroupId) {
        this.marketGroupId = marketGroupId;
    }

    public List<Object> getMarketGroupIds() {
        return marketGroupIds;
    }

    public void setMarketGroupIds(List<Object> marketGroupIds) {
        this.marketGroupIds = marketGroupIds;
    }

    public String getSubGroupId() {
        return subGroupId;
    }

    public void setSubGroupId(String subGroupId) {
        this.subGroupId = subGroupId;
    }

    public String getFixedId() {
        return fixedId;
    }

    public void setFixedId(String fixedId) {
        this.fixedId = fixedId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public List<Odd> getOdds() {
        return odds;
    }

    public void setOdds(List<Odd> odds) {
        this.odds = odds;
    }

    public Integer getMinimumRestriction() {
        return minimumRestriction;
    }

    public void setMinimumRestriction(Integer minimumRestriction) {
        this.minimumRestriction = minimumRestriction;
    }

    public Integer getMaximumRestriction() {
        return maximumRestriction;
    }

    public void setMaximumRestriction(Integer maximumRestriction) {
        this.maximumRestriction = maximumRestriction;
    }

    public Boolean getIsChanged() {
        return isChanged;
    }

    public void setIsChanged(Boolean isChanged) {
        this.isChanged = isChanged;
    }

    public Boolean getBalanced() {
        return balanced;
    }

    public void setBalanced(Boolean balanced) {
        this.balanced = balanced;
    }

    public Boolean getDisplayed() {
        return displayed;
    }

    public void setDisplayed(Boolean displayed) {
        this.displayed = displayed;
    }

    public String getLegacyMarketId() {
        return legacyMarketId;
    }

    public void setLegacyMarketId(String legacyMarketId) {
        this.legacyMarketId = legacyMarketId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Object> getScores() {
        return scores;
    }

    public void setScores(List<Object> scores) {
        this.scores = scores;
    }

    public List<Object> getLines() {
        return lines;
    }

    public void setLines(List<Object> lines) {
        this.lines = lines;
    }

    public Object getEvent() {
        return event;
    }

    public void setEvent(Object event) {
        this.event = event;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Object getVeryShortName() {
        return veryShortName;
    }

    public void setVeryShortName(Object veryShortName) {
        this.veryShortName = veryShortName;
    }

    public String getMarketTypeName() {
        return marketTypeName;
    }

    public void setMarketTypeName(String marketTypeName) {
        this.marketTypeName = marketTypeName;
    }

    public Object getPriority() {
        return priority;
    }

    public void setPriority(Object priority) {
        this.priority = priority;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getCols() {
        return cols;
    }

    public void setCols(Integer cols) {
        this.cols = cols;
    }

    public Boolean getWinningLegsBonus() {
        return winningLegsBonus;
    }

    public void setWinningLegsBonus(Boolean winningLegsBonus) {
        this.winningLegsBonus = winningLegsBonus;
    }

    public Boolean getBetBuilder() {
        return betBuilder;
    }

    public void setBetBuilder(Boolean betBuilder) {
        this.betBuilder = betBuilder;
    }

    public Boolean getGrouped() {
        return grouped;
    }

    public void setGrouped(Boolean grouped) {
        this.grouped = grouped;
    }

    public Boolean getIsHandicap() {
        return isHandicap;
    }

    public void setIsHandicap(Boolean isHandicap) {
        this.isHandicap = isHandicap;
    }

    public String getBonusType() {
        return bonusType;
    }

    public void setBonusType(String bonusType) {
        this.bonusType = bonusType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
