package com.intralot.qa.automation.core.lottery.apigatewayj.models.player.service.reset.password;

import com.google.gson.annotations.SerializedName;

public class A1{

	@SerializedName("streetName")
	private String streetName;

	@SerializedName("streetNumber")
	private String streetNumber;

	@SerializedName("city")
	private int city;

	@SerializedName("postCode")
	private String postCode;

	@SerializedName("state")
	private int state;

	public String getStreetName(){
		return streetName;
	}

	public String getStreetNumber(){
		return streetNumber;
	}

	public int getCity(){
		return city;
	}

	public String getPostCode(){
		return postCode;
	}

	public int getState(){
		return state;
	}
}