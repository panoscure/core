
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Bet {

    @SerializedName("accountBonusId")
    @Expose
    private Integer accountBonusId;
    @SerializedName("autoCashout")
    @Expose
    private AutoCashout autoCashout;
    @SerializedName("barcode")
    @Expose
    private String barcode;
    @SerializedName("betId")
    @Expose
    private Integer betId;
    @SerializedName("betNo")
    @Expose
    private Integer betNo;
    @SerializedName("betTime")
    @Expose
    private Integer betTime;
    @SerializedName("bonusCodeAwarded")
    @Expose
    private String bonusCodeAwarded;
    @SerializedName("bonusCodeRulesOfUse")
    @Expose
    private String bonusCodeRulesOfUse;
    @SerializedName("bonusStake")
    @Expose
    private BonusStake bonusStake;
    @SerializedName("bonusWinnings")
    @Expose
    private Integer bonusWinnings;
    @SerializedName("cashOut")
    @Expose
    private Boolean cashOut;
    @SerializedName("channelId")
    @Expose
    private Integer channelId;
    @SerializedName("checkOdds")
    @Expose
    private Integer checkOdds;
    @SerializedName("childBetId")
    @Expose
    private String childBetId;
    @SerializedName("currentlyInplay")
    @Expose
    private Boolean currentlyInplay;
    @SerializedName("discountBonusAmount")
    @Expose
    private Integer discountBonusAmount;
    @SerializedName("discountBonusId")
    @Expose
    private Integer discountBonusId;
    @SerializedName("displayStatus")
    @Expose
    private String displayStatus;
    @SerializedName("extBetId")
    @Expose
    private String extBetId;
    @SerializedName("freeBet")
    @Expose
    private Boolean freeBet;
    @SerializedName("freeBetBonusAmount")
    @Expose
    private FreeBetBonusAmount freeBetBonusAmount;
    @SerializedName("limitedStake")
    @Expose
    private Integer limitedStake;
    @SerializedName("liveBet")
    @Expose
    private Boolean liveBet;
    @SerializedName("originalCashoutBetId")
    @Expose
    private Integer originalCashoutBetId;
    @SerializedName("overAskId")
    @Expose
    private String overAskId;
    @SerializedName("parentBetId")
    @Expose
    private String parentBetId;
    @SerializedName("partialCashoutBetIds")
    @Expose
    private List<Integer> partialCashoutBetIds = null;
    @SerializedName("payout")
    @Expose
    private Integer payout;
    @SerializedName("potentialBonusWinnings")
    @Expose
    private Integer potentialBonusWinnings;
    @SerializedName("potentialPayout")
    @Expose
    private Integer potentialPayout;
    @SerializedName("promoDescription")
    @Expose
    private String promoDescription;
    @SerializedName("referralPath")
    @Expose
    private String referralPath;
    @SerializedName("refund")
    @Expose
    private Integer refund;
    @SerializedName("rejectionReason")
    @Expose
    private String rejectionReason;
    @SerializedName("selections")
    @Expose
    private List<Selection__> selections = null;
    @SerializedName("stake")
    @Expose
    private Stake_ stake;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("system")
    @Expose
    private System__ system;
    @SerializedName("taxOnReturnsPcnt")
    @Expose
    private Integer taxOnReturnsPcnt;
    @SerializedName("totalCost")
    @Expose
    private Integer totalCost;
    @SerializedName("totalDiscountStake")
    @Expose
    private Integer totalDiscountStake;
    @SerializedName("totalOdds")
    @Expose
    private Integer totalOdds;
    @SerializedName("totalPrice")
    @Expose
    private Integer totalPrice;
    @SerializedName("totalStake")
    @Expose
    private Integer totalStake;
    @SerializedName("transactionId")
    @Expose
    private Integer transactionId;
    @SerializedName("voucherCode")
    @Expose
    private String voucherCode;
    @SerializedName("voucherCodeUsed")
    @Expose
    private String voucherCodeUsed;
    @SerializedName("winType")
    @Expose
    private String winType;
    @SerializedName("retailerId")
    @Expose
    private String retailerId;
    @SerializedName("paidByRetailer")
    @Expose
    private String paidByRetailer;
    @SerializedName("paidTime")
    @Expose
    private Integer paidTime;

    public Integer getAccountBonusId() {
        return accountBonusId;
    }

    public void setAccountBonusId(Integer accountBonusId) {
        this.accountBonusId = accountBonusId;
    }

    public AutoCashout getAutoCashout() {
        return autoCashout;
    }

    public void setAutoCashout(AutoCashout autoCashout) {
        this.autoCashout = autoCashout;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getBetId() {
        return betId;
    }

    public void setBetId(Integer betId) {
        this.betId = betId;
    }

    public Integer getBetNo() {
        return betNo;
    }

    public void setBetNo(Integer betNo) {
        this.betNo = betNo;
    }

    public Integer getBetTime() {
        return betTime;
    }

    public void setBetTime(Integer betTime) {
        this.betTime = betTime;
    }

    public String getBonusCodeAwarded() {
        return bonusCodeAwarded;
    }

    public void setBonusCodeAwarded(String bonusCodeAwarded) {
        this.bonusCodeAwarded = bonusCodeAwarded;
    }

    public String getBonusCodeRulesOfUse() {
        return bonusCodeRulesOfUse;
    }

    public void setBonusCodeRulesOfUse(String bonusCodeRulesOfUse) {
        this.bonusCodeRulesOfUse = bonusCodeRulesOfUse;
    }

    public BonusStake getBonusStake() {
        return bonusStake;
    }

    public void setBonusStake(BonusStake bonusStake) {
        this.bonusStake = bonusStake;
    }

    public Integer getBonusWinnings() {
        return bonusWinnings;
    }

    public void setBonusWinnings(Integer bonusWinnings) {
        this.bonusWinnings = bonusWinnings;
    }

    public Boolean getCashOut() {
        return cashOut;
    }

    public void setCashOut(Boolean cashOut) {
        this.cashOut = cashOut;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getCheckOdds() {
        return checkOdds;
    }

    public void setCheckOdds(Integer checkOdds) {
        this.checkOdds = checkOdds;
    }

    public String getChildBetId() {
        return childBetId;
    }

    public void setChildBetId(String childBetId) {
        this.childBetId = childBetId;
    }

    public Boolean getCurrentlyInplay() {
        return currentlyInplay;
    }

    public void setCurrentlyInplay(Boolean currentlyInplay) {
        this.currentlyInplay = currentlyInplay;
    }

    public Integer getDiscountBonusAmount() {
        return discountBonusAmount;
    }

    public void setDiscountBonusAmount(Integer discountBonusAmount) {
        this.discountBonusAmount = discountBonusAmount;
    }

    public Integer getDiscountBonusId() {
        return discountBonusId;
    }

    public void setDiscountBonusId(Integer discountBonusId) {
        this.discountBonusId = discountBonusId;
    }

    public String getDisplayStatus() {
        return displayStatus;
    }

    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public String getExtBetId() {
        return extBetId;
    }

    public void setExtBetId(String extBetId) {
        this.extBetId = extBetId;
    }

    public Boolean getFreeBet() {
        return freeBet;
    }

    public void setFreeBet(Boolean freeBet) {
        this.freeBet = freeBet;
    }

    public FreeBetBonusAmount getFreeBetBonusAmount() {
        return freeBetBonusAmount;
    }

    public void setFreeBetBonusAmount(FreeBetBonusAmount freeBetBonusAmount) {
        this.freeBetBonusAmount = freeBetBonusAmount;
    }

    public Integer getLimitedStake() {
        return limitedStake;
    }

    public void setLimitedStake(Integer limitedStake) {
        this.limitedStake = limitedStake;
    }

    public Boolean getLiveBet() {
        return liveBet;
    }

    public void setLiveBet(Boolean liveBet) {
        this.liveBet = liveBet;
    }

    public Integer getOriginalCashoutBetId() {
        return originalCashoutBetId;
    }

    public void setOriginalCashoutBetId(Integer originalCashoutBetId) {
        this.originalCashoutBetId = originalCashoutBetId;
    }

    public String getOverAskId() {
        return overAskId;
    }

    public void setOverAskId(String overAskId) {
        this.overAskId = overAskId;
    }

    public String getParentBetId() {
        return parentBetId;
    }

    public void setParentBetId(String parentBetId) {
        this.parentBetId = parentBetId;
    }

    public List<Integer> getPartialCashoutBetIds() {
        return partialCashoutBetIds;
    }

    public void setPartialCashoutBetIds(List<Integer> partialCashoutBetIds) {
        this.partialCashoutBetIds = partialCashoutBetIds;
    }

    public Integer getPayout() {
        return payout;
    }

    public void setPayout(Integer payout) {
        this.payout = payout;
    }

    public Integer getPotentialBonusWinnings() {
        return potentialBonusWinnings;
    }

    public void setPotentialBonusWinnings(Integer potentialBonusWinnings) {
        this.potentialBonusWinnings = potentialBonusWinnings;
    }

    public Integer getPotentialPayout() {
        return potentialPayout;
    }

    public void setPotentialPayout(Integer potentialPayout) {
        this.potentialPayout = potentialPayout;
    }

    public String getPromoDescription() {
        return promoDescription;
    }

    public void setPromoDescription(String promoDescription) {
        this.promoDescription = promoDescription;
    }

    public String getReferralPath() {
        return referralPath;
    }

    public void setReferralPath(String referralPath) {
        this.referralPath = referralPath;
    }

    public Integer getRefund() {
        return refund;
    }

    public void setRefund(Integer refund) {
        this.refund = refund;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public List<Selection__> getSelections() {
        return selections;
    }

    public void setSelections(List<Selection__> selections) {
        this.selections = selections;
    }

    public Stake_ getStake() {
        return stake;
    }

    public void setStake(Stake_ stake) {
        this.stake = stake;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public System__ getSystem() {
        return system;
    }

    public void setSystem(System__ system) {
        this.system = system;
    }

    public Integer getTaxOnReturnsPcnt() {
        return taxOnReturnsPcnt;
    }

    public void setTaxOnReturnsPcnt(Integer taxOnReturnsPcnt) {
        this.taxOnReturnsPcnt = taxOnReturnsPcnt;
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public Integer getTotalDiscountStake() {
        return totalDiscountStake;
    }

    public void setTotalDiscountStake(Integer totalDiscountStake) {
        this.totalDiscountStake = totalDiscountStake;
    }

    public Integer getTotalOdds() {
        return totalOdds;
    }

    public void setTotalOdds(Integer totalOdds) {
        this.totalOdds = totalOdds;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getTotalStake() {
        return totalStake;
    }

    public void setTotalStake(Integer totalStake) {
        this.totalStake = totalStake;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }

    public String getVoucherCodeUsed() {
        return voucherCodeUsed;
    }

    public void setVoucherCodeUsed(String voucherCodeUsed) {
        this.voucherCodeUsed = voucherCodeUsed;
    }

    public String getWinType() {
        return winType;
    }

    public void setWinType(String winType) {
        this.winType = winType;
    }

    public String getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(String retailerId) {
        this.retailerId = retailerId;
    }

    public String getPaidByRetailer() {
        return paidByRetailer;
    }

    public void setPaidByRetailer(String paidByRetailer) {
        this.paidByRetailer = paidByRetailer;
    }

    public Integer getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Integer paidTime) {
        this.paidTime = paidTime;
    }

}
