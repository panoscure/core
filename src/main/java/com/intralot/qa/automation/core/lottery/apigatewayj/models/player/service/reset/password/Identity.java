package com.intralot.qa.automation.core.lottery.apigatewayj.models.player.service.reset.password;

import com.google.gson.annotations.SerializedName;

public class Identity{

	@SerializedName("ssn")
	private String ssn;

	public String getSsn(){
		return ssn;
	}
}