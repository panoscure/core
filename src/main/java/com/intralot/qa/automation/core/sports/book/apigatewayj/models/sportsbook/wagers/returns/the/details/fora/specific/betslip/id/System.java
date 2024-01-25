package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.details.fora.specific.betslip.id;

import com.google.gson.annotations.SerializedName;

public class System{

	@SerializedName("type")
	private String type;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}