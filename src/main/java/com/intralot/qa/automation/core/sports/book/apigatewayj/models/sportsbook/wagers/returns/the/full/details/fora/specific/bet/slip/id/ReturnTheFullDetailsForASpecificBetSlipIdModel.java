
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.full.details.fora.specific.bet.slip.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.BaseModel;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnTheFullDetailsForASpecificBetSlipIdModel extends BaseModel {
    @SerializedName("selections")
    @Expose
    private List<Selection> selections = null;
    @SerializedName("stake")
    @Expose
    private Stake stake;
    @SerializedName("system")
    @Expose
    private java.lang.System system;
    @SerializedName("winType")
    @Expose
    private String winType;
    @SerializedName("potentialPayout")
    @Expose
    private BigDecimal potentialPayout;
    @SerializedName("payout")
    @Expose
    private BigDecimal payout;
    @SerializedName("betId")
    @Expose
    private Long betId;
    @SerializedName("betNo")
    @Expose
    private Long betNo;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("liveBet")
    @Expose
    private Boolean liveBet;
    @SerializedName("totalPrice")
    @Expose
    private BigDecimal totalPrice;
    @SerializedName("betTime")
    @Expose
    private Long betTime;
    @SerializedName("channelId")
    @Expose
    private Long channelId;
    @SerializedName("bonusWinnings")
    @Expose
    private BigDecimal bonusWinnings;
    @SerializedName("freeBet")
    @Expose
    private Boolean freeBet;
    @SerializedName("displayStatus")
    @Expose
    private String displayStatus;
    @SerializedName("potentialBonusWinnings")
    @Expose
    private BigDecimal potentialBonusWinnings;
    @SerializedName("extBetId")
    @Expose
    private String extBetId;
    @SerializedName("partialCashoutBetIds")
    @Expose
    private List<Object> partialCashoutBetIds = null;
    @SerializedName("discountBonusAmount")
    @Expose
    private BigDecimal discountBonusAmount;
    @SerializedName("refund")
    @Expose
    private BigDecimal refund;
    @SerializedName("buildABet")
    @Expose
    private Boolean buildABet;
    @SerializedName("accountId")
    @Expose
    private Long accountId;
    @SerializedName("extAccountId")
    @Expose
    private String extAccountId;
    @SerializedName("capturedStake")
    @Expose
    private CapturedStake capturedStake;
    @SerializedName("settlementType")
    @Expose
    private String settlementType;
    @SerializedName("enhancements")
    @Expose
    private List<Object> enhancements = null;
    @SerializedName("childBetSummaries")
    @Expose
    private List<Object> childBetSummaries = null;
    @SerializedName("betRiskGroup")
    @Expose
    private String betRiskGroup;
    @SerializedName("masterBetId")
    @Expose
    private String masterBetId;
    @SerializedName("betSlipId")
    @Expose
    private String betSlipId;
    @SerializedName("betStatus")
    @Expose
    private String betStatus;
    @SerializedName("winnings")
    @Expose
    private BigDecimal winnings;
    @SerializedName("parts")
    @Expose
    private Parts parts;
    @SerializedName("currentlyInplay")
    @Expose
    private Boolean currentlyInplay;


    /**
     * No args constructor for use in serialization
     */
    public ReturnTheFullDetailsForASpecificBetSlipIdModel() {
    }

    /**
     * @param freeBet
     * @param accountId
     * @param liveBet
     * @param winnings
     * @param parts
     * @param betStatus
     * @param capturedStake
     * @param buildABet
     * @param stake
     * @param winType
     * @param refund
     * @param enhancements
     * @param selections
     * @param potentialPayout
     * @param totalPrice
     * @param potentialBonusWinnings
     * @param betSlipId
     * @param currentlyInplay
     * @param channelId
     * @param status
     * @param betTime
     * @param displayStatus
     * @param betNo
     * @param betId
     * @param betRiskGroup
     * @param partialCashoutBetIds
     * @param system
     * @param extBetId
     * @param childBetSummaries
     * @param extAccountId
     */
    public ReturnTheFullDetailsForASpecificBetSlipIdModel(List<Selection> selections, Stake stake, java.lang.System system, String winType, BigDecimal potentialPayout, Long betId, Long betNo, String status, Boolean liveBet, BigDecimal totalPrice, Long betTime, Long channelId, Boolean freeBet, String displayStatus, BigDecimal potentialBonusWinnings, String extBetId, List<Object> partialCashoutBetIds, BigDecimal refund, Boolean buildABet, Long accountId, String extAccountId, CapturedStake capturedStake, List<Object> enhancements, List<Object> childBetSummaries, String betRiskGroup, String betSlipId, String betStatus, BigDecimal winnings, Parts parts, Boolean currentlyInplay) {
        super();
        this.selections = selections;
        this.stake = stake;
        this.system = system;
        this.winType = winType;
        this.potentialPayout = potentialPayout;
        this.betId = betId;
        this.betNo = betNo;
        this.status = status;
        this.liveBet = liveBet;
        this.totalPrice = totalPrice;
        this.betTime = betTime;
        this.channelId = channelId;
        this.freeBet = freeBet;
        this.displayStatus = displayStatus;
        this.potentialBonusWinnings = potentialBonusWinnings;
        this.extBetId = extBetId;
        this.partialCashoutBetIds = partialCashoutBetIds;
        this.refund = refund;
        this.buildABet = buildABet;
        this.accountId = accountId;
        this.extAccountId = extAccountId;
        this.capturedStake = capturedStake;
        this.enhancements = enhancements;
        this.childBetSummaries = childBetSummaries;
        this.betRiskGroup = betRiskGroup;
        this.betSlipId = betSlipId;
        this.betStatus = betStatus;
        this.winnings = winnings;
        this.parts = parts;
        this.currentlyInplay = currentlyInplay;
    }

    public List<Selection> getSelections() {
        return selections;
    }

    public void setSelections(List<Selection> selections) {
        this.selections = selections;
    }

    public Stake getStake() {
        return stake;
    }

    public void setStake(Stake stake) {
        this.stake = stake;
    }

    public java.lang.System getSystem() {
        return system;
    }

    public void setSystem(java.lang.System system) {
        this.system = system;
    }

    public String getWinType() {
        return winType;
    }

    public void setWinType(String winType) {
        this.winType = winType;
    }

    public BigDecimal getPotentialPayout() {
        return potentialPayout;
    }

    public void setPotentialPayout(BigDecimal potentialPayout) {
        this.potentialPayout = potentialPayout;
    }

    public Long getBetId() {
        return betId;
    }

    public void setBetId(Long betId) {
        this.betId = betId;
    }

    public Long getBetNo() {
        return betNo;
    }

    public void setBetNo(Long betNo) {
        this.betNo = betNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getLiveBet() {
        return liveBet;
    }

    public void setLiveBet(Boolean liveBet) {
        this.liveBet = liveBet;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getBetTime() {
        return betTime;
    }

    public void setBetTime(Long betTime) {
        this.betTime = betTime;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Boolean getFreeBet() {
        return freeBet;
    }

    public void setFreeBet(Boolean freeBet) {
        this.freeBet = freeBet;
    }

    public String getDisplayStatus() {
        return displayStatus;
    }

    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public BigDecimal getPotentialBonusWinnings() {
        return potentialBonusWinnings;
    }

    public void setPotentialBonusWinnings(BigDecimal potentialBonusWinnings) {
        this.potentialBonusWinnings = potentialBonusWinnings;
    }

    public String getExtBetId() {
        return extBetId;
    }

    public void setExtBetId(String extBetId) {
        this.extBetId = extBetId;
    }

    public List<Object> getPartialCashoutBetIds() {
        return partialCashoutBetIds;
    }

    public void setPartialCashoutBetIds(List<Object> partialCashoutBetIds) {
        this.partialCashoutBetIds = partialCashoutBetIds;
    }

    public BigDecimal getRefund() {
        return refund;
    }

    public void setRefund(BigDecimal refund) {
        this.refund = refund;
    }

    public Boolean getBuildABet() {
        return buildABet;
    }

    public void setBuildABet(Boolean buildABet) {
        this.buildABet = buildABet;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getExtAccountId() {
        return extAccountId;
    }

    public void setExtAccountId(String extAccountId) {
        this.extAccountId = extAccountId;
    }

    public CapturedStake getCapturedStake() {
        return capturedStake;
    }

    public void setCapturedStake(CapturedStake capturedStake) {
        this.capturedStake = capturedStake;
    }

    public List<Object> getEnhancements() {
        return enhancements;
    }

    public void setEnhancements(List<Object> enhancements) {
        this.enhancements = enhancements;
    }

    public List<Object> getChildBetSummaries() {
        return childBetSummaries;
    }

    public void setChildBetSummaries(List<Object> childBetSummaries) {
        this.childBetSummaries = childBetSummaries;
    }

    public String getBetRiskGroup() {
        return betRiskGroup;
    }

    public void setBetRiskGroup(String betRiskGroup) {
        this.betRiskGroup = betRiskGroup;
    }

    public String getBetSlipId() {
        return betSlipId;
    }

    public void setBetSlipId(String betSlipId) {
        this.betSlipId = betSlipId;
    }

    public String getBetStatus() {
        return betStatus;
    }

    public void setBetStatus(String betStatus) {
        this.betStatus = betStatus;
    }

    public BigDecimal getWinnings() {
        return winnings;
    }

    public void setWinnings(BigDecimal winnings) {
        this.winnings = winnings;
    }

    public Parts getParts() {
        return parts;
    }

    public void setParts(Parts parts) {
        this.parts = parts;
    }

    public Boolean getCurrentlyInplay() {
        return currentlyInplay;
    }

    public void setCurrentlyInplay(Boolean currentlyInplay) {
        this.currentlyInplay = currentlyInplay;
    }

    public Boolean isSettled() {
        return (betStatus.equals("SETTLED") && !selections.stream().map(Selection::getResultType).collect(Collectors.toList()).contains("NOT_SET"));
    }

    public BigDecimal getPayout() {
        return payout;
    }

    public void setPayout(BigDecimal payout) {
        this.payout = payout;
    }

    public List<Selection> getBankersSelections() {
        return selections.stream().filter(Selection::getBanker).collect(Collectors.toList());
    }

    public BigDecimal getOddForSelection(String selectionId) {
        return selections.stream().filter(selection -> selection.getSelectionId().equalsIgnoreCase(selectionId)).findFirst().get().getOdds().getDecimal();
    }

    public String getFractionalForSelection(String selectionId) {
        return selections.stream().filter(selection -> selection.getSelectionId().equalsIgnoreCase(selectionId)).findFirst().get().getOdds().getFractional();
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }

    public BigDecimal getBonusWinnings() {
        return bonusWinnings;
    }

    public void setBonusWinnings(BigDecimal bonusWinnings) {
        this.bonusWinnings = bonusWinnings;
    }

    public BigDecimal getDiscountBonusAmount() {
        return discountBonusAmount;
    }

    public void setDiscountBonusAmount(BigDecimal discountBonusAmount) {
        this.discountBonusAmount = discountBonusAmount;
    }

    public String getMasterBetId() {
        return masterBetId;
    }

    public void setMasterBetId(String masterBetId) {
        this.masterBetId = masterBetId;
    }
}