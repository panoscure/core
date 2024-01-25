package com.intralot.qa.automation.core.lottery.apigatewayj.models.my.profile.service.get.my.limits;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class GetMyLimitsModel {

	@SerializedName("Response")
	private List<GetMyLimit> response;

	public List<GetMyLimit> getResponse(){
		return response;
	}
}