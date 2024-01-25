package com.intralot.qa.automation.core.sports.book.mpng.models.play;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class SelectionInfo {
    @SerializedName("verifiedStake")
    @Expose
    private BigDecimal verifiedStake;
    @SerializedName("verifiedWinnings")
    @Expose
    private BigDecimal verifiedWinnings;
    @SerializedName("verifiedBonusWinnings")
    @Expose
    private BigDecimal verifiedBonusWinnings;
    @SerializedName("transactionId")
    @Expose
    private Long transactionId;
    @SerializedName("barcode")
    @Expose
    private String barcode;
    @SerializedName("cashOut")
    @Expose
    private Boolean cashOut;
    @SerializedName("overask")
    @Expose
    private Boolean overask;
    @SerializedName("verifiedOdds")
    @Expose
    private VerifiedOdds verifiedOdds;
    @SerializedName("discount")
    @Expose
    private Object discount;
    @SerializedName("live")
    @Expose
    private Boolean live;
    @SerializedName("bonus")
    @Expose
    private Object bonus;
    @SerializedName("betSlipId")
    @Expose
    private Long betSlipId;

    public BigDecimal getVerifiedStake() {
        return verifiedStake;
    }

    public void setVerifiedStake(BigDecimal verifiedStake) {
        this.verifiedStake = verifiedStake;
    }

    public BigDecimal getVerifiedWinnings() {
        return verifiedWinnings;
    }

    public void setVerifiedWinnings(BigDecimal verifiedWinnings) {
        this.verifiedWinnings = verifiedWinnings;
    }

    public BigDecimal getVerifiedBonusWinnings() {
        return verifiedBonusWinnings;
    }

    public void setVerifiedBonusWinnings(BigDecimal verifiedBonusWinnings) {
        this.verifiedBonusWinnings = verifiedBonusWinnings;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Boolean getCashOut() {
        return cashOut;
    }

    public void setCashOut(Boolean cashOut) {
        this.cashOut = cashOut;
    }

    public Boolean getOverask() {
        return overask;
    }

    public void setOverask(Boolean overask) {
        this.overask = overask;
    }

    public VerifiedOdds getVerifiedOdds() {
        return verifiedOdds;
    }

    public void setVerifiedOdds(VerifiedOdds verifiedOdds) {
        this.verifiedOdds = verifiedOdds;
    }

    public Object getDiscount() {
        return discount;
    }

    public void setDiscount(Object discount) {
        this.discount = discount;
    }

    public Boolean getLive() {
        return live;
    }

    public void setLive(Boolean live) {
        this.live = live;
    }

    public Object getBonus() {
        return bonus;
    }

    public void setBonus(Object bonus) {
        this.bonus = bonus;
    }

    public Long getBetSlipId() {
        return betSlipId;
    }

    public void setBetSlipId(Long betSlipId) {
        this.betSlipId = betSlipId;
    }

}
