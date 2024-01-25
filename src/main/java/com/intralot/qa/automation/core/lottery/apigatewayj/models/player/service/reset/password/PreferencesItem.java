package com.intralot.qa.automation.core.lottery.apigatewayj.models.player.service.reset.password;

import com.google.gson.annotations.SerializedName;

public class PreferencesItem{

	@SerializedName("enable")
	private boolean enable;

	@SerializedName("values")
	private Values values;

	@SerializedName("type")
	private String type;

	public boolean isEnable(){
		return enable;
	}

	public Values getValues(){
		return values;
	}

	public String getType(){
		return type;
	}
}