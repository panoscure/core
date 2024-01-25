package com.intralot.qa.automation.core.lottery.apigatewayj.models.pam.players;

import com.google.gson.annotations.SerializedName;

public class PAMCreateFavoritePlayslipModel {

	@SerializedName("gameId")
	private Integer gameId;

	@SerializedName("created")
	private long created;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private Integer id;

	public Integer getGameId(){
		return gameId;
	}

	public long getCreated(){
		return created;
	}

	public String getName(){
		return name;
	}

	public Integer getId(){
		return id;
	}
}