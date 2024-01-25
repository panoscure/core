package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.details.fora.specific.betslip.id;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class CapturedStake{

	@SerializedName("amount")
	private BigDecimal amount;

	@SerializedName("currency")
	private String currency;

	public void setAmount(BigDecimal amount){
		this.amount = amount;
	}

	public BigDecimal getAmount(){
		return amount;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}
}