package com.intralot.qa.automation.core.sports.book.mpng.models.play;

import java.math.BigDecimal;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlaceBetModel {

    @SerializedName("events")
    @Expose
    private List<Event> events = null;
    @SerializedName("system")
    @Expose
    private System system;
    @SerializedName("totalStake")
    @Expose
    private BigDecimal totalStake;
    @SerializedName("totalWinnings")
    @Expose
    private BigDecimal totalWinnings;
    @SerializedName("useBankers")
    @Expose
    private Boolean useBankers;
    @SerializedName("instantBet")
    @Expose
    private Boolean instantBet;
    @SerializedName("totalBonusWinnings")
    @Expose
    private BigDecimal totalBonusWinnings;
    @SerializedName("useBonusFunds")
    @Expose
    private Object useBonusFunds;
    @SerializedName("errors")
    @Expose
    private List<Object> errors = null;
    @SerializedName("warnings")
    @Expose
    private List<Object> warnings = null;
    @SerializedName("results")
    @Expose
    private Object results;
    @SerializedName("acceptOdds")
    @Expose
    private BigDecimal acceptOdds;
    @SerializedName("defaultStake")
    @Expose
    private BigDecimal defaultStake;
    @SerializedName("defaultStakeFactor")
    @Expose
    private List<Object> defaultStakeFactor = null;
    @SerializedName("minimumBet")
    @Expose
    private BigDecimal minimumBet;
    @SerializedName("maximumBet")
    @Expose
    private BigDecimal maximumBet;
    @SerializedName("winningsLimit")
    @Expose
    private BigDecimal winningsLimit;
    @SerializedName("winningsLimitReached")
    @Expose
    private Boolean winningsLimitReached;
    @SerializedName("promotions")
    @Expose
    private List<Object> promotions = null;

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public BigDecimal getTotalStake() {
        return totalStake;
    }

    public void setTotalStake(BigDecimal totalStake) {
        this.totalStake = totalStake;
    }

    public BigDecimal getTotalWinnings() {
        return totalWinnings;
    }

    public void setTotalWinnings(BigDecimal totalWinnings) {
        this.totalWinnings = totalWinnings;
    }

    public Boolean getUseBankers() {
        return useBankers;
    }

    public void setUseBankers(Boolean useBankers) {
        this.useBankers = useBankers;
    }

    public Boolean getInstantBet() {
        return instantBet;
    }

    public void setInstantBet(Boolean instantBet) {
        this.instantBet = instantBet;
    }

    public BigDecimal getTotalBonusWinnings() {
        return totalBonusWinnings;
    }

    public void setTotalBonusWinnings(BigDecimal totalBonusWinnings) {
        this.totalBonusWinnings = totalBonusWinnings;
    }

    public Object getUseBonusFunds() {
        return useBonusFunds;
    }

    public void setUseBonusFunds(Object useBonusFunds) {
        this.useBonusFunds = useBonusFunds;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public List<Object> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<Object> warnings) {
        this.warnings = warnings;
    }

    public Object getResults() {
        return results;
    }

    public void setResults(String Object) {
        this.results = results;
    }

    public BigDecimal getAcceptOdds() {
        return acceptOdds;
    }

    public void setAcceptOdds(BigDecimal acceptOdds) {
        this.acceptOdds = acceptOdds;
    }

    public BigDecimal getDefaultStake() {
        return defaultStake;
    }

    public void setDefaultStake(BigDecimal defaultStake) {
        this.defaultStake = defaultStake;
    }

    public List<Object> getDefaultStakeFactor() {
        return defaultStakeFactor;
    }

    public void setDefaultStakeFactor(List<Object> defaultStakeFactor) {
        this.defaultStakeFactor = defaultStakeFactor;
    }

    public BigDecimal getMinimumBet() {
        return minimumBet;
    }

    public void setMinimumBet(BigDecimal minimumBet) {
        this.minimumBet = minimumBet;
    }

    public BigDecimal getMaximumBet() {
        return maximumBet;
    }

    public void setMaximumBet(BigDecimal maximumBet) {
        this.maximumBet = maximumBet;
    }

    public BigDecimal getWinningsLimit() {
        return winningsLimit;
    }

    public void setWinningsLimit(BigDecimal winningsLimit) {
        this.winningsLimit = winningsLimit;
    }

    public Boolean getWinningsLimitReached() {
        return winningsLimitReached;
    }

    public void setWinningsLimitReached(Boolean winningsLimitReached) {
        this.winningsLimitReached = winningsLimitReached;
    }

    public List<Object> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Object> promotions) {
        this.promotions = promotions;
    }

}