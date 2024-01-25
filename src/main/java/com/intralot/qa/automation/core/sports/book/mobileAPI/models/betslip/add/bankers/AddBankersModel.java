package com.intralot.qa.automation.core.sports.book.mobileAPI.models.betslip.add.bankers;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AddBankersModel {

    @SerializedName("events")
    @Expose
    private List<Event> events = null;
    @SerializedName("system")
    @Expose
    private java.lang.System system;
    @SerializedName("totalStake")
    @Expose
    private Integer totalStake;
    @SerializedName("totalWinnings")
    @Expose
    private Double totalWinnings;
    @SerializedName("useBankers")
    @Expose
    private Boolean useBankers;
    @SerializedName("instantBet")
    @Expose
    private Boolean instantBet;
    @SerializedName("totalBonusWinnings")
    @Expose
    private Double totalBonusWinnings;
    @SerializedName("useBonusFunds")
    @Expose
    private Object useBonusFunds;
    @SerializedName("errors")
    @Expose
    private List<Object> errors = null;
    @SerializedName("warnings")
    @Expose
    private List<Object> warnings = null;
    @SerializedName("acceptOdds")
    @Expose
    private String acceptOdds;
    @SerializedName("defaultStake")
    @Expose
    private Integer defaultStake;
    @SerializedName("defaultStakeFactor")
    @Expose
    private List<Integer> defaultStakeFactor = null;
    @SerializedName("minimumBet")
    @Expose
    private Double minimumBet;
    @SerializedName("maximumBet")
    @Expose
    private Integer maximumBet;
    @SerializedName("winningsLimit")
    @Expose
    private Integer winningsLimit;
    @SerializedName("winningsLimitReached")
    @Expose
    private Boolean winningsLimitReached;
    @SerializedName("promotions")
    @Expose
    private List<Object> promotions = null;
    @SerializedName("maxEvents")
    @Expose
    private Integer maxEvents;

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public java.lang.System getSystem() {
        return system;
    }

    public void setSystem(java.lang.System system) {
        this.system = system;
    }

    public Integer getTotalStake() {
        return totalStake;
    }

    public void setTotalStake(Integer totalStake) {
        this.totalStake = totalStake;
    }

    public Double getTotalWinnings() {
        return totalWinnings;
    }

    public void setTotalWinnings(Double totalWinnings) {
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

    public Double getTotalBonusWinnings() {
        return totalBonusWinnings;
    }

    public void setTotalBonusWinnings(Double totalBonusWinnings) {
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

    public String getAcceptOdds() {
        return acceptOdds;
    }

    public void setAcceptOdds(String acceptOdds) {
        this.acceptOdds = acceptOdds;
    }

    public Integer getDefaultStake() {
        return defaultStake;
    }

    public void setDefaultStake(Integer defaultStake) {
        this.defaultStake = defaultStake;
    }

    public List<Integer> getDefaultStakeFactor() {
        return defaultStakeFactor;
    }

    public void setDefaultStakeFactor(List<Integer> defaultStakeFactor) {
        this.defaultStakeFactor = defaultStakeFactor;
    }

    public Double getMinimumBet() {
        return minimumBet;
    }

    public void setMinimumBet(Double minimumBet) {
        this.minimumBet = minimumBet;
    }

    public Integer getMaximumBet() {
        return maximumBet;
    }

    public void setMaximumBet(Integer maximumBet) {
        this.maximumBet = maximumBet;
    }

    public Integer getWinningsLimit() {
        return winningsLimit;
    }

    public void setWinningsLimit(Integer winningsLimit) {
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

    public Integer getMaxEvents() {
        return maxEvents;
    }

    public void setMaxEvents(Integer maxEvents) {
        this.maxEvents = maxEvents;
    }
}
