package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.details.fora.specific.betslip.id;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Odds{

	@SerializedName("fractional")
	private String fractional;

	@SerializedName("american")
	private Integer american;

	@SerializedName("decimal")
	private BigDecimal decimal;

	public void setFractional(String fractional){
		this.fractional = fractional;
	}

	public String getFractional(){
		return fractional;
	}

	public void setAmerican(Integer american){
		this.american = american;
	}

	public Integer getAmerican(){
		return american;
	}

	public void setDecimal(BigDecimal decimal){
		this.decimal = decimal;
	}

	public BigDecimal getDecimal(){
		return decimal;
	}
}