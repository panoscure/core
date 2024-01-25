package com.intralot.qa.automation.core.lottery.apigatewayj.models.player.service.reset.password;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Values{

	@SerializedName("channels")
	private List<Object> channels;

	public List<Object> getChannels(){
		return channels;
	}
}