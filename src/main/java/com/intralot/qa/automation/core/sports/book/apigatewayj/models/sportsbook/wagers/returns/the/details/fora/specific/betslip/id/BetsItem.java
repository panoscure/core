package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.details.fora.specific.betslip.id;

import java.math.BigDecimal;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class BetsItem{

	@SerializedName("capturedStake")
	private CapturedStake capturedStake;

	@SerializedName("currentlyInplay")
	private Boolean currentlyInplay;

	@SerializedName("potentialPayout")
	private BigDecimal potentialPayout;

	@SerializedName("totalPrice")
	private BigDecimal totalPrice;

	@SerializedName("betNo")
	private Integer betNo;

	@SerializedName("freeBet")
	private Boolean freeBet;

	@SerializedName("payout")
	private BigDecimal payout;

	@SerializedName("displayStatus")
	private String displayStatus;

	@SerializedName("buildABet")
	private Boolean buildABet;

	@SerializedName("extBetId")
	private String extBetId;

	@SerializedName("partialCashoutBetIds")
	private List<Object> partialCashoutBetIds;

	@SerializedName("stake")
	private Stake stake;

	@SerializedName("totalPriceAmerican")
	private BigDecimal totalPriceAmerican;

	@SerializedName("selections")
	private List<SelectionsItem> selections;

	@SerializedName("system")
	private System system;

	@SerializedName("betId")
	private Long betId;

	@SerializedName("betTime")
	private Long betTime;

	@SerializedName("potentialBonusWinnings")
	private BigDecimal potentialBonusWinnings;

	@SerializedName("winType")
	private String winType;

	@SerializedName("liveBet")
	private Boolean liveBet;

	@SerializedName("channelId")
	private Integer channelId;

	@SerializedName("status")
	private String status;

	@SerializedName("refund")
	private BigDecimal refund;

	public void setCapturedStake(CapturedStake capturedStake){
		this.capturedStake = capturedStake;
	}

	public CapturedStake getCapturedStake(){
		return capturedStake;
	}

	public void setCurrentlyInplay(Boolean currentlyInplay){
		this.currentlyInplay = currentlyInplay;
	}

	public boolean isCurrentlyInplay(){
		return currentlyInplay;
	}

	public void setPotentialPayout(BigDecimal potentialPayout){
		this.potentialPayout = potentialPayout;
	}

	public BigDecimal getPotentialPayout(){
		return potentialPayout;
	}

	public void setTotalPrice(BigDecimal totalPrice){
		this.totalPrice = totalPrice;
	}

	public BigDecimal getTotalPrice(){
		return totalPrice;
	}

	public void setBetNo(Integer betNo){
		this.betNo = betNo;
	}

	public Integer getBetNo(){
		return betNo;
	}

	public void setFreeBet(Boolean freeBet){
		this.freeBet = freeBet;
	}

	public boolean isFreeBet(){
		return freeBet;
	}

	public void setPayout(BigDecimal payout){
		this.payout = payout;
	}

	public BigDecimal getPayout(){
		return payout;
	}

	public void setDisplayStatus(String displayStatus){
		this.displayStatus = displayStatus;
	}

	public String getDisplayStatus(){
		return displayStatus;
	}

	public void setBuildABet(Boolean buildABet){
		this.buildABet = buildABet;
	}

	public boolean isBuildABet(){
		return buildABet;
	}

	public void setExtBetId(String extBetId){
		this.extBetId = extBetId;
	}

	public String getExtBetId(){
		return extBetId;
	}

	public void setPartialCashoutBetIds(List<Object> partialCashoutBetIds){
		this.partialCashoutBetIds = partialCashoutBetIds;
	}

	public List<Object> getPartialCashoutBetIds(){
		return partialCashoutBetIds;
	}

	public void setStake(Stake stake){
		this.stake = stake;
	}

	public Stake getStake(){
		return stake;
	}

	public void setTotalPriceAmerican(BigDecimal totalPriceAmerican){
		this.totalPriceAmerican = totalPriceAmerican;
	}

	public BigDecimal getTotalPriceAmerican(){
		return totalPriceAmerican;
	}

	public void setSelections(List<SelectionsItem> selections){
		this.selections = selections;
	}

	public List<SelectionsItem> getSelections(){
		return selections;
	}

	public void setSystem(System system){
		this.system = system;
	}

	public System getSystem(){
		return system;
	}

	public void setBetId(Long betId){
		this.betId = betId;
	}

	public Long getBetId(){
		return betId;
	}

	public void setBetTime(Long betTime){
		this.betTime = betTime;
	}

	public Long getBetTime(){
		return betTime;
	}

	public void setPotentialBonusWinnings(BigDecimal potentialBonusWinnings){
		this.potentialBonusWinnings = potentialBonusWinnings;
	}

	public BigDecimal getPotentialBonusWinnings(){
		return potentialBonusWinnings;
	}

	public void setWinType(String winType){
		this.winType = winType;
	}

	public String getWinType(){
		return winType;
	}

	public void setLiveBet(Boolean liveBet){
		this.liveBet = liveBet;
	}

	public boolean isLiveBet(){
		return liveBet;
	}

	public void setChannelId(Integer channelId){
		this.channelId = channelId;
	}

	public Integer getChannelId(){
		return channelId;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setRefund(BigDecimal refund){
		this.refund = refund;
	}

	public BigDecimal getRefund(){
		return refund;
	}
}