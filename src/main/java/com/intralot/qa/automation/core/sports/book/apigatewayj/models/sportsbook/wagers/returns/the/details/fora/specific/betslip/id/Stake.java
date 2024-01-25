package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.details.fora.specific.betslip.id;

import com.google.gson.annotations.SerializedName;

public class Stake{

	@SerializedName("amount")
	private Double amount;

	@SerializedName("currency")
	private String currency;

	public void setAmount(Double amount){
		this.amount = amount;
	}

	public Double getAmount(){
		return amount;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}
}