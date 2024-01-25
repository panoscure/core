package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.details.fora.specific.betslip.id;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ReturnsTheDetailsForASpecificBetSlipIdModel {

	@SerializedName("gameId")
	private Integer gameId;

	@SerializedName("acceptPriceChange")
	private Boolean acceptPriceChange;

	@SerializedName("bets")
	private List<BetsItem> bets;

	public void setGameId(Integer gameId){
		this.gameId = gameId;
	}

	public Integer getGameId(){
		return gameId;
	}

	public void setAcceptPriceChange(Boolean acceptPriceChange){
		this.acceptPriceChange = acceptPriceChange;
	}

	public boolean isAcceptPriceChange(){
		return acceptPriceChange;
	}

	public void setBets(List<BetsItem> bets){
		this.bets = bets;
	}

	public List<BetsItem> getBets(){
		return bets;
	}
}