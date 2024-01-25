package com.intralot.qa.automation.core.lottery.apigatewayj.models.my.profile.service.get.my.favorite.playslips;

import com.google.gson.annotations.SerializedName;

public class Content {

	@SerializedName("gameId")
	private int gameId;

	@SerializedName("wager")
	private Wager wager;

	@SerializedName("created")
	private long created;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	public void setGameId(int gameId){
		this.gameId = gameId;
	}

	public int getGameId(){
		return gameId;
	}

	public void setWager(Wager wager){
		this.wager = wager;
	}

	public Wager getWager(){
		return wager;
	}

	public void setCreated(long created){
		this.created = created;
	}

	public long getCreated(){
		return created;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}
}